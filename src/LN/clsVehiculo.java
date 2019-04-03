package LN;

import java.util.Date;

import Comun.itfProperty;

/**
 * Clase Padre que es abstracta porque nunca se va a instanciar.
 */
public abstract class clsVehiculo implements itfProperty {
	
	String numbastidor;
	String marca;
	String modelo;
	int cv;
	int aniofabricacion;
	Date fecha;
	String color;
	int kilometros;
	
	public clsVehiculo(String numbastidor, String marca, String modelo, int cv, int aniofabricacion, Date fecha, String color, int kilometros) {
		this.numbastidor = numbastidor;
		this.marca = marca;
		this.modelo = modelo;
		this.cv = cv;
		this.aniofabricacion = aniofabricacion;
		this.fecha = fecha;
		this.color = color;
		this.kilometros = kilometros;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getNumbastidor() {
		return numbastidor;
	}

	public void setNumbastidor(String numbastidor) {
		this.numbastidor = numbastidor;
	}


	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getCv() {
		return cv;
	}

	public void setCv(int cv) {
		this.cv = cv;
	}

	public int getAniofabricacion() {
		return aniofabricacion;
	}

	public void setAniofabricacion(int aniofabricacion) {
		this.aniofabricacion = aniofabricacion;
	}

	public int getKilometros() {
		return kilometros;
	}

	public void setKilometros(int kilometros) {
		this.kilometros = kilometros;
	}
	
	
	
	
	
	

}
