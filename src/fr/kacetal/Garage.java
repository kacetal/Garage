package fr.kacetal;

import java.util.LinkedHashSet;
import java.util.Set;

import fr.kacetal.vehicule.Vehicule;

public class Garage {
	
	private Set<Vehicule> voitures = new LinkedHashSet<>();
	
	public void add(Vehicule vehicule) {
		voitures.add(vehicule);
	}

	@Override
	public String toString() {
		
		StringBuilder sb = new StringBuilder();
		
		sb.append("****************************\n");
		sb.append("*  Garage OpenClassRooms   *\n");
		sb.append("****************************\n");
		
		if (voitures.isEmpty()) {
			System.err.println("Aucune voiture sauvegardée !\n");
			return sb.toString();
		}		
		
		for (Vehicule vehicule : voitures) {
			sb.append(" + ").append(vehicule).append("\n");
		}
		return sb.toString();
	}

	public void addVoiture(Vehicule vehicule) {
		voitures.add(vehicule);
	}
}