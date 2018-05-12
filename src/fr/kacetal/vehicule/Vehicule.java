package fr.kacetal.vehicule;

import java.text.DecimalFormat;
import java.util.LinkedHashSet;
import java.util.Set;

import fr.kacetal.moteur.*;
import fr.kacetal.option.*;

public abstract class Vehicule {
	
	private Double prix = 0.0;
	
	private Set<Option> options = new LinkedHashSet<>();
	
	private String nom;	
	
	private Marque marque;
	
	private Moteur moteur;
	
	protected Vehicule(String nom, Marque marque) {
		this.nom = nom;
		this.marque = marque;
	}
	
	public void setMoteur(Moteur moteur) {
		this.moteur = moteur;
	}

	public void addOption(final Option option) {
		options.add(option);
	}
	
	private Double getPrix() {
		prix = 0.0;
		for (Option option : options) {
			prix += option.getPrix();
		}
		prix += moteur.getPrix();
		return prix;
	}

	@Override
	public String toString() {
		
		DecimalFormat prixFormat = new DecimalFormat("#########.00");
		String prixString = prixFormat.format(getPrix());
		
		StringBuilder sb = new StringBuilder();
		sb.append("Voiture ").append(marque);
		sb.append(" : ").append(nom);
		sb.append(" ").append(moteur);
		sb.append(" ").append(options);
		sb.append(" d'une valeur totale de " + prixString + "\u20AC");
		
		return sb.toString();
	}
	
	
}
