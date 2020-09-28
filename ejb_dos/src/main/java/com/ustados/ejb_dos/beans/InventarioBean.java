package com.ustados.ejb_dos.beans;


import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.ejb.TransactionManagement;
import javax.ejb.TransactionManagementType;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import com.mysql.model.Costumer;
import com.postgresql.model.Client;
import com.ustados.ejb_dos.emnus.MotorBdEnum;
import com.ustados.ejb_dos.interfaces.InventarioFacade;

@Stateless	//Bean con estado
@LocalBean
@TransactionManagement(TransactionManagementType.CONTAINER)
public class InventarioBean<T> implements InventarioFacade<T>{

    //Define la unidad de persistenciaa que nos vamos a conectar
    //Cual es la base de datos que estamos usando
    @PersistenceContext(unitName = "ejb_dos")

    //Contiene la logica de los metdos para realizar las transacciones con la BBDD y administracion de consultas
    private EntityManager entityManagerPostgreSQL;

	@PersistenceContext(name = "ejb_dos_mysql")
	private EntityManager entityManagerMySQL;

	@java.lang.Override
	public void create(T t) throws Exception {
		entityManagerPostgreSQL.persist(t);
		
	}

	@java.lang.Override
	public T update(T t) throws Exception {
		return entityManagerPostgreSQL.merge(t);
	}

	@java.lang.Override
	public void delete(T t) throws Exception {
		entityManagerPostgreSQL.remove(t);	
	}

	@Override
	public T searchByDocument(String document, MotorBdEnum bdMotor) throws Exception {
		T t = null;
		Query query = null;
		switch (bdMotor) {
			case POSTGRESQL:
				query = entityManagerPostgreSQL.createNamedQuery(Client.FIND_BY_DOCUMENT).setParameter("doc", document);
				List<Client> c = query.getResultList();
				if(!c.isEmpty()){
					for (Client cl : c){
						t = (T) cl;
						break;
					}
				}
				break;
			case MYSQL:
				query = entityManagerMySQL.createNamedQuery(Costumer.FIND_BY_DOCUMENT).setParameter("doc", document);
				List<Costumer> cr = query.getResultList();
				if(!cr.isEmpty()){
					for(Costumer cs : cr){
						t = (T) cs;
						break;
					}
				}
				break;
			
			default:
				break;
		}
		return t;
	}


}
