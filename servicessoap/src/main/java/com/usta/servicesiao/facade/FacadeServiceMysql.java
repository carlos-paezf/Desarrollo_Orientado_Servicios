package com.usta.servicesiao.facade;

import java.io.Serializable;

import javax.ejb.EJB;
import javax.ejb.Stateless;

import org.apache.poi.ss.formula.functions.T;

import com.mysql.model.Costumer;
import com.usta.ejb_dos.enums.MotorBdEnum;
import com.ustados.ejb_dos.services.InventadioServicesMysql;


/**
 * 
 * @author edgarmedina
 *
 * @param <T>
 */
@Stateless
public class FacadeServiceMysql<T> implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	@EJB
	private InventadioServicesMysql<T> inventario;
	
	public Costumer searchCostumerDocument(String document) {
		
		Costumer costumer = new Costumer();
		
		try {
			costumer = (Costumer) inventario.searchByDocument(document, MotorBdEnum.MYSQL);
			
		} catch (Exception e) {
			costumer = null;
		}
		
		return costumer;
		
	}
	

}
