package by.htp.city;

import java.util.HashMap;

public class CityLibrary {
	private HashMap<Publication, Integer> itemsInCityLibrary;

	public HashMap<Publication, Integer> getItemsInCityLibrary() {
		return itemsInCityLibrary;
	}

	public void setItemsInCityLibrary(HashMap<Publication, Integer> itemsInCityLibrary) {
		this.itemsInCityLibrary = itemsInCityLibrary;
	}

}
