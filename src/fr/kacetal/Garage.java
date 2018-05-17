package fr.kacetal;

import java.io.*;
import java.nio.file.*;
import java.util.*;
import fr.kacetal.vehicule.*;

public class Garage {

	private Set<Vehicule> voitures = new LinkedHashSet<>();

	private String dirForFile = "./files";

	private String fileForSave = "/garage.ser";

	private Path mkDir = Paths.get(dirForFile);

	private Path mkFile = Paths.get(dirForFile, fileForSave);

	private void createFile() {
		try {
			if (!Files.isDirectory(mkDir)) {
				Files.createDirectory(mkDir);
				System.out.println("mkdir");
			}
			if (!Files.exists(mkFile)) {
				Files.createFile(mkFile);
				System.out.println("mkfile");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private void saveObjToFile() {
		createFile();
		try (ObjectOutputStream objToSave = new ObjectOutputStream(
				new BufferedOutputStream(new FileOutputStream(mkFile.toFile())))) {
			for (Vehicule vhl : voitures) {
				objToSave.writeObject(vhl);
			}
		} catch (IOException e) {
			System.err.println("Problem with save objects in the file");
			e.printStackTrace();
		}
	}

	private void loadObjFromFile() {
	    try (ObjectInputStream objToLoad = new ObjectInputStream(new BufferedInputStream(new FileInputStream(mkFile.toFile())))) {
	        while (true) {
	            voitures.add((Vehicule) objToLoad.readObject());
	        }
	    } catch (EOFException e2) {
	
	    } catch (ClassNotFoundException | IOException e) {
	        e.printStackTrace();
	    }
	}

	public void addVoiture(Vehicule vehicule) {
		voitures.add(vehicule);
		createFile();
		saveObjToFile();
	}

	@Override
	public String toString() {
		
		createFile();
		loadObjFromFile();

		StringBuilder sb = new StringBuilder();

		sb.append("***************************\n");
		sb.append("*  Garage OpenClassRooms  *\n");
		sb.append("***************************\n");

		if (voitures.isEmpty()) {
			System.err.println("Aucune voiture sauvegardée !\n");
			return sb.toString();
		}

		for (Vehicule vehicule : voitures) {
			sb.append(" + ").append(vehicule).append("\n");
		}
		return sb.toString();
	}
}