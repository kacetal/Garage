package fr.kacetal.moteur;

public class MoteurElectrique extends Moteur {
		
	private static final long serialVersionUID = -5716514920425234568L;

	public MoteurElectrique(String cylindre, String prix) {
		super(cylindre, prix, TypeMoteur.ELECTRIQUE);
	}
}