package test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import model.Book;
/**
 * Maya Cruz - Gcruz
 * CIS175 - Spring 2024
 * Jan 27, 2024
 */
public class TestBook {

	String title = "The Shining";
	Book book = new Book(title);
	
	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testTitleNotNull() {
	   assertNotNull(book.printTitle( ));
	}

}
	
	
