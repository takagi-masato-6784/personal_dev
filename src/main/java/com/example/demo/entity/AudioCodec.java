package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "audio_codec")
public class AudioCodec {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	private String codec;

	public AudioCodec() {

	}

	public AudioCodec(String codec) {

	}
	

	public Integer getId() {
		return id;
	}

	public String getCodec() {
		return codec;
	}
	
	
}
