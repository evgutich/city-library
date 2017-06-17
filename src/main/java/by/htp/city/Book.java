package by.htp.city;

public class Book extends Literature {
	
	public Book(Author author, String title) {
		super(author, title);
	}

	@Override
	public String toString() {
		return author.toString() + " " + "\"" + title.toString() + "\"";
	}
}
