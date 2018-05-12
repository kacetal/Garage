package fr.kacetal.moteur;

public class MoteurDiesel extends Moteur {
	
	private final TypeMoteur type;
	
	{
		type = TypeMoteur.DIESEL;
	}

	public MoteurDiesel(String cylindre, Double prix) {
		super(cylindre, prix);		
	}
}