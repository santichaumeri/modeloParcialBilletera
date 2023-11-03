package ar.edu.unlam.pb2;

import java.util.Objects;

public abstract class Tarjeta extends MedioDePago{
	
	protected Long numero;
	protected String fechaDeVencimiento;
	protected Integer codigoDeSeguridad;
	protected Double saldo; 
	
	public void setSaldo(Double saldo) {
		this.saldo= saldo;
	}
	
	public void setCodigoDeSeguridad(Integer codigoDeSeguridad) {
		this.codigoDeSeguridad= codigoDeSeguridad;
	}

	public void setFechaDeVencimiento(String fechaDeVencimiento) {
		this.fechaDeVencimiento= fechaDeVencimiento;
	}

	public abstract Double getSaldo();

	public Long getNumero() {
		return this.numero;
	}


	public Integer getCodigoDeSeguridad() {
		return this.codigoDeSeguridad;
	}

	public String getFechaDeVencimiento() {
		return this.fechaDeVencimiento;
	}
	
	public void setNumero(Long numero) throws NumeroDeTarjetaInvalidoException{
			String numeroDeTarjetaEnString= numero.toString();
			
			if (numeroDeTarjetaEnString.length() != 16) {
				throw new NumeroDeTarjetaInvalidoException("numero de tarjeta invalido");
			}
			this.numero= numero;
			
	}

	@Override
	public int hashCode() {
		return Objects.hash(codigoDeSeguridad);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Tarjeta other = (Tarjeta) obj;
		return Objects.equals(codigoDeSeguridad, other.codigoDeSeguridad);
	}
	
	

}
