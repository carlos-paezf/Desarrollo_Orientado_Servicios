package com.mysql.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the stock database table.
 * 
 */
@Entity
@Table(name = "stock")
public class StockMysql implements Serializable {
	private static final long serialVersionUID = 1L;
	
	public static final String FIND_ALL = "StockMysql.FIND_ALL";
	
	public static final String FIND_ALL_ID= "StockMysql.FIND_ALL_ID";

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_stock")
	private int idStock;

	private int amount;

	@Column(name="name_stock")
	private String nameStock;

	public StockMysql() {
	}

	public int getIdStock() {
		return this.idStock;
	}

	public void setIdStock(int idStock) {
		this.idStock = idStock;
	}

	public int getAmount() {
		return this.amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public String getNameStock() {
		return this.nameStock;
	}

	public void setNameStock(String nameStock) {
		this.nameStock = nameStock;
	}

}