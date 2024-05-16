package com.example.demo.entity;

import java.time.LocalDate;

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
	private LocalDate reviewDay;

	public Review() {

	}

	public Review(String title, String report, Integer score, Integer customerId, Integer itemId, LocalDate reviewDay) {
		this.title = title;
		this.report = report;
		this.score = score;
		this.customerId = customerId;
		this.itemId = itemId;
		this.reviewDay = reviewDay;
	}
	
	public Review(Integer itemId, String title, String report, Integer score, LocalDate reviewDay) {
		this.itemId = itemId;
		this.title = title;
		this.report = report;
		this.score = score;
		this.reviewDay = reviewDay;
	}

	public Integer getId() {
		return id;
	}

	public String getTitle() {
		return title;
	}

	public String getReport() {
		return report;
	}

	public Integer getScore() {
		return score;
	}

	public Integer getCustomerId() {
		return customerId;
	}

	public Integer getItemId() {
		return itemId;
	}

	public LocalDate getReviewDay() {
		return reviewDay;
	}
}
