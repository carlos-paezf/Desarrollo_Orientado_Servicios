package com.ustados.ejb_dos.interfaces;

import java.util.List;

import javax.ejb.Remote;

import com.ustados.ejb_dos.modelmysql.BusinessHeadquarter;
import com.ustados.ejb_dos.modelmysql.BusinessHeadquarterProvider;
import com.ustados.ejb_dos.modelmysql.BusinessHeadquarterStock;
import com.ustados.ejb_dos.modelmysql.Costumer;
import com.ustados.ejb_dos.modelmysql.GeographicLocation;
import com.ustados.ejb_dos.modelmysql.InvoiceMySQL;
import com.ustados.ejb_dos.modelmysql.ProductMySQL;
import com.ustados.ejb_dos.modelmysql.Provider;
import com.ustados.ejb_dos.modelmysql.StockInvoice;
import com.ustados.ejb_dos.modelmysql.StockMySQL;


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
