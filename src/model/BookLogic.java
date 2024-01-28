package model;

/**
 * Maya Cruz - Gcruz
 * CIS175 - Spring 2024
 * Jan 27, 2024
 */
public class BookLogic {
	
	public boolean isBookPrice(Book book) {
		return book.getPrice() < 49.99;
	}

}
