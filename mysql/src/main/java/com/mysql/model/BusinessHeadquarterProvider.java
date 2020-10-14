package com.mysql.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the business_headquarter_provider database table.
 * 
 */
@Entity
@Table(name="business_headquarter_provider")
public class BusinessHeadquarterProvider implements Serializable {
	private static final long serialVersionUID = 1L;
	
	public static final String FIND_ALL = "BusinessHeadquarterProvider.FIND_ALL";
	
	public static final String FIND_ALL_ID= "BusinessHeadquarterProvider.FIND_ALL_ID";

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_business_headquarter_provider")
	private int idBusinessHeadquarterProvider;

	@Column(name="id_business_headquarter")
	private int idBusinessHeadquarter;

	@Column(name="id_provider")
	private int idProvider;

	public BusinessHeadquarterProvider() {
	}

	public int getIdBusinessHeadquarterProvider() {
		return this.idBusinessHeadquarterProvider;
	}

	public void setIdBusinessHeadquarterProvider(int idBusinessHeadquarterProvider) {
		this.idBusinessHeadquarterProvider = idBusinessHeadquarterProvider;
	}

	public int getIdBusinessHeadquarter() {
		return this.idBusinessHeadquarter;
	}

	public void setIdBusinessHeadquarter(int idBusinessHeadquarter) {
		this.idBusinessHeadquarter = idBusinessHeadquarter;
	}

	public int getIdProvider() {
		return this.idProvider;
	}

	public void setIdProvider(int idProvider) {
		this.idProvider = idProvider;
	}

}