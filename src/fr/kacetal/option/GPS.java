package fr.kacetal.option;

public class GPS implements Option {
	
	private final String name;
	
	private final Double prix;
	
	public GPS() {
		name = "GPS";
		prix = 113.5;
	}
	
	@Override
	public Double getPrix() {
		return prix;
	}

	@Override
	public String toString() {
		return "GPS [name=" + name + ", prix=" + prix + "\\u20AC" + "]";
	}
}