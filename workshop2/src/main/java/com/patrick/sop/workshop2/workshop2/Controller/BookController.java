package com.patrick.sop.workshop2.workshop2.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.patrick.sop.workshop2.workshop2.Entity.Book;
import com.patrick.sop.workshop2.workshop2.Entity.Order;
import com.patrick.sop.workshop2.workshop2.Service.BookService;


@RestController
public class BookController {

	@Autowired
	private BookService service;

	
	@GetMapping("/books")
	public List<Book> listBooks() {
		return service.listBook();
	}

	@GetMapping("/books/{id}")
	public Book getBook(@PathVariable int id) {
		return service.findOne(id);
	}

	@PostMapping("/books")
	public Order getBook(@RequestBody Order order) {
		return service.orderBook(order.getOrderId(), order.getAmount());
	}
	
	
}
