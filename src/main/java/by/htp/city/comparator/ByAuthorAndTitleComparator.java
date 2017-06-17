package by.htp.city.comparator;

import java.util.Comparator;

import by.htp.city.entity.publication.Literature;

public class ByAuthorAndTitleComparator implements Comparator<Literature> {

	public int compare(Literature o1, Literature o2) {
		if (compareByAuthor(o1, o2) != 0) {
			return compareByAuthor(o1, o2);
		}
		return new ByTitleComparator().compare(o1, o2);
	}

	private int compareByAuthor(Literature o1, Literature o2) {
		int surnameCompare = o1.getAuthor().getSurname().compareTo(o2.getAuthor().getSurname());
		if (surnameCompare != 0) {
			return surnameCompare;
		}
		int nameCompare = o1.getAuthor().getName().compareTo(o2.getAuthor().getName());
		if (nameCompare != 0) {
			return nameCompare;
		}
		return o1.getAuthor().getDateOfBirth().compareTo(o2.getAuthor().getDateOfBirth());
	}

}
