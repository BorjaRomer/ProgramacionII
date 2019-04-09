package LN;

import java.util.Date;
import static Comun.clsConstantes.*;


/**
 * Clase hija que se instancia en la clase Gestor.
 */

public class clsCamion extends clsVehiculo {

	int idtipocamion;
	int altura;
	int anchura;
	
	public clsCamion(String numbastidor, String marca, String modelo, int cv, int aniofabricacion, Date fecha, String color, int kilometros,
			int idtipocamion, int altura, int anchura, int idestado) {
		super(numbastidor, marca, modelo, cv, aniofabricacion, fecha, color, kilometros, idestado);
		this.idtipocamion = idtipocamion;
		this.altura = altura;
		this.anchura = anchura;
	}

	public int getIdtipocamion() {
		return idtipocamion;
	}

	public void setIdtipocamion(int idtipocamion) {
		this.idtipocamion = idtipocamion;
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
		case PROPIEDAD_IDESTADO: return this.getIdestado();
		case PROPIEDAD_TIPOCAMION_ID: return this.getIdtipocamion();
		case PROPIEDAD_CAMION_ALTURA: return this.getAltura();
		case PROPIEDAD_CAMION_ANCHURA: return this.getAnchura();
		}
		
		return propiedad;
		
	}
	
	
	
}
