package Comun;

import java.util.Comparator;
import LN.clsVehiculo;

public class clsComparatorValor implements Comparator <clsVehiculo> {

	public int compare(clsVehiculo v1, clsVehiculo v2) {
		return v1.getValor().compareTo(v2.getValor());
	}

}
