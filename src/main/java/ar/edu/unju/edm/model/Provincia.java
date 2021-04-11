package ar.edu.unju.edm.model;

import org.springframework.stereotype.Component;

@Component
public class Provincia {
	private int codigoDeProvincia;
	private String nombreDeProvincia;

	public Provincia() {
		// TODO Auto-generated constructor stub
	}

	public int getCodigoDeProvincia() {
		return codigoDeProvincia;
	}

	public void setCodigoDeProvincia(int codigoDeProvincia) {
		this.codigoDeProvincia = codigoDeProvincia;
	}

	public String getNombreDeProvincia() {
		return nombreDeProvincia;
	}

	public void setNombreDeProvincia(String nombreDeProvincia) {
		this.nombreDeProvincia = nombreDeProvincia;
	}

	@Override
	public String toString() {
		return "Provincia [codigoDeProvincia=" + codigoDeProvincia + ", nombreDeProvincia=" + nombreDeProvincia + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + codigoDeProvincia;
		result = prime * result + ((nombreDeProvincia == null) ? 0 : nombreDeProvincia.hashCode());
		return result;
	}
//
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Provincia other = (Provincia) obj;
		if (codigoDeProvincia != other.codigoDeProvincia)
			return false;
		if (nombreDeProvincia == null) {
			if (other.nombreDeProvincia != null)
				return false;
		} else if (!nombreDeProvincia.equals(other.nombreDeProvincia))
			return false;
		return true;
	}

	public Provincia(int codigoDeProvincia, String nombreDeProvincia) {
		super();
		this.codigoDeProvincia = codigoDeProvincia;
		this.nombreDeProvincia = nombreDeProvincia;
	}

}
