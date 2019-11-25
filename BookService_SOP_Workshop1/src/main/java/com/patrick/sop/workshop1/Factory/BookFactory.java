package com.patrick.sop.workshop1.Factory;

import com.patrick.sop.workshop1.Entity.Book;

public class BookFactory {

	public BookFactory() {

	}

	public static Book create(String genre) {

		if (genre.equalsIgnoreCase("Literature")) {
			return new Book(genre = "Literature");
		} else if (genre.equalsIgnoreCase("Politics")) {
			return new Book(genre = "Politics");
		} else {
			return new Book();
		}

	}

}