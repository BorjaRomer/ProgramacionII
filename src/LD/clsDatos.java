package LD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;

public class clsDatos {

	/**Nombre de la base de datos*/
	private String database = "desguace";

	/** Host*/
	private String hostname = "localhost";

	/**Puerto*/
	private String port = "3306";

	/**Ruta de la base de datos*/
	/**(jdbc:mysql://localhost:3306/alumnoBD?useTimezone=true&serverTimezone=GMT&useSSL=false)*/
	private String url = "jdbc:mysql://" + hostname + ":" + port + "/" + database
			+ "?useTimezone=true&serverTimezone=GMT&useSSL=false";

	/** Nombre de usuario*/
	private String user = "root";

	/**Password*/
	private String password = "4392deusto";

	/** Se crea la conexion*/
	private Connection objConexion = null;

	/** Conectar BD*/
	public void conectarBD() {

		try {

			objConexion = DriverManager.getConnection(url, user, password);

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	/**Desconectar BD*/
	public void desconectarBD() {

		try {

			objConexion.close();

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}
	
	/** Modificar el estado de un coche en BBDD
	 * @throws SQLException */
	public void modificarEstadoCocheBD (String numbastidor, int id) throws SQLException {
		
		/** Funcion de la clase modificar estado para hacer update en BBDD*/
		clsModificarestadoBD.modificarCocheBD(numbastidor, id, objConexion);
		
	}
	
	/** Modificar el estado de un camion en BBDD
	 * @throws SQLException */
	public void modificarEstadoCamionBD (String numbastidor, int id) throws SQLException {
		
		/** Funcion de la clase modificar estado para hacer update en BBDD*/
		clsModificarestadoBD.modificarCamionBD(numbastidor, id, objConexion);
		
	}
	
	/** Modificar el estado de un camion en BBDD
	 * @throws SQLException */
	public void modificarEstadoMotoBD (String numbastidor, int id) throws SQLException {
		
		/** Funcion de la clase modificar estado para hacer update en BBDD*/
		clsModificarestadoBD.modificarMotoBD(numbastidor, id, objConexion);
		
	}
	
	/**Recoger pedidos en BD*/
	public ResultSet recogerpedidosBD() throws SQLException {

		/**Nos devuelve un ResultSet donde contiene los pedidos*/
		ResultSet rs = clsPedidoBD.recogerBD(objConexion);

		return rs;
	}
	
	public void insertatpedidosBD(double precio, String numbastidor, String dnicliente, String idoperario, String tipopedido) throws SQLException {
		
		/** Funcion de la clase pedidobd para hacer una insert en BD*/
		clsPedidoBD.insertarBD(precio, numbastidor, dnicliente, idoperario, tipopedido, objConexion);
		
	}
	
	/**Recoger operarios en BD*/
	public ResultSet recogeroperariosBD() throws SQLException {

		/**Nos devuelve un ResultSet donde contiene los operarios*/
		ResultSet rs = clsOperarioBD.recogerBD(objConexion);

		return rs;
	}

	/**Recoger tipos de coche en BD*/
	public ResultSet recogertipococheBD() throws SQLException {

		/**Nos devuelve un ResultSet donde contiene los tipos de coches*/
		ResultSet rs = clsTipovehiculoBD.recogertipococheBD(objConexion);

		return rs;
	}

	/**Recoger tipos de camion en BD*/
	public ResultSet recogertipocamionBD() throws SQLException {

		/**Nos devuelve un ResultSet donde contiene los tipos de camion*/
		ResultSet rs = clsTipovehiculoBD.recogertipocamionBD(objConexion);

		return rs;
	}

	/** Recoger tipos de motos en BD*/
	public ResultSet recogertipomotoBD() throws SQLException {

		/**Nos devuelve un ResultSet donde contiene los tipos de moto*/
		ResultSet rs = clsTipovehiculoBD.recogertipomotoBD(objConexion);

		return rs;
	}

	/**Recoger estados en BD*/
	public ResultSet recogerestadoBD() throws SQLException {

		/**Nos devuelve un ResultSet donde contiene los estados*/
		ResultSet rs = clsEstadoBD.recogerBD(objConexion);

		return rs;
	}
	
	/**Recoger camiones en BD*/
	public ResultSet recogercamionBD() throws SQLException {

		/**La funcion recoger de la clase CamionBD nos devuelve un ResultSet que contiene
		todos los coches que estan en MySQL*/
		ResultSet rs = clsCamionBD.recogerBD(objConexion);

		return rs;
	}

	/**Insertar camion en BD*/
	public void insertarcamionBD(String numbastidor, String marca, String modelo, int cv, Date aniofabricacion, Date fecha,
			String color, int kilometros, int idtipocamion, int altura, int carga, int idestado, int valor, String idoperario) throws SQLException {

		// Funcion insertar en la clase CamionBD para hacer una Insert en MySQL*/
		clsCamionBD.insertarBD(numbastidor, marca, modelo, cv, aniofabricacion, fecha, color, kilometros,
				idtipocamion, altura, carga, idestado, valor, idoperario, objConexion);
	}

	/**Eliminar una camion en BD*/
	public void eliminarcamionBD(String numbastidor) throws SQLException {

		/**Funcion eliminar en la clase CamionBD para hacer Delete en MySQL*/
		clsCamionBD.eliminarBD(numbastidor, objConexion);
	}
	
	
	/**Recoger motos en BD*/
	public ResultSet recogermotoBD() throws SQLException {

		/**La funcion recoger de la clase MotoBD nos devuelve un ResultSet que contiene
		todos los coches que estan en MySQL*/
		ResultSet rs = clsMotoBD.recogerBD(objConexion);

		return rs;
	}

	/**Insertar moto en BD*/
	public void insertarmotoBD(String numbastidor, String marca, String modelo, int cv, Date aniofabricacion, Date fecha,
			String color, int kilometros, int idtipomoto, int cilindrada, String tamaño, int idestado, int valor, String idoperario) throws SQLException {

		// Funcion insertar en la clase MotoBD para hacer una Insert en MySQL*/
		clsMotoBD.insertarBD(numbastidor, marca, modelo, cv, aniofabricacion, fecha, color, kilometros,
				idtipomoto, cilindrada, tamaño, idestado, valor, idoperario, objConexion);
	}

	/**Eliminar una moto en BD*/
	public void eliminarmotoBD(String numbastidor) throws SQLException {

		/**Funcion eliminar en la clase MotoBD para hacer Delete en MySQL*/
		clsMotoBD.eliminarBD(numbastidor, objConexion);
	}
	
	

	/**Recoger coches en BD*/
	public ResultSet recogercocheBD() throws SQLException {

		/**La funcion recoger de la clase CocheBD nos devuelve un ResultSet que contiene
		todos los coches que estan en MySQL*/
		ResultSet rs = clsCocheBD.recogerBD(objConexion);

		return rs;
	}

	/**Insertar coche en BD*/
	public void insertarcocheBD(String numbastidor, String marca, String modelo, int cv, Date aniofabricacion,
			Date fecha, String color, int kilometros, int idtipocoche, String combustible, int cilindrada,
			int idestado, int valor, String idoperario) throws SQLException {

		// Funcion insertar en la clase CocheBD para hacer una Insert en MySQL*/
		clsCocheBD.insertarBD(numbastidor, marca, modelo, cv, aniofabricacion, fecha, color, kilometros, idtipocoche,
				combustible, cilindrada, idestado, valor, idoperario, objConexion);
	}

	/**Eliminar un coche en BD*/
	public void eliminarcocheBD(String numbastidor) throws SQLException {

		/**Funcion eliminar en la clase CocheBD para hacer Delete en MySQL*/
		clsCocheBD.eliminarBD(numbastidor, objConexion);
	}

}
