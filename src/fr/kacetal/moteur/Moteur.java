package fr.kacetal.moteur;

public abstract class Moteur {
	
	private final TypeMoteur type;
	
	private final String cylindre;
	
	private final Double prix;

	public Moteur(String cylindre, Double prix, TypeMoteur type) {
		super();
		this.cylindre = cylindre;
		this.prix = prix;
		this.type = type;
	}
	
	public Moteur(String cylindre, Double prix) {
		super();
		this.cylindre = cylindre;
		this.prix = prix;
		this.type = null;
	}

	public Double getPrix() {
		return prix;
	}

	@Override
	public String toString() {
		return "Moteur " + type + " " + cylindre + " (" + prix + "\u20AC)";
	}
}