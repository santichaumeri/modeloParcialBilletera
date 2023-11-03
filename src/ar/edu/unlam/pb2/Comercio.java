package ar.edu.unlam.pb2;

import java.util.Objects;

public class Comercio {

	private final Integer CANT_DIGITOS_EN_CUIT = 11;
	private final String COMIENZO_DEL_CUIT = "30";
	private Long cuit;
	private String nombre;

	public Comercio(Long cuit, String nombre) throws CuitInvalidoException {
		this.setCuit(cuit); 
		this.nombre= nombre;
	}

	private void setCuit(Long cuit) throws CuitInvalidoException{
		String cuitAString= cuit.toString(); 
		if (cuitAString.length() != CANT_DIGITOS_EN_CUIT || cuitAString.substring(0, 2) == COMIENZO_DEL_CUIT) {
			throw new CuitInvalidoException("cuit invalido");
		}
		this.cuit= cuit;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Long getCuit() {
		return cuit;
	}

	@Override
	public int hashCode() {
		return Objects.hash(cuit);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		Comercio other = (Comercio) obj;
		return Objects.equals(cuit, other.cuit);
	}
	
	

}
