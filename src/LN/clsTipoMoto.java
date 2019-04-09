package LN;

import static Comun.clsConstantes.*;

import Comun.itfProperty;


public class clsTipoMoto implements itfProperty {

	int idtipomoto;
	
	String descripcion;

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
	public Object getProperty(String propiedad) {
		
		switch(propiedad) {
		case PROPIEDAD_TIPOMOTO_ID: return this.getIdtipomoto();
		case PROPIEDAD_TIPOMOTO_DESCRIPCION: return this.getDescripcion() ;
		}
		
	
		return propiedad;
			
	}
	
	
	
	
}
