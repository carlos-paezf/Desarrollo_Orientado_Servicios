package com.ustados.ejb_dos.interfaces;

import java.util.List;

import javax.ejb.Remote;

import com.mysql.model.BusinessHeadquarter;
import com.mysql.model.BusinessHeadquarterProvider;
import com.mysql.model.BusinessHeadquarterStock;
import com.mysql.model.Costumer;
import com.mysql.model.GeographicLocation;
import com.mysql.model.InvoiceMySQL;
import com.mysql.model.ProductMySQL;
import com.mysql.model.Provider;
import com.mysql.model.StockInvoice;
import com.mysql.model.StockMySQL;


@Remote
public interface IObjectFacadeMySQL {

    public GeographicLocation findByIdGeographicLocation(int id) throws Exception;

    public List<GeographicLocation> findAllGeographicLocations() throws Exception;

    public BusinessHeadquarter findByIdBusinessHeadquarter(int id) throws Exception;

    public List<BusinessHeadquarter> findAllBusinessHeadquarters() throws Exception;

    public BusinessHeadquarterProvider findByIdbBusinessHeadquarterProvider(int id) throws Exception;

    public List<BusinessHeadquarterProvider> findAllBusinessHeadquarterProviders() throws Exception;

    public BusinessHeadquarterStock findByIdBusinessHeadquarterStock(int id) throws Exception;
    
    public List<BusinessHeadquarterStock> findAllBusinessHeadquarterStocks() throws Exception;
    
    public Costumer findByIdCostumer(int id) throws Exception;

    public List<Costumer> findAllCostumers() throws Exception;

    public InvoiceMySQL findByIdInvoiceMySQL(int id) throws Exception;

    public List<InvoiceMySQL> findAllInvoiceMySQLs() throws Exception;

    public ProductMySQL findByIdProductMySQL(int id) throws Exception;

    public List<ProductMySQL> findAllProductMySQLs() throws Exception;

    public Provider findByIdProvider(int id) throws Exception;

    public List<Provider> findAllProviders() throws Exception;

    public StockInvoice findByIdStockInvoice(int id) throws Exception;

    public List<StockInvoice> findAllStockInvoices() throws Exception;

    public StockMySQL findByIdStockMySQL(int id) throws Exception;

    public List<StockMySQL> findAllStockMySQLs() throws Exception;

    /**
     * Busca las _________ según el _______
     * 
     * @param id
     * @return
     * @throws Exception
     */
    //public List<> findById(int id) throws Exception;
}
