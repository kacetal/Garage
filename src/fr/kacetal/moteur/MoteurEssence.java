package fr.kacetal.moteur;

public class MoteurEssence extends Moteur {

	private static final long serialVersionUID = 2911155558297819270L;

	public MoteurEssence(String cylindre, String prix) {
		super(cylindre, prix, TypeMoteur.ESSENCE);
	}
}