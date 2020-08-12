package com.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.app.service.BookService;

@Controller
public class BookController {

	@Autowired
	private BookService bookService;
	
	@RequestMapping("/price")
	public String getPriceById(@RequestParam("bookId")String bookId,Model model)
	{
	
		Double price=bookService.findPriceById(bookId);
		model.addAttribute("price", "Book price :"+price);
		
		
		return "display";
	}
	
}
