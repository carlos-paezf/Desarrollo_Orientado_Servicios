package com.mysql.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the stock_invoice database table.
 * 
 */
@Entity
@Table(name="stock_invoice")
public class StockInvoice implements Serializable {
	private static final long serialVersionUID = 1L;
	
	public static final String FIND_ALL = "StockInvoice.FIND_ALL";
	
	public static final String FIND_ALL_ID= "StockInvoice.FIND_ALL_ID";

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_stock_invoice")
	private int idStockInvoice;

	@Column(name="id_invoice")
	private int idInvoice;

	@Column(name="id_stock")
	private int idStock;

	public StockInvoice() {
	}

	public int getIdStockInvoice() {
		return this.idStockInvoice;
	}

	public void setIdStockInvoice(int idStockInvoice) {
		this.idStockInvoice = idStockInvoice;
	}

	public int getIdInvoice() {
		return this.idInvoice;
	}

	public void setIdInvoice(int idInvoice) {
		this.idInvoice = idInvoice;
	}

	public int getIdStock() {
		return this.idStock;
	}

	public void setIdStock(int idStock) {
		this.idStock = idStock;
	}

}