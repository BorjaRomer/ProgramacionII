package Comun;

import java.util.Comparator;
import LN.clsVehiculo;

public class clsComparatorMarca implements Comparator <clsVehiculo> {

	@Override
	public int compare(clsVehiculo v1, clsVehiculo v2) {
		return v1.getMarca().compareTo(v2.getMarca());
	}

}
