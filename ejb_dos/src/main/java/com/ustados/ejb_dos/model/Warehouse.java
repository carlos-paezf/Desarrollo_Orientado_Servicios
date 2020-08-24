package com.ustados.ejb_dos.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the warehouse database table.
 * 
 */
@Entity
@NamedQuery(name="Warehouse.findAll", query="SELECT w FROM Warehouse w")
public class Warehouse implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_warehouse")
	private Integer idWarehouse;

	private String address;

	private String administrator;

	@Column(name="capacity_per_m2")
	private String capacityPerM2;

	@Column(name="id_city")
	private Integer idCity;

	public Warehouse() {
	}

	public Integer getIdWarehouse() {
		return this.idWarehouse;
	}

	public void setIdWarehouse(Integer idWarehouse) {
		this.idWarehouse = idWarehouse;
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getAdministrator() {
		return this.administrator;
	}

	public void setAdministrator(String administrator) {
		this.administrator = administrator;
	}

	public String getCapacityPerM2() {
		return this.capacityPerM2;
	}

	public void setCapacityPerM2(String capacityPerM2) {
		this.capacityPerM2 = capacityPerM2;
	}

	public Integer getIdCity() {
		return this.idCity;
	}

	public void setIdCity(Integer idCity) {
		this.idCity = idCity;
	}

}