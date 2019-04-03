package LN;

import java.util.Date;
import static Comun.clsConstantes.PROPIEDAD_NUMBASTIDOR;
import static Comun.clsConstantes.PROPIEDAD_MARCA;
import static Comun.clsConstantes.PROPIEDAD_MODELO; 
import static Comun.clsConstantes.PROPIEDAD_ANIOFABRICACION;
import static Comun.clsConstantes.PROPIEDAD_CV;
import static Comun.clsConstantes.PROPIEDAD_FECHA;
import static Comun.clsConstantes.PROPIEDAD_COLOR;
import static Comun.clsConstantes.PROPIEDAD_KILOMETROS;
import static Comun.clsConstantes.PROPIEDAD_CAMION_TIPOCAMION;
import static Comun.clsConstantes.PROPIEDAD_CAMION_ALTURA;
import static Comun.clsConstantes.PROPIEDAD_CAMION_ANCHURA;

/**
 * Clase hija que se instancia en la clase Gestor.
 */

public class clsCamion extends clsVehiculo {

	String tipocamion;
	int altura;
	int anchura;
	
	public clsCamion(String numbastidor, String marca, String modelo, int cv, int aniofabricacion, Date fecha, String color, int kilometros,
			String tipocamion, int altura, int anchura) {
		super(numbastidor, marca, modelo, cv, aniofabricacion, fecha, color, kilometros);
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
		
		case PROPIEDAD_NUMBASTIDOR: return this.getNumbastidor();
		case PROPIEDAD_MARCA: return this.getMarca();
		case PROPIEDAD_MODELO: return this.getModelo();
		case PROPIEDAD_CV: return this.getCv();
		case PROPIEDAD_ANIOFABRICACION: return this.getAniofabricacion();
		case PROPIEDAD_FECHA: return this.getFecha();
		case PROPIEDAD_COLOR: return this.getColor();
		case PROPIEDAD_KILOMETROS: return this.getKilometros();
		case PROPIEDAD_CAMION_TIPOCAMION: return this.getTipocamion();
		case PROPIEDAD_CAMION_ALTURA: return this.getAltura();
		case PROPIEDAD_CAMION_ANCHURA: return this.getAnchura();
		}
		
		return propiedad;
		
	}
	
	
	
}
