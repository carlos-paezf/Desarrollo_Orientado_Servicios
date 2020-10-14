package com.usta.ejb_dos.enums;

public enum ObjectConstants {

	BUSINESSHEADQUATER(1,"BusinessHeadquarter"),
	BUSINESSHEADQUATERPROVIDER(2,"BusinessHeadquarterProvider"),
	BUSINESSHEADQUATERSTOCK(3,"BusinessHeadquarterStock"),
	COSTUMER(4,"Costumer"),
	GEOGRAPHICLOGIC(5,"GeographicLocation"),
	INVOICESMSQL(6,"InvoiceMysql"),
	PRODUCTMYSQL(7,"ProductMysql"),
	PROVIDER(8,"Provider"),
	STOCKINVOICE(9,"SctockInvoice"),
	STOCKMYSQK(10,"StockMysql");
	
	public int idEnum;
	
	public String description;

	private ObjectConstants(int idEnum, String description) {
		this.idEnum = idEnum;
		this.description = description;
	}

	public int getIdEnum() {
		return idEnum;
	}

	public String getDescription() {
		return description;
	}
	
	
	
}