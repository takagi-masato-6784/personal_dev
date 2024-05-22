package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.entity.AudioCodec;
import com.example.demo.entity.Brand;
import com.example.demo.entity.Item;
import com.example.demo.entity.Type;
import com.example.demo.repository.AudioCodecRepository;
import com.example.demo.repository.BrandRepository;
import com.example.demo.repository.ItemRepository;
import com.example.demo.repository.TypeRepository;

@Controller
public class ItemController {
	
	@Autowired
	TypeRepository typeRepository;
	
	@Autowired
	BrandRepository brandRepository;
	
	@Autowired
	AudioCodecRepository audioCodecRepository;
	
	@Autowired
	ItemRepository itemRepository;
	
	@GetMapping("/items")
	public String index(
			@RequestParam(name = "type", defaultValue = "")
			Integer type,
			@RequestParam(name = "brandId", defaultValue = "")
			Integer brandId,
			@RequestParam(name = "codecId", defaultValue = "")
			Integer codecId,
			@RequestParam(name = "keyword", defaultValue = "") String keyword,
			Model model
			) {
		
		List<Type> typeList = typeRepository.findAll();
		model.addAttribute("type", typeList);
		
		List<Brand> brandList = brandRepository.findAll();
		model.addAttribute("brands", brandList);
		
		List<AudioCodec> codecList = audioCodecRepository.findAll();
		model.addAttribute("codec", codecList);
		
		List<Item> itemList = null;
		if(type != null) {
			itemList = itemRepository.findByType(type);
		} else if(brandId != null) {
			itemList = itemRepository.findByBrandId(brandId);
		} else if (codecId != null) {
			itemList = itemRepository.findByCodecId(codecId);
		} else if (keyword.length() > 0) {
			itemList = itemRepository.findByNameContaining(keyword);
		}else {
			itemList = itemRepository.findAll();
		}
		
		model.addAttribute("keyword", keyword);
		model.addAttribute("items", itemList);
		
		return "items";
		
	}
	
		
	
}
