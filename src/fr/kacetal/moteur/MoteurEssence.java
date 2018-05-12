package fr.kacetal.moteur;

public class MoteurEssence extends Moteur {

	public MoteurEssence(String cylindre, Double prix) {
		super(cylindre, prix, TypeMoteur.ESSENCE);
	}
}