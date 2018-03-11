package com.uday.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Product {
	@Id
	private Integer id;
	private String name;
	
	public Product(Integer id, String name) {
		this.id = id;
		this.name = name;
	}
	
	public Product() {
		
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "Product" + " " + "[" + this.id + "," + this.name + "]";
	}
	
}
