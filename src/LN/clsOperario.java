package LN;

import Comun.itfProperty;
import static Comun.clsConstantes.*;


public class clsOperario implements itfProperty{
	
	private String idoperario;
	private String contraseña;
	
	
	public clsOperario(String idoperario, String contraseña) {
		this.idoperario = idoperario;
		this.contraseña = contraseña;
	}


	public String getIdoperario() {
		return idoperario;
	}


	public void setIdoperario(String idoperario) {
		this.idoperario = idoperario;
	}


	public String getContraseña() {
		return contraseña;
	}


	public void setContraseña(String contraseña) {
		this.contraseña = contraseña;
	}


	@Override
	public Object getProperty(String propiedad) throws RuntimeException{
	
		switch (propiedad) {
		
		case PROPIEDAD_USUARIO_IDOPERARIO: return this.getIdoperario();
		case PROPIEDAD_USUARIO_CONTRASEÑA: return this.getContraseña();
		default: throw new RuntimeException();
		}

	}


	@Override
	public String toString() {
		return "clsOperario [idoperario=" + idoperario + ", contraseña=" + contraseña + "]";
	}
	
	
	
}
