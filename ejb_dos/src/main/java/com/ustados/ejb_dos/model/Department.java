package com.ustados.ejb_dos.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the department database table.
 * 
 */
@Entity
public class Department implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_department")
	private Integer idDepartment;

	private String name;

	public Department() {
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