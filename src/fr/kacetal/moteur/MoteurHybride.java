package fr.kacetal.moteur;

public class MoteurHybride extends Moteur {

	private static final long serialVersionUID = 6250913873971813713L;

	public MoteurHybride(String cylindre, String prix) {
		super(cylindre, prix, TypeMoteur.HYBRIDE);		
	}
}
