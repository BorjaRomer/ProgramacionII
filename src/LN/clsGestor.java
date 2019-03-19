package LN;

import java.util.Date;

import Comun.itfProperty;

import java.util.ArrayList;

public class clsGestor {
	
	private ArrayList<clsVehiculo> registros = new ArrayList<>();
	
	public ArrayList<itfProperty> DameVehiculos() {
		 ArrayList<itfProperty> retorno;
		 retorno = new ArrayList<itfProperty>();
		 for(clsVehiculo a:registros) {
			 retorno.add(a);
		 }
		 return retorno;
	}

	/**
	 * Funcion Crear coche para que se comunique con el Menu Principal y guardars los atributos en la instancia objeto coche.
	 * De esta manera solo se comunica con el Menu Principal la Clase Gestor. 
	 */
	public void CrearCoche(String numbastidor, String marca, String estado, Date fecha, String color, int kilometros,
			String tipocoche, String combustible, String modelo) {
		
		clsCoche objCoche = new clsCoche(numbastidor, marca, estado, fecha, color, kilometros,
				tipocoche, combustible, modelo);
		
		registros.add(objCoche);
		
	}
	
	/**
	 * Funcion Crear camion para que se comunique con el Menu Principal y guardars los atributos en la instancia objeto camion.
	 * De esta manera solo se comunica con el Menu Principal la Clase Gestor. 
	 */
	public void CrearCamion(String numbastidor, String marca, String estado, Date fecha, String color, int kilometros,
			String tipocamion, int altura, int anchura) {
		
		clsCamion objCamion = new clsCamion(numbastidor, marca, estado, fecha, color, kilometros, tipocamion, altura, anchura);
		
		registros.add(objCamion);
	}

	/**
	 * Funcion Crear moto para que se comunique con el Menu Principal y guardars los atributos en la instancia objeto moto.
	 * De esta manera solo se comunica con el Menu Principal la Clase Gestor. 
	 */
	public void CrearMoto(String numbastidor, String marca, String estado, Date fecha, String color, int kilometros,
			String tipomoto, int cilindrada, int tamaño) {
		
		clsMoto objMoto = new clsMoto(numbastidor, marca, estado, fecha, color, kilometros, tipomoto, cilindrada, tamaño);
		
		registros.add(objMoto);
	}
	
}
