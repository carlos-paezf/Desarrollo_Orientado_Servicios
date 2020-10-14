package com.postgres.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the stock database table.
 * 
 */
@Entity
public class Stock implements Serializable {
	private static final long serialVersionUID = 1L;
	
	public static final String FIND_BY_ID ="Stock.FIND_BY_ID";
	
	public static final String FIND_ALL ="Stock.FIND_ALL";

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_stock")
	private Long idStock;

	@Column(name="id_product")
	private Integer idProduct;

	@Column(name="id_supplier")
	private Integer idSupplier;

	@Column(name="id_warehouse")
	private Integer idWarehouse;

	@Column(name="unitary_cost")
	private float unitaryCost;

	private Integer units;

	public Stock() {
	}

	public Long getIdStock() {
		return this.idStock;
	}

	public void setIdStock(Long idStock) {
		this.idStock = idStock;
	}

	public Integer getIdProduct() {
		return this.idProduct;
	}

	public void setIdProduct(Integer idProduct) {
		this.idProduct = idProduct;
	}

	public Integer getIdSupplier() {
		return this.idSupplier;
	}

	public void setIdSupplier(Integer idSupplier) {
		this.idSupplier = idSupplier;
	}

	public Integer getIdWarehouse() {
		return this.idWarehouse;
	}

	public void setIdWarehouse(Integer idWarehouse) {
		this.idWarehouse = idWarehouse;
	}

	public float getUnitaryCost() {
		return this.unitaryCost;
	}

	public void setUnitaryCost(float unitaryCost) {
		this.unitaryCost = unitaryCost;
	}

	public Integer getUnits() {
		return this.units;
	}

	public void setUnits(Integer units) {
		this.units = units;
	}

}