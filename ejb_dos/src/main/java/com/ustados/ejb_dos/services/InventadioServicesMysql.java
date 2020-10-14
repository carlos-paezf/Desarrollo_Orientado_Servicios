package com.ustados.ejb_dos.services;

import javax.ejb.EJB;
import javax.ejb.Local;
import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;

import com.mysql.model.BusinessHeadquarter;
import com.postgres.model.City;
import com.postgres.model.Client;
import com.postgres.model.Departament;
import com.postgres.model.Invoice;
import com.postgres.model.Product;
import com.postgres.model.Stock;
import com.postgres.model.Supplier;
import com.postgres.model.Warehouse;
import com.usta.ejb_dos.enums.MotorBdEnum;
import com.ustados.ejb_dos.interfaces.IObjectFacadeMysql;
import com.ustados.ejb_dos.interfaces.InventarioFacade;

@Local
@Stateless
@TransactionAttribute(TransactionAttributeType.NOT_SUPPORTED)
public class InventadioServicesMysql<T> {

	
	@EJB
	InventarioFacade<T> inventarioFacade;
	
	@EJB
	IObjectFacadeMysql facadeObject;
	
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
	 * metodo que buscar una persona por su documento
	 * @param document
	 * @return
	 * @throws Exception
	 */
	public T searchByDocument(String document, MotorBdEnum bdMotor) throws Exception{
		return inventarioFacade.searchByDocument(document, bdMotor);
	}
	
	/**
	 * metodo que elimina el objeto indicado
	 * @param t
	 * @throws Exception
	 */
	public void delete(T t) throws Exception{
		inventarioFacade.delete(t);
	}
	
	public T findByID(int id, int clas) throws Exception{
		T resutl = null;
		
		switch (clas) {
			case 1:
				resutl = (T) facadeObject.findByIdBusinessHeadquarter(id);
				break;
			case 2:
				resutl = (T) facadeObject.findByIdBusinessHeadquarterProvider(id);
				break;
			case 3:
				resutl = (T) facadeObject.findByIdBusinessHeadquarterStock(id);
				break;
			case 4:
				resutl = (T) facadeObject.findByIDSCostumer(id);
				break;
			case 5:
				resutl = (T) facadeObject.findByIdGeographicLocation(id);
				break;
			case 6:
				resutl = (T) facadeObject.findByIdInvoiceMysq(id);
				break;
			case 7:
				resutl = (T) facadeObject.findByIdProductMysql(id);
				break;
			case 8:
				resutl = (T) facadeObject.findByIdProvider(id);
				break;
			case 9:
				resutl = (T) facadeObject.findByIDStockMysql(id);
				break;
			case 10:
				resutl = (T) facadeObject.findByIDStockMysql(id);
				break;
		
		}
		
		return resutl;
	}
}
