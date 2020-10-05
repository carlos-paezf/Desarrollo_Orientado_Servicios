package com.ustados.ejb_dos.beans;

import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.ejb.TransactionManagement;
import javax.ejb.TransactionManagementType;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

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
import com.ustados.ejb_dos.interfaces.IObjectFacadeMySQL;

@Stateless // Bean con estado
@LocalBean
@TransactionManagement(TransactionManagementType.CONTAINER)
public class QuerysBeanMySQL implements IObjectFacadeMySQL {

    @PersistenceContext(unitName = "ejb_dos_mysql")
    EntityManager entityManager;

    @Override
    public GeographicLocation findByIdGeographicLocation(int id) throws Exception {
        return entityManager.find(GeographicLocation.class, id);
    }

    @Override
    public List<GeographicLocation> findAllGeographicLocations() throws Exception {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public BusinessHeadquarter findByIdBusinessHeadquarter(int id) throws Exception {
        return entityManager.find(BusinessHeadquarter.class, id);
    }

    @Override
    public List<BusinessHeadquarter> findAllBusinessHeadquarters() throws Exception {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public BusinessHeadquarterProvider findByIdbBusinessHeadquarterProvider(int id) throws Exception {
        return entityManager.find(BusinessHeadquarterProvider.class, id);
    }

    @Override
    public List<BusinessHeadquarterProvider> findAllBusinessHeadquarterProviders() throws Exception {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public BusinessHeadquarterStock findByIdBusinessHeadquarterStock(int id) throws Exception {
        return entityManager.find(BusinessHeadquarterStock.class, id);
    }

    @Override
    public List<Costumer> findAllCostumers() throws Exception {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public InvoiceMySQL findByIdInvoiceMySQL(int id) throws Exception {
        return entityManager.find(InvoiceMySQL.class, id);
    }

    @Override
    public List<InvoiceMySQL> findAllInvoiceMySQLs() throws Exception {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public ProductMySQL findByIdProductMySQL(int id) throws Exception {
        return entityManager.find(ProductMySQL.class, id);
    }

    @Override
    public List<ProductMySQL> findAllProductMySQLs() throws Exception {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Provider findByIdProvider(int id) throws Exception {
        return entityManager.find(Provider.class, id);
    }

    @Override
    public List<Provider> findAllProviders() throws Exception {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public StockInvoice findByIdStockInvoice(int id) throws Exception {
        return entityManager.find(StockInvoice.class, id);
    }

    @Override
    public List<StockInvoice> findAllStockInvoices() throws Exception {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public StockMySQL findByIdStockMySQL(int id) throws Exception {
        return entityManager.find(StockMySQL.class, id);
    }

    @Override
    public List<StockMySQL> findAllStockMySQLs() throws Exception {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public List<BusinessHeadquarterStock> findAllBusinessHeadquarterStocks() throws Exception {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Costumer findByIdCostumer(int id) throws Exception {
        // TODO Auto-generated method stub
        return null;
    }

    
}
