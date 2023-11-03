package ar.edu.unlam.pb2;

public class TarjetaDeCredito extends Tarjeta implements Pagadora {

	private Double limiteDeComprasEnPesos;
	private Double limiteDeComprasEnDolares;

	public TarjetaDeCredito(Long numero, String titular, String fechaDeVencimiento,
			Integer codigoDeSeguridad, Double limiteDeCompraEnPesos,
			Double limiteDeCompraEnDolares) throws NumeroDeTarjetaInvalidoException {
		this.setNumero(numero);
		this.setTitular(titular);
		this.setFechaDeVencimiento(fechaDeVencimiento);
		this.setCodigoDeSeguridad(codigoDeSeguridad);
		this.setLimiteDeComprasEnPesos(limiteDeCompraEnPesos);
		this.setLimiteDeComprasEnDolares(limiteDeCompraEnDolares);
	}

	@Override
	public Boolean pagar(Persona vendedor, Double importe) {
		return null;
	}

	@Override
	public Double getSaldo() {
		// TODO Auto-generated method stub
		return this.saldo;
	}

	public Double getLimiteDeComprasEnPesos() {
		return limiteDeComprasEnPesos;
	}

	public void setLimiteDeComprasEnPesos(Double limiteDeComprasEnPesos) {
		this.limiteDeComprasEnPesos = limiteDeComprasEnPesos;
	}

	public Double getLimiteDeComprasEnDolares() {
		return limiteDeComprasEnDolares;
	}

	public void setLimiteDeComprasEnDolares(Double limiteDeComprasEnDolares) {
		this.limiteDeComprasEnDolares = limiteDeComprasEnDolares;
	}
	

}
