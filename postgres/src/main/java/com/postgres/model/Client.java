package com.postgres.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the client database table.
 * 
 */
//@Table(name=�cliente�, schema=�inventario�)
@Entity
public class Client implements Serializable {
	private static final long serialVersionUID = 1L;
	
	public static final String FIND_BY_ID ="Client.FIND_BY_ID";
	
	public static final String FIND_ALL ="Client.FIND_ALL";
	
	public static final String FIND_BY_DOCUMENT = "Client.FIND_BY_DOCUMENT";

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_client")
	private Long idClient;

	@Temporal(TemporalType.DATE)
	private Date birthdate;

	@Column(name="contact_email")
	private String contactEmail;

	@Column(name="contact_number")
	private String contactNumber;

	private String document;

	private String gender;

	private String name;

	public Client() {
	}

	public Long getIdClient() {
		return this.idClient;
	}

	public void setIdClient(Long idClient) {
		this.idClient = idClient;
	}

	public Date getBirthdate() {
		return this.birthdate;
	}

	public void setBirthdate(Date birthdate) {
		this.birthdate = birthdate;
	}

	public String getContactEmail() {
		return this.contactEmail;
	}

	public void setContactEmail(String contactEmail) {
		this.contactEmail = contactEmail;
	}

	public String getContactNumber() {
		return this.contactNumber;
	}

	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}

	public String getDocument() {
		return this.document;
	}

	public void setDocument(String document) {
		this.document = document;
	}

	public String getGender() {
		return this.gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

}