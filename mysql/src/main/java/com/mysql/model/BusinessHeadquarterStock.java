package com.mysql.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the business_headquarter_stock database table.
 * 
 */
@Entity
public class BusinessHeadquarterStock implements Serializable {
	private static final long serialVersionUID = 1L;

	// ! Variable de la consulta
	public static final String FIND_BY_ID = "BusinessHeadquarterStock.FIND_BY_ID";
	public static final String FIND_ALL = "BusinessHeadquarterStock.FIND_ALL";

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_business_headquarter_stock")
	private int idBusinessHeadquarterStock;

	@Column(name="id_business_headquarter")
	private int idBusinessHeadquarter;

	@Column(name="id_stock")
	private int idStock;

	public BusinessHeadquarterStock() {
	}

	public int getIdBusinessHeadquarterStock() {
		return this.idBusinessHeadquarterStock;
	}

	public void setIdBusinessHeadquarterStock(int idBusinessHeadquarterStock) {
		this.idBusinessHeadquarterStock = idBusinessHeadquarterStock;
	}

	public int getIdBusinessHeadquarter() {
		return this.idBusinessHeadquarter;
	}

	public void setIdBusinessHeadquarter(int idBusinessHeadquarter) {
		this.idBusinessHeadquarter = idBusinessHeadquarter;
	}

	public int getIdStock() {
		return this.idStock;
	}

	public void setIdStock(int idStock) {
		this.idStock = idStock;
	}

}