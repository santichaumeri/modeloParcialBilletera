package ar.edu.unlam.pb2;

public class Compra {

	private Comercio comercio;
	private double importeCompra;

	public Compra(Comercio comercioEncontrado, double importeCompra) {
		this.setCuitComercio(comercioEncontrado);
		this.setImporteCompra(importeCompra);
	}

	public Comercio getComercio() {
		return comercio;
	}

	public void setCuitComercio(Comercio comercioEncontrado) {
		this.comercio = comercioEncontrado;
	}

	public double getImporteCompra() {
		return importeCompra;
	}

	public void setImporteCompra(double importeCompra) {
		this.importeCompra = importeCompra;
	}

}
