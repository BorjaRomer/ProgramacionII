package LN;

import java.util.Date;
import static Comun.clsConstantes.*;

/**
 * Clase hija que se instancia en la clase Gestor.
 */
public class clsMoto extends clsVehiculo {

	int idtipomoto;
	int cilindrada;
	String tama�o;

	public clsMoto(String numbastidor, String marca, String modelo, int cv, int aniofabricacion, Date fecha,
			String color, int kilometros, int idtipomoto, int cilindrada, String tama�o, int idestado) {
		super(numbastidor, marca, modelo, cv, aniofabricacion, fecha, color, kilometros, idestado);
		this.idtipomoto = idtipomoto;
		this.cilindrada = cilindrada;
		this.tama�o = tama�o;
	}

	public int getIdtipomoto() {
		return idtipomoto;
	}

	public void setIdtipomoto(int idtipomoto) {
		this.idtipomoto = idtipomoto;
	}

	public int getCilindrada() {
		return cilindrada;
	}

	public void setCilindrada(int cilindrada) {
		this.cilindrada = cilindrada;
	}

	public String getTama�o() {
		return tama�o;
	}

	public void setTama�o(String tama�o) {
		this.tama�o = tama�o;
	}

	public Object getProperty(String propiedad) {

		switch (propiedad) {

		case PROPIEDAD_NUMBASTIDOR:
			return this.getNumbastidor();
		case PROPIEDAD_MARCA:
			return this.getMarca();
		case PROPIEDAD_MODELO:
			return this.getModelo();
		case PROPIEDAD_CV:
			return this.getCv();
		case PROPIEDAD_ANIOFABRICACION:
			return this.getAniofabricacion();
		case PROPIEDAD_FECHA:
			return this.getFecha();
		case PROPIEDAD_COLOR:
			return this.getColor();
		case PROPIEDAD_KILOMETROS:
			return this.getKilometros();
		case PROPIEDAD_IDESTADO:
			return this.getIdestado();
		case PROPIEDAD_TIPOMOTO_ID:
			return this.getIdtipomoto();
		case PROPIEDAD_MOTO_CILINDRADA:
			return this.getCilindrada();
		case PROPIEDAD_MOTO_TAMA�O:
			return this.getTama�o();
		default:
			throw new RuntimeException("Propiedad no existente");
		}

	}

}
