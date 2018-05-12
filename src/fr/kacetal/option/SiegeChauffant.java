package fr.kacetal.option;

public class SiegeChauffant implements Option {
	
	private final String name;
	
	private final Double prix;
	
	public SiegeChauffant() {
		name = "SiegeChauffant";
		prix = 562.9;
	}

	@Override
	public Double getPrix() {
		return prix;
	}

	@Override
	public String toString() {
		return "SiegeChauffant [name=" + name + ", prix=" + prix + "\\u20AC" + "]";
	}
}