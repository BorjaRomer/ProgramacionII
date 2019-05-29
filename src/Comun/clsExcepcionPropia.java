package Comun;

public class clsExcepcionPropia extends Exception {

	private static final long serialVersionUID = 1L;

	private final String MENSAJE = "Solo puedes vender vehiculos en estado optimo";

	
	public String getMessage() {
		
		return MENSAJE;
	}

	
	public String toString() {
		
		return MENSAJE;
	}

}
