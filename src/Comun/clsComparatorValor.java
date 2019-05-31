package Comun;

import java.util.Comparator;
import LN.clsVehiculo;

/**
 * Clase para ordenar los vehiculos por su valor(€) al que se le implementa la
 * interfaz comparator
 */
public class clsComparatorValor implements Comparator<clsVehiculo> {

	/**
	 * Metodo de ordenacion que compara los valores de los vehiculos
	 */
	public int compare(clsVehiculo v1, clsVehiculo v2) {
		return v1.getValor().compareTo(v2.getValor());
	}

}
