package fr.kacetal.option;

public class VitreElectrique implements Option {
	
	private final String name;
	
	private final Double prix;
	
	public VitreElectrique() {
		name = "VitreElectrique";
		prix = 212.35;
	}

	@Override
	public Double getPrix() {
		return prix;
	}

	@Override
	public String toString() {
		return "SiegeChauffant [name=" + name + ", prix=" + prix + "\\u20AC" + "]";
	}
}