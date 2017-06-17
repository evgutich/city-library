package by.htp.city;

import java.util.List;

public interface Librarian<TypeOfPublication> {
	List<TypeOfPublication> viewAll();
	List<TypeOfPublication> findByTitle(String title);
	List<TypeOfPublication> sortByTitle(String title);
	
}
