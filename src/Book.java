import java.util.Date;

public class Book {

	private String isbn;
	private String title;
	private String author;
	private Date lastEdited;
	
	// constructor
	public Book(){
		setLastEdited();
	}
	
	public Book(String isbn, String title, String author){
		setISBN(isbn);
		setTitle(title);
		setAuthor(author);
		setLastEdited();
	}
	
	// getters and setters
	public String getISBN(){
		return this.isbn;
	}
	
	public void setISBN(String isbn){
		this.isbn = isbn;
	}
	
	public String getTitle(){
		return this.title;
	}
	
	public void setTitle(String title){
		this.title = title;
	}
	
	public String getAuthor(){
		return this.author;
	}
	
	public void setAuthor(String author){
		this.author = author;
	}
	
	public Memento createUndo(){
		return new Memento(isbn, title, author, lastEdited);
	}
	
	public void restoreFromUndo(Memento memento){
		setTitle(memento.getTitle());
		setAuthor(memento.getAuthor());
		setISBN(memento.getISBN());
		
		this.lastEdited = memento.getLastEdited(); 
	}
	
	public void showBook(){
		System.out.println(isbn + " - '" + title + "', by " + author + ", edited " + lastEdited);
	}
	
	private void setLastEdited(){
		// Date constructor initializes object with current date and time
		lastEdited = new Date();
	}
	
}
