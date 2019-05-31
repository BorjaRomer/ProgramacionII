package LN;

import static Comun.clsConstantes.*;

import Comun.clsRuntimeExceptionPropia;
import Comun.itfProperty;

/**
 * Clase que crea el objeto de tipo moto
 *
 */
public class clsTipoMoto implements itfProperty {

	/*
	 * Id tipo moto
	 */
	int idtipomoto;
	/*
	 * Descripcion
	 */
	String descripcion;

	/*
	 * Constructor
	 */
	public clsTipoMoto(int idtipomoto, String descripcion) {
		this.idtipomoto = idtipomoto;
		this.descripcion = descripcion;
	}

	public int getIdtipomoto() {
		return idtipomoto;
	}

	public void setIdtipomoto(int idtipomoto) {
		this.idtipomoto = idtipomoto;
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
		case PROPIEDAD_TIPOMOTO_ID: return this.getIdtipomoto();
		case PROPIEDAD_TIPOMOTO_DESCRIPCION: return this.getDescripcion();
		default: throw new clsRuntimeExceptionPropia();
		}
			
	}
	
	
	
	
}
