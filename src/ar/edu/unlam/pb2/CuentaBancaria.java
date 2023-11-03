package ar.edu.unlam.pb2;

public class CuentaBancaria extends Cuenta implements Transferible {

	private final Integer LARGO_DE_CBU = 20;
	private String cbu;

	public CuentaBancaria(String cbu, String entidad, String titular) throws CBUInvalidoException {
		this.setCbu(cbu); 
		this.setEntidad(entidad); 
		this.setTitular(titular); 
	}


	@Override
	public void depositar(Double importe) {

	}

	@Override
	public Boolean extraer(Double importe) {

		return null;
	}

	@Override
	public String getNumero() {

		return this.cbu;
	}

	public void setCbu(String cbu) throws CBUInvalidoException{
		if (cbu.length() != LARGO_DE_CBU) {
			throw new CBUInvalidoException("cbu invalido");
		}
		
		this.cbu = cbu;
	}



}
