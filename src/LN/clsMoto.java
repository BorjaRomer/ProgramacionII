package LN;

import java.util.Date;

/**
 * Clase hija que se instancia en la clase Gestor.
 */

public class clsMoto extends clsVehiculo{
			
	String tipomoto;
	int cilindrada;
	int tama�o;
	
	public clsMoto(String numbastidor, String marca, String estado, Date fecha, String color, int kilometros,
			String tipomoto, int cilindrada, int tama�o) {
		super(numbastidor, marca, estado, fecha, color, kilometros);
		this.tipomoto = tipomoto;
		this.cilindrada = cilindrada;
		this.tama�o = tama�o;
	}

	public String getTipomoto() {
		return tipomoto; 
	}

	public void setTipomoto(String tipomoto) {
		this.tipomoto = tipomoto;
	}

	public int getCilindrada() {
		return cilindrada;
	}

	public void setCilindrada(int cilindrada) {
		this.cilindrada = cilindrada;
	}

	public int getTama�o() {
		return tama�o;
	}

	public void setTama�o(int tama�o) {
		this.tama�o = tama�o;
	}
	
public Object getProperty (String propiedad) {
		
		switch(propiedad) {
		
		case "numbastidor": return this.getNumbastidor();
		case "marca": return this.getMarca();
		case "estado": return this.getEstado();
		case "fecha": return this.getFecha();
		case "color": return this.getColor();
		case "tipomoto": return this.getTipomoto();
		case "cilindrada": return this.getCilindrada();
		case "tama�o": return this.getTama�o();
		}
		return propiedad;
		
	}
	
	
	
	
}
