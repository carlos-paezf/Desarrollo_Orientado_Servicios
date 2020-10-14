package com.usta.servicesiao.facade;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Stateless;

import com.postgres.model.Client;
import com.postgres.model.Supplier;
import com.postgres.model.Warehouse;
import com.usta.ejb_dos.enums.MotorBdEnum;
import com.ustados.ejb_dos.services.InventarioService;

//Clase intermediaria para el llamado de la capa
//logica y la capas de soap
@Stateless
public class FacadeServicesPostgresql<T> implements Serializable{

	@EJB
	InventarioService<T> inventarioService;
	
	
	/*
	 * metodo que invoca la busqueda de las sucursales
	 */
	public List<Warehouse> findAll(int id){
		List<Warehouse> warehouses = new ArrayList<Warehouse>();
		
		try {
			warehouses = inventarioService.findAll();
		} catch (Exception e) {
			warehouses = null;
		}
		
		return warehouses;
	}
	
	/**
	 * 
	 * @param document
	 * @return
	 */
	public Client searchClientDocument(String document) {
		
		Client client = new Client();
		
		try {
			client = (Client) inventarioService.searchByDocument(document, MotorBdEnum.POSTGRESQL);
			
		} catch (Exception e) {
			client = null;
		}
		
		return client;
	}
	
}
