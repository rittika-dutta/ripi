package list;

import java.util.Objects;

import generics.Student;

public class Book implements Comparable<Book>{
	private int id;
	private String title;
	private double price;
	public Book(int id, String title, double price) {
		
		this.id = id;
		this.title = title;
		this.price = price;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	
	@Override
	public String toString() {
		return "Book [id=" + id + ", title=" + title + ", price=" + price + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(this.id, this.title, this.price);
	}
	@Override
	public boolean equals(Object obj) {
		Book s=(Book)obj;
		return this.id==s.id && this.title.equals(s.title) && this.price==s.price;
	}
	
	@Override
	public int compareTo(Book b)
	{
		return this.id-b.id;
	}
	
	

}
