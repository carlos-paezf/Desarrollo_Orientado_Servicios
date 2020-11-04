package com.soapclient.webclient.clientws;

import java.io.Serializable;
import java.util.Calendar;

import org.datacontract.schemas._2004._07.SICC_Domain.WebStatus;
import org.tempuri.ISistemStatus;
import org.tempuri.SistemStatusLocator;

public class WsSoapClientStatus implements Serializable{

	private static final long seralVersioUID = 1L;
	
	private static final String USER_AND_PASSWORD = "msicc";
	
	public WsSoapClientStatus() {
		super();
	}
	
	/**
	 * Encargado de consumir el servicio que se esta consultando
	 */
	public void statusConsumer() {
		// Variable de Respuesta
		String retorno = "";
		try {
			// Clase donde se ubica el endpoint(url del servicio wsdl)
			SistemStatusLocator locator = new SistemStatusLocator();
			// Interfaz que contiene los metodos a utilizar
			ISistemStatus status = locator.getBasicHttpBinding_ISistemStatus();
			
			String login = status.loginUsuario(USER_AND_PASSWORD, USER_AND_PASSWORD);
			if(login.equals("") && login!=null) {
				WebStatus webStatus = new WebStatus();
				
				Calendar c = Calendar.getInstance();
				webStatus.setCreadoUTC(c);
				
				webStatus.setDisponible(true);
				webStatus.setFechaUTC(c);
				webStatus.setIdApp(0);
				webStatus.setObservaciones("");
				webStatus.setUsuarioCreador("redgis");
				
				Integer respuesta = status.webStatus(login,  webStatus);
				System.out.println("El resultado es: "+ (respuesta == 0 ? "No hay datos" : "Exito de consulta"));
			}
			retorno = "Successful";
		} catch (Exception e) {
			retorno = "fail";
		}
	}
}
