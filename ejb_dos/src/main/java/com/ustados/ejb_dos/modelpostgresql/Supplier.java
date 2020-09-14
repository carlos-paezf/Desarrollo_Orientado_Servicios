package com.ustados.ejb_dos.modelpostgresql;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the supplier database table.
 * 
 */
@Entity
public class Supplier implements Serializable {
	private static final long serialVersionUID = 1L;

	//! Variable de la consulta
	public static final String FIND_BY_ID = "Supplier.FIND_BY_ID";
	public static final String FIND_ALL = "Supplier.FIND_ALL";

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_supplier")
	private Integer idSupplier;

	@Column(name="company_name")
	private String companyName;

	@Column(name="contact_number")
	private String contactNumber;

	@Column(name="incharge_person")
	private String inchargePerson;

	public Supplier() {
	}

	public Integer getIdSupplier() {
		return this.idSupplier;
	}

	public void setIdSupplier(Integer idSupplier) {
		this.idSupplier = idSupplier;
	}

	public String getCompanyName() {
		return this.companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getContactNumber() {
		return this.contactNumber;
	}

	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}

	public String getInchargePerson() {
		return this.inchargePerson;
	}

	public void setInchargePerson(String inchargePerson) {
		this.inchargePerson = inchargePerson;
	}

}