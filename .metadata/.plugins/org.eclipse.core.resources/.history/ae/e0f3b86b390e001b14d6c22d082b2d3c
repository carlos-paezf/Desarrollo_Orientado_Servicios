package com.ustados.servicessoap.services;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

import org.apache.poi.ss.formula.functions.T;

import com.mysql.model.Costumer;
import com.postgres.model.Client;
import com.postgres.model.Warehouse;
import com.usta.servicesiao.facade.FacadeServicesPostgresql;

/**
 * definicion del servicio Soap que vamos publicar
 * @author edgarmedina
 * ip:port/nombreproyecto/servicio.wsdl
 * localhost:8081/servicessoap/inventario.wsdl
 */
@WebService(name = "invetario")
@Stateless//bean de session sin estado
public class InventarioUsta implements Serializable{
	
	@EJB
	FacadeServicesPostgresql<T> fachada;

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	/**
	 * 
	 * @param idSup
	 * @return
	 */
	@WebMethod(operationName = "warehouses")
	public List<Warehouse> listWareHouses(
			@WebParam(name = "idSupplier") Long idSup ){
		
		List<Warehouse> w = new ArrayList<Warehouse>();
		
		try {
			w = fachada.findAll(idSup.intValue());
		} catch (Exception e) {
			w = null;
		}
		
		return w;
	}
	
	
	/**
	 * 
	 * @param document
	 * @return
	 */
	@WebMethod(operationName = "clientByDocument")
	public Client searchClientByDocument(
			@WebParam(name = "document") String document) {
		
		Client client = new Client();
		
		client = fachada.searchClientDocument(document);
		
		return client;
	}

}
