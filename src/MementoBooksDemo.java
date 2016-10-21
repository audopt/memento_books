import java.lang.Thread;

public class MementoBooksDemo {

	public static void main(String[] args){
		Book book = new Book("123456789", "A Coisa", "Stephen King");
		book.showBook();
	
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		CareTaker history = new CareTaker();
		history.memento = book.createUndo();
		
		book.setISBN("987654321");
		book.setTitle("Lord of the Rings");
		book.setAuthor("J.R.R. Tolkien");
		book.showBook();
		
		book.restoreFromUndo(history.getMemento());
		book.showBook();
	}
	
}
