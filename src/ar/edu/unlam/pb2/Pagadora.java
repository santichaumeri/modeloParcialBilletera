package ar.edu.unlam.pb2;

public interface Pagadora {
	
	Boolean pagar (Persona vendedor, Double importe);

	void setSaldo(Double d);
	
	Double getSaldo();

	Long getNumero();

	String getTitular();


}
