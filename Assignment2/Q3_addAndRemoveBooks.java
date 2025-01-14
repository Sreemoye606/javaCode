/*
Write a Java program to create a class called "Book" with attributes for title, author, and ISBN, and methods
 to add and remove books   given from command prompt also using JOptionPane.
*/

import static javax.swing.JOptionPane.*;
import lombok.*;

@Getter
@Setter
class Book{
	private String title;
	private String author;
	private int ISBN;
	
	void addBooks(String title, String author, int ISBN){
		this.title=title;
		this.author=author;
		this.ISBN=ISBN;
	}
	void removeBooks(int ISBN){
		if (ISBN == this.ISBN ){
			this.title=null;
			this.author=null;
			this.ISBN=0;
			
		}
	}
}
class Q3_addAndRemoveBooks{
	
	public static void main(String[] args){
		Book b1 = new Book();
		Book b2 = new Book();
		
		String title1 = showInputDialog("Enter title of book: ","enter here");
		String author1 = showInputDialog("Enter author of book: ","enter here");
		int isbn1 = Integer.parseInt(showInputDialog("Enter isbn of book: ","enter here"));
		
		b1.addBooks(title1, author1, isbn1);
		System.out.println("Details");
		System.out.println(b1.getTitle());
		System.out.println(b1.getAuthor());
		System.out.println(b1.getISBN());
		
		String title2 = args[0];
		String author2 = args[1];
		int isbn2 = Integer.parseInt(args[2]);
		
		b2.addBooks(title2, author2, isbn2);
		System.out.println("\nDetails");
		System.out.println(b2.getTitle());
		System.out.println(b2.getAuthor());
		System.out.println(b2.getISBN());
	}
}