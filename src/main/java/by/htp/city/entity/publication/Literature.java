package by.htp.city.entity.publication;

import by.htp.city.entity.Author;

public class Literature extends Publication {
	
	protected Author author;
	
	public Literature(Author author, String title) {
		super(title);
		this.author = author;
	}
	
	public Author getAuthor() {
		return author;
	}

	public void setAuthor(Author author) {
		this.author = author;
	}

}
