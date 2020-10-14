package com.ustados.ejb_dos.interfaces;

import java.util.List;

import javax.ejb.Remote;
import javax.sound.sampled.LineListener;

import com.postgres.model.City;
import com.postgres.model.Client;
import com.postgres.model.Departament;
import com.postgres.model.Invoice;
import com.postgres.model.Product;
import com.postgres.model.Stock;
import com.postgres.model.Supplier;
import com.postgres.model.Warehouse;

@Remote
public interface IObjectFacade {

	/**
	 * buscar un objeto por su llave primaria o id
	 * @param id
	 * @return
	 * @throws Exception
	 */
	public City findById(int id) throws Exception;
	
	/**
	 * lista la existencia de todos lo objetos relacionados
	 * @return
	 * @throws Exception
	 */
	public List<City> findAll() throws Exception;
	
	/**
	 * buscar un objeto por su llave primaria o id
	 * @param id
	 * @return
	 * @throws Exception
	 */
	public Client findByIdClient(int id) throws Exception;
	
	/**
	 * lista la existencia de todos lo objetos relacionados
	 * @return
	 * @throws Exception
	 */
	public List<Client> findAllClient() throws Exception;
	
	/**
	 * buscar un objeto por su llave primaria o id
	 * @param id
	 * @return
	 * @throws Exception
	 */
	public Departament findByIdDepartament(int id) throws Exception;
	
	/**
	 * lista la existencia de todos lo objetos relacionados
	 * @return
	 * @throws Exception
	 */
	public List<Departament> findAllDepartament() throws Exception;
	
	/**
	 * buscar un objeto por su llave primaria o id
	 * @param id
	 * @return
	 * @throws Exception
	 */
	public Invoice findByIdInvoice(int id) throws Exception;
	
	/**
	 * lista la existencia de todos lo objetos relacionados
	 * @return
	 * @throws Exception
	 */
	public List<Invoice> findAllInvoices() throws Exception;
	
	/**
	 * buscar un objeto por su llave primaria o id
	 * @param id
	 * @return
	 * @throws Exception
	 */
	public Product findByIdProduct(int id) throws Exception;
	
	/**
	 * lista la existencia de todos lo objetos relacionados
	 * @return
	 * @throws Exception
	 */
	public List<Product> findAlProducts() throws Exception;
	
	/**
	 * buscar un objeto por su llave primaria o id
	 * @param id
	 * @return
	 * @throws Exception
	 */
	public Stock findByIdStock(int id) throws Exception;
	
	/**
	 * lista la existencia de todos lo objetos relacionados
	 * @return
	 * @throws Exception
	 */
	public List<Stock> findAllStocks() throws Exception;
	
	/**
	 * buscar un objeto por su llave primaria o id
	 * @param id
	 * @return
	 * @throws Exception
	 */
	public Supplier findByIdSupplier(int id) throws Exception;
	
	/**
	 * lista la existencia de todos lo objetos relacionados
	 * @return
	 * @throws Exception
	 */
	public List<Supplier> findAllSuppliers() throws Exception;
	
	/**
	 * buscar un objeto por su llave primaria o id
	 * @param id
	 * @return
	 * @throws Exception
	 */
	public Warehouse findByIdWarehouse(int id) throws Exception;
	
	/**
	 * lista la existencia de todos lo objetos relacionados
	 * @return
	 * @throws Exception
	 */
	public List<Warehouse> findAlWarehousesl() throws Exception;
	
	/**
	 * busca las sedes dependiendo el proveedor
	 * @param id
	 * @return
	 * @throws Exception
	 */
	public List<Warehouse> findBySupplierId(int id) throws Exception;
	
	
}
