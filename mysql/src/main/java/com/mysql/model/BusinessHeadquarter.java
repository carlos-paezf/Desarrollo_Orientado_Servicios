package com.mysql.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the business_headquarter database table.
 * 
 */
@Entity
@Table(name="business_headquarter")
public class BusinessHeadquarter implements Serializable {
	private static final long serialVersionUID = 1L;
	
	public static final String FIND_ALL = "BusinessHeadquarter.FIND_ALL";
	
	public static final String FIND_ALL_ID= "BusinessHeadquarter.FIND_ALL_ID";

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_business_headquarter")
	private int idBusinessHeadquarter;

	private String director;

	@Column(name="id_geographic_location")
	private int idGeographicLocation;

	@Column(name="name_business")
	private String nameBusiness;

	public BusinessHeadquarter() {
	}

	public int getIdBusinessHeadquarter() {
		return this.idBusinessHeadquarter;
	}

	public void setIdBusinessHeadquarter(int idBusinessHeadquarter) {
		this.idBusinessHeadquarter = idBusinessHeadquarter;
	}

	public String getDirector() {
		return this.director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public int getIdGeographicLocation() {
		return this.idGeographicLocation;
	}

	public void setIdGeographicLocation(int idGeographicLocation) {
		this.idGeographicLocation = idGeographicLocation;
	}

	public String getNameBusiness() {
		return this.nameBusiness;
	}

	public void setNameBusiness(String nameBusiness) {
		this.nameBusiness = nameBusiness;
	}

}