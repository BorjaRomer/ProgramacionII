package LN;

import java.util.Date;
import static Comun.clsConstantes.*;

//Clase Coche hijo de clsVehiculo  
public class clsCoche extends clsVehiculo{

		String tipocoche;
		String combustible;
		String cilindrada;
		
		public clsCoche(String numbastidor, String marca, String modelo, int cv, int aniofabricacion, Date fecha, String color, int kilometros,
				String tipocoche, String combustible, String cilindrada, int idestado) {
			super(numbastidor, marca, modelo, cv, aniofabricacion, fecha, color, kilometros, idestado);
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
			
			case PROPIEDAD_NUMBASTIDOR: return this.getNumbastidor();
			case PROPIEDAD_MARCA: return this.getMarca();
			case PROPIEDAD_MODELO: return this.getModelo();
			case PROPIEDAD_CV: return this.getCv();
			case PROPIEDAD_ANIOFABRICACION: return this.getAniofabricacion();
			case PROPIEDAD_FECHA: return this.getFecha();
			case PROPIEDAD_COLOR: return this.getColor();
			case PROPIEDAD_KILOMETROS: return this.getKilometros();
			case PROPIEDAD_IDESTADO: return this.getIdestado();
			case PROPIEDAD_COCHE_TIPOCOCHE: return this.getTipocoche();
			case PROPIEDAD_COCHE_COMBUSTIBLE: return this.getCombustible();
			case PROPIEDAD_COCHE_CILINDRADA: return this.getCilindrada();
			}
			
			return propiedad;
			
		}
		
		
		
		
		
		
}
