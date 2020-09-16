package com.ustados.ejb_dos.services;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Local;
import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;

import com.ustados.ejb_dos.emnus.MotorBdEnum;
import com.ustados.ejb_dos.interfaces.IObjectFacadePostgreSQL;
import com.ustados.ejb_dos.interfaces.InventarioFacade;
import com.ustados.ejb_dos.modelpostgresql.*;

/* 
 * 
 * Clase que se encarga de administrar las transacciones con el bean indicado
 * @author David Ferrer
 *
 */

@Local
@Stateless
@TransactionAttribute(TransactionAttributeType.NOT_SUPPORTED)
public class InventarioServicePostgreSQL<T> {

	@EJB
	InventarioFacade<T> inventarioFacade;

	@EJB
	IObjectFacadePostgreSQL facadeObject;

	public void create(T t) throws Exception {
		inventarioFacade.create(t);
	}

	public T update(T t) throws Exception {
		return inventarioFacade.update(t);
	}

	public void delete(T t) throws Exception {
		inventarioFacade.delete(t);
	}

	public T searchByDocument(String document, MotorBdEnum bdMotor) throws Exception{
		return inventarioFacade.searchByDocument(document, bdMotor);
	}

	public T findByID(T t) throws Exception {
		T result = null;
		if (t instanceof Client) {
			Client c = (Client) t;
			result = (T) facadeObject.findByIdClient(c.getIdClient().intValue());
		} else if (t instanceof City) {
			City cy = (City) t;
			result = (T) facadeObject.findByIdCity(cy.getIdCity());
		} else if (t instanceof Department) {
			Department d = (Department) t;
			result = (T) facadeObject.findByIdDepartment(d.getIdDepartment());
		} else if (t instanceof Invoice) {
			Invoice i = (Invoice) t;
			result = (T) facadeObject.findByIdInvoice(i.getIdInvoice().intValue());
		} else if (t instanceof Product) {
			Product p = (Product) t;
			result = (T) facadeObject.findByIdProduct(p.getIdProduct());
		} else if (t instanceof Stock) {
			Stock s = (Stock) t;
			result = (T) facadeObject.findByIdStock(s.getIdStock().intValue());
		} else if (t instanceof Supplier) {
			Supplier su = (Supplier) t;
			result = (T) facadeObject.findByIdSupplier(su.getIdSupplier());
		} else if (t instanceof Warehouse) {
			Warehouse w = (Warehouse) t;
			result = (T) facadeObject.findByIdWarehouse(w.getIdWarehouse());
		}
		return result;
	}

	public List<Warehouse> findAll() throws Exception {
		return facadeObject.findAllWarehouses();
	}
}
