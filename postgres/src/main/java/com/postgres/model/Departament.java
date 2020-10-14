package com.postgres.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the departament database table.
 * 
 */
@Entity
public class Departament implements Serializable {
	private static final long serialVersionUID = 1L;
	
	public static final String FIND_BY_ID ="Departament.FIND_BY_ID";
	
	public static final String FIND_ALL ="Departament.FIND_ALL";

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_department")
	private Integer idDepartment;

	private String name;

	public Departament() {
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