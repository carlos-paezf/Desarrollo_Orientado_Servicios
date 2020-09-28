package com.ustados.servicessoap.services;

import java.io.Serializable;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

import com.mysql.model.Costumer;
import com.ustados.ejb_dos.services.InventarioServiceMySQL;
import com.ustados.servicessoap.facade.FacadeServicesMySQL;

import org.apache.poi.ss.formula.functions.T;

@WebService(name = "ustainventario")
@Stateless
public class InventarioMySQLUsta implements Serializable {

    @EJB
    FacadeServicesMySQL<T> facadeServicesMySQL;
    /**
     * 
     */
    private static final long serialVersionUID = 1L;

    @EJB
    private InventarioServiceMySQL<T> inventario;

    @WebMethod(operationName = "clientByDocument")
    public Costumer searchClientByDocument(@WebParam(name = "document") String document) {
        Costumer costumer = new Costumer();
        costumer = facadeServicesMySQL.searchCostumerDocument(document);
        return costumer;
    }
}