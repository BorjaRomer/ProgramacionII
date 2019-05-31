package LN;

import Comun.itfProperty;
import static Comun.clsConstantes.*;

import Comun.clsRuntimeExceptionPropia;

/**
 * Clase para crear objetos que contengan a cada operario *
 */
public class clsOperario implements itfProperty{
	
	/*
	 * Id del operario
	 */
	private String idoperario;
	/*
	 * Contraseña del oeprario
	 */
	private String contrasea;
	/*
	 * Nombre
	 */
	private String nombre;
	/*
	 * Apellido
	 */
	private String apellido;
	/*
	 * Dni
	 */
	private String dni;
	
	/*
	 * Constructor
	 */
	public clsOperario(String idoperario, String contrasea, String nombre, String apellido, String dni) {
		this.idoperario = idoperario;
		this.contrasea = contrasea;
		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;
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
	
	
	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getApellido() {
		return apellido;
	}


	public void setApellido(String apellido) {
		this.apellido = apellido;
	}


	public String getDni() {
		return dni;
	}


	public void setDni(String dni) {
		this.dni = dni;
	}


	@Override
	public Object getProperty(String propiedad) throws clsRuntimeExceptionPropia {
	
		switch (propiedad) {
		
		case PROPIEDAD_USUARIO_IDOPERARIO: return this.getIdoperario();
		case PROPIEDAD_USUARIO_CONTRASEÑA: return this.getContrasea();
		case PROPIEDAD_USUARIO_NOMBRE: return this.getNombre();
		case PROPIEDAD_USUARIO_APELLIDO: return this.getApellido();
		case PROPIEDAD_USUARIO_DNI: return this.getDni();
		default: throw new clsRuntimeExceptionPropia();
		}

	}


	@Override
	public String toString() {
		return "clsOperario [idoperario=" + idoperario + ", contraseña=" + contrasea + "]";
	}
	
	
	
}

