package model;

/**
 * Maya Cruz - Gcruz
 * CIS175 - Spring 2024
 * Jan 27, 2024
 */
public class Book {
	
	private String title;
	private String author;
	private double price;
	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}
	/**
	 * @param title the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}
	/**
	 * @return the author
	 */
	public String getAuthor() {
		return author;
	}
	/**
	 * @param author the author to set
	 */
	public void setAuthor(String author) {
		this.author = author;
	}
	/**
	 * @return the price
	 */
	public double getPrice() {
		return price;
	}
	/**
	 * @param price the price to set
	 */
	public void setPrice(double price) {
		this.price = price;
	}
	/**
	 * 
	 */
	public Book() {
		super();
	}
	/**
	 * @param title
	 */
	public Book(String title) {
		super();
		this.title = title;
	}
	public String printTitle() {
		return title;
	}
}
