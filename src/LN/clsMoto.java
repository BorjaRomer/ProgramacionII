package LN;

import java.util.Date;

import Comun.clsRuntimeExceptionPropia;

import static Comun.clsConstantes.*;

/**
 * Clase hija que hereda de clsVehiculo
 *
 */
public class clsMoto extends clsVehiculo {

	/*
	 * Id tipo de moto
	 */
	int idtipomoto;
	/*
	 * Cilindrada de la moto
	 */
	int cilindrada;
	/*
	 * Tama�o de la moto
	 */
	String tama�o;

	/*
	 * Constructor
	 */
	public clsMoto(String numbastidor, String marca, String modelo, int cv, Date aniofabricacion, Date fecha,
			String color, int kilometros, int idtipomoto, int cilindrada, String tama�o, int idestado, int valor,
			String idoperario) {
		super(numbastidor, marca, modelo, cv, aniofabricacion, fecha, color, kilometros, idestado, valor, idoperario);
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

	public Object getProperty(String propiedad)  throws clsRuntimeExceptionPropia {

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
		case PROPIEDAD_VALOR:
			return this.getValor();
		case PROPIEDAD_IDOPERARIO:
			return this.getIdoperario();
		case PROPIEDAD_TIPOMOTO_ID:
			return this.getIdtipomoto();
		case PROPIEDAD_MOTO_CILINDRADA:
			return this.getCilindrada();
		case PROPIEDAD_MOTO_TAMA�O:
			return this.getTama�o();
		default:
			throw new clsRuntimeExceptionPropia();
		}

	}

}
