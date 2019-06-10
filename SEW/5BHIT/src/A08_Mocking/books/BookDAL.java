package A08_Mocking.books;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

public class BookDAL implements DAL{
	
	private static BookDAL instance;
	
	TreeSet<Book> books;
	
	/**
	 * BookDAL constructor
	 * Initializes the books collection
	 */
	private BookDAL(){
		books = new TreeSet<Book>();
	}
	
	/**
	 * Returns the only instance of BookDAL.
	 * If there is no instance present so far a new one will be created.
	 * 
	 * @return The BookDAL instance
	 */
	public static DAL getInstance(){
		if(instance == null){
			instance = new BookDAL();
		}
		return instance;
	}
	
	/**
	 * Returns all books in a List
	 */
	@Override
	public List<Book> getAllBooks(){
		ArrayList<Book> b = new ArrayList<Book>(books);
		return b;
	}
	
	/**
	 * Checks whether or not the given isbn has a related book and returns it.
	 * 
	 * @throws ISBN2ShortException If the isbn is too short
	 * @throws ISBN2LongException If the isbn is too long
	 * @throws BooksNotFoundException If the given isbn has no related book
	 * @return The related book
	 */
	@Override
	public Book getBook(String isbn) throws ISBN2ShortException, ISBN2LongException, BooksNotFoundException{
		if(isbn.length() > 10 || isbn.length() == 12){
			throw new ISBN2ShortException();
		}else if(isbn.length() > 13 || isbn.length() == 11){
			throw new ISBN2LongException();
		}
		Book output = null;
		for(Book book : books){
			if(book.getIsbn().equals(isbn)){
				output = book;
			}
		}
		if(output == null){
			throw new BooksNotFoundException();
		}else{
			return output;
		}
	}
	
	/**
	 * Adds the given book to the collection
	 * Returns the isbn if the book was successfully added otherwise returns double
	 * 
	 * @return the isbn of the added book or double
	 */
	@Override
	public String addBook(Book book){
		for(Book b : books){
			if(b.getIsbn().equals(book.getIsbn())){
				return "double";
			}
		}
		books.add(book);
		return book.getIsbn();
	}
	
	/**
	 * Updates the given book.
	 * If the given book was found and updated the related isbn gets returned.
	 * If the given book was not found "No existing book" gets returned.
	 * 
	 * @return the related isbn or "No existing book"
	 */
	@Override
	public String updateBook(Book book){
		for(Book b : books){
			if(b.getIsbn().equals(book.getIsbn())){
				books.remove(b);
				books.add(book);
				return book.getIsbn();
			}
		}
		return "No existing book";
	}

	/**
	 * Returns the amount of available books
	 * 
	 * @return The number of books
	 */
	@Override
	public int size() {
		//TODO Just return 0
		return books.size();
	}

}
