package LN;

import java.util.Date;
import Comun.itfProperty;
import java.util.ArrayList;
import LD.clsDatos;

public class clsGestor {
	
	clsDatos objDatos = new clsDatos();
	private ArrayList<clsVehiculo> registros = new ArrayList<>();
	
	public ArrayList<itfProperty> DameVehiculos() {
		 ArrayList<itfProperty> retorno;
		 retorno = new ArrayList<itfProperty>();
		 for(clsVehiculo a:registros) {
			 retorno.add(a);
		 }
		 return retorno;
	}
	
	public void RecogerBD() {
		objDatos.consultarBD();
	}
	
	public void EliminarBD(String numerobastidor) {
		objDatos.eliminarBD(numerobastidor);
	}

	/**
	 * Funcion Crear coche para que se comunique con el Menu Principal y guardars los atributos en la instancia objeto coche.
	 * De esta manera solo se comunica con el Menu Principal la Clase Gestor. 
	 */
	public void CrearCoche(String numbastidor, String marca, String modelo, int cv, int aniofabricacion, String estado, Date fecha, String color, int kilometros,
			String tipocoche, String combustible, String cilindrada) {
		
		clsCoche objCoche = new clsCoche(numbastidor, marca, modelo, cv, aniofabricacion, estado, fecha, color, kilometros,
				tipocoche, combustible, cilindrada);
		
		//A�adimos al AarrayList el objeto creado
		registros.add(objCoche);
		
		//Se crea un objDatos para llamar a la funcion insertarBD
		objDatos.insertarBD(numbastidor, marca, modelo, cv, aniofabricacion, color, kilometros,
				tipocoche, combustible, cilindrada);
		
	}
	
	/**
	 * Funcion Crear camion para que se comunique con el Menu Principal y guardars los atributos en la instancia objeto camion.
	 * De esta manera solo se comunica con el Menu Principal la Clase Gestor. 
	 */
	public void CrearCamion(String numbastidor, String marca, String modelo, int cv, int aniofabricacion, String estado, Date fecha, String color, int kilometros,
			String tipocamion, int altura, int anchura) {
		
		clsCamion objCamion = new clsCamion(numbastidor, marca, modelo, cv, aniofabricacion, estado, fecha, color, kilometros, tipocamion, altura, anchura);
		
		registros.add(objCamion);
	}

	/**
	 * Funcion Crear moto para que se comunique con el Menu Principal y guardars los atributos en la instancia objeto moto.
	 * De esta manera solo se comunica con el Menu Principal la Clase Gestor. 
	 */
	public void CrearMoto(String numbastidor, String marca, String modelo, int cv, int aniofabricacion, String estado, Date fecha, String color, int kilometros,
			String tipomoto, int cilindrada, int tama�o) {
		
		clsMoto objMoto = new clsMoto(numbastidor, marca, modelo, cv, aniofabricacion, estado, fecha, color, kilometros, tipomoto, cilindrada, tama�o);
		
		registros.add(objMoto);
	}
	
}
