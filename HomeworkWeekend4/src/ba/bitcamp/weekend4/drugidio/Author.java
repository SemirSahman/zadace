package ba.bitcamp.weekend4.drugidio;

import java.util.Arrays;

public class Author {
	private String name;
	private Integer yearOfBirth;
	private Book[] books;

	// Generating get and set methods
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getYearOfBirth() {
		return yearOfBirth;
	}

	public void setYearOfBirth(Integer yearOfBirth) {
		this.yearOfBirth = yearOfBirth;
	}

	public Book[] getBooks() {
		return books;
	}

	public void setBooks(Book[] books) {
		this.books = books;
	}

	// Generating constructor
	public Author(String name, Integer yearOfBirth, Book[] books) {
		super();
		this.name = name;
		this.yearOfBirth = yearOfBirth;
		this.books = books;
	}

	// Generating toString method for print
	@Override
	public String toString() {
		String s = "";
		s = "Name of author: " + name + "\n";
		s += "Year of birth: " + yearOfBirth + "\n";
		s += "Books: \n";
		for (int i = 0; i < books.length; i++) {
			s += books[i].toString();
		}
		return s;
	}

}