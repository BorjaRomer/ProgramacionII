package LN;
import static Comun.clsConstantes.*;
import Comun.itfProperty;

public class clsEstado implements itfProperty{
	
	//Atributo id del estado
	int idestado;
	//Atributo descripcion del id
	String descripcion;
	
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
	
	public Object getProperty (String propiedad) {
		
		switch(propiedad) {
		case PROPIEDAD_ESTADO_ID: return this.getIdestado();
		case PROPIEDAD_ESTADO_DESCRIPCION: return this.getDescripcion();
		default: throw new RuntimeException("Propiedad no existente");
		}
		
		
	}

}
