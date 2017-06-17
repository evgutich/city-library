package by.htp.city;

import java.time.LocalDate;
import java.util.HashMap;

public class CityLibrarianBuilder {
	public CityLibrarianImpl build(){
		Author author = new Author("Lev", "Tolstoy", LocalDate.of(1828, 9, 9));
		Book book = new Book(author, "War and peace");
		Author author2 = new Author("sf", "af", LocalDate.of(1828, 9, 9));
		Book book2 = new Book(author2, "War and peace");
		Author author3 = new Author("Alexander", "Griboedov", LocalDate.of(1795, 1, 4));
		Book book3 = new Book(author3, "Clever people also cry");
		CityLibrary cityLibrary = new CityLibrary();
		HashMap<StorableInCityLibrary, Integer> libraryStock = new HashMap<StorableInCityLibrary, Integer>();
		libraryStock.put(book, 1);
		libraryStock.put(book2, 1);
		libraryStock.put(book3, 1);
		cityLibrary.setItemsInCityLibrary(libraryStock);
		return new CityLibrarianImpl(cityLibrary);
	}
}
