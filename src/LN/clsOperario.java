package LN;

import Comun.itfProperty;
import static Comun.clsConstantes.*;


public class clsOperario implements itfProperty{
	
	private String idoperario;
	private String contrasea;
	
	
	public clsOperario(String idoperario, String contrasea) {
		this.idoperario = idoperario;
		this.contrasea = contrasea;
	}


	public String getIdoperario() {
		return idoperario;
	}


	public void setIdoperario(String idoperario) {
		this.idoperario = idoperario;
	}


	public String getContrasea() {
		return contrasea;
	}


	public void setContrasea(String contrasea) {
		this.contrasea = contrasea;
	}


	@Override
	public Object getProperty(String propiedad) throws RuntimeException{
	
		switch (propiedad) {
		
		case PROPIEDAD_USUARIO_IDOPERARIO: return this.getIdoperario();
		case PROPIEDAD_USUARIO_CONTRASEÑA: return this.getContrasea();
		default: throw new RuntimeException();
		}

	}


	@Override
	public String toString() {
		return "clsOperario [idoperario=" + idoperario + ", contraseña=" + contrasea + "]";
	}
	
	
	
}

