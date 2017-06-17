package by.htp.city;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class CityLibrarianImpl implements Librarian<Publication> {
	
	private CityLibrary cityLibrary;
	
	public CityLibrarianImpl(CityLibrary cityLibrary) {
		this.cityLibrary = cityLibrary;
	}
	
	public List<Publication> viewAll() {
		Set<Publication> cityLibrarySet = cityLibrary.getItemsInCityLibrary().keySet();
		return new ArrayList<Publication>(cityLibrarySet);
	}

	public List<Publication> findByTitle(String title) {
		List<Publication> result = new ArrayList<Publication>();
		Set<Publication> cityLibrariySet = cityLibrary.getItemsInCityLibrary().keySet();
		for (Publication storable : cityLibrariySet){
			if (storable.getTitle().equals(title)){
				result.add(storable);
			}
		}
		return result;
	}

	public List<Publication> sortByTitle(String title) {
		// TODO Auto-generated method stub
		return null;
	}
	
}


