package by.htp.city;

import java.util.HashMap;

public class CityLibrary {
	private HashMap<StorableInCityLibrary, Integer> itemsInCityLibrary;

	public HashMap<StorableInCityLibrary, Integer> getItemsInCityLibrary() {
		return itemsInCityLibrary;
	}

	public void setItemsInCityLibrary(HashMap<StorableInCityLibrary, Integer> itemsInCityLibrary) {
		this.itemsInCityLibrary = itemsInCityLibrary;
	}

}
