package LD;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Clase que se encarga de recoger de BBDD los tipos de vehiculos que hay
 *
 */
public class clsTipovehiculoBD {
	
	/*
	 * Método que recoge los tipos de coche
	 */
	public static ResultSet recogertipococheBD(Connection objConexion) throws SQLException {

		/**Creamos la Tabla para recoger de BBDD*/
		ResultSet rs = null;

		/**Preparamos la consulta*/
		Statement st = objConexion.createStatement();
		rs = st.executeQuery("select * from tipocoche");

		return rs;

	}
	
	/*
	 * Metodo que recoge los tipos de camion
	 */
	public static ResultSet recogertipocamionBD(Connection objConexion) throws SQLException {

		/** Creamos la Tabla para recoger de BBDD*/
		ResultSet rs = null;

		/** Preparamos la consulta*/
		Statement st = objConexion.createStatement();
		rs = st.executeQuery("select * from tipocamion");

		return rs;

	}
	
	/*
	 * Metodo que recoge los tipos de moto
	 */
	public static ResultSet recogertipomotoBD(Connection objConexion) throws SQLException {

		/** Creamos la Tabla para recoger de BBDD*/
		ResultSet rs = null;

		/** Preparamos la consulta*/
		Statement st = objConexion.createStatement();
		rs = st.executeQuery("select * from tipomoto");

		return rs;

	}

}
