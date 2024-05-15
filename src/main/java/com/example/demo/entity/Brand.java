package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "brands")

public class Brand {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	private String brand;

	public Brand() {

	}

	public Brand(String brand) {
		this.brand = brand;
	}
	

	public Integer getId() {
		return id;
	}

	public String getBrand() {
		return brand;
	}
	
	
}
