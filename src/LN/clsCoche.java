package LN;

import java.util.Date;

/**
 * Clase hija que se instancia en la clase Gestor.
 */

public class clsCoche extends clsVehiculo{

		String tipocoche;
		String combustible;
		String modelo;
		
		public clsCoche(String numbastidor, String marca, String estado, Date fecha, String color, int kilometros,
				String tipocoche, String combustible, String modelo) {
			super(numbastidor, marca, estado, fecha, color, kilometros);
			this.tipocoche = tipocoche;
			this.combustible = combustible;
			this.modelo = modelo;
		}
		
		public String getTipocoche() {
			return tipocoche;
		}
		public void setTipocoche(String tipocoche) {
			this.tipocoche = tipocoche;
		}
		
		public String getCombustible() {
			return combustible;
		}
		public void setCombustible(String combustible) {
			this.combustible = combustible;
		}
		public String getModelo() {
			return modelo;
		}
		public void setModelo(String modelo) {
			this.modelo = modelo;
		}
		
		public Object getProperty (String propiedad) {
			
			switch(propiedad) {
			
			case "numbastidor": return this.getNumbastidor();
			case "marca": return this.getMarca();
			case "estado": return this.getEstado();
			case "fecha": return this.getFecha();
			case "color": return this.getColor();
			case "tipocoche": return this.getTipocoche();
			case "modelo": return this.getModelo();
			case "combustible": return this.getCombustible();
			}
			return propiedad;
			
		}
		
		
}
