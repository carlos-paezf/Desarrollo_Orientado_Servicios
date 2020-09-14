package com.ustados.ejb_dos.services;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Local;
import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;

import com.ustados.ejb_dos.interfaces.IObjectFacadeMySQL;
import com.ustados.ejb_dos.interfaces.InventarioFacade;
import com.ustados.ejb_dos.modelmysql.*;

/* 
 * 
 * Clase que se encarga de administrar las transacciones con el bean indicado
 * @author David Ferrer
 *
 */

@Local
@Stateless
@TransactionAttribute(TransactionAttributeType.NOT_SUPPORTED)
public class InventarioServiceMySQL<T> {

    @EJB
    InventarioFacade<T> inventarioFacade;

    @EJB
    IObjectFacadeMySQL facadeObject;

    public void create(T t) throws Exception {
        inventarioFacade.create(t);
    }

    public T update(T t) throws Exception {
        return inventarioFacade.update(t);
    }

    public void delete(T t) throws Exception {
        inventarioFacade.delete(t);
    }

    public T findByID(T t) throws Exception {
        T result = null;
        if (t instanceof BusinessHeadquarter) {
            BusinessHeadquarter b = (BusinessHeadquarter) t;
            result = (T) facadeObject.findByIdBusinessHeadquarter(b.getIdBusinessHeadquarter());
        } else if (t instanceof BusinessHeadquarterProvider) {
            BusinessHeadquarterProvider bp = (BusinessHeadquarterProvider) t;
            result = (T) facadeObject.findByIdbBusinessHeadquarterProvider(bp.getIdBusinessHeadquarterProvider());
        } else if (t instanceof BusinessHeadquarterStock) {
            BusinessHeadquarterStock bs = (BusinessHeadquarterStock) t;
            result = (T) facadeObject.findByIdBusinessHeadquarterStock(bs.getIdBusinessHeadquarterStock());
        } else if (t instanceof Costumer) {
            Costumer c = (Costumer) t;
            result = (T) facadeObject.findByIdCostumer(c.getIdCostumer());
        } else if (t instanceof GeographicLocation) {
            GeographicLocation g = (GeographicLocation) t;
            result = (T) facadeObject.findByIdGeographicLocation(g.getIdGeographicLocation());
        } else if (t instanceof InvoiceMySQL) {
            InvoiceMySQL i = (InvoiceMySQL) t;
            result = (T) facadeObject.findByIdInvoiceMySQL(i.getIdInvoice());
        } else if (t instanceof ProductMySQL) {
            ProductMySQL p = (ProductMySQL) t;
            result = (T) facadeObject.findByIdProductMySQL(p.getIdProduct());
        } else if (t instanceof Provider) {
            Provider pv = (Provider) t;
            result = (T) facadeObject.findByIdProvider(pv.getIdProvider());
        } else if (t instanceof StockInvoice) {
            StockInvoice si = (StockInvoice) t;
            result = (T) facadeObject.findByIdStockInvoice(si.getIdStockInvoice());
        } else if (t instanceof StockMySQL) {
            StockMySQL s = (StockMySQL) t;
            result = (T) facadeObject.findByIdStockMySQL(s.getIdStock());
        }
        return result;
    }

    /*public List<> findAll() throws Exception {
        return facadeObject.();
    }*/
}
