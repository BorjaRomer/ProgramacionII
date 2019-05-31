package Comun;

/**
 * Clase que extiende de RuntimeException donde se crea una excepcion propia
 */

public class clsRuntimeExceptionPropia extends RuntimeException {

	private static final long serialVersionUID = 1L;

	/**
	 * Constante donde se especifíca el mensaje
	 */
	private final String MENSAJE = "No existe esa propiedad";

	/**
	 * Metodo que devuelve el mensaje
	 */
	public String getMessage() {

		return MENSAJE;
	}

	/**
	 * Metodo que devuelve el mensaje
	 */
	public String toString() {

		return MENSAJE;
	}

}
