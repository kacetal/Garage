package fr.kacetal.moteur;

public class MoteurElectrique extends Moteur {

	public MoteurElectrique(String cylindre, Double prix) {
		super(cylindre, prix, TypeMoteur.ELECTRIQUE);
	}
}