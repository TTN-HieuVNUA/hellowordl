package test;

import java.util.ArrayList;
import java.util.List;

public class main {
	public static void main(String[] args) {
		books Book1 = new books("java", 20000);
		books Book2 = new books("PHP", 20000);
		books Book3 = new books("C#", 20000);
		
		author Author1 = new author("tác giả 1", "tg1@gmail.com");
		author Author2 = new author("tác giả 2", "tg2@gmail.com");
		author Author3 = new author("tác giả 3", "tg3@gmail.com");
	
		ArrayList<books> book = new ArrayList<books>();
		Book1.getAuthor().add(Author1);
		book.add(Book1);
		Book2.getAuthor().add(Author2);
		Book2.getAuthor().add(Author3);
		book.add(Book2);
		Author1.getBook().add(Book1);

		for(books show : book) {
			System.out.println(show);
		}
//		for(int i=0; i<book.size(); i++) {
//			for(int j=0; j<book.get(i).getAuthor().size(); j++) {
//				System.out.println(book.get(i).getName() +" " +
//									book.get(j).getAuthor().get(j).getName() +"\n");
//			}
//		}
	}
}
