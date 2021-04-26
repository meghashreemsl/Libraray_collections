package com.wolken.wolkenapp;

public class BookDTO {
	private String publisher;
	private String bookName;
	private int edition;
	private int bookId;
	private String author;
	private double price;
	private String type;
	
	public BookDTO() { //Constructor
		System.out.println(this.getClass().getSimpleName()+ "Object created");
		
	}

	public BookDTO(String publisher, String bookName, int edition, int bookId, String author, int price, String type) {
		// TODO Auto-generated constructor stub
		this.publisher=publisher;
		this.bookName=bookName;
		this.edition=edition;
		this.bookId=bookId;
		this.author=author;
		this.price=price;
		this.type=type;
		
		
	}

	

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public int getEdition() {
		return edition;
	}

	public void setEdition(int edition) {
		this.edition = edition;
	}

	public int getBookId() {
		return bookId;
	}

	public void setBookId(int bookId) {
		this.bookId = bookId;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
	@Override
	public String toString() {
		return "BookDTO [publisher=" + publisher + ", bookName=" + bookName + ", edition=" + edition + ", bookId="
				+ bookId + ", author=" + author + ", price=" + price + ", type=" + type + "]";
	}

	}
