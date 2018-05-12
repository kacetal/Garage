package fr.kacetal.option;

public class SiegeChauffant implements Option {
	
	private final String name;
	
	private final Double prix;
	
	public SiegeChauffant() {
		name = "Siège chauffant";
		prix = 562.9;
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