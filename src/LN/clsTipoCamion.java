package LN;

import static Comun.clsConstantes.*;

import Comun.clsRuntimeExceptionPropia;
import Comun.itfProperty;


public class clsTipoCamion implements itfProperty{

	int idtipocamion;
	
	String descripcion;

	public clsTipoCamion(int idtipocamion, String descripcion) {
		this.idtipocamion = idtipocamion;
		this.descripcion = descripcion;
	}

	public int getIdtipocamion() {
		return idtipocamion;
	}

	public void setIdtipocamion(int idtipocamion) {
		this.idtipocamion = idtipocamion;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}


	public Object getProperty(String propiedad) throws clsRuntimeExceptionPropia {
		
		switch(propiedad) {
		case PROPIEDAD_TIPOCAMION_ID: return this.getIdtipocamion();
		case PROPIEDAD_TIPOCAMION_DESCRIPCION: return this.getDescripcion();
		default: throw new clsRuntimeExceptionPropia();
		}
		
	}
	
	
	
	
}
