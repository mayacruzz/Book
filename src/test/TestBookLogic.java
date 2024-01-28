package test;

import static org.junit.Assert.*;
import model.BookLogic;
import model.Book;

import org.junit.Before;
import org.junit.Test;

/**
 * Maya Cruz - Gcruz
 * CIS175 - Spring 2024
 * Jan 27, 2024
 */
public class TestBookLogic {

	BookLogic bookL = new BookLogic();
	Book book = new Book("IT");


	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testPriceIsUnderFifty() {
		book.setPrice(32.50);
		assertTrue(bookL.isBookPrice(book));
	}
	
	@Test
	public void testPriceIsNotUnderFifty() {
		book.setPrice(51.99);
		assertFalse(bookL.isBookPrice(book));
	}

}
