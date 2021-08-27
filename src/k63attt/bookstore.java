package k63attt;

public class bookstore {
	
	public String ID;
	public String bookName;
	public double price;
	
	// constructor
	public bookstore(String ID, String bookName, double price) {
		this.setID(ID);
		this.setBookName(bookName);
		this.setPrice(price);
	}
	
	// setter
	public void setID(String id) {
		this.ID = id;
	}
	
	public void setBookName(String bookname) {
		this.bookName = bookname;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	/// getter
	
	public String getID() {
		return this.ID;
	}
	
	public String getBookName() {
		return this.bookName;
	}
	
	public double getPrice() {
		return this.price;
	}
	
	public void showinfo() {
		System.out.println("this is bookID \t\t:" + this.getID());
		System.out.println("this is bookname \t:" + this.getBookName());
		System.out.println("this is bookprice \t:" + this.getPrice());
	}
}
