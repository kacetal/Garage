package fr.kacetal.vehicule;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.LinkedHashSet;
import java.util.Set;

import fr.kacetal.moteur.*;
import fr.kacetal.option.*;

public abstract class Vehicule implements Serializable {
	
	private static final long serialVersionUID = -1473123319940187303L;

	private String nom;
	
	private Marque marque;
	
	private Moteur moteur;
	
	private Set<Option> options;	
	
	private BigDecimal prix;
	
	protected Vehicule() {
		this("", null);
	}
	
	protected Vehicule(String nom, Marque marque) {
		this.nom = nom;
		this.marque = marque;
		this.moteur = null;
		this.options = new LinkedHashSet<>();
		this.prix = new BigDecimal("0.00").setScale(2, RoundingMode.HALF_UP);
	}	
	
	public void setMoteur(Moteur moteur) {
		this.moteur = moteur;
		this.recalculatePrix();
	}

	public void addOption(final Option option) {
		options.add(option);
		this.recalculatePrix();
	}
	
	private void recalculatePrix() {
		prix = new BigDecimal("0.00").setScale(2, RoundingMode.HALF_UP);
		
		if (moteur != null) prix = new BigDecimal(moteur.getPrix().toString()).setScale(2, RoundingMode.HALF_UP);
		
		if (!options.isEmpty()) {
			for (Option option : options) {
				prix = prix.add(option.getPrix());
			}
		}		
	}
	
	private BigDecimal getPrix() {
		this.recalculatePrix();
		return prix;
	}

	@Override
	public String toString() {
				
		StringBuilder sb = new StringBuilder();
		sb.append("Voiture ").append(marque);
		sb.append(" : ").append(nom);
		sb.append(" ").append(moteur);
		sb.append(" ").append(options);
		sb.append(" d'une valeur totale de " + getPrix().toString() + "\u20AC");
		
		return sb.toString();
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((marque == null) ? 0 : marque.hashCode());
		result = prime * result + ((moteur == null) ? 0 : moteur.hashCode());
		result = prime * result + ((nom == null) ? 0 : nom.hashCode());
		result = prime * result + ((options == null) ? 0 : options.hashCode());
		result = prime * result + ((prix == null) ? 0 : prix.hashCode());
		return result;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (!(obj instanceof Vehicule)) {
			return false;
		}
		Vehicule other = (Vehicule) obj;
		if (marque != other.marque) {
			return false;
		}
		if (moteur == null) {
			if (other.moteur != null) {
				return false;
			}
		} else if (!moteur.equals(other.moteur)) {
			return false;
		}
		if (nom == null) {
			if (other.nom != null) {
				return false;
			}
		} else if (!nom.equals(other.nom)) {
			return false;
		}
		if (options == null) {
			if (other.options != null) {
				return false;
			}
		} else if (!options.equals(other.options)) {
			return false;
		}
		if (prix == null) {
			if (other.prix != null) {
				return false;
			}
		} else if (prix.compareTo(other.prix) != 0) {
			return false;
		}
		return true;
	}
	
	
}
