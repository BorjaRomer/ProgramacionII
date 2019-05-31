package LN;

import static Comun.clsConstantes.*;

import Comun.clsRuntimeExceptionPropia;
import Comun.itfProperty;


/**
 * Clase para crear objeto de tipo coche
 *
 */
public class clsTipoCoche implements itfProperty {
	
	/*
	 * Id de tipo coche
	 */
	int idtipocoche;
	
	/*
	 * Descripcion
	 */
	String descripcion;

	/*
	 * Constructor
	 */
	public clsTipoCoche(int idtipocoche, String descripcion) {
		this.idtipocoche = idtipocoche;
		this.descripcion = descripcion;
	}

	public int getIdtipocoche() {
		return idtipocoche;
	}

	public void setIdtipocoche(int idtipocoche) {
		this.idtipocoche = idtipocoche;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	@Override
	public Object getProperty(String propiedad) throws clsRuntimeExceptionPropia {
		
		switch(propiedad) {
		case PROPIEDAD_TIPOCOCHE_ID: return this.getIdtipocoche();
		case PROPIEDAD_TIPOCOCHE_DESCRIPCION: return this.getDescripcion();
		default: throw new clsRuntimeExceptionPropia();
		}
		
	}
	
	
	
	

}
