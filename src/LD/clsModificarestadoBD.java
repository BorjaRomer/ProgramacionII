package LD;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * Clase que realiza una sentencia update para modificar un parámetro en los
 * distintos vehículos
 *
 */
public class clsModificarestadoBD {

	/**
	 * Método para modificar coche en BBDD
	 */
	public static void modificarCocheBD(String numbastidor, int id, Connection objConexion) throws SQLException {

		/** Preparamos la insert */
		String query = "update coche set idestado = ? where numbastidor = ?";

		/** Creamos las preparedstaments */
		PreparedStatement objSt = objConexion.prepareStatement(query);

		objSt.setInt(1, id);
		objSt.setString(2, numbastidor);

		/** Ejecutamos la query que hemos preparado */
		objSt.execute();

		/** Cerramos el preparedStatement */
		objSt.close();
	}

	/**
	 * Metodo para modificar camion
	 */
	public static void modificarCamionBD(String numbastidor, int id, Connection objConexion) throws SQLException {

		/** Preparamos la insert */
		String query = "update camion set idestado = ? where numbastidor = ?";

		/** Creamos las preparedstaments */
		PreparedStatement objSt = objConexion.prepareStatement(query);

		objSt.setInt(1, id);
		objSt.setString(2, numbastidor);

		/** Ejecutamos la query que hemos preparado */
		objSt.execute();

		/** Cerramos el preparedStatement */
		objSt.close();

	}

	/**
	 * Metodo para modificar moto
	 */
	public static void modificarMotoBD(String numbastidor, int id, Connection objConexion) throws SQLException {

		/** Preparamos la insert */
		String query = "update moto set idestado = ? where numbastidor = ?";

		/** Creamos las preparedstaments */
		PreparedStatement objSt = objConexion.prepareStatement(query);

		objSt.setInt(1, id);
		objSt.setString(2, numbastidor);

		/** Ejecutamos la query que hemos preparado */
		objSt.execute();

		/** Cerramos el preparedStatement */
		objSt.close();
	}

}
