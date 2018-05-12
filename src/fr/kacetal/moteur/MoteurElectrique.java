package fr.kacetal.moteur;

public class MoteurElectrique extends Moteur {
	
	private final TypeMoteur type;
	
	{
		type = TypeMoteur.ELECTRIQUE;
	}

	public MoteurElectrique(String cylindre, Double prix) {
		super(cylindre, prix);
	}
}