package com.mysql.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the provider database table.
 * 
 */
@Entity
public class Provider implements Serializable {
	private static final long serialVersionUID = 1L;
	
	public static final String FIND_ALL = "Provider.FIND_ALL";
	
	public static final String FIND_ALL_ID= "Provider.FIND_ALL_ID";

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_provider")
	private int idProvider;

	@Column(name="company_name")
	private String companyName;

	private String email;

	@Column(name="manager_name")
	private String managerName;

	@Column(name="manager_surname")
	private String managerSurname;

	private String nit;

	public Provider() {
	}

	public int getIdProvider() {
		return this.idProvider;
	}

	public void setIdProvider(int idProvider) {
		this.idProvider = idProvider;
	}

	public String getCompanyName() {
		return this.companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getManagerName() {
		return this.managerName;
	}

	public void setManagerName(String managerName) {
		this.managerName = managerName;
	}

	public String getManagerSurname() {
		return this.managerSurname;
	}

	public void setManagerSurname(String managerSurname) {
		this.managerSurname = managerSurname;
	}

	public String getNit() {
		return this.nit;
	}

	public void setNit(String nit) {
		this.nit = nit;
	}

}