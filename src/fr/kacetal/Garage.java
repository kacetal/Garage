package fr.kacetal;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.LinkedHashSet;
import java.util.Set;
import fr.kacetal.vehicule.Vehicule;


public class Garage {
	
	private Set<Vehicule> voitures = new LinkedHashSet<>();
	
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
		createFile();
		voitures.add(vehicule);
	}
	
	private void createFile() {
		try {
			
			Path mkDir = Paths.get("./files");
			
			Path mkFile = Paths.get("./files/Garage.txt");
			
			if (!Files.isDirectory(mkDir)) {
				Files.createDirectory(mkDir);
			}
			
			if (!Files.exists(mkFile)) {
				Files.createFile(mkFile);
			}			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		 
	}	
}