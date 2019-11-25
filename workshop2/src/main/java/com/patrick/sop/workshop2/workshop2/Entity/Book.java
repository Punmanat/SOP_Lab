package com.patrick.sop.workshop2.workshop2.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.*;



@Entity
public class Book {

	// Attribute
	@Id
	private int id;
	
	private String ISBN;
	private String title;
	private double price;
	private String author;
	@Column(name = "briefstory")
	private String briefStory;
	@Column(name = "dateofpublish")
	private String dateOfPublish;
	private String publisher;
	@Column(name = "numofpages")
	private String numOfPages;
	private String genre;

	// Method

	public Book() {
		super();
	}

	public Book(String genre) {
		super();
		this.genre = genre;
	}

	public Book(int id, String iSBN, String title, double price, String author, String briefStory, String dateOfPublish,
			String publisher, String numOfPages, String genre) {
		super();
		this.id = id;
		this.ISBN = iSBN;
		this.title = title;
		this.price = price;
		this.author = author;
		this.briefStory = briefStory;
		this.dateOfPublish = dateOfPublish;
		this.publisher = publisher;
		this.numOfPages = numOfPages;
		this.genre = genre;
	}
	
	

	public void setBook(String ISBN, String title, double price, String author, String briefStory,
			String dateOfPublish, String publisher, String numOfPages) {
		this.ISBN = ISBN;
		this.title = title;
		this.price = price;
		this.author = author;
		this.briefStory = briefStory;
		this.dateOfPublish = dateOfPublish;
		this.publisher = publisher;
		this.numOfPages = numOfPages;
	}

	
	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public String getNumOfPages() {
		return numOfPages;
	}

	public void setNumOfPages(String numOfPages) {
		this.numOfPages = numOfPages;
	}

	public String getISBN() {
		return ISBN;
	}

	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getBriefStory() {
		return briefStory;
	}

	public void setBriefStory(String briefStory) {
		this.briefStory = briefStory;
	}

	public String getDateOfPublish() {
		return dateOfPublish;
	}

	public void setDateOfPublish(String dateOfPublish) {
		this.dateOfPublish = dateOfPublish;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Book [id=" + id + ", ISBN=" + ISBN + ", title=" + title + ", price=" + price + ", author=" + author
				+ ", briefStory=" + briefStory + ", dateOfPublish=" + dateOfPublish + ", publisher=" + publisher
				+ ", numOfPages=" + numOfPages + ", genre=" + genre + "]";
	}
}

