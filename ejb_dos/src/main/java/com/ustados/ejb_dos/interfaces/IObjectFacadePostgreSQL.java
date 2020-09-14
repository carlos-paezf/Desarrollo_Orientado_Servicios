package com.ustados.ejb_dos.interfaces;

import java.util.List;

import javax.ejb.Remote;

import com.ustados.ejb_dos.modelpostgresql.City;
import com.ustados.ejb_dos.modelpostgresql.Client;
import com.ustados.ejb_dos.modelpostgresql.Department;
import com.ustados.ejb_dos.modelpostgresql.Invoice;
import com.ustados.ejb_dos.modelpostgresql.Product;
import com.ustados.ejb_dos.modelpostgresql.Stock;
import com.ustados.ejb_dos.modelpostgresql.Supplier;
import com.ustados.ejb_dos.modelpostgresql.Warehouse;

@Remote
public interface IObjectFacadePostgreSQL {

    public City findByIdCity(int id) throws Exception;

    public List<City> findAllCities() throws Exception;

    public Client findByIdClient(int id) throws Exception;

    public List<Client> findAllClients() throws Exception;

    public Department findByIdDepartment(int id) throws Exception;

    public List<Department> findAllDepartments() throws Exception;

    public Invoice findByIdInvoice(int id) throws Exception;

    public List<Invoice> findAllInvoices() throws Exception;

    public Product findByIdProduct(int id) throws Exception;

    public List<Product> findAllProducts() throws Exception;

    public Stock findByIdStock(int id) throws Exception;

    public List<Stock> findAllStocks() throws Exception;

    public Supplier findByIdSupplier(int id) throws Exception;

    public List<Supplier> findAllSuppliers() throws Exception;

    public Warehouse findByIdWarehouse(int id) throws Exception;

    public List<Warehouse> findAllWarehouses() throws Exception;
    
    /**
     * Busca las sedes según el proveedor
     * @param id
     * @return
     * @throws Exception
     */
    public List<Warehouse> findByIdSupp(int id) throws Exception;
}
