package com.ustados.ejb_dos.beans;



import java.util.List;

import javax.ejb.Local;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.ejb.TransactionManagement;
import javax.ejb.TransactionManagementType;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import com.mysql.model.Costumer;
import com.postgres.model.Client;
import com.usta.ejb_dos.enums.MotorBdEnum;
import com.ustados.ejb_dos.interfaces.InventarioFacade;

/**
 * clase tipo bean que se encarga de las transacciones
 * de tipo logico con la base de datos
 * @author edgarmedina
 *
 * @param <T>
 */
@Stateless //Bean con estado, estara atento a las peticiones
@LocalBean
@TransactionManagement(TransactionManagementType.CONTAINER)//indica que las transacciones
//las administra el servidor
public class InventarioBean<T> implements InventarioFacade<T>{

	//defininon la unidad de persistencia la que nos vamos a 
	//conectar (Cual es la base de datos que estamos usando) 
	@PersistenceContext(unitName = "postgresEjb")
	//contiene la logica de los metodos para realizar las transacciones
	//con la base de datos y adminstración de consultas
	private EntityManager entyMan;
	
	
	
	@PersistenceContext(unitName =  "mysqlEjb")
	private EntityManager entyMysql;
	
	@Override
	public void create(T t) throws Exception {
		entyMan.persist(t);		
	}

	@Override
	public T update(T t) throws Exception {
		return entyMan.merge(t);
	}

	@Override
	public void delete(T t) throws Exception {
		entyMan.remove(t);
	}

	@Override
	public T searchByDocument(String document, MotorBdEnum bdMotor) throws Exception {
		T t = null;
		
		Query query = null;
				
		switch (bdMotor) {
			case POSTGRESQL:
				query = entyMan.createNamedQuery(Client.FIND_BY_DOCUMENT).setParameter("doc", document);
				
				List<Client> c = query.getResultList();
				
				if(!c.isEmpty()) {
					for(Client cl : c) {
						t = (T) cl;
						break;
					}
				}
			break;
			case MYSQL:
				query = entyMysql.createNamedQuery(Costumer.FIND_BY_DOCUMENT).setParameter("doc", document);
				
				List<Costumer> co = query.getResultList();
				
				if(!co.isEmpty()) {
					for(Costumer cl : co) {
						t = (T) cl;
						break;
					}
				}
				break;
		}
		
		return t;
	}

}
