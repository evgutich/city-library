package by.htp.city.librarian;

import java.time.LocalDate;
import java.util.HashMap;

import by.htp.city.entity.Author;
import by.htp.city.entity.library.CityLibrary;
import by.htp.city.entity.publication.Book;
import by.htp.city.entity.publication.Publication;

public class CityLibrarianBuilder {
	public CityLibrarianImpl buildForFindByTitle() {
		Author author = new Author("Lev", "Tolstoy", LocalDate.of(1828, 9, 9));
		Book book = new Book(author, "War and peace");
		Author author2 = new Author("sf", "af", LocalDate.of(1828, 9, 9));
		Book book2 = new Book(author2, "War and peace");
		Author author3 = new Author("Alexander", "Griboedov", LocalDate.of(1795, 1, 4));
		Book book3 = new Book(author3, "Clever people also cry");
		CityLibrary cityLibrary = new CityLibrary();
		HashMap<Publication, Integer> libraryStock = new HashMap<Publication, Integer>();
		libraryStock.put(book, 1);
		libraryStock.put(book2, 1);
		libraryStock.put(book3, 1);
		cityLibrary.setItemsInCityLibrary(libraryStock);
		return new CityLibrarianImpl(cityLibrary);
	}

	public CityLibrarianImpl buildForSorting() {
		Author author = new Author("Lev", "Tolstoy", LocalDate.of(1828, 9, 9));
		Book book = new Book(author, "Zar and peace");
		Author author2 = new Author("sf", "af", LocalDate.of(1828, 9, 9));
		Book book2 = new Book(author2, "War and peace");
		Author author3 = new Author("Alexander", "Griboedov", LocalDate.of(1795, 1, 4));
		Book book3 = new Book(author3, "Clever people also cry");
		CityLibrary cityLibrary = new CityLibrary();
		HashMap<Publication, Integer> libraryStock = new HashMap<Publication, Integer>();
		libraryStock.put(book, 1);
		libraryStock.put(book2, 1);
		libraryStock.put(book3, 1);
		cityLibrary.setItemsInCityLibrary(libraryStock);
		return new CityLibrarianImpl(cityLibrary);

	}
}
