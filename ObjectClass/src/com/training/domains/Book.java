package com.training.domains;

import java.util.*;

import com.training.exceptions.*;

public class Book {
	
	private long bookNum;
	private String bookName;
	private String author;
	private double price;
	
	public Book() {
		super();
	}
	
	public Book(long bookNum, String bookName, String author, double price) throws RangeCheckException {
		super();

		if(bookNum < 1000 || bookNum > 10000){
			throw new RangeCheckException(bookNum);		// will throw an exception for when you want to use it, it needs to get caught
		}
			this.bookNum = bookNum;
			this.bookName = bookName;
			this.author = author;
			this.price = price;
	}

	public long getBookNum() {
		return bookNum;
	}

	public void setBookNum(long bookNum) {
		
		if(bookNum < 1000 || bookNum > 10000){
			try{
				throw new RangeCheckException(bookNum);
			} catch (RangeCheckException e) {
				e.getMessage();
			}
		}
		
		this.bookNum = bookNum;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
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

	@Override
	public String toString() {
		return "Book [bookNum=" + bookNum + ", bookName=" + bookName + ", author=" + author + ", price=" + price + "]";
	}
	
	@Override
	public boolean equals(Object obj){
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (this.getClass() != obj.getClass())
			return false;
		
		Book bk = (Book) obj;
		
		return bk.bookNum == this.bookNum && bk.bookName.equals(this.bookName) &&
				bk.author.equals(this.author) && bk.price == this.price;
	}
	
	@Override 
	public int hashCode(){
		return Objects.hash(bookNum, bookName, price);
	}
	
	@Override
	protected void finalize() throws Throwable{
		System.out.println(this + " := Object Garbage Collected");
	}
	
	

}
