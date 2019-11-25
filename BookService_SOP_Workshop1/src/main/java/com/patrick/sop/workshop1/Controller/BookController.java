package com.patrick.sop.workshop1.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.patrick.sop.workshop1.Entity.Book;
import com.patrick.sop.workshop1.Service.BookService;
import com.patrick.sop.workshop1.Entity.Order;


@RestController
public class BookController {

	@Autowired
	private BookService service = BookService.getInstance();

	
	@GetMapping("/books")
	public List<Book> listBooks() {
		return service.listBook();
	}

	@GetMapping("/books/{id}")
	public ResponseEntity getBook(@PathVariable int id) {
		Book _book = service.findOne(id);
		if(_book == null) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<>(_book ,HttpStatus.OK);
	}

	@PostMapping("/books")
	public ResponseEntity getBook(@RequestBody Order order) {
		Book _book = service.findOne(order.getOrderId());
		if(_book == null) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<>(service.orderBook(order.getOrderId(), order.getAmount()) ,HttpStatus.OK);
	}

	
	
	
	
}
