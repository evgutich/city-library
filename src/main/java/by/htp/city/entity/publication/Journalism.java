package by.htp.city.entity.publication;

public class Journalism extends Publication {
	
	protected String publishingHouse;
	
	public Journalism(String publishingHouse, String title) {
		super(title);
		this.publishingHouse = publishingHouse;
	}

	public String getPublishingHouse() {
		return publishingHouse;
	}

	public void setPublishingHouse(String publishingHouse) {
		this.publishingHouse = publishingHouse;
	}

}
