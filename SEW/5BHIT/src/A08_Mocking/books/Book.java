package A08_Mocking.books;
import java.util.List;

/**
* Model class for the book details.
*/
public class Book {

  private String isbn;
  private String title;
  private List<String> authors;
  private String publication;
  private Integer yearOfPublication;
  private Integer numberOfPages;
  private String image;
  /**
   * Constructor 
   * @param isbn
   * @param title
   * @param authors
   * @param publication
   * @param yearOfPublication
   * @param numberOfPages
   * @param image
   */
  public Book(String isbn,
              String title,
              List<String> authors,
              String publication,
              Integer yearOfPublication,
              Integer numberOfPages,
              String image){

    this.isbn = isbn;
    this.title = title;
    this.authors = authors;
    this.publication = publication;
    this.yearOfPublication = yearOfPublication;
    this.numberOfPages = numberOfPages;
    this.image = image;

  }
  /**
   * getISBN
   * @return
   */
  public String getIsbn() {
    return isbn;
  }
  /**
   * getTitle
   * @return
   */
  public String getTitle() {
    return title;
  }
  /**
   * getAuthors
   * @return
   */
  public List<String> getAuthors() {
    return authors;
  }
  /**
   * getPublication
   * @return
   */
  public String getPublication() {
    return publication;
  }
  /**
   * getYearOfPublication
   * @return
   */
  public Integer getYearOfPublication() {
    return yearOfPublication;
  }
  /**
   * getNumberOfPages
   * @return
   */
  public Integer getNumberOfPages() {
    return numberOfPages;
  }
  /**
   * getImage
   * @return
   */
  public String getImage() {
    return image;
  }
}