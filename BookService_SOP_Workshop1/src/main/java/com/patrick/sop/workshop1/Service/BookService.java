package com.patrick.sop.workshop1.Service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.patrick.sop.workshop1.Entity.Book;
import com.patrick.sop.workshop1.Entity.Order;
import com.patrick.sop.workshop1.Repository.BookRepository;

@Service
public class BookService {

	@Autowired
	private BookRepository bookRepository;
	
	
	//Singleton
	private static BookService single_instance = null; 
		
	public static BookService getInstance() {
		 if (single_instance == null) 
	            single_instance = new BookService(); 
	  
	        return single_instance; 
	}

	public List<Book> listBook() {
		return bookRepository.findAll();
	}

	public void addBook(Book book) {
		bookRepository.save(book);
	}

	public Book findOne(int id) {
		return bookRepository.findById(id);
	}

	public Order orderBook(int id, int amount) {
		Book _book = bookRepository.findById(id);
		
		//Singleton Pattern
		Order _order = Order.getInstance();
		_order.setOrderId(_book.getId());
		_order.setISBN(_book.getISBN());
		_order.setName(_book.getTitle());
		_order.setAmount(amount);
		_order.setPricePerBook(_book.getPrice());
		_order.setTotal(_book.getPrice() * amount);
		
		return _order;
	}

}
