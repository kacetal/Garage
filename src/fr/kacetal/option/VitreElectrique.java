package fr.kacetal.option;

public class VitreElectrique implements Option {
	
	private final String name;
	
	private final Double prix;
	
	public VitreElectrique() {
		name = "Vitre electrique";
		prix = 212.35;
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