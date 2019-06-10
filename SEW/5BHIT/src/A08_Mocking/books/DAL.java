package A08_Mocking.books;

import java.util.Collections;
import java.util.List;

/**
 * API layer for persisting and retrieving the Book objects.
 */
public interface DAL {

	/**
	 * @return A list of all available books
	 */
	default List<Book> getAllBooks(){
		return Collections.emptyList();
	}

	/**
	 * no book available
	 * 
	 * @param isbn String representing the isbn of a given book
	 * @return List of all available books
	 */

	default Book getBook(String isbn) throws BooksNotFoundException, ISBN2ShortException, ISBN2LongException{
		return null;
	}

	/**
	 * add a new book
	 * 
	 * @param book Object of type Book
	 * @return ISBN of the added book or "double" if it was already existing  
	 */
	default String addBook(Book book){
		return null;
	}


	/**
	 * update an existing book
	 * 
	 * @param book
	 * @return ISBN of updated book 
	 */
	default String updateBook(Book book){
		return null;
	}

	/**
	 * return the amount of available books
	 * 
	 * @return size
	 */
	int size();

	/**
	 * only a single reference of DAL will be available
	 * @return Singelton Object of DAL
	 */
	static DAL getInstance(){
		return null;
	}
}