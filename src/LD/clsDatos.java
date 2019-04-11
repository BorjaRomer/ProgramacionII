package LD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;

public class clsDatos {

	// Objeto clsCocheBD
	clsCocheBD objCocheBD = new clsCocheBD();

	// Objeto clsEstadoBD
	clsEstadoBD objEstadoBD = new clsEstadoBD();

	// Objeto clsTipovehiculoBD
	clsTipovehiculoBD objTipovehiculoBD = new clsTipovehiculoBD();

	// Nombre de la base de datos
	public String database = "desguace";

	// Host
	public String hostname = "localhost";

	// Puerto
	public String port = "3306";

	// Ruta de la base de datos
	// (jdbc:mysql://localhost:3306/alumnoBD?useTimezone=true&serverTimezone=GMT&useSSL=false)
	public String url = "jdbc:mysql://" + hostname + ":" + port + "/" + database
			+ "?useTimezone=true&serverTimezone=GMT&useSSL=false";

	// Nombre de usuario
	public String user = "root";

	// Password
	public String password = "4392deusto";

	// Se crea la conexion
	Connection objConexion = null;

	// Conectar BD
	public Connection conectarBD() {

		try {

			objConexion = DriverManager.getConnection(url, user, password);

		} catch (SQLException e) {
			System.out.println("Ha fallado la conexión" + e);
		}

		return objConexion;
	}

	// Desconectar BD
	public void desconectarBD(Connection conexion) {

		try {

			conexion.close();

		} catch (SQLException e) {
			System.out.println("Ha fallado la desconexión" + e);
		}

	}

	// Recoger tipos de coche en BD
	public ResultSet recogertipococheBD(Connection conexion) throws SQLException {

		// Nos devuelve un ResultSet donde contiene los tipos de coches
		ResultSet rs = objTipovehiculoBD.recogertipococheBD(conexion);

		return rs;
	}

	// Recoger tipos de camion en BD
	public ResultSet recogertipocamionBD(Connection conexion) throws SQLException {

		// Nos devuelve un ResultSet donde contiene los tipos de camion
		ResultSet rs = objTipovehiculoBD.recogertipocamionBD(conexion);

		return rs;
	}

	// Recoger tipos de motos en BD
	public ResultSet recogertipomotoBD(Connection conexion) throws SQLException {

		// Nos devuelve un ResultSet donde contiene los tipos de moto
		ResultSet rs = objTipovehiculoBD.recogertipomotoBD(conexion);

		return rs;
	}

	// Recoger estados en BD
	public ResultSet recogerestadoBD(Connection conexion) throws SQLException {

		// Nos devuelve un ResultSet donde contiene los estados
		ResultSet rs = objEstadoBD.recogerBD(conexion);

		return rs;
	}

	// Recoger coches en BD
	public ResultSet recogercocheBD(Connection conexion) throws SQLException {

		// La funcion recoger de la clase CocheBD nos devuelve un ResultSet que contiene
		// todos los coches que estan en MySQL
		ResultSet rs = objCocheBD.recogerBD(conexion);

		return rs;
	}

	// Insertar coche en BD
	public void insertarcocheBD(String numbastidor, String marca, String modelo, int cv, int aniofabricacion,
			Date fecha, String color, int kilometros, int idtipocoche, String combustible, String cilindrada,
			int idestado, Connection conexion) throws SQLException {

		// Funcion insertar en la clase CocheBD para hacer una Insert en MySQL
		objCocheBD.insertarBD(numbastidor, marca, modelo, cv, aniofabricacion, fecha, color, kilometros, idtipocoche,
				combustible, cilindrada, idestado, conexion);
	}

	// Eliminar un coche en BD
	public void eliminarcocheBD(String numbastidor, Connection conexion) throws SQLException {

		// Funcion eliminar en la clase CocheBD para hacer Delete en MySQL
		objCocheBD.eliminarBD(numbastidor, conexion);
	}

}
