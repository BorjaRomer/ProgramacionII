package LN;

import java.util.Date;
import Comun.itfProperty;
import java.util.ArrayList;
import LD.clsDatos;
import java.sql.ResultSet;
import java.sql.SQLException;


public class clsGestor {
	
	//Creamos objeto de la clase Datos para utilizar sus funciones
	clsDatos objDatos = new clsDatos();
	
	//Creamos ArrayList de vehiculos
	private ArrayList<clsVehiculo> registros = new ArrayList<>();
	
	//Funcion ArrayList donde se guardan los vehiculos
	public ArrayList<itfProperty> DameVehiculos() {
		 ArrayList<itfProperty> retorno;
		 retorno = new ArrayList<itfProperty>();
		 for(clsVehiculo a:registros) {
			 retorno.add(a);
		 }
		 return retorno;
	}
	
	//Funcion recoger de base de datos desde clsGestor en el que utilizamos el objeto Datos para llamar a la funcion consultar datos
	public void RecogerBD() throws SQLException {
		ResultSet rs;
		rs = objDatos.consultarBD();
		while (rs.next()) 
    	{ 
		  clsCoche objCoche = new clsCoche(rs.getString ("numbastidor"), rs.getString ("marca"), rs.getString ("modelo"), rs.getInt ("cv"),
				  rs.getInt ("aniofabricacion"), rs.getDate ("fecha"), rs.getString ("color"), rs.getInt ("kilometros"),
				  rs.getString ("tipocoche"), rs.getString ("combustible"), rs.getString ("cilindrada"));
		  
		  registros.add(objCoche);
    	}
	}
	
	//Funcion eliminar de base de datos desde clsGestor en el que utilizamos el objeto Datos para llamar a la funcion eliminar datos
	public void EliminarBD(String numerobastidor) {
		objDatos.eliminarBD(numerobastidor);
	}
	

	/**
	 * Funcion Crear coche para que se comunique con el Menu Principal y guardars los atributos en la instancia objeto coche.
	 * De esta manera solo se comunica con el Menu Principal la Clase Gestor. 
	 */
	public void CrearCoche(String numbastidor, String marca, String modelo, int cv, int aniofabricacion, Date fecha, String color, int kilometros,
			String tipocoche, String combustible, String cilindrada) {
		
		clsCoche objCoche = new clsCoche(numbastidor, marca, modelo, cv, aniofabricacion, fecha, color, kilometros,
				tipocoche, combustible, cilindrada);
		
		//Añadimos al AarrayList el objeto creado
		registros.add(objCoche);
		
		//Se crea un objDatos para llamar a la funcion insertarBD
		objDatos.insertarBD(numbastidor, marca, modelo, cv, aniofabricacion, fecha, color, kilometros,
				tipocoche, combustible, cilindrada);
		
	}
	
	/**
	 * Funcion Crear camion para que se comunique con el Menu Principal y guardars los atributos en la instancia objeto camion.
	 * De esta manera solo se comunica con el Menu Principal la Clase Gestor. 
	 */
	public void CrearCamion(String numbastidor, String marca, String modelo, int cv, int aniofabricacion, Date fecha, String color, int kilometros,
			String tipocamion, int altura, int anchura) {
		
		clsCamion objCamion = new clsCamion(numbastidor, marca, modelo, cv, aniofabricacion, fecha, color, kilometros, tipocamion, altura, anchura);
		
		//Añadimos al ArrayList el objeto creado
		registros.add(objCamion);
	}

	/**
	 * Funcion Crear moto para que se comunique con el Menu Principal y guardars los atributos en la instancia objeto moto.
	 * De esta manera solo se comunica con el Menu Principal la Clase Gestor. 
	 */
	public void CrearMoto(String numbastidor, String marca, String modelo, int cv, int aniofabricacion, Date fecha, String color, int kilometros,
			String tipomoto, int cilindrada, int tamaño) {
		
		clsMoto objMoto = new clsMoto(numbastidor, marca, modelo, cv, aniofabricacion, fecha, color, kilometros, tipomoto, cilindrada, tamaño);
		
		////Añadimos al ArrayList el objeto creado
		registros.add(objMoto);
	}
	
}
