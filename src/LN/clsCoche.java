package LN;

import java.util.Date;
import static Comun.clsConstantes.*;

/**Clase Coche hijo de clsVehiculo  */
	public class clsCoche extends clsVehiculo {

	int idtipocoche;
	int cilindrada;
	String combustible;
	
	/**Constructor de clsCoche*/
	public clsCoche(String numbastidor, String marca, String modelo, int cv, Date aniofabricacion, Date fecha, String color, int kilometros,
			int idtipocoche, String combustible, int cilindrada, int idestado, int valor) {
		super(numbastidor, marca, modelo, cv, aniofabricacion, fecha, color, kilometros, idestado, valor);
		this.idtipocoche = idtipocoche;
		this.combustible = combustible;
		this.cilindrada = cilindrada;
	}
	
	public int getIdtipocoche() {
		return idtipocoche;
	}
	public void setTipocoche(int idtipocoche) {
		this.idtipocoche = idtipocoche;
	}
	
	public String getCombustible() {
		return combustible;
	}
	public void setCombustible(String combustible) {
		this.combustible = combustible;
	}

	public int getCilindrada() {
		return cilindrada;
	}

	public void setCilindrada(int cilindrada) {
		this.cilindrada = cilindrada;
	}
	
	public Object getProperty (String propiedad) throws RuntimeException {
		
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
		case PROPIEDAD_TIPOCOCHE_ID: return this.getIdtipocoche();
		case PROPIEDAD_COCHE_COMBUSTIBLE: return this.getCombustible();
		case PROPIEDAD_COCHE_CILINDRADA: return this.getCilindrada();
		default: throw new RuntimeException("Propiedad no existente");
		
		}
		
	}
	
	/**
	 * Metodo toString para devolver los parametros cuando queremos mostrarlo
	 */
	public String toString() {
		
		return "\n Nº Bastidor: " + this.numbastidor + "; MARCA: " + this.marca + "; FECHA: " + this.fecha + "; CV: " + this.cv;
		
	}
	
}
