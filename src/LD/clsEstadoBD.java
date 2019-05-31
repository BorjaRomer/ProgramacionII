package LD;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Clase que realiza una consulta de recogida de estados en la BBDD *
 */
public class clsEstadoBD {

	/**
	 * Se recoge los datos de los estados de BBDD
	 */
	public static ResultSet recogerBD(Connection objConexion) throws SQLException {

		/**Creamos la Tabla para recoger de BBDD*/
		ResultSet rs = null;

		/**Preparamos la consulta*/
		Statement st = objConexion.createStatement();
		rs = st.executeQuery("select * from estado");

		return rs;
	}
}
