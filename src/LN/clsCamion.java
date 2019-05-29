package LN;

import java.util.Date;

import Comun.clsRuntimeExceptionPropia;

import static Comun.clsConstantes.*;


/**
 * Clase hija que se instancia en la clase Gestor.
 */

public class clsCamion extends clsVehiculo {

	int idtipocamion;
	int altura;
	int carga;
	
	public clsCamion(String numbastidor, String marca, String modelo, int cv, Date aniofabricacion, Date fecha, String color, int kilometros,
			int idtipocamion, int altura, int carga, int idestado, int valor, String idoperario) {
		super(numbastidor, marca, modelo, cv, aniofabricacion, fecha, color, kilometros, idestado, valor, idoperario);
		this.idtipocamion = idtipocamion;
		this.altura = altura;
		this.carga = carga;
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

	public int getCarga() {
		return carga;
	}

	public void setCarga(int carga) {
		this.carga = carga;
	}
	
	public Object getProperty (String propiedad) throws clsRuntimeExceptionPropia {
		
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
		case PROPIEDAD_VALOR: return this.getValor();
		case PROPIEDAD_IDOPERARIO: return this.getIdoperario();
		case PROPIEDAD_TIPOCAMION_ID: return this.getIdtipocamion();
		case PROPIEDAD_CAMION_ALTURA: return this.getAltura();
		case PROPIEDAD_CAMION_CARGA: return this.getCarga();
		default: throw new clsRuntimeExceptionPropia();
		}

		
	}
	
	
	
}
