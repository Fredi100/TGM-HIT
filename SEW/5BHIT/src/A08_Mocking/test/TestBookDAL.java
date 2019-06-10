/**
 * 
 */
package A08_Mocking.test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import java.util.ArrayList;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import A08_Mocking.books.Book;
import A08_Mocking.books.BookDAL;
import A08_Mocking.books.DAL;

/**
 * Test class for BookDAL
 * 
 * @author Alfred Emsenhuber
 * @version 2016-12-11
 */
public class TestBookDAL {
	
	@Mock
	private DAL dal;

	@Before
	public void setupMockTests(){
		MockitoAnnotations.initMocks(this);
		when(dal.)
	}
	
	
	
	public void setUp() throws Exception {
		dal = mock(BookDAL.class);
		ArrayList<String> s1 = new ArrayList<String>();
		s1.add("Autor1");
		s1.add("Autor2");
		Book b1 = new Book(
				"1234567890",
				"Book1",
				s1,
				"Pub1",
				2001,
				100,
				"Img1"
				);
		
		ArrayList<String> s2 = new ArrayList<String>();
		s1.add("Autor1");
		s1.add("Autor2");
		Book b2 = new Book(
				"1234567890123",
				"Book2",
				s2,
				"Pub2",
				2002,
				200,
				"Img2"
				);
		
		ArrayList<String> s3 = new ArrayList<String>();
		s1.add("Autor1");
		s1.add("Autor2");
		Book b3 = new Book(
				"0987654321",
				"Book3",
				s3,
				"Pub3",
				2003,
				300,
				"Img3"
				);
		
		dal.addBook(b1);
		dal.addBook(b2);
		dal.addBook(b3);
	}
	
	/* getInstance Tests */
	@Test
	public void testGetInstanceAlwaysSame(){
		DAL d1 = BookDAL.getInstance();
		DAL d2 = BookDAL.getInstance();
		assertEquals(d1, d2);
	}
	
	/* Keine Ahnung, wie ich hier irgendwelche Tests mit Mockito schreiben soll.
	 * Speziell, da ich durch getInstance ja immer das selbe Objekt habe, und daher
	 * nicht verschiedene zustände testen kann.
	 */

}
