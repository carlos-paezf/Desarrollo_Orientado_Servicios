package com.ustados.servicessoap.facade;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Stateless;

import com.postgresql.model.Client;
import com.postgresql.model.Warehouse;
import com.ustados.ejb_dos.enums.MotorBdEnum;
import com.ustados.ejb_dos.services.InventarioServicePostgreSQL;

/**
 * @author DavidFerrer
 */

// ! Clase intermedia para el llamado de la capa logica y las capas del SOAP
@Stateless
public class FacadeServicesPostgreSQL<T> implements Serializable {
    @EJB
    InventarioServicePostgreSQL<T> inventarioServicePostgreSQL;

    /**
     * Método que invoca la busqueda de las sucursales. Nos ayuda a hacer las
     * consultas
     */
    public List<Warehouse> findAll(int id) {
        List<Warehouse> warehouses = new ArrayList<Warehouse>();
        try {
            warehouses = inventarioServicePostgreSQL.findAll();
        } catch (Exception e) {
            warehouses = null;
        }
        return warehouses;
    }

    /**
     * 
     * @param document
     * @return
     */
    public Client searchClientDocument(String document){
        Client client = new Client();
        try {
            client = (Client) inventarioServicePostgreSQL.searchByDocument(document, MotorBdEnum.POSTGRESQL);
        } catch (Exception e) {
            client = null;
        }
        return client;
    }

}
