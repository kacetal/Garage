package fr.kacetal.option;

public class BarreDeToit implements Option {
	
	private final String name;
	
	private final Double prix;
	
	public BarreDeToit() {
		name = "BarreDeToit";
		prix = 29.9;
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