package LN;

import Comun.itfProperty;
import static Comun.clsConstantes.*;


public class clsOperario implements itfProperty{
	
	private String idoperario;
	private String contrase�a;
	
	
	public clsOperario(String idoperario, String contrase�a) {
		this.idoperario = idoperario;
		this.contrase�a = contrase�a;
	}


	public String getIdoperario() {
		return idoperario;
	}


	public void setIdoperario(String idoperario) {
		this.idoperario = idoperario;
	}


	public String getContrase�a() {
		return contrase�a;
	}


	public void setContrase�a(String contrase�a) {
		this.contrase�a = contrase�a;
	}


	@Override
	public Object getProperty(String propiedad) throws RuntimeException{
	
		switch (propiedad) {
		
		case PROPIEDAD_USUARIO_IDOPERARIO: return this.getIdoperario();
		case PROPIEDAD_USUARIO_CONTRASE�A: return this.getContrase�a();
		default: throw new RuntimeException();
		}

	}


	@Override
	public String toString() {
		return "clsOperario [idoperario=" + idoperario + ", contrase�a=" + contrase�a + "]";
	}
	
	
	
}
