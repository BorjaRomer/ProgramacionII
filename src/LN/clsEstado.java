package LN;
import static Comun.clsConstantes.*;

import Comun.clsRuntimeExceptionPropia;
import Comun.itfProperty;

/**
 * Clase para crear objetos estados que estan relacionados con los vehiculos
 *
 */
public class clsEstado implements itfProperty{
	
	/*
	 * Id de estado 
	 */
	int idestado;
	/*
	 * Descripcion
	 */
	String descripcion;
	
	/*
	 * Constructor
	 */
	public clsEstado(int idestado, String descripcion) {
		this.idestado = idestado;
		this.descripcion = descripcion;
	}

	public int getIdestado() {
		return idestado;
	}

	public void setIdestado(int idestado) {
		this.idestado = idestado;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	public Object getProperty (String propiedad) throws clsRuntimeExceptionPropia {
		
		switch(propiedad) {
		case PROPIEDAD_ESTADO_ID: return this.getIdestado();
		case PROPIEDAD_ESTADO_DESCRIPCION: return this.getDescripcion();
		default: throw new clsRuntimeExceptionPropia();
		}
		
		
	}

}
