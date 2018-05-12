package fr.kacetal.option;

public class BarreDeToit implements Option {
	
	private final String name;
	
	private final Double prix;
	
	public BarreDeToit() {
		name = "Barre de toit";
		prix = 29.9;
	}

	@Override
	public Double getPrix() {
		return prix;
	}

	@Override
	public String toString() {
		return name + " (" + prix + "\u20AC" + ")";
	}
}