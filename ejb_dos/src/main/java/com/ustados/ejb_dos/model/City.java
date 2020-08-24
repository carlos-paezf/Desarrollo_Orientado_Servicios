package com.ustados.ejb_dos.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the city database table.
 * 
 */
@Entity
@NamedQuery(name="City.findAll", query="SELECT c FROM City c")
public class City implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_city")
	private Integer idCity;

	@Column(name="id_department")
	private Integer idDepartment;

	private String name;

	public City() {
	}

	public Integer getIdCity() {
		return this.idCity;
	}

	public void setIdCity(Integer idCity) {
		this.idCity = idCity;
	}

	public Integer getIdDepartment() {
		return this.idDepartment;
	}

	public void setIdDepartment(Integer idDepartment) {
		this.idDepartment = idDepartment;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

}