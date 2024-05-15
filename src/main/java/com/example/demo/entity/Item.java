package com.example.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;

@Entity
@Table(name = "items")
public class Item {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(name = "brand_id")
	private Integer brandId;
	
	@Column(name ="codec_id")
	private Integer codecId;
	
	
	
	private String name;
	
	private Integer price;
	
	@Transient
	private Integer quantity;
	
	public Item() {
		
	}
	

	public Item(Integer id) {
		this.id = id;
	}

	public Integer getId() {
		return id;
	}

	public Integer getBrandId() {
		return brandId;
	}

	public Integer getCodecId() {
		return codecId;
	}

	public String getName() {
		return name;
	}

	public Integer getPrice() {
		return price;
	}

	public Integer getQuantity() {
		return quantity;
	}
	
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

}
