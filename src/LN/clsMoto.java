package LN;

import java.util.Date;
import static Comun.clsConstantes.PROPIEDAD_NUMBASTIDOR;
import static Comun.clsConstantes.PROPIEDAD_MARCA;
import static Comun.clsConstantes.PROPIEDAD_MODELO; 
import static Comun.clsConstantes.PROPIEDAD_ANIOFABRICACION;
import static Comun.clsConstantes.PROPIEDAD_CV;
import static Comun.clsConstantes.PROPIEDAD_FECHA;
import static Comun.clsConstantes.PROPIEDAD_IDESTADO;
import static Comun.clsConstantes.PROPIEDAD_COLOR;
import static Comun.clsConstantes.PROPIEDAD_KILOMETROS;
import static Comun.clsConstantes.PROPIEDAD_MOTO_TIPOMOTO;
import static Comun.clsConstantes.PROPIEDAD_MOTO_CILINDRADA;
import static Comun.clsConstantes.PROPIEDAD_MOTO_TAMAÑO;

/**
 * Clase hija que se instancia en la clase Gestor.
 */

public class clsMoto extends clsVehiculo{
			
	String tipomoto;
	int cilindrada;
	int tamaño;
	
	public clsMoto(String numbastidor, String marca, String modelo, int cv, int aniofabricacion, Date fecha, String color, int kilometros,
			String tipomoto, int cilindrada, int tamaño, int idestado) {
		super(numbastidor, marca, modelo, cv, aniofabricacion, fecha, color, kilometros, idestado);
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
		
		case PROPIEDAD_NUMBASTIDOR: return this.getNumbastidor();
		case PROPIEDAD_MARCA: return this.getMarca();
		case PROPIEDAD_MODELO: return this.getModelo();
		case PROPIEDAD_CV: return this.getCv();
		case PROPIEDAD_ANIOFABRICACION: return this.getAniofabricacion();
		case PROPIEDAD_FECHA: return this.getFecha();
		case PROPIEDAD_COLOR: return this.getColor();
		case PROPIEDAD_KILOMETROS: return this.getKilometros();
		case PROPIEDAD_IDESTADO: return this.getIdestado();
		case PROPIEDAD_MOTO_TIPOMOTO: return this.getTipomoto();
		case PROPIEDAD_MOTO_CILINDRADA: return this.getCilindrada();
		case PROPIEDAD_MOTO_TAMAÑO: return this.getTamaño();
		}
		
		return propiedad;
		
	}
	
	
	
	
}
