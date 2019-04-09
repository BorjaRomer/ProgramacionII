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
	
	//ArrayList donde van a contener los estados de los vehiculos
	private ArrayList<clsEstado> estados = new ArrayList<>();
	
	//ArrayList donde van a contener los tipo de coches
	private ArrayList<clsTipoCoche> tipocoche = new ArrayList<>();
	
	//ArrayList donde van a contener los tipos de motos
	private ArrayList<clsTipoMoto> tipomoto = new ArrayList<>();
	
	//ArrayList donde van a contener los tipos de camiones
	private ArrayList<clsTipoCamion> tipocamion = new ArrayList<>();
	
	
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
				  rs.getInt ("idtipocoche"), rs.getString ("combustible"), rs.getString ("cilindrada"), rs.getInt ("idestado"));
		  
		  registros.add(objCoche);
    	}
	}
	
	
	//Funcion eliminar de base de datos desde clsGestor en el que utilizamos el objeto Datos para llamar a la funcion eliminar datos
	public void EliminarBD(String numerobastidor) {
		
		//Eliminar del ArrayList
		for (clsVehiculo e: registros) {
			if(e.numbastidor.equals(numerobastidor)) {
				registros.remove(e);
				System.out.println("Se ha eliminado del AarrayList");
			}
		}
		
		//Funcion de clsDatos para eliminar el objeto de la BBDD
		objDatos.eliminarBD(numerobastidor);
	}
	
	
	public void RecogerEstados() {
		
	}
	
	public void RecogerTipocoche() {
		
	}
	
	public void RecogerTipomoto() {
		
	}
	
	public void RecogerTipocamion() {
		
	}
	
	

	/**
	 * Funcion Crear coche para que se comunique con el Menu Principal y guardars los atributos en la instancia objeto coche.
	 * De esta manera solo se comunica con el Menu Principal la Clase Gestor. 
	 */
	public void CrearCoche(String numbastidor, String marca, String modelo, int cv, int aniofabricacion, Date fecha, String color, int kilometros,
			int idtipocoche, String combustible, String cilindrada, int idestado) {
		
		clsCoche objCoche = new clsCoche(numbastidor, marca, modelo, cv, aniofabricacion, fecha, color, kilometros,
				idtipocoche, combustible, cilindrada, idestado);
		
		//Añadimos al AarrayList el objeto creado
		registros.add(objCoche);
		
		//Se crea un objDatos para llamar a la funcion insertarBD
		objDatos.insertarBD(numbastidor, marca, modelo, cv, aniofabricacion, fecha, color, kilometros,
				idtipocoche, combustible, cilindrada, idestado);
		
	}
	
	/**
	 * Funcion Crear camion para que se comunique con el Menu Principal y guardars los atributos en la instancia objeto camion.
	 * De esta manera solo se comunica con el Menu Principal la Clase Gestor. 
	 */
	public void CrearCamion(String numbastidor, String marca, String modelo, int cv, int aniofabricacion, Date fecha, String color, int kilometros,
			int idtipocamion, int altura, int anchura, int idestado) {
		
		clsCamion objCamion = new clsCamion(numbastidor, marca, modelo, cv, aniofabricacion, fecha, color, kilometros,idtipocamion, altura, anchura, idestado);
		
		//Añadimos al ArrayList el objeto creado
		registros.add(objCamion);
	}

	/**
	 * Funcion Crear moto para que se comunique con el Menu Principal y guardars los atributos en la instancia objeto moto.
	 * De esta manera solo se comunica con el Menu Principal la Clase Gestor. 
	 */
	public void CrearMoto(String numbastidor, String marca, String modelo, int cv, int aniofabricacion, Date fecha, String color, int kilometros,
			int idtipomoto, int cilindrada, int tamaño, int idestado) {
		
		clsMoto objMoto = new clsMoto(numbastidor, marca, modelo, cv, aniofabricacion, fecha, color, kilometros, idtipomoto, cilindrada, tamaño, idestado);
		
		////Añadimos al ArrayList el objeto creado
		registros.add(objMoto);
	}

}
