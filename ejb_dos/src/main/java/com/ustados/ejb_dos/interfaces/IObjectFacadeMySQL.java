package com.ustados.ejb_dos.interfaces;

import java.util.List;

import javax.ejb.Remote;

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


@Remote
public interface IObjectFacadeMysql {

	/**
	 * 
	 * @param id
	 * @return
	 * @throws Exception
	 */
	public BusinessHeadquarter findByIdBusinessHeadquarter(int id) throws Exception;
	
	/**
	 * 
	 * @return
	 * @throws Exception
	 */
	public List<BusinessHeadquarter> findAllBusinessHeadquarter() throws Exception;
	
	/**
	 * 
	 * @param id
	 * @return
	 * @throws Exception
	 */
	public BusinessHeadquarterProvider findByIdBusinessHeadquarterProvider(int id) throws Exception;
	
	/**
	 * 
	 * @return
	 * @throws Exception
	 */
	public List<BusinessHeadquarterProvider> findAllBusinessHeadquarterProvider() throws Exception;
	
	
	/**
	 * 
	 * @param id
	 * @return
	 * @throws Exception
	 */
	public BusinessHeadquarterStock findByIdBusinessHeadquarterStock(int id) throws Exception;
	
	/**
	 * 
	 * @return
	 * @throws Exception
	 */
	public List<BusinessHeadquarterStock> findAllBusinessHeadquarterStock() throws Exception;
	
	/**
	 * 
	 * @param id
	 * @return
	 * @throws Exception
	 */
	public Costumer findByIdInvoice(int id) throws Exception;
	
	/**
	 * 
	 * @return
	 * @throws Exception
	 */
	public List<Costumer> findAllInvoices() throws Exception;
	
	/**
	 * 
	 * @param id
	 * @return
	 * @throws Exception
	 */
	public GeographicLocation findByIdGeographicLocation(int id) throws Exception;
	
	/**
	 * 
	 * @return
	 * @throws Exception
	 */
	public List<GeographicLocation> findAlGeographicLocation() throws Exception;
	
	/**
	 * 
	 * @param id
	 * @return
	 * @throws Exception
	 */
	public InvoiceMysq findByIdInvoiceMysq(int id) throws Exception;
	
	/**
	 * 
	 * @return
	 * @throws Exception
	 */
	public List<InvoiceMysq> findAllInvoiceMysq() throws Exception;
	
	/**
	 * 
	 * @param id
	 * @return
	 * @throws Exception
	 */
	public ProductMysql findByIdProductMysql(int id) throws Exception;
	
	/**
	 * 
	 * @return
	 * @throws Exception
	 */
	public List<ProductMysql> findAllProductMysql() throws Exception;
	
	/**
	 * 
	 * @param id
	 * @return
	 * @throws Exception
	 */
	public Provider findByIdProvider(int id) throws Exception;
	
	/**
	 * 
	 * @return
	 * @throws Exception
	 */
	public List<Provider> findAlProvider() throws Exception;
	
	/**
	 * 
	 * @param id
	 * @return
	 * @throws Exception
	 */
	public StockInvoice findByIDStockInvoice(int id) throws Exception;
	
	/**
	 * 
	 * @return
	 * @throws Exception
	 */
	public List<StockInvoice> findBySupplierId() throws Exception;
	
	/**
	 * 
	 * @param id
	 * @return
	 * @throws Exception
	 */
	public StockMysql findByIDStockMysql(int id) throws Exception;
	
	/**
	 * 
	 * @return
	 * @throws Exception
	 */
	public List<StockMysql> findByStockMysql() throws Exception;
	
	/**
	 * 
	 * @param id
	 * @return
	 * @throws Exception
	 */
	public Costumer findByIDSCostumer(int id) throws Exception;
	
	/**
	 * 
	 * @return
	 * @throws Exception
	 */
	public List<Costumer> findByCostumers() throws Exception;
	
	
}
