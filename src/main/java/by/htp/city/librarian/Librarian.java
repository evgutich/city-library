package by.htp.city.librarian;

import java.util.List;

import by.htp.city.entity.publication.Publication;

public interface Librarian {
	List<Publication> viewAll();
	List<Publication> findByTitle(String title);
	List<Publication> sortByTitle();
}
