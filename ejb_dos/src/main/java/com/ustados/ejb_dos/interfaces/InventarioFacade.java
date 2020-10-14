package com.ustados.ejb_dos.interfaces;


import javax.ejb.Remote;

import com.usta.ejb_dos.enums.MotorBdEnum;

/**
 * interfaz encargada de crear los metodos comunes
 * @author edgarmedina
 *
 */
@Remote //que es la interfaz va trabajar sobre el codigo fuente
public interface InventarioFacade<T> {
	
	/**
	 * Persiste un objetivo para crearlo como nuevo en la base de datos
	 * @param t
	 * @throws Exception
	 */
	public void create(T t) throws Exception;
	
	/**
	 * Metodo que realiza la actulizacion del objeto que se busca
	 * @param t
	 * @return
	 * @throws Exception
	 */
	public T update(T t) throws Exception;
	
	/**
	 * metodo que elimina el objeto indicado
	 * @param t
	 * @throws Exception
	 */
	public void delete(T t) throws Exception;
	
	/**
	 * metodo que buscar una persona por su documento
	 * @param document
	 * @return
	 * @throws Exception
	 */
	public T searchByDocument(String document, MotorBdEnum bdMotor) throws Exception;
	

}
