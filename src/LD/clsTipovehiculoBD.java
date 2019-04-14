package LD;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class clsTipovehiculoBD {

	public ResultSet recogertipococheBD(Connection objConexion) throws SQLException {

		/**Creamos la Tabla para recoger de BBDD*/
		ResultSet rs = null;

		/**Preparamos la consulta*/
		Statement st = objConexion.createStatement();
		rs = st.executeQuery("select * from tipocoche");

		return rs;

	}

	public ResultSet recogertipocamionBD(Connection objConexion) throws SQLException {

		/** Creamos la Tabla para recoger de BBDD*/
		ResultSet rs = null;

		/** Preparamos la consulta*/
		Statement st = objConexion.createStatement();
		rs = st.executeQuery("select * from tipocamion");

		return rs;

	}

	public ResultSet recogertipomotoBD(Connection objConexion) throws SQLException {

		/** Creamos la Tabla para recoger de BBDD*/
		ResultSet rs = null;

		/** Preparamos la consulta*/
		Statement st = objConexion.createStatement();
		rs = st.executeQuery("select * from tipomoto");

		return rs;

	}

}
