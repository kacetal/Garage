package fr.kacetal.moteur;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.RoundingMode;

public abstract class Moteur implements Serializable {
	
	private static final long serialVersionUID = 8612556626915039373L;

	private final TypeMoteur type;
	
	private final String cylindre;
	
	private final BigDecimal prix;
	
	protected Moteur() {
		this("", "0.00");
	}
	
	protected Moteur(String cylindre, String prix) {
		this(cylindre, prix, null);		
	}

	protected Moteur(String cylindre, String prix, TypeMoteur type) {
		this.cylindre = cylindre;
		this.prix = new BigDecimal(prix).setScale(2, RoundingMode.HALF_UP);
		this.type = type;
	}

	public BigDecimal getPrix() {
		return prix;
	}

	@Override
	public String toString() {
		return "Moteur " + type + " " + cylindre + " (" + prix.toString() + "\u20AC)";
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cylindre == null) ? 0 : cylindre.hashCode());
		result = prime * result + ((prix == null) ? 0 : prix.hashCode());
		result = prime * result + ((type == null) ? 0 : type.hashCode());
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
		if (!(obj instanceof Moteur)) {
			return false;
		}
		Moteur other = (Moteur) obj;
		if (cylindre == null) {
			if (other.cylindre != null) {
				return false;
			}
		} else if (!cylindre.equals(other.cylindre)) {
			return false;
		}
		if (prix == null) {
			if (other.prix != null) {
				return false;
			}
		} else if (prix.compareTo(other.prix) != 0) {
			return false;
		}
		if (type != other.type) {
			return false;
		}
		return true;
	}
}