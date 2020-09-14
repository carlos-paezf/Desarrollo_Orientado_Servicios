package com.ustados.ejb_dos.modelmysql;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the stock_invoice database table.
 * 
 */
@Entity
@NamedQuery(name="StockInvoice.findAll", query="SELECT s FROM StockInvoice s")
public class StockInvoice implements Serializable {
	private static final long serialVersionUID = 1L;

	// ! Variable de la consulta
	public static final String FIND_BY_ID = "StockInvoice.FIND_BY_ID";
	public static final String FIND_ALL = "StockInvoice.FIND_ALL";
	
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