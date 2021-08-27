package test;

import java.util.ArrayList;
import java.util.List;

public class books {
	private String bookName;
	private double Price;
	private List<author> author = new ArrayList<author>();
	public books(String name, double price) {
		super();
		bookName = name;
		Price = price;
	}
	public books(String name, double price, List<test.author> author) {
		super();
		bookName = name;
		Price = price;
		this.author = author;
	}
	public String getName() {
		return bookName;
	}
	public List<author> getAuthor() {
		return author;
	}
	public void setAuthor(List<author> author) {
		this.author = author;
	}
	@Override
	public String toString() {
			return "books" +"\n"+"Name=" + bookName + ", Price=" + Price + ", author=" +  author;
	}
	
}
