package com.patrick.sop.workshop2.workshop2.Service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.patrick.sop.workshop2.workshop2.Entity.*;
import com.patrick.sop.workshop2.workshop2.Repository.BookRepository;


@Service
public class BookService {

	@Autowired
	private BookRepository bookRepository;
	
	public List<Book> listBook() {
		return bookRepository.findAll();
	}
	
	public void addBook(Book book) {
		bookRepository.save(book);
	}

	public Book findOne(int id) {
		return bookRepository.findById(id).get();
	}

	public Order orderBook(int id, int amount) {
		Book _book = bookRepository.findById(id).get();
		
		return new Order(_book.getId(), _book.getISBN(), _book.getTitle(), amount, _book.getPrice(),
				(_book.getPrice() * amount));
	}
	
}
