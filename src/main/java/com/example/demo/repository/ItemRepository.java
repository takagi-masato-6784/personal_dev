package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Item;

public interface ItemRepository extends JpaRepository<Item, Integer> {
	List<Item> findByType(Integer type);
	List<Item> findByBrandId(Integer brandId);
	List<Item> findByCodecId(Integer codecId);
	List<Item> findByNameContaining(String keyword);
}
