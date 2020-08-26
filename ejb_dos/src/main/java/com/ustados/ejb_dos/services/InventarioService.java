package com.ustados.ejb_dos.services;

import javax.ejb.EJB;
import javax.ejb.Local;
import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;

import com.ustados.ejb_dos.interfaces.IObjectFacade;
import com.ustados.ejb_dos.interfaces.InventarioFacade;
import com.ustados.ejb_dos.model.*;


/* 
 * 
 * Clase que se encarga de administrar las transacciones con el bean indicado
 * @author David Ferrer
 *
 */

@Local
@Stateless
@TransactionAttribute(TransactionAttributeType.NOT_SUPPORTED)
public class InventarioService<T> {
	
	@EJB
	InventarioFacade<T> inventarioFacade;

	@EJB
	IObjectFacade facadeObject;

	public void create(T t) throws Exception{
		inventarioFacade.create(t);
	}

	public T update(T t) throws Exception{
		return inventarioFacade.update(t);
	}

	public void delete(T t) throws Exception{
		inventarioFacade.delete(t);
	}

	public T findByID(T t) throws Exception{
		if (t instanceof Client){
			Client c = (Client) t;
			facadeObject.findByIdClient(c.getIdClient().intValue());
		} else if (t instanceof City){
			City cy = (City) t;
			facadeObject.findByIdCity(cy.getIdCity());
		} else if (t instanceof Department){
			Department d= (Department) t;
			facadeObject.findByIdDepartment(d.getIdDepartment());
		}else if (t instanceof Invoice){
			Invoice i = (Invoice) t;
			facadeObject.findByIdInvoice(i.getIdInvoice().intValue());
		}else if (t instanceof Product){
			Product p = (Product) t;
			facadeObject.findByIdProduct(p.getIdProduct());
		}else if (t instanceof Stock){
			Stock s = (Stock) t;
			facadeObject.findByIdStock(s.getIdStock().intValue());
		}else if (t instanceof Supplier){
			Supplier su = (Supplier) t;
			facadeObject.findByIdSupplier(su.getIdSupplier());
		}else if (t instanceof Warehouse){
			Warehouse w = (Warehouse) t;
			facadeObject.findByIdWarehouse(w.getIdWarehouse());
		}
		return t;
	}
}
