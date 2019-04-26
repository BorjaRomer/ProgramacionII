package LD;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class clsOperarioBD {
	
	public static ResultSet recogerBD(Connection objConexion) throws SQLException {

		/**Creamos la Tabla para recoger de BBDD*/
		ResultSet rs = null;

		/**Preparamos la consulta*/
		Statement st = objConexion.createStatement();
		rs = st.executeQuery("select * from operario");

		return rs;
	}

}
