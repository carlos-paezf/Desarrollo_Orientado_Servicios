package com.ustados.ejb_dos.services;


import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Local;
import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;

import com.postgres.model.City;
import com.postgres.model.Client;
import com.postgres.model.Departament;
import com.postgres.model.Invoice;
import com.postgres.model.Product;
import com.postgres.model.Stock;
import com.postgres.model.Supplier;
import com.postgres.model.Warehouse;
import com.usta.ejb_dos.enums.MotorBdEnum;
import com.ustados.ejb_dos.interfaces.IObjectFacade;
import com.ustados.ejb_dos.interfaces.InventarioFacade;

/**
 * clase que se encarga de adminitrar las transacciones con el bean indicado
 * @author edgarmedina
 * implementa los metodos
 */
@Local
@Stateless
@TransactionAttribute(TransactionAttributeType.NOT_SUPPORTED)
public class InventarioService<T> {

	//injeccion de la interfaz inventario reconociendolo como un bean
	//transaccional
	@EJB
	InventarioFacade<T> inventarioFacade;
	
	@EJB
	IObjectFacade facadeObject;
	
	/**
	 * Persiste un objetivo para crearlo como nuevo en la base de datos
	 * @param t
	 * @throws Exception
	 */
	public void create(T t) throws Exception{
		inventarioFacade.create(t);
	}
	
	/**
	 * Metodo que realiza la actulizacion del objeto que se busca
	 * @param t
	 * @return
	 * @throws Exception
	 */
	public T update(T t) throws Exception{
		return inventarioFacade.update(t);
	}
	
	/**
	 * metodo que elimina el objeto indicado
	 * @param t
	 * @throws Exception
	 */
	public void delete(T t) throws Exception{
		inventarioFacade.delete(t);
	}
	
	/**
	 * metodo que buscar una persona por su documento
	 * @param document
	 * @return
	 * @throws Exception
	 */
	public T searchByDocument(String document, MotorBdEnum bdMotor) throws Exception{
		return inventarioFacade.searchByDocument(document, bdMotor);
	}
	
	public T findByID(T t) throws Exception{
		T resutl = null;
		
		if(t instanceof Client) {
			Client c = (Client) t;
			resutl = (T) facadeObject.findByIdClient(c.getIdClient().intValue());
		}else if(t instanceof City) {
			City cy = (City)t;
			resutl = (T)facadeObject.findById(cy.getIdCity());
		}else if(t instanceof Departament) {
			Departament d = (Departament)t;
			resutl = (T)facadeObject.findByIdDepartament(d.getIdDepartment());
		}else if(t instanceof Invoice) {
			Invoice i = (Invoice)t;
			resutl = (T)facadeObject.findByIdInvoice(i.getIdClient().intValue());
		}else if(t instanceof Product) {
			Product p = (Product) t;
			resutl = (T)facadeObject.findByIdProduct(p.getIdProduct());
		}else if(t instanceof Stock) {
			Stock s = (Stock)t;
			resutl = (T)facadeObject.findByIdStock(s.getIdStock().intValue());
		}else if(t instanceof Supplier){
			 Supplier su= (Supplier)t;
			 resutl = (T)facadeObject.findByIdSupplier(su.getIdSupplier());
		}else if(t instanceof Warehouse) {
			Warehouse w = (Warehouse)t;
			resutl = (T)facadeObject.findByIdWarehouse(w.getIdWarehouse());
		}
		
		return resutl;
	}
	
	
	public List<Warehouse> findAll() throws Exception{
		
		return facadeObject.findAlWarehousesl();
	}
}
