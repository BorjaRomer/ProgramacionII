package LN;
import java.util.Date;

import Comun.itfProperty;

/**
 * Clase padre abstracta que nunca se va a instanciar
 * Implementada por dos Interfaces una de tipo itfProperty y otra de tipo Comparable
 *
 */
public abstract class clsVehiculo implements itfProperty, Comparable <clsVehiculo> {
	
	/*
	 * Numero de bastidor de los cehiculos
	 */
	String numbastidor;
	/*
	 * Marca de los vehiculos
	 */
	String marca;
	/*
	 * Modelo de los vehiculos
	 */
	String modelo;
	/*
	 * Cavallos de los vehiculos
	 */
	Integer cv;
	/*
	 * Año de fabricacion de los vehiculos
	 */
	Date aniofabricacion;
	/*
	 * Fecha de registro
	 */
	Date fecha;
	/*
	 * Color del vehiculo
	 */
	String color;
	/*
	 * Kilometros que tiene el vehiculo
	 */
	int kilometros;
	/*
	 * Id de estado para relacionarlo con los objetos estado
	 */
	int idestado;
	/*
	 * Valor del vehiculo
	 */
	int valor;
	/*
	 * Id de operario
	 */
	String idoperario;
	
	/*
	 * Constructor
	 */
	public clsVehiculo(String numbastidor, String marca, String modelo, int cv, Date aniofabricacion, Date fecha, String color, int kilometros,
			int idestado, int valor, String idoperario) {
		this.numbastidor = numbastidor;
		this.marca = marca;
		this.modelo = modelo;
		this.cv = cv;
		this.aniofabricacion = aniofabricacion;
		this.fecha = fecha;
		this.color = color;
		this.kilometros = kilometros;
		this.idestado = idestado;
		this.valor = valor;
		this.idoperario = idoperario;
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

	public Integer getCv() {
		return cv;
	}

	public void setCv(int cv) {
		this.cv = cv;
	}

	public Date getAniofabricacion() {
		return aniofabricacion;
	}

	public void setAniofabricacion(Date aniofabricacion) {
		this.aniofabricacion = aniofabricacion;
	}

	public int getKilometros() {
		return kilometros;
	}

	public void setKilometros(int kilometros) {
		this.kilometros = kilometros;
	}

	public int getIdestado() {
		return idestado;
	}

	public void setIdestado(int idestado) {
		this.idestado = idestado;
	}

	public Integer getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}

	public String getIdoperario() {
		return idoperario;
	}

	public void setIdoperario(String idoperario) {
		this.idoperario = idoperario;
	}

	/**
	 * Metodo hasCode que evitala repeticion de un mismo objeto con un atributo en particular, en este caso el numero de bastidor
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((numbastidor == null) ? 0 : numbastidor.hashCode());
		return result;
	}

	/**
	 * Metodo equals que evitala repeticion de un mismo objeto con un atributo en particular, en este caso el numero de bastidor
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		clsVehiculo other = (clsVehiculo) obj;
		if (numbastidor == null) {
			if (other.numbastidor != null)
				return false;
		} else if (!numbastidor.equals(other.numbastidor))
			return false;
		return true;
	}
	
	/**
	 * Metodo para comparar los objetos vehiculo o que hereden de el con la Interfaz Comparable
	 */
	public int compareTo(clsVehiculo v) {
		
		return v.cv.compareTo(this.cv);
	
	}

}
