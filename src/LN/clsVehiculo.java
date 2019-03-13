package LN;

import java.util.Date;

import Comun.itfProperty;

/**
 * Clase Padre que es abstracta porque nunca se va a instanciar.
 */
public abstract class clsVehiculo implements itfProperty {
	
	String numbastidor;
	String marca;
	String estado;
	Date fecha;
	String color;
	int kilometros;
	
	public clsVehiculo(String numbastidor, String marca, String estado, Date fecha, String color, int kilometros) {
		this.numbastidor = numbastidor;
		this.marca = marca;
		this.estado = estado;
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

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
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
	
	
	
	

}
