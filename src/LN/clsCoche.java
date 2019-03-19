package LN;

import java.util.Date;

/**
 * Clase hija que se instancia en la clase Gestor.
 */

public class clsCoche extends clsVehiculo{

		String tipocoche;
		String combustible;
		String cilindrada;
		
		public clsCoche(String numbastidor, String marca, String modelo, int cv, int aniofabricacion, String estado, Date fecha, String color, int kilometros,
				String tipocoche, String combustible, String cilindrada) {
			super(numbastidor, marca, modelo, cv, aniofabricacion, estado, fecha, color, kilometros);
			this.tipocoche = tipocoche;
			this.combustible = combustible;
			this.cilindrada = cilindrada;
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

		public String getCilindrada() {
			return cilindrada;
		}

		public void setCilindrada(String cilindrada) {
			this.cilindrada = cilindrada;
		}
		
		public Object getProperty (String propiedad) {
			
			switch(propiedad) {
			
			case "numbastidor": return this.getNumbastidor();
			case "marca": return this.getMarca();
			case "modelo": return this.getModelo();
			case "cv": return this.getCv();
			case "aniofabricacion": return this.getAniofabricacion();
			case "estado": return this.getEstado();
			case "fecha": return this.getFecha();
			case "color": return this.getColor();
			case "kilometros": return this.getKilometros();
			case "tipocoche": return this.getTipocoche();
			case "combustible": return this.getCombustible();
			case "cilindrada": return this.getCilindrada();
			}
			
			return propiedad;
			
		}
		
		
		
		
		
		
}
