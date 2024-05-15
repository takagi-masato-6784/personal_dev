package com.example.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "review")
public class Review {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	private String title;
	
	private String report;
	
	private Integer score;
	
	@Column(name = "customer_id")
	private Integer customerId;
	
	@Column(name = "item_id")
	private Integer itemId;
	
	@Column(name = "review_day")
	private Integer reviewDay;
}
