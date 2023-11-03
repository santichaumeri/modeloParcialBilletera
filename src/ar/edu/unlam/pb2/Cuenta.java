package ar.edu.unlam.pb2;

public class Cuenta extends MedioDePago{
	
	protected String entidad;
	protected Double saldo;
	
	public String getEntidad() {
		return entidad;
	}
	
	public void setEntidad(String entidad) {
		this.entidad = entidad;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}
	
	public Double getSaldo() {
		return this.saldo;
	}
}
