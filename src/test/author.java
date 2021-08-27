package test;

import java.util.ArrayList;
import java.util.List;

public class author {
	private String Name;
	private String Email;
	private List<books> book = new ArrayList<books>();
	public author(String name, String email) {
		Name = name;
		Email = email;
	}
	
	public author(String name, String email, List<books> book) {
		super();
		Name = name;
		Email = email;
		this.book = book;
	}

	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public List<books> getBook() {
		return book;
	}
	public void setBook(List<books> book) {
		this.book = book;
	}

	@Override
	public String toString() {
		return "author [Name=" + Name + ", Email=" + Email + "]";
	}
	
	
}
