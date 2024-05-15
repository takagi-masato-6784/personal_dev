package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.model.Account;

import jakarta.servlet.http.HttpSession;

@Controller
public class AccountController {
	
	@Autowired
	HttpSession session;
	
	@Autowired
	Account account;
	
	@GetMapping({"/login","/logout"})
	public String index(
			@RequestParam(name = "error", defaultValue = "")
			String error,
			Model model
			) {
		session.invalidate();
		
		if(error.equals("notLoggedIn")) {
			model.addAttribute("message", "ログインしてください");
		}
		
		return "login";
	}
	
	@PostMapping("/login")
	public String login(
			@RequestParam("name")
			String name,
			Model model
			) {
		if(name == null || name.length() ==0 ) {
			model.addAttribute("message", "名前を入力してください");
			return "login";
		}
		
		account.setName(name);
		return "redirect:/items";
	}
	
	@GetMapping("/addAccount")
	public String addIndex() {
		return "addAccount";
	}
	
	@PostMapping("/addAccout")
	public String addShow(
			@RequestParam("addName")
			String addName,
			Model model
			) {
		return "redirect:/login";
	}
}
