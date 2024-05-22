package com.example.demo.controller;

import java.util.ArrayList;
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
			@RequestParam(name = "name", defaultValue = "") String name,
			@RequestParam(name = "email", defaultValue = "") String email,
			@RequestParam(name = "pw", defaultValue = "") String pw,
			Model model) {

		List<Customer> customer = customerRepository.findByNameAndEmailAndPw(name, email, pw);
		List<String> errar = new ArrayList<>();

		if (name == null || name.length() == 0) {
			errar.add("名前を入力してください");
		}

		if (email == null || email.length() == 0) {
			errar.add("メールアドレスを入力してください");
		}

		if (pw.equals("")) {
			errar.add("パスワードを入力してください");
		}

		if (customer.size() == 0) {
			errar.add("または一致するユーザーが存在しません");
		}
		
		if(errar.size() >0) {
			model.addAttribute("errar", errar);
			return "login";
		}
		

		account.setName(name);
		account.setEmail(email);
		account.setPw(pw);
		return "redirect:/items";

	}

	@GetMapping("/addAccount")
	public String addIndex() {
		return "addAccount";
	}

	@PostMapping("/addAccount")
	public String addShow(
			@RequestParam(name = "addName", defaultValue = "") String addName,
			@RequestParam(name = "addEmail", defaultValue = "") String addEmail,
			@RequestParam(name = "addPw", defaultValue = "") String addPw,
			Model model) {
		Customer customer = new Customer(addName, addEmail, addPw);
		List<String> errar2 = new ArrayList<>();

		if (addName == null || addName.length() == 0) {
			errar2.add("名前を入力してください");
		}

		if (addEmail == null || addEmail.length() == 0) {
			errar2.add("メールアドレスを入力してください");
		}

		if (addPw.equals("")) {
			errar2.add("パスワードを入力してください");
		}
		
		if(errar2.size() >0) {
			model.addAttribute("errar2", errar2);
			return "addAccount";
		}
		
		customerRepository.save(customer);
		return "redirect:/login";
	}
}
