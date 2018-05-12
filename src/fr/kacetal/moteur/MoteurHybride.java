package fr.kacetal.moteur;

public class MoteurHybride extends Moteur {
	
	private final TypeMoteur type;
	
	{
		type = TypeMoteur.HYBRIDE;
	}

	public MoteurHybride(String cylindre, Double prix) {
		super(cylindre, prix);		
	}
}
