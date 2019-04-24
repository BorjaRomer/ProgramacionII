package LN;

import java.util.Date;
import Comun.clsComparatorMarca;
import Comun.itfProperty;
import java.util.ArrayList;
import java.util.Collections;
import LD.clsDatos;
import java.sql.ResultSet;
import java.sql.SQLException;

public class clsGestor {

	/**Creamos objeto de la clase Datos para utilizar sus funciones*/
	clsDatos objDatos = new clsDatos();

	/**ArrayList donde van a contener los estados de los vehiculos*/
	private ArrayList<clsEstado> estados = new ArrayList<>();
	
	/**Funcion ArrayList donde se guardan los estados*/
	
	public ArrayList<itfProperty> DameEstados() {
		ArrayList<itfProperty> retorno = new ArrayList<itfProperty>();
		for (clsEstado a : estados) {
			retorno.add(a);
		}
		return retorno;
	}

	/**ArrayList donde van a contener los tipo de coches*/
	private ArrayList<clsTipoCoche> tipocoche = new ArrayList<>();

	/**ArrayList donde van a contener los tipos de motos*/
	private ArrayList<clsTipoMoto> tipomoto = new ArrayList<>();

	/**ArrayList donde van a contener los tipos de camiones*/
	private ArrayList<clsTipoCamion> tipocamion = new ArrayList<>();

	/** Creamos ArrayList de vehiculos*/
	private ArrayList<clsVehiculo> vehiculos = new ArrayList<>();

	/**Funcion ArrayList donde se guardan los vehiculos*/
	public ArrayList<itfProperty> DameCoches(int orden) throws RuntimeException {
	
		if(orden==1) {
			/**Se instancia la clase Comparator con el metodo CompareTo*/
			clsComparatorMarca comparadormarca = new clsComparatorMarca();
			
			/**Con el metodo sort ordenamos los vehiculos mediante la clase Comparator creada*/
			Collections.sort(vehiculos, comparadormarca);
		}
		
		if(orden==2) {
			/**Interfaz Comparable implementada en vehiculos que ordena por potencia en caballos	*/
		Collections.sort(vehiculos);
		}
		
		ArrayList<itfProperty> retorno = new ArrayList<itfProperty>();
		
		for (clsVehiculo a : vehiculos) {
			if(a instanceof clsCoche) {
			retorno.add(a);
			}else {
				throw new RuntimeException("No hay coches en la BD");
			}
		}
		return retorno;	
	}

	public void RecogertipococheBD() throws SQLException {
		/** Se crea conexion con BD*/
		objDatos.conectarBD();
		ResultSet rs;

		/** Se llama a la funcion recoger tipos de coche de la clase Datos*/
		rs = objDatos.recogertipococheBD();

		/** Recorre el ResultSet añadiendo los objetos en el ArrayList*/
		while (rs.next()) {
			clsTipoCoche objTipoCoche = new clsTipoCoche(rs.getInt("idtipocoche"), rs.getString("descripcion"));
			tipocoche.add(objTipoCoche);
		}

		/** Se desconecta la BD*/
		objDatos.desconectarBD();

	}

	public void RecogertipomotoBD() throws SQLException {

		/** Se crea conexion con BD*/
		objDatos.conectarBD();
		ResultSet rs;

		/** Se llama a la funcion recoger tipos de moto de la clase Datos*/
		rs = objDatos.recogertipomotoBD();

		/** Recorre el ResultSet añadiendo los objetos en el ArrayList*/
		while (rs.next()) {
			clsTipoMoto objTipoMoto = new clsTipoMoto(rs.getInt("idtipomoto"), rs.getString("descripcion"));
			tipomoto.add(objTipoMoto);
		}

		/** Se desconecta la BD*/
		objDatos.desconectarBD();

	}

	public void RecogertipocamionBD() throws SQLException {

		/**Se crea conexion con BD*/
		objDatos.conectarBD();
		ResultSet rs;

		/** Se llama a la funcion recoger tipos de coche de la clase Datos*/
		rs = objDatos.recogertipocamionBD();

		/** Recorre el ResultSet añadiendo los objetos en el ArrayList*/
		while (rs.next()) {
			clsTipoCamion objTipoCamion = new clsTipoCamion(rs.getInt("idtipocamion"), rs.getString("descripcion"));
			tipocamion.add(objTipoCamion);
		}

		/**Se desconecta la BD*/
		objDatos.desconectarBD();

	}

	public void RecogerestadosBD() throws SQLException {

		/** Se crea conexion con BD*/
		objDatos.conectarBD();
		ResultSet rs;

		/**Se llama a la funcion recoger estados de la clase Datos*/
		rs = objDatos.recogerestadoBD();

		/**Recorre el ResultSet añadiendo los objetos en el ArrayList*/
		while (rs.next()) {
			clsEstado objEstado = new clsEstado(rs.getInt("idestado"), rs.getString("descripcion"));
			estados.add(objEstado);
		}

		/** Se desconecta la BD*/
		objDatos.desconectarBD();
	}

	/**Funcion recoger de base de datos desde clsGestor en el que utilizamos el*/
	/** objeto Datos para llamar a la funcion consultar datos*/
	public void RecogercocheBD() throws SQLException {

		/** Se crea conexion con BD*/
		objDatos.conectarBD();
		ResultSet rs;

		/**Funcion recoger coches de la BD*/
		rs = objDatos.recogercocheBD();

		/**Se recorre el ResultSet añadiendo los objetos en el ArrayList*/
		while (rs.next()) {
			clsCoche objCoche = new clsCoche(rs.getString("numbastidor"), rs.getString("marca"), rs.getString("modelo"),
					rs.getInt("cv"), rs.getInt("aniofabricacion"), rs.getDate("fecha"), rs.getString("color"),
					rs.getInt("kilometros"), rs.getInt("idtipocoche"), rs.getString("combustible"),
					rs.getString("cilindrada"), rs.getInt("idestado"));

			vehiculos.add(objCoche);
		}

		/**Se desconecta la BD*/
		objDatos.desconectarBD();
	}

	/**Funcion eliminar de base de datos desde clsGestor en el que utilizamos el*/
	/**objeto Datos para llamar a la funcion eliminar datos*/
	public void EliminarcocheBD(String numerobastidor) throws SQLException {

		/**Establecer conexion con BD*/
		objDatos.conectarBD();

		for (clsVehiculo e : vehiculos) {
			if(e instanceof clsCoche) {
			if (e.numbastidor.equals(numerobastidor)) {

				vehiculos.remove(e);
				System.out.println("Se ha eliminado del ArrayList");
				
				/**Funcion de clsDatos para eliminar el objeto de la BBDD*/
				objDatos.eliminarcocheBD(numerobastidor);

			}
		}
	}
		/**Desconectar la BD*/
		objDatos.desconectarBD();
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

		/**Se conecta la BD*/
		objDatos.conectarBD();

		/**Se pasa por parámetro los atributos para introducirlos en la BD*/
		objDatos.insertarcocheBD(numbastidor, marca, modelo, cv, aniofabricacion, fecha, color, kilometros, idtipocoche,
				combustible, cilindrada, idestado);

		/**Se desconecta la BD*/
		objDatos.desconectarBD();

		/**Añadimos al AarrayList el objeto creado*/
		vehiculos.add(objCoche);
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

		/**Añadimos al ArrayList el objeto creado*/
		vehiculos.add(objCamion);
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

		/**Añadimos al ArrayList el objeto creado*/
		vehiculos.add(objMoto);
	}

}
