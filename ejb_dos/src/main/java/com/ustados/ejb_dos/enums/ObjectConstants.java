package com.ustados.ejb_dos.enums;

public enum ObjectConstants {

    BUSINESSHEADQUARTER(1, "BusinessHeadquarter"),
    BUSINESSHEADQUARTERPROVIDER(2, "BusinessHeadquarterProvider"),
    BUSINESSHEADQUARTERSTOCK(3, "BusinessHeadquarterStock"),
    COSTUMER(4, "Costumer"),
    GEOGRAPHICLOCATION(5, "GeographicLocation"),
    INVOICEMYSQL(6, "InvoiceMySQL"),
    PRODUCTMYSQL(7, "ProductMySQL"),
    PROVIDER(8, "Provider"),
    STOCKINVOICE(9, "StockInvoice"),
    STOCKMYSQL(10, "StockMySQL");

    public int idEnum;

    public String description;

    private ObjectConstants(int idEnum, String description){
        this.idEnum = idEnum;
        this.description = description;
    }

    public int getIdEnum(){
        return idEnum;
    }

    public String getDescription(){
        return description;
    }
}
