package by.htp.city.librarian;

import java.util.List;

import by.htp.city.entity.publication.Literature;

public interface LiteratureLibrarian {
	List<Literature> sortByAuthorAndTitle();
}
