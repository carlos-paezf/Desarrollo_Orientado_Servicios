package com.ustados.ejb_dos.beans;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.Local;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.ejb.TransactionManagement;
import javax.ejb.TransactionManagementType;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import com.postgres.model.City;
import com.postgres.model.Client;
import com.postgres.model.Departament;
import com.postgres.model.Invoice;
import com.postgres.model.Product;
import com.postgres.model.Stock;
import com.postgres.model.Supplier;
import com.postgres.model.Warehouse;
import com.ustados.ejb_dos.interfaces.IObjectFacade;

@Stateless
@LocalBean
@TransactionManagement(TransactionManagementType.CONTAINER)
public class QuerysBeans implements IObjectFacade{

	@PersistenceContext(unitName = "postgresEjb")
	EntityManager entiMan;
	
	@Override
	public City findById(int id) throws Exception {
		
		City city = new City();
		
		Query q = entiMan.createNamedQuery(City.FIND_BY_ID);
		q.setParameter("cityId", id);
		
		try {
			city = (City) q.getSingleResult();	
		} catch (NoResultException e) {
			city = null;
		}
		
		return city;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<City> findAll() throws Exception {
		Query q = entiMan.createNamedQuery(City.FIND_ALL);
		
		List<City> cities = q.getResultList();
		
		return cities;
	}

	@Override
	public Client findByIdClient(int id) throws Exception {
		Client c = new Client();
		if(id>0) {
			Query q = entiMan.createNamedQuery(Client.FIND_BY_ID)
					.setParameter("clientId", id);
			
			try {
				c = (Client) q.getSingleResult();
			} catch (NoResultException e) {
				c= null;
			}
			
		}
		return c;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Client> findAllClient() throws Exception {
		List<Client> cl = new ArrayList<Client>();
		 Query q = entiMan.createNamedQuery(Client.FIND_ALL);
		 
		 cl = q.getResultList();
		 
		return cl;
	}

	@Override
	public Departament findByIdDepartament(int id) throws Exception {
		Departament d = new Departament();
		if(id>0) {
			Query q = entiMan.createNamedQuery(Departament.FIND_BY_ID)
					.setParameter("depId", id);
			
			try {
				d = (Departament) q.getSingleResult();
			} catch (NoResultException e) {
				d= null;
			}
			
		}
		
		return d;
	}

	@Override
	public List<Departament> findAllDepartament() throws Exception {
		
		List<Departament> d = new ArrayList<Departament>();
		
		 Query query = entiMan.createNamedQuery(Departament.FIND_ALL);
		 
		  d = query.getResultList();
		  
		return d;
	}

	@Override
	public Invoice findByIdInvoice(int id) throws Exception {
		Invoice i = new Invoice();
		
		if(id>0) {
			Query q = entiMan.createNamedQuery(Invoice.FIND_BY_ID)
					.setParameter("in", id);
			
			try {
				i = (Invoice) q.getSingleResult();
			} catch (NoResultException e) {
				i = null;
			}
			
		}
		
		return i;
	}

	@Override
	public List<Invoice> findAllInvoices() throws Exception {
		List<Invoice> in = new ArrayList<Invoice>();
		
		Query q = entiMan.createNamedQuery(Invoice.FIND_ALL);
		
		in = q.getResultList();
		
 		return in;
	}

	@Override
	public Product findByIdProduct(int id) throws Exception {
		
		Product p = new Product();
		
		if(id>0) {
			Query q = entiMan.createNamedQuery(Product.FIND_BY_ID)
					.setParameter("pId", id);
			
			try {
				p = (Product) q.getSingleResult();
			} catch (NoResultException e) {
				p = null;
			}
			
		}
		return p;
	}

	@Override
	public List<Product> findAlProducts() throws Exception {
		List<Product> p = new ArrayList<Product>();
		
		Query q = entiMan.createNamedQuery(Product.FIND_ALL);
		
		p = q.getResultList();
		
		return p;
	}

	@Override
	public Stock findByIdStock(int id) throws Exception {
		Stock s = new Stock();
		
		if(id>0) {
			Query q = entiMan.createNamedQuery(Stock.FIND_BY_ID)
					.setParameter("sId", id);
			
			try {
				s = (Stock) q.getSingleResult();
			} catch (NoResultException e) {
				s = null;
			}
			
		}
		return s;
	}

	@Override
	public List<Stock> findAllStocks() throws Exception {
		List<Stock> s = new ArrayList<Stock>();
		
		Query q = entiMan.createNamedQuery(Stock.FIND_ALL);
		
		s = q.getResultList();
		
		return s;
	}

	@Override
	public Supplier findByIdSupplier(int id) throws Exception {
		Supplier sp = new Supplier();
		
		if(id>0) {
			Query q = entiMan.createNamedQuery(Supplier.FIND_BY_ID)
					.setParameter("spId", id);
			
			try {
				sp = (Supplier) q.getSingleResult();
			} catch (NoResultException e) {
				sp = null;
			}
			
		}
		
		return sp;
	}

	@Override
	public List<Supplier> findAllSuppliers() throws Exception {
		List<Supplier> sp = new ArrayList<Supplier>();
		
		Query q = entiMan.createNamedQuery(Supplier.FIND_ALL);
		
		sp = q.getResultList();
		
		return sp;
	}

	@Override
	public Warehouse findByIdWarehouse(int id) throws Exception {
		
		Warehouse w = new Warehouse();
		
		if(id>0) {
			Query q = entiMan.createNamedQuery(Warehouse.FIND_BY_ID)
					.setParameter("wId", id);
			
			try {
				w = (Warehouse) q.getSingleResult();
			} catch (NoResultException e) {
				w = null;
			}
			
		}
		return w;
	}

	@Override
	public List<Warehouse> findAlWarehousesl() throws Exception {
		
		List<Warehouse> w = new ArrayList<Warehouse>();
		
		Query q = entiMan.createNamedQuery(Warehouse.FIND_ALL);
		
		w = q.getResultList();
		
		return w;
	}

	@Override
	public List<Warehouse> findBySupplierId(int id) throws Exception {
		List<Warehouse> warehouses = new ArrayList<Warehouse>();
		
		//Query q = entiMan.createNamedQuery(Warehouse.);
		
		return warehouses;
	}

}
