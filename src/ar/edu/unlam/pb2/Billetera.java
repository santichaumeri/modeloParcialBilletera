package ar.edu.unlam.pb2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

public class Billetera {

	private String nombre;
	private Set<Comercio> comercios;
	private Set<Consumidor> consumidores; 
	private Map<MedioDePago, Integer> mediosDePago; 
	private List<Compra> compras;

	public Billetera(String nombre) {
		this.setNombre(nombre);
		this.comercios= new HashSet<>();
		this.consumidores= new HashSet<>();
		this.mediosDePago= new HashMap<>();
		this.compras= new ArrayList<>();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void agregarComercio(Comercio comercio) {
		comercios.add(comercio);
	}

	public Integer getCantidadDeComercios() {
		return comercios.size();
	}

	public void agregarConsumidor(Consumidor consumidor) {
		consumidores.add(consumidor);	
	}

	public Object getCantidadDeConsumidores() {
		
		return consumidores.size();
	}

	public void agregarMedioDePago(Integer dniDeConsumidor, MedioDePago nuevo) throws NoCoincideTitularException, DniInvalidoException{
		Consumidor consumidor= buscarConsumidorXDni(dniDeConsumidor);
		
		if (consumidor == null) {
			throw new DniInvalidoException("dni invalido");
		}
		
		if (!consumidor.getNombre().equals(nuevo.getTitular())) {
			throw new NoCoincideTitularException("no coincide el titular");
		}
		
		mediosDePago.put(nuevo, dniDeConsumidor);
		
	}

	public Consumidor buscarConsumidorXDni(Integer dniDeConsumidor) {
		
		for (Consumidor actual : consumidores) {
			if (actual.getDni().equals(dniDeConsumidor)) {
				return actual;
			}
		}
		return null;
	}

	public Integer getCantidadDeMediosDePago(Integer dniDeConsumidor) {
		//Map<MedioDePago, Integer> mediosDePagoDelConsumidor = new HashMap<>();
		 Integer cantMediosDePago= 0;
		for (Map.Entry<MedioDePago, Integer> entry : mediosDePago.entrySet()) {
			MedioDePago key = entry.getKey();
			Integer val = entry.getValue();
			
			if (val.equals(dniDeConsumidor)) {
				cantMediosDePago++;
				//mediosDePagoDelConsumidor.put(key, val);
			}
			
		}
		return cantMediosDePago;
		//return mediosDePagoDelConsumidor.size();
	}

	public Compra generarCodigoQR(long cuitComercio, double importeCompra) {
		
		Comercio comercioEncontrado= buscarComercio(cuitComercio);
		Compra nueva= new Compra(comercioEncontrado, importeCompra);
		compras.add(nueva);
		return nueva;
	}

	private Comercio buscarComercio(long cuitComercio) {
		
		for (Comercio comercio : comercios) {
			
			if (comercio.getCuit().equals(cuitComercio)) {
				return comercio;
			}
		}
		return null;
	}

	
	
}
