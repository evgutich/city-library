package by.htp.city;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class CityLibrarianImpl implements Librarian<StorableInCityLibrary> {
	
	private CityLibrary cityLibrary;
	
	public CityLibrarianImpl(CityLibrary cityLibrary) {
		this.cityLibrary = cityLibrary;
	}
	
	public List<StorableInCityLibrary> viewAll() {
		Set<StorableInCityLibrary> cityLibrarySet = cityLibrary.getItemsInCityLibrary().keySet();
		return new ArrayList<StorableInCityLibrary>(cityLibrarySet);
	}

	public List<StorableInCityLibrary> findByTitle(String title) {
		List<StorableInCityLibrary> result = new ArrayList<StorableInCityLibrary>();
		Set<StorableInCityLibrary> cityLibrariySet = cityLibrary.getItemsInCityLibrary().keySet();
		for (StorableInCityLibrary storable : cityLibrariySet){
			if (storable.getTitle().equals(title)){
				result.add(storable);
			}
		}
		return result;
	}

	public List<StorableInCityLibrary> sortByTitle(String title) {
		// TODO Auto-generated method stub
		return null;
	}
	
}


