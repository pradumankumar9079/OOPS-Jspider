package arrayofobjectday1;

// We Will Complete it later--like implement 

// Java Document-- this description will be visible in intellisense while calling it
/**
 * This Class is Developed to represent the library of books
 */
public class BookLibrary {
	// Array Not Other Classes can access it
	private Book[] books;

	public BookLibrary() {
		books = new Book[10];
	}

	// Abstraction Happened
	public BookLibrary(int n) {
		books = new Book[n];
	}

	/**
	 * this method store given book b in the library
	 * 
	 * @param b
	 */
	public void addBook(Book b) {
		// Code To Store
	}

	/**
	 * return the total number of books in the library
	 * 
	 * @return
	 */
	public int totalBooks() {
		return 0;
	}

	/**
	 * this method is used to find the book in the library based on title
	 * 
	 * @param title
	 */
	void findBook(String title) {

	}

	/**
	 * search and return the book based on title, if book not found returns null
	 * 
	 * @param title
	 * @return
	 */
	public Book searchByTitle(String title) {
		return null;
	}

	/**
	 * search and return the book based on author name, if book not found returns
	 * null
	 * 
	 * @param author
	 * @return
	 */
	public Book searchByAuthor(String author) {
		return null;
	}

	/**
	 * search and return the book based on id, if book not found returns null
	 * 
	 * @param id
	 * @return
	 */
	public Book searchById(int id) {
		return null;
	}

}
