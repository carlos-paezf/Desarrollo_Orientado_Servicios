package com.mysql.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the costumer database table.
 * 
 */
@Entity
public class Costumer implements Serializable {
	private static final long serialVersionUID = 1L;
	
	public static final String FIND_ALL = "Costumer.FIND_ALL";
	
	public static final String FIND_ALL_ID= "Costumer.FIND_ALL_ID";

	public static final String FIND_BY_DOCUMENT = "Costumer.FIND_BY_DOCUMENT";
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_costumer")
	private int idCostumer;

	@Temporal(TemporalType.DATE)
	@Column(name="date_of_birth")
	private Date dateOfBirth;

	private String email;

	private String gender;

	@Column(name="id_geographic_location")
	private int idGeographicLocation;

	private String name;

	@Column(name="phone_number")
	private String phoneNumber;

	private String surname;
	
	private String document;
	
	public Costumer() {
	}

	public int getIdCostumer() {
		return this.idCostumer;
	}

	public void setIdCostumer(int idCostumer) {
		this.idCostumer = idCostumer;
	}

	public Date getDateOfBirth() {
		return this.dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getGender() {
		return this.gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getIdGeographicLocation() {
		return this.idGeographicLocation;
	}

	public void setIdGeographicLocation(int idGeographicLocation) {
		this.idGeographicLocation = idGeographicLocation;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhoneNumber() {
		return this.phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getSurname() {
		return this.surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getDocument() {
		return document;
	}

	public void setDocument(String document) {
		this.document = document;
	}

}