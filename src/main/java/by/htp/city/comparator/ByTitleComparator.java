package by.htp.city.comparator;

import java.util.Comparator;

import by.htp.city.entity.publication.Publication;

public class ByTitleComparator implements Comparator<Publication>{

	public int compare(Publication o1, Publication o2) {
		return o1.getTitle().compareTo(o2.getTitle());
	}

}
