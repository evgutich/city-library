package by.htp.city.entity.publication;

import by.htp.city.entity.Author;

public class Book extends Literature {
	
	public Book(Author author, String title) {
		super(author, title);
	}

	@Override
	public String toString() {
		return author.toString() + " " + "\"" + title.toString() + "\"";
	}
}
