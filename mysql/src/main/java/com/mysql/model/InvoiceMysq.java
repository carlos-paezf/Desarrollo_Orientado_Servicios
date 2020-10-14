package com.mysql.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the invoice database table.
 * 
 */
@Entity
@Table(name = "invoice")
public class InvoiceMysq implements Serializable {
	private static final long serialVersionUID = 1L;
	
	public static final String FIND_ALL = "InvoiceMysq.FIND_ALL";
	
	public static final String FIND_ALL_ID= "InvoiceMysq.FIND_ALL_ID";

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_invoice")
	private int idInvoice;

	@Temporal(TemporalType.DATE)
	@Column(name="date_invoice")
	private Date dateInvoice;

	private String description;

	@Column(name="id_costumer")
	private int idCostumer;

	private double total;

	public InvoiceMysq() {
	}

	public int getIdInvoice() {
		return this.idInvoice;
	}

	public void setIdInvoice(int idInvoice) {
		this.idInvoice = idInvoice;
	}

	public Date getDateInvoice() {
		return this.dateInvoice;
	}

	public void setDateInvoice(Date dateInvoice) {
		this.dateInvoice = dateInvoice;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getIdCostumer() {
		return this.idCostumer;
	}

	public void setIdCostumer(int idCostumer) {
		this.idCostumer = idCostumer;
	}

	public double getTotal() {
		return this.total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

}