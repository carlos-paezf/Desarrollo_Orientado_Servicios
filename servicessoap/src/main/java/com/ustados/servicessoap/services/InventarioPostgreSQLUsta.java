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

import com.ustados.ejb_dos.modelpostgresql.Client;
import com.ustados.ejb_dos.modelpostgresql.Warehouse;
import com.ustados.servicessoap.facade.FacadeServicesPostgreSQL;

/**
 * @author DavidFerrer ip:port/nombreproyecto/servicio.wsdl ejm->
 *         localhost:8081/servicessoap/inventario.wsdl
 */

// ! Con esta anotación, defino la clase como servicio tipo SOAP
@WebService(name = "inventario")
// ! Con esta anotacion defino el bean de session sin estado
@Stateless
public class InventarioPostgreSQLUsta implements Serializable {

    @EJB
    FacadeServicesPostgreSQL<T> facadeServicesPostgreSQL;
    /**
     * 
     */
    private static final long serialVersionUID = 1L;

    @WebMethod(operationName = "warehouses")
    public List<Warehouse> listWarehouses(@WebParam(name = "idSupplier") Long idSup) {
        List<Warehouse> w = new ArrayList<Warehouse>();
        try {
            w = facadeServicesPostgreSQL.findAll(idSup.intValue());
        } catch (Exception e) {
            w = null;
        }
        return w;
    }

    @WebMethod(operationName = "clientByDocument")
    public Client searchClientByDocument(@WebParam(name = "document") String document){
        Client client = new Client();
        client = facadeServicesPostgreSQL.searchClientDocument(document);
        return client;
    }
}
