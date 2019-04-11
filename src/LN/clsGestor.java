package LN;

import java.util.Date;
import Comun.itfProperty;
import java.util.ArrayList;
import LD.clsDatos;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

public class clsGestor {

	// Creamos objeto de la clase Datos para utilizar sus funciones
	clsDatos objDatos = new clsDatos();

	// ArrayList donde van a contener los estados de los vehiculos
	private ArrayList<clsEstado> estados = new ArrayList<>();

	// ArrayList donde van a contener los tipo de coches
	private ArrayList<clsTipoCoche> tipocoche = new ArrayList<>();

	// ArrayList donde van a contener los tipos de motos
	private ArrayList<clsTipoMoto> tipomoto = new ArrayList<>();

	// ArrayList donde van a contener los tipos de camiones
	private ArrayList<clsTipoCamion> tipocamion = new ArrayList<>();

	// Creamos ArrayList de vehiculos
	private ArrayList<clsVehiculo> registros = new ArrayList<>();

	// Funcion ArrayList donde se guardan los vehiculos
	public ArrayList<itfProperty> DameVehiculos() {
		ArrayList<itfProperty> retorno;
		retorno = new ArrayList<itfProperty>();
		for (clsVehiculo a : registros) {
			retorno.add(a);
		}
		return retorno;
	}

	public void RecogertipococheBD() throws SQLException {
		// Se crea conexion con BD
		Connection conexion = objDatos.conectarBD();
		ResultSet rs;

		// Se llama a la funcion recoger tipos de coche de la clase Datos
		rs = objDatos.recogertipococheBD(conexion);

		// Recorre el ResultSet añadiendo los objetos en el ArrayList
		while (rs.next()) {
			clsTipoCoche objTipoCoche = new clsTipoCoche(rs.getInt("idtipocoche"), rs.getString("descripcion"));
			tipocoche.add(objTipoCoche);
		}

		// Se desconecta la BD
		objDatos.desconectarBD(conexion);

	}

	public void RecogertipomotoBD() throws SQLException {

		// Se crea conexion con BD
		Connection conexion = objDatos.conectarBD();
		ResultSet rs;

		// Se llama a la funcion recoger tipos de moto de la clase Datos
		rs = objDatos.recogertipomotoBD(conexion);

		// Recorre el ResultSet añadiendo los objetos en el ArrayList
		while (rs.next()) {
			clsTipoMoto objTipoMoto = new clsTipoMoto(rs.getInt("idtipomoto"), rs.getString("descripcion"));
			tipomoto.add(objTipoMoto);
		}

		// Se desconecta la BD
		objDatos.desconectarBD(conexion);

	}

	public void RecogertipocamionBD() throws SQLException {

		// Se crea conexion con BD
		Connection conexion = objDatos.conectarBD();
		ResultSet rs;

		// Se llama a la funcion recoger tipos de coche de la clase Datos
		rs = objDatos.recogertipocamionBD(conexion);

		// Recorre el ResultSet añadiendo los objetos en el ArrayList
		while (rs.next()) {
			clsTipoCamion objTipoCamion = new clsTipoCamion(rs.getInt("idtipocamion"), rs.getString("descripcion"));
			tipocamion.add(objTipoCamion);
		}

		// Se desconecta la BD
		objDatos.desconectarBD(conexion);

	}

	public void RecogerestadosBD() throws SQLException {

		// Se crea conexion con BD
		Connection conexion = objDatos.conectarBD();
		ResultSet rs;

		// Se llama a la funcion recoger estados de la clase Datos
		rs = objDatos.recogerestadoBD(conexion);

		// Recorre el ResultSet añadiendo los objetos en el ArrayList
		while (rs.next()) {
			clsEstado objEstado = new clsEstado(rs.getInt("idestado"), rs.getString("descripcion"));
			estados.add(objEstado);
		}

		// Se desconecta la BD
		objDatos.desconectarBD(conexion);
	}

	// Funcion recoger de base de datos desde clsGestor en el que utilizamos el
	// objeto Datos para llamar a la funcion consultar datos
	public void RecogercocheBD() throws SQLException {
		
		//Se crea conexion con BD
		Connection conexion = objDatos.conectarBD();
		ResultSet rs;
		
		//Funcion recoger coches de la BD
		rs = objDatos.recogercocheBD(conexion);
		
		//Se recorre el ResultSet añadiendo los objetos en el ArrayList
		while (rs.next()) {
			clsCoche objCoche = new clsCoche(rs.getString("numbastidor"), rs.getString("marca"), rs.getString("modelo"),
					rs.getInt("cv"), rs.getInt("aniofabricacion"), rs.getDate("fecha"), rs.getString("color"),
					rs.getInt("kilometros"), rs.getInt("idtipocoche"), rs.getString("combustible"),
					rs.getString("cilindrada"), rs.getInt("idestado"));

			registros.add(objCoche);
		}
		
		//Se desconecta la BD
		objDatos.desconectarBD(conexion);
	}

	// Funcion eliminar de base de datos desde clsGestor en el que utilizamos el
	// objeto Datos para llamar a la funcion eliminar datos
	public void EliminarcocheBD(String numerobastidor) throws SQLException {

		// Establecer conexion con BD
		Connection conexion = objDatos.conectarBD();

		for (clsVehiculo e : registros) {
			if (e.numbastidor.equals(numerobastidor)) {
				registros.remove(e);
				System.out.println("Se ha eliminado del AarrayList");

				// Funcion de clsDatos para eliminar el objeto de la BBDD
				objDatos.eliminarcocheBD(numerobastidor, conexion);

			} else {
				System.out.println("No coincide con el numbastidor");
			}
		}
		// Desconectar la BD
		objDatos.desconectarBD(conexion);
	}

	/**
	 * Funcion Crear coche para que se comunique con el Menu Principal y guardars
	 * los atributos en la instancia objeto coche. De esta manera solo se comunica
	 * con el Menu Principal la Clase Gestor.
	 * 
	 * @throws SQLException
	 */
	public void CrearCoche(String numbastidor, String marca, String modelo, int cv, int aniofabricacion, Date fecha,
			String color, int kilometros, int idtipocoche, String combustible, String cilindrada, int idestado)
			throws SQLException {

		clsCoche objCoche = new clsCoche(numbastidor, marca, modelo, cv, aniofabricacion, fecha, color, kilometros,
				idtipocoche, combustible, cilindrada, idestado);

		// Añadimos al AarrayList el objeto creado
		registros.add(objCoche);

		// Se conecta la BD
		Connection conexion = objDatos.conectarBD();

		// Se pasa por parámetro los atributos para introducirlos en la BD
		objDatos.insertarcocheBD(numbastidor, marca, modelo, cv, aniofabricacion, fecha, color, kilometros, idtipocoche,
				combustible, cilindrada, idestado, conexion);

		// Se desconecta la BD
		objDatos.desconectarBD(conexion);
	}

	/**
	 * Funcion Crear camion para que se comunique con el Menu Principal y guardars
	 * los atributos en la instancia objeto camion. De esta manera solo se comunica
	 * con el Menu Principal la Clase Gestor.
	 */
	public void CrearCamion(String numbastidor, String marca, String modelo, int cv, int aniofabricacion, Date fecha,
			String color, int kilometros, int idtipocamion, int altura, int anchura, int idestado) {

		clsCamion objCamion = new clsCamion(numbastidor, marca, modelo, cv, aniofabricacion, fecha, color, kilometros,
				idtipocamion, altura, anchura, idestado);

		// Añadimos al ArrayList el objeto creado
		registros.add(objCamion);
	}

	/**
	 * Funcion Crear moto para que se comunique con el Menu Principal y guardars los
	 * atributos en la instancia objeto moto. De esta manera solo se comunica con el
	 * Menu Principal la Clase Gestor.
	 */
	public void CrearMoto(String numbastidor, String marca, String modelo, int cv, int aniofabricacion, Date fecha,
			String color, int kilometros, int idtipomoto, int cilindrada, int tamaño, int idestado) {

		clsMoto objMoto = new clsMoto(numbastidor, marca, modelo, cv, aniofabricacion, fecha, color, kilometros,
				idtipomoto, cilindrada, tamaño, idestado);

		//// Añadimos al ArrayList el objeto creado
		registros.add(objMoto);
	}

}
