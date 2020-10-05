package com.ustados.ejb_dos.interfaces;

import javax.ejb.Remote;

import com.ustados.ejb_dos.enums.MotorBdEnum;

/**
 * interfaz encardad de crear los métodos comunes
 * @author David Ferrer
 *
 */
@Remote //La interfaz va a trabjar sobre el codigo fuente
public interface InventarioFacade<T> {
	
	/**
	 * Persiste un objetivo para crearlo como nuevo en la base de datos
	 * @param T
	 * @throws Exception
	 */
	public void create(T t) throws Exception;
	
	/**
	 * Método que realiza la actuliazacion del objeto que se busca
	 * @param T
	 * @return
	 * @throws Exception
	 */
	public T update(T t) throws Exception;
	
	/**
	 * Método que elimina el objeto indicado
	 * @param t
	 * @throws Exception
	 */
	public void delete(T t) throws Exception;	

	/**
	 * Metodo para buscar una persona por su documento
	 * @param document
	 * @return
	 * @throws Exception
	 */
	public T searchByDocument(String document, MotorBdEnum bdMotor) throws Exception;
}
