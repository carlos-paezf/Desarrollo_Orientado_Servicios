package com.ustados.servicessoap.facade;

import java.io.Serializable;

import javax.ejb.EJB;

import com.mysql.model.Costumer;
import com.ustados.ejb_dos.emnus.MotorBdEnum;
import com.ustados.ejb_dos.services.InventarioServiceMySQL;

public class FacadeServicesMySQL<T> implements Serializable{
    
    @EJB
    private InventarioServiceMySQL<T> inventarioServiceMySQL;

    public Costumer searchCostumerDocument(String document){
        Costumer costumer = new Costumer();
        try {
            costumer = (Costumer) inventarioServiceMySQL.searchByDocument(document, MotorBdEnum.MYSQL);
        } catch (Exception e) {
            //TODO: handle exception
        }
        return costumer;
    }
}
