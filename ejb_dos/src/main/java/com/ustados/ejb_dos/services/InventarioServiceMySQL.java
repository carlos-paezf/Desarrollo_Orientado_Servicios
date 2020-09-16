package com.ustados.ejb_dos.services;

import javax.ejb.EJB;
import javax.ejb.Local;
import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;

import com.ustados.ejb_dos.emnus.MotorBdEnum;
import com.ustados.ejb_dos.interfaces.IObjectFacadeMySQL;
import com.ustados.ejb_dos.interfaces.InventarioFacade;

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

    public T searchByDocument(String document, MotorBdEnum bdMotor) throws Exception{
        return inventarioFacade.searchByDocument(document, bdMotor);
    }

    public T findByID(int id, int clase) throws Exception {
        T result = null;
        switch (clase) {
            case 1:
                result = (T) facadeObject.findByIdBusinessHeadquarter(id);
                break;
            case 2:
                result = (T) facadeObject.findByIdbBusinessHeadquarterProvider(id);
                break;
            case 3:
                result = (T) facadeObject.findByIdBusinessHeadquarterStock(id);
                break;
            case 4:
                result = (T) facadeObject.findByIdCostumer(id);
                break;
            case 5:
                result = (T) facadeObject.findByIdGeographicLocation(id);
                break;
            case 6:
                result = (T) facadeObject.findByIdInvoiceMySQL(id);
                break;
            case 7:
                result = (T) facadeObject.findByIdProductMySQL(id);
                break;
            case 8:
                result = (T) facadeObject.findByIdProvider(id);
                break;
            case 9:
                result = (T) facadeObject.findByIdStockInvoice(id);
                break;
            case 10:
                result = (T) facadeObject.findByIdStockMySQL(id);
                break;
            default:
                break;
        }
        return result;
    }

    /*
     * public List<> findAll() throws Exception { return facadeObject.(); }
     */
}
