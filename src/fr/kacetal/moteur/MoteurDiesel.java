package fr.kacetal.moteur;

public class MoteurDiesel extends Moteur {

	private static final long serialVersionUID = -6403836017089193162L;

	public MoteurDiesel(String cylindre, String prix) {
		super(cylindre, prix, TypeMoteur.DIESEL);		
	}
}