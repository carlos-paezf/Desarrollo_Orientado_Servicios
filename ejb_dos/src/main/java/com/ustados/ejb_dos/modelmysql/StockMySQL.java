package com.ustados.ejb_dos.modelmysql;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the stock database table.
 * 
 */
@Entity
@Table(name = "stock")
@NamedQuery(name="Stock.findAll", query="SELECT s FROM StockMySQL s")
public class StockMySQL implements Serializable {
	private static final long serialVersionUID = 1L;

	// ! Variable de la consulta
	public static final String FIND_BY_ID = "Stock.FIND_BY_ID";
	public static final String FIND_ALL = "Stock.FIND_ALL";
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_stock")
	private int idStock;

	private int amount;

	@Column(name="name_stock")
	private String nameStock;

	public StockMySQL() {
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