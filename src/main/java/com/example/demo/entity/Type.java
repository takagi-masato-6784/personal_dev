package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "type")

public class Type {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private Integer type;
	
	public Type() {
		
	}
	
	public Type(Integer type) {
		this.type = type;
	}
	
	public Integer getId() {
		return id;
	}

	public Integer getType() {
		return type;
	}
	
	
}
