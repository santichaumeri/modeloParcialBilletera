package ar.edu.unlam.pb2;

public class CuentaVirtual extends Cuenta implements Transferible {

	
	private final int LARGO_CVU = 23;
	private String cvu;
	
	public CuentaVirtual(String cvu, String entidad, String titular) throws CVUInvalidoException {
		this.setCvu(cvu); 
		this.setEntidad(entidad);
		this.setTitular(titular);
		
	}

	private void setCvu(String cvu) throws CVUInvalidoException {
		if (cvu.length() != LARGO_CVU) {
			throw new CVUInvalidoException("cvu invalido");
		}
		this.cvu= cvu;
	}

	@Override
	public String getNumero() {
		// TODO Auto-generated method stub
		return cvu;
	}

	@Override
	public void depositar(Double importe) {
		// TODO Auto-generated method stub

	}

	@Override
	public Boolean extraer(Double importe) {
		// TODO Auto-generated method stub
		return null;
	}

}
