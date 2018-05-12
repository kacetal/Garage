package fr.kacetal.vehicule;

public enum Marque {
	
	RENO ("Reneault"),
	PIGEOT ("Peugeot"),
	TROEN ("Citroën");
	
	private final String name;
	
	private Marque(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return name;
	}
}
