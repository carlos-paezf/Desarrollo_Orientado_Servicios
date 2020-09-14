package com.ustados.ejb_dos.beans;

import java.util.List;

import javax.ejb.Local;
import javax.ejb.Stateless;
import javax.ejb.TransactionManagement;
import javax.ejb.TransactionManagementType;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.ustados.ejb_dos.interfaces.IObjectFacadeMySQL;
import com.ustados.ejb_dos.modelmysql.*;

@Stateless // Bean con estado
@Local
@TransactionManagement(TransactionManagementType.CONTAINER)
public class QuerysBeanMySQL implements IObjectFacadeMySQL {

    @PersistenceContext(unitName = "ejb_dos")
    EntityManager entityManager;

    @Override
    public GeographicLocation findByIdGeographicLocation(int id) throws Exception {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public List<GeographicLocation> findAllGeographicLocations() throws Exception {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public BusinessHeadquarter findByIdBusinessHeadquarter(int id) throws Exception {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public List<BusinessHeadquarter> findAllBusinessHeadquarters() throws Exception {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public BusinessHeadquarterProvider findByIdbBusinessHeadquarterProvider(int id) throws Exception {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public List<BusinessHeadquarterProvider> findAllBusinessHeadquarterProviders() throws Exception {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public BusinessHeadquarterStock findByIdBusinessHeadquarterStock(int id) throws Exception {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public List<Costumer> findAllCostumers() throws Exception {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public InvoiceMySQL findByIdInvoiceMySQL(int id) throws Exception {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public List<InvoiceMySQL> findAllInvoiceMySQLs() throws Exception {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public ProductMySQL findByIdProductMySQL(int id) throws Exception {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public List<ProductMySQL> findAllProductMySQLs() throws Exception {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Provider findByIdProvider(int id) throws Exception {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public List<Provider> findAllProviders() throws Exception {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public StockInvoice findByIdStockInvoice(int id) throws Exception {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public List<StockInvoice> findAllStockInvoices() throws Exception {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public StockMySQL findByIdStockMySQL(int id) throws Exception {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public List<StockMySQL> findAllStockMySQLs() throws Exception {
        // TODO Auto-generated method stub
        return null;
    }

    
}
