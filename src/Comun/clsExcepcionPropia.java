package Comun;

/**
 * Clase que extiende de Exception donde se crea una excepci�n propia
 */

public class clsExcepcionPropia extends Exception {

	private static final long serialVersionUID = 1L;

	/**
	 * Constante de la clase en la que se especif�ca el mensaje
	 */
	private final String MENSAJE = "Solo puedes vender vehiculos en estado optimo";

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
