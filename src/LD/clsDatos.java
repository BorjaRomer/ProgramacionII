package LD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;

public class clsDatos {

	/** Objeto clsCocheBD*/
	clsCocheBD objCocheBD = new clsCocheBD();

	/** Objeto clsEstadoBD*/
	clsEstadoBD objEstadoBD = new clsEstadoBD();

	/** Objeto clsTipovehiculoBD*/
	clsTipovehiculoBD objTipovehiculoBD = new clsTipovehiculoBD();
	
	/**OBjeto clsCamion BD*/
	clsCamionBD ObjCamionBD = new clsCamionBD();

	/**Nombre de la base de datos*/
	public String database = "desguace";

	/** Host*/
	public String hostname = "localhost";

	/**Puerto*/
	public String port = "3306";

	/**Ruta de la base de datos*/
	/**(jdbc:mysql://localhost:3306/alumnoBD?useTimezone=true&serverTimezone=GMT&useSSL=false)*/
	public String url = "jdbc:mysql://" + hostname + ":" + port + "/" + database
			+ "?useTimezone=true&serverTimezone=GMT&useSSL=false";

	/** Nombre de usuario*/
	public String user = "root";

	/**Password*/
	public String password = "4392deusto";

	/** Se crea la conexion*/
	Connection objConexion = null;

	/** Conectar BD*/
	public void conectarBD() {

		try {

			objConexion = DriverManager.getConnection(url, user, password);

		} catch (SQLException e) {
			System.out.println("Ha fallado la conexión" + e);
		}

	}

	/**Desconectar BD*/
	public void desconectarBD() {

		try {

			objConexion.close();

		} catch (SQLException e) {
			System.out.println("Ha fallado la desconexión" + e);
		}

	}

	/**Recoger tipos de coche en BD*/
	public ResultSet recogertipococheBD() throws SQLException {

		/**Nos devuelve un ResultSet donde contiene los tipos de coches*/
		ResultSet rs = objTipovehiculoBD.recogertipococheBD(objConexion);

		return rs;
	}

	/**Recoger tipos de camion en BD*/
	public ResultSet recogertipocamionBD() throws SQLException {

		/**Nos devuelve un ResultSet donde contiene los tipos de camion*/
		ResultSet rs = objTipovehiculoBD.recogertipocamionBD(objConexion);

		return rs;
	}

	/** Recoger tipos de motos en BD*/
	public ResultSet recogertipomotoBD() throws SQLException {

		/**Nos devuelve un ResultSet donde contiene los tipos de moto*/
		ResultSet rs = objTipovehiculoBD.recogertipomotoBD(objConexion);

		return rs;
	}

	/**Recoger estados en BD*/
	public ResultSet recogerestadoBD() throws SQLException {

		/**Nos devuelve un ResultSet donde contiene los estados*/
		ResultSet rs = objEstadoBD.recogerBD(objConexion);

		return rs;
	}

	/**Recoger coches en BD*/
	public ResultSet recogercocheBD() throws SQLException {

		/**La funcion recoger de la clase CocheBD nos devuelve un ResultSet que contiene*/
		/**todos los coches que estan en MySQL*/
		ResultSet rs = objCocheBD.recogerBD(objConexion);

		return rs;
	}

	/**Insertar coche en BD*/
	public void insertarcocheBD(String numbastidor, String marca, String modelo, int cv, int aniofabricacion,
			Date fecha, String color, int kilometros, int idtipocoche, String combustible, String cilindrada,
			int idestado) throws SQLException {

		// Funcion insertar en la clase CocheBD para hacer una Insert en MySQL*/
		objCocheBD.insertarBD(numbastidor, marca, modelo, cv, aniofabricacion, fecha, color, kilometros, idtipocoche,
				combustible, cilindrada, idestado, objConexion);
	}

	/**Eliminar un coche en BD*/
	public void eliminarcocheBD(String numbastidor) throws SQLException {

		/**Funcion eliminar en la clase CocheBD para hacer Delete en MySQL*/
		objCocheBD.eliminarBD(numbastidor, objConexion);
	}

}
