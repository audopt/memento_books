import java.util.Date;

public class Memento {

	private String isbn;
	private String title;
	private String author;
	private Date lastEdited;

	// constructor
	public Memento(String isbn, String title, String author, Date lastEdited){
		setISBN(isbn);
		setTitle(title);
		setAuthor(author);
		this.lastEdited = lastEdited;
	}
	
	// getters and setters
	public String getISBN(){
		return this.isbn;
	}
	
	private void setISBN(String isbn){
		this.isbn = isbn;
	}
	
	public String getTitle(){
		return this.title;
	}
	
	private void setTitle(String title){
		this.title = title;
	}
	
	public String getAuthor(){
		return this.author;
	}
	
	private void setAuthor(String author){
		this.author = author;
	}
	
	public Date getLastEdited(){
		return this.lastEdited;
	}
	
}
