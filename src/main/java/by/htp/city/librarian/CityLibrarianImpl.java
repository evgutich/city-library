package by.htp.city.librarian;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

import by.htp.city.comparator.ByTitleComparator;
import by.htp.city.entity.library.CityLibrary;
import by.htp.city.entity.publication.Publication;

public class CityLibrarianImpl implements Librarian {
	
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

	public List<Publication> sortByTitle() {
		Set<Publication> cityLibrariySet = cityLibrary.getItemsInCityLibrary().keySet();
		List<Publication> publications = new ArrayList<Publication>(cityLibrariySet);
		Collections.sort(publications, new ByTitleComparator());
		return publications;
	}

}


