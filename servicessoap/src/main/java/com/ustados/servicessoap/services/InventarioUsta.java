package com.ustados.servicessoap.services;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

import org.apache.poi.ss.formula.functions.T;

import com.ustados.ejb_dos.modelpostgresql.Warehouse;
import com.ustados.servicessoap.facade.FacadeServices;

/**
 * @author DavidFerrer ip:port/nombreproyecto/servicio.wsdl ejm->
 *         localhost:8081/servicessoap/inventario.wsdl
 */

// ! Con esta anotación, defino la clase como servicio tipo SOAP
@WebService(name = "inventario")
// ! Con esta anotacion defino el bean de session sin estado
@Stateless
public class InventarioUsta implements Serializable {

    @EJB
    FacadeServices<T> facade;
    /**
     * 
     */
    private static final long serialVersionUID = 1L;

    @WebMethod(operationName = "warehouses")
    public List<Warehouse> listWarehouses(@WebParam(name = "idSupplier") Long idSup) {
        List<Warehouse> w = new ArrayList<Warehouse>();
        try {
            w = facade.findAll(idSup.intValue());
        } catch (Exception e) {
            w = null;
        }
        return w;
    }
}
