package LN;

import java.util.Date;

/**
 * Clase hija que se instancia en la clase Gestor.
 */

public class clsCamion extends clsVehiculo {

	String tipocamion;
	int altura;
	int anchura;
	
	public clsCamion(String numbastidor, String marca, String estado, Date fecha, String color, int kilometros,
			String tipocamion, int altura, int anchura) {
		super(numbastidor, marca, estado, fecha, color, kilometros);
		this.tipocamion = tipocamion;
		this.altura = altura;
		this.anchura = anchura;
	}

	public String getTipocamion() {
		return tipocamion;
	}

	public void setTipocamion(String tipocamion) {
		this.tipocamion = tipocamion;
	}


	public int getAltura() {
		return altura;
	}

	public void setAltura(int altura) {
		this.altura = altura;
	}

	public int getAnchura() {
		return anchura;
	}

	public void setAnchura(int anchura) {
		this.anchura = anchura;
	}
	
	public Object getProperty (String propiedad) {
		
		switch(propiedad) {
		
		case "numbastidor": return this.getNumbastidor();
		case "marca": return this.getMarca();
		case "estado": return this.getEstado();
		case "fecha": return this.getFecha();
		case "color": return this.getColor();
		case "tipocamion": return this.getTipocamion();
		case "altura": return this.getAltura();
		case "anchura": return this.getAnchura();
		}
		return propiedad;
		
	}
	
	
	
}
