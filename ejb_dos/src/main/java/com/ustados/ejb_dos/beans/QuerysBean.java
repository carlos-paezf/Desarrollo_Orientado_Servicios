package com.ustados.ejb_dos.beans;


import java.util.ArrayList;
import java.util.List;

import javax.ejb.Local;
import javax.ejb.Stateless;
import javax.ejb.TransactionManagement;
import javax.ejb.TransactionManagementType;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import com.ustados.ejb_dos.interfaces.IObjectFacade;
import com.ustados.ejb_dos.model.*;

@Stateless	//Bean con estado
@Local
@TransactionManagement(TransactionManagementType.CONTAINER)
public class QuerysBean implements IObjectFacade {

    @PersistenceContext(unitName = "ejb_dos")
    EntityManager entityManager;

    @java.lang.Override
    public City findByIdCity(int id) throws Exception {
        City city = new City();
        if (id>0){
            Query q = entityManager.createNamedQuery(City.FIND_BY_ID);
            q.setParameter("cityId", id);
            try {
                city = (City) q.getSingleResult();
            }catch (NoResultException e){
                city = null;
            }
        }
        return city;
    }

    @java.lang.Override
    public List<City> findAllCities() throws Exception {
        Query q = entityManager.createNamedQuery(City.FIND_ALL);
        List<City> cities = new ArrayList<City>();
        cities = q.getResultList();
        return cities;
    }

    @java.lang.Override
    public Client findByIdClient(int id) throws Exception {
        Client client = new Client();
        if (id>0) {
            Query q = entityManager.createNamedQuery(Client.FIND_BY_ID);
            q.setParameter("clientId", id);
            try {
                client = (Client) q.getSingleResult();
            }catch (NoResultException e){
                client = null;
            }
        }
        return client;
    }

    @java.lang.Override
    public List<Client> findAllClients() throws Exception {
        List<Client> clients = new ArrayList<Client>();
        Query q = entityManager.createNamedQuery(Client.FIND_ALL);
        clients = q.getResultList();
        return clients;
    }

    @java.lang.Override
    public Department findByIdDepartment(int id) throws Exception {
        Department department = new Department();
        if (id>0){
            Query q = entityManager.createNamedQuery(Department.FIND_BY_ID);
            q.setParameter("departmentId", id);
            try {
                department = (Department) q.getSingleResult();
            }catch (NoResultException e){
                department = null;
            }
        }
        return department;
    }

    @java.lang.Override
    public List<Department> findAllDepartments() throws Exception {
        Query q = entityManager.createNamedQuery(Department.FIND_ALL);
        List<Department> departments = new ArrayList<Department>();
        departments = q.getResultList();
        return departments;
    }

    @java.lang.Override
    public Invoice findByIdInvoice(int id) throws Exception {
        Invoice invoice = new Invoice();
        if (id>0){
            Query q = entityManager.createNamedQuery(Invoice.FIND_BY_ID);
            q.setParameter("invoiceId", id);
            try {
                invoice = (Invoice) q.getSingleResult();
            }catch (NoResultException e){
                invoice = null;
            }
        }
        return invoice;
    }

    @java.lang.Override
    public List<Invoice> findAllInvoices() throws Exception {
        Query q = entityManager.createNamedQuery(Invoice.FIND_ALL);
        List<Invoice> invoices = new ArrayList<Invoice>();
        invoices = q.getResultList();
        return invoices;
    }

    @java.lang.Override
    public Product findByIdProduct(int id) throws Exception {
        Product product = new Product();
        if (id>0){
            Query q = entityManager.createNamedQuery(Product.FIND_BY_ID);
            q.setParameter("productId", id);
            try {
                product = (Product) q.getSingleResult();
            }catch (NoResultException e){
                product = null;
            }
        }
        return product;
    }

    @java.lang.Override
    public List<Product> findAllProducts() throws Exception {
        Query q = entityManager.createNamedQuery(Product.FIND_ALL);
        List<Product> products = new ArrayList<Product>();
        products = q.getResultList();
        return products;
    }

    @java.lang.Override
    public Stock findByIdStock(int id) throws Exception {
        Stock stock = new Stock();
        if (id>0){
            Query q = entityManager.createNamedQuery(Stock.FIND_BY_ID);
            q.setParameter("stockId", id);
            try {
                stock = (Stock) q.getSingleResult();
            }catch (NoResultException e){
                stock = null;
            }
        }
        return stock;
    }

    @java.lang.Override
    public List<Stock> findAllStocks() throws Exception {
        Query q = entityManager.createNamedQuery(Stock.FIND_ALL);
        List<Stock> stocks = new ArrayList<Stock>();
        stocks = q.getResultList();
        return stocks;
    }

    @java.lang.Override
    public Supplier findByIdSupplier(int id) throws Exception {
        Supplier supplier = new Supplier();
        if (id>0){
            Query q = entityManager.createNamedQuery(Supplier.FIND_BY_ID);
            q.setParameter("supplierId", id);
            try {
                supplier = (Supplier) q.getSingleResult();
            }catch (NoResultException e){
                supplier = null;
            }
        }
        return supplier;
    }

    @java.lang.Override
    public List<Supplier> findAllSuppliers() throws Exception {
        Query q = entityManager.createNamedQuery(Supplier.FIND_ALL);
        List<Supplier> suppliers = new ArrayList<Supplier>();
        suppliers = q.getResultList();
        return suppliers;
    }

    @java.lang.Override
    public Warehouse findByIdWarehouse(int id) throws Exception {
        Warehouse warehouse = new Warehouse();
        if (id>0){
            Query q = entityManager.createNamedQuery(Warehouse.FIND_BY_ID);
            q.setParameter("warehouseId", id);
            try {
                warehouse = (Warehouse) q.getSingleResult();
            }catch (NoResultException e){
                warehouse = null;
            }
        }
        return warehouse;
    }

    @java.lang.Override
    public List<Warehouse> findAllWarehouses() throws Exception {
        Query q = entityManager.createNamedQuery(Warehouse.FIND_ALL);
        List<Warehouse> warehouses = new ArrayList<Warehouse>();
        warehouses = q.getResultList();
        return warehouses;
    }
}