package fr.kacetal.option;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.RoundingMode;

public abstract class Option implements Serializable {
	
	private static final long serialVersionUID = -5543768118792365996L;

	private final String name;
	
	private final BigDecimal prix;
	
	public Option() {
		this("", "0.00");
	}
		
	protected Option(String name, String prix) {
		this.name = name;
		this.prix = new BigDecimal(prix).setScale(2, RoundingMode.HALF_UP);
	}
	
	protected Option(String name, int prix) {
		this.name = name;
		this.prix = new BigDecimal(prix).setScale(2, RoundingMode.HALF_UP);
	}

	public BigDecimal getPrix() {
		return prix;
	}
	
	@Override
	public String toString() {
		return name + " (" + prix.toString() + "\u20AC)";
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
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
		if (!(obj instanceof Option)) {
			return false;
		}
		Option other = (Option) obj;
		if (name == null) {
			if (other.name != null) {
				return false;
			}
		} else if (!name.equals(other.name)) {
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