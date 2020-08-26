package com.ustados.ejb_dos.beans;


import javax.ejb.Local;
import javax.ejb.Stateless;
import javax.ejb.TransactionManagement;
import javax.ejb.TransactionManagementType;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.ustados.ejb_dos.interfaces.InventarioFacade;

@Stateless	//Bean con estado
@Local
@TransactionManagement(TransactionManagementType.CONTAINER)
public class InventarioBean<T> implements InventarioFacade<T>{

    //Define la unidad de persistenciaa que nos vamos a conectar
    //Cual es la base de datos que estamos usando
    @PersistenceContext(unitName = "ejb_dos")

    //Contiene la logica de los metdos para realizar las transacciones con la BBDD y administracion de consultas
    private EntityManager entyMan;

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

}
