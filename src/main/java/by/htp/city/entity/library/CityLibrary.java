package by.htp.city.entity.library;

import java.util.HashMap;

import by.htp.city.entity.publication.Publication;

public class CityLibrary {
	private HashMap<Publication, Integer> itemsInCityLibrary;

	public HashMap<Publication, Integer> getItemsInCityLibrary() {
		return itemsInCityLibrary;
	}

	public void setItemsInCityLibrary(HashMap<Publication, Integer> itemsInCityLibrary) {
		this.itemsInCityLibrary = itemsInCityLibrary;
	}

}
