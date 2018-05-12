package fr.kacetal.option;

public class Climatisation implements Option {
	
	private final String name;
	
	private final Double prix;
	
	public Climatisation() {
		name = "Climatisation";
		prix = 347.3;
	}

	@Override
	public Double getPrix() {
		return prix;
	}

	@Override
	public String toString() {
		return name + " (" + prix + "\\u20AC" + ")";
	}
}