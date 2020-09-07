package com.ustados.servicessoap.facade;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Stateless;

import com.ustados.ejb_dos.model.Supplier;
import com.ustados.ejb_dos.model.Warehouse;
import com.ustados.ejb_dos.services.InventarioService;

/**
 * @author DavidFerrer
 */

// ! Clase intermedia para el llamado de la capa logica y las capas del SOAP
@Stateless
public class FacadeServices<T> implements Serializable {
    @EJB
    InventarioService<T> inventarioService;

    /**
     * Método que invoca la busqueda de las sucursales. Nos ayuda a hacer las
     * consultas
     */
    public List<Warehouse> findAll(int id) {
        List<Warehouse> warehouses = new ArrayList<Warehouse>();
        try {
            warehouses = inventarioService.findAll();
        } catch (Exception e) {
            warehouses = null;
        }
        return warehouses;
    }

}