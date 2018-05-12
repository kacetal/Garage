package fr.kacetal.moteur;

public enum TypeMoteur {
	
	DIESEL ("DIESEL"),
	ESSENCE ("ESSENCE"),
	HYBRIDE ("HYBRIDE"),
	ELECTRIQUE ("ELECTRIQUE");
	
	private final String name;
	
	private TypeMoteur(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return name;
	}
}