package com.ustados.ejb_dos.modelpostgresql;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the invoice database table.
 * 
 */
@Entity
public class Invoice implements Serializable {
	private static final long serialVersionUID = 1L;

	//! Variable de la consulta
	public static final String FIND_BY_ID = "Invoice.FIND_BY_ID";
	public static final String FIND_ALL = "Invoice.FIND_ALL";

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_invoice")
	private Long idInvoice;

	@Column(name="id_client")
	private Long idClient;

	@Column(name="id_stock")
	private Long idStock;

	@Column(name="sale_date")
	private Timestamp saleDate;

	@Column(name="sell_price")
	private float sellPrice;

	@Column(name="sold_units")
	private Integer soldUnits;

	public Invoice() {
	}

	public Long getIdInvoice() {
		return this.idInvoice;
	}

	public void setIdInvoice(Long idInvoice) {
		this.idInvoice = idInvoice;
	}

	public Long getIdClient() {
		return this.idClient;
	}

	public void setIdClient(Long idClient) {
		this.idClient = idClient;
	}

	public Long getIdStock() {
		return this.idStock;
	}

	public void setIdStock(Long idStock) {
		this.idStock = idStock;
	}

	public Timestamp getSaleDate() {
		return this.saleDate;
	}

	public void setSaleDate(Timestamp saleDate) {
		this.saleDate = saleDate;
	}

	public float getSellPrice() {
		return this.sellPrice;
	}

	public void setSellPrice(float sellPrice) {
		this.sellPrice = sellPrice;
	}

	public Integer getSoldUnits() {
		return this.soldUnits;
	}

	public void setSoldUnits(Integer soldUnits) {
		this.soldUnits = soldUnits;
	}

}