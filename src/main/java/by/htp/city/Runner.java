package by.htp.city;

import java.util.List;

import by.htp.city.builder.CityLibrarianBuilder;
import by.htp.city.entity.publication.Publication;
import by.htp.city.librarian.CityLibrarianImpl;

public class Runner {
	
	private static void printPublications(List<Publication> data){
		for (Publication storable : data){
			System.out.println(storable);
		}
		System.out.println();
	}
	public static void main(String[] args) {
//		CityLibrarianImpl librarian = (new CityLibrarianBuilder()).buildForFindByTitle();
//		printPublications(librarian.viewAll());
//		printPublications(librarian.findByTitle("War and peace"));
		CityLibrarianImpl librarian = (new CityLibrarianBuilder()).buildForSorting();
		printPublications(librarian.sortByTitle());
		
	}
	

}
