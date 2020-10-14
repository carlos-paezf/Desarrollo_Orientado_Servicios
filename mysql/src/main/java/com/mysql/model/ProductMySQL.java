package com.mysql.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the product database table.
 * 
 */
@Entity
@Table(name = "product")
public class ProductMysql implements Serializable {
	private static final long serialVersionUID = 1L;
	
	public static final String FIND_ALL = "ProductMysql.FIND_ALL";
	
	public static final String FIND_ALL_ID= "ProductMysql.FIND_ALL_ID";

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_product")
	private int idProduct;

	private int amount;

	private String brand;

	private String description;

	@Column(name="id_stock")
	private int idStock;

	private String name;

	private double price;

	public ProductMysql() {
	}

	public int getIdProduct() {
		return this.idProduct;
	}

	public void setIdProduct(int idProduct) {
		this.idProduct = idProduct;
	}

	public int getAmount() {
		return this.amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public String getBrand() {
		return this.brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getIdStock() {
		return this.idStock;
	}

	public void setIdStock(int idStock) {
		this.idStock = idStock;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return this.price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

}