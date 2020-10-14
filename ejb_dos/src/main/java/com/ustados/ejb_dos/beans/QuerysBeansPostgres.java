package com.ustados.ejb_dos.beans;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Local;
import javax.ejb.LocalBean;
import javax.ejb.LocalHome;
import javax.ejb.Stateless;
import javax.ejb.TransactionManagement;
import javax.ejb.TransactionManagementType;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import com.mysql.model.BusinessHeadquarter;
import com.mysql.model.BusinessHeadquarterProvider;
import com.mysql.model.BusinessHeadquarterStock;
import com.mysql.model.Costumer;
import com.mysql.model.GeographicLocation;
import com.mysql.model.InvoiceMysq;
import com.mysql.model.ProductMysql;
import com.mysql.model.Provider;
import com.mysql.model.StockInvoice;
import com.mysql.model.StockMysql;
import com.postgres.model.City;
import com.ustados.ejb_dos.interfaces.IObjectFacadeMysql;

@Stateless
@LocalBean
@TransactionManagement(TransactionManagementType.CONTAINER)
public class QuerysBeansPostgres implements IObjectFacadeMysql{


	@PersistenceContext(unitName = "mysqlEjb")
	EntityManager em;
	
	
	@Override
	public BusinessHeadquarter findByIdBusinessHeadquarter(int id) throws Exception {
		return em.find(BusinessHeadquarter.class, id);
	}

	@Override
	public List<BusinessHeadquarter> findAllBusinessHeadquarter() throws Exception {
		
		Query q = em.createNamedQuery(BusinessHeadquarter.FIND_ALL);
		
		List<BusinessHeadquarter> b = q.getResultList();
		return b;
	}

	@Override
	public BusinessHeadquarterProvider findByIdBusinessHeadquarterProvider(int id) throws Exception {
		return em.find(BusinessHeadquarterProvider.class, id);
	}

	@Override
	public List<BusinessHeadquarterProvider> findAllBusinessHeadquarterProvider() throws Exception {
		
		Query q = em.createNamedQuery(BusinessHeadquarterProvider.FIND_ALL);
		
		List<BusinessHeadquarterProvider> b = q.getResultList();
		return b;
	}

	@Override
	public BusinessHeadquarterStock findByIdBusinessHeadquarterStock(int id) throws Exception {
		return em.find(BusinessHeadquarterStock.class, id);
	}

	@Override
	public List<BusinessHeadquarterStock> findAllBusinessHeadquarterStock() throws Exception {
		Query q = em.createNamedQuery(BusinessHeadquarterStock.FIND_ALL);
		
		List<BusinessHeadquarterStock> b = q.getResultList();
		return b;
	}

	@Override
	public Costumer findByIdInvoice(int id) throws Exception {
		return em.find(Costumer.class, id);
	}

	@Override
	public List<Costumer> findAllInvoices() throws Exception {
		Query q = em.createNamedQuery(Costumer.FIND_ALL);
		
		List<Costumer> b = q.getResultList();
		return b;
	}

	@Override
	public GeographicLocation findByIdGeographicLocation(int id) throws Exception {
		return em.find(GeographicLocation.class, id);
	}

	@Override
	public List<GeographicLocation> findAlGeographicLocation() throws Exception {
		Query q = em.createNamedQuery(GeographicLocation.FIND_ALL);
		
		List<GeographicLocation> b = q.getResultList();
		return b;
	}

	@Override
	public InvoiceMysq findByIdInvoiceMysq(int id) throws Exception {
		return em.find(InvoiceMysq.class, id);
	}

	@Override
	public List<InvoiceMysq> findAllInvoiceMysq() throws Exception {
		Query q = em.createNamedQuery(InvoiceMysq.FIND_ALL);
		
		List<InvoiceMysq> b = q.getResultList();
		return b;
	}

	@Override
	public ProductMysql findByIdProductMysql(int id) throws Exception {
		return em.find(ProductMysql.class, id);
	}

	@Override
	public List<ProductMysql> findAllProductMysql() throws Exception {
		Query q = em.createNamedQuery(ProductMysql.FIND_ALL);
		
		List<ProductMysql> b = q.getResultList();
		return b;
	}

	@Override
	public Provider findByIdProvider(int id) throws Exception {
		return em.find(Provider.class, id);
	}

	@Override
	public List<Provider> findAlProvider() throws Exception {
		Query q = em.createNamedQuery(Provider.FIND_ALL);
		
		List<Provider> b = q.getResultList();
		return b;
	}

	@Override
	public StockInvoice findByIDStockInvoice(int id) throws Exception {
		return em.find(StockInvoice.class, id);
	}

	@Override
	public List<StockInvoice> findBySupplierId() throws Exception {
		Query q = em.createNamedQuery(StockInvoice.FIND_ALL);
		
		List<StockInvoice> b = q.getResultList();
		return b;
	}

	@Override
	public StockMysql findByIDStockMysql(int id) throws Exception {
		return em.find(StockMysql.class, id);
	}

	@Override
	public List<StockMysql> findByStockMysql() throws Exception {
		Query q = em.createNamedQuery(StockMysql.FIND_ALL);
		
		List<StockMysql> b = q.getResultList();
		return b;
	}

	@Override
	public Costumer findByIDSCostumer(int id) throws Exception {
		return em.find(Costumer.class, id);
	}

	@Override
	public List<Costumer> findByCostumers() throws Exception {
		Query q = em.createNamedQuery(StockMysql.FIND_ALL);
		
		List<Costumer> b = q.getResultList();
		return b;
	}

}
