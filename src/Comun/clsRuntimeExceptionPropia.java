package Comun;

public class clsRuntimeExceptionPropia extends RuntimeException {
	
	private static final long serialVersionUID = 1L;

	private final String MENSAJE = "No existe esa propiedad";

	
	public String getMessage() {
		
		return MENSAJE;
	}

	
	public String toString() {
		
		return MENSAJE;
	}

}
