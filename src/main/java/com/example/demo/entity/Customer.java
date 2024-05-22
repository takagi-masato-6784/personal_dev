package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "customers")
public class Customer {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	private String name;
	private String address;
	private String tel;
	private String email;
	private String pw;

	public Customer() {

	}
	
	public Customer(String name, String address, String tel, String email) {
		this.name = name;
		this.address = address;
		this.tel = tel;
		this.email = email;
	}

	public Customer(String name, String address, String tel, String email, String pw) {
		this.name = name;
		this.address = address;
		this.tel = tel;
		this.email = email;
		this.pw = pw;
	}

	public Customer(String addName, String addEmail, String addPw) {
		this.name = addName;
		this.email = addEmail;
		this.pw = addPw;
		
	}

	// ゲッター
	public Integer getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getAddress() {
		return address;
	}

	public String getTel() {
		return tel;
	}

	public String getEmail() {
		return email;
	}

	public String getPw() {
		return pw;
	}

}
