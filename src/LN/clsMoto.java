package LN;

import java.util.Date;

/**
 * Clase hija que se instancia en la clase Gestor.
 */

public class clsMoto extends clsVehiculo{
			
	String tipomoto;
	int cilindrada;
	int tamaño;
	
	public clsMoto(String numbastidor, String marca, String estado, Date fecha, String color, int kilometros,
			String tipomoto, int cilindrada, int tamaño) {
		super(numbastidor, marca, estado, fecha, color, kilometros);
		this.tipomoto = tipomoto;
		this.cilindrada = cilindrada;
		this.tamaño = tamaño;
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

	public int getTamaño() {
		return tamaño;
	}

	public void setTamaño(int tamaño) {
		this.tamaño = tamaño;
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
		case "tamaño": return this.getTamaño();
		}
		return propiedad;
		
	}
	
	
	
	
}
