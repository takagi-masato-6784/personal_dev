package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.entity.Customer;
import com.example.demo.model.Account;
import com.example.demo.repository.CustomerRepository;

import jakarta.servlet.http.HttpSession;

@Controller
public class AccountController {

	@Autowired
	HttpSession session;

	@Autowired
	Account account;

	@Autowired
	CustomerRepository customerRepository;

	@GetMapping({ "/login", "/logout" })
	public String index() {
		session.invalidate();
		return "login";
	}

	@PostMapping("/login")
	public String login(
			@RequestParam("name") String name,
			Model model) {
		
		if (name == null || name.length() == 0) {
			model.addAttribute("message", "名前を入力してください");
			return "login";
		} 

		List<Customer> customer = customerRepository.findByName(name);

		if (customer.size() != 0) {
			account.setName(name);
			return "redirect:/items";
		} else {
			model.addAttribute("error", "お名前が存在しません");
		}

		return "login";

	}

	@GetMapping("/addAccount")
	public String addIndex() {
		return "addAccount";
	}

	@PostMapping("/addAccount")
	public String addShow(
			@RequestParam("addName") String addName,
			Model model) {
		Customer customer = new Customer(addName);
		customerRepository.save(customer);
		return "redirect:/login";
	}
}
