package by.htp.city;

import java.util.List;

public class Runner {
	
	private static void printStorableInCityLibrary(List<Publication> data){
		for (Publication storable : data){
			System.out.println(storable);
		}
		System.out.println();
	}
	public static void main(String[] args) {
		CityLibrarianImpl librarian = (new CityLibrarianBuilder()).build();
		printStorableInCityLibrary(librarian.viewAll());
		printStorableInCityLibrary(librarian.findByTitle("War and peace"));
	}

}
