package fr.kacetal.moteur;

public class MoteurEssence extends Moteur {
	
	private final TypeMoteur type;
	
	{
		type = TypeMoteur.ESSENCE;
	}

	public MoteurEssence(String cylindre, Double prix) {
		super(cylindre, prix);
	}
}