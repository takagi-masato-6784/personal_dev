package com.example.demo.controller;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.entity.Review;
import com.example.demo.repository.ItemRepository;
import com.example.demo.repository.ReviewRepository;

@Controller
public class ReviewController {

	@Autowired
	ReviewRepository reviewRepository;

	@Autowired
	ItemRepository itemRepository;

	@GetMapping("/review")
	public String index(
			@RequestParam("itemId") Integer itemId,
			Model model) {
		List<Review> reviewList = reviewRepository.findByItemId(itemId);
		if (reviewList.size() == 0) {
			model.addAttribute("message", "現在レビューはありません");
		}

		model.addAttribute("itemId", itemId);
		model.addAttribute("reviews", reviewList);
		return "review";
	}

	@PostMapping("/add/review")
	public String addReview(
			@RequestParam("itemId")Integer itemId,
			@RequestParam("title") String title,
			@RequestParam("report") String report,
			@RequestParam(value="score",defaultValue="") Integer score,
			Model model
			) {
		List<String> errorList = new ArrayList<>();
		if(title.equals("")) {
			errorList.add("タイトルを入力して下さい");
		}
		
		if(report.equals("")) {
			errorList.add("内容を入力して下さい");
		}
		
		if(score == null) {
			errorList.add("スコアを入力して下さい");
		}
		
		
		if(errorList.size()==0) {
			Review review = new Review(itemId, title, report, score, LocalDate.now());
			reviewRepository.save(review);
			return ("redirect:/review?itemId=" + itemId);
		}else {
			List<Review> reviewList = reviewRepository.findByItemId(itemId);
			model.addAttribute("msg",errorList);
			model.addAttribute("reviews", reviewList);
			model.addAttribute("itemId", itemId);
			return "review";
		}
	}
}
