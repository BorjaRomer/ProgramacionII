package LD;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class clsModificarestadoBD {

	public static void modificarCocheBD(String numbastidor, int id, Connection objConexion) throws SQLException {
	
		/** Preparamos la insert*/
		String query = "update coche set idestado = ? where numbastidor = ?"; 
		
		/**Creamos las preparedstaments*/
		PreparedStatement objSt = objConexion.prepareStatement(query);
		
		objSt.setInt(1, id);
		objSt.setString(2, numbastidor);
		
		/** Ejecutamos la query que hemos preparado*/
		objSt.execute();

		/** Cerramos el preparedStatement*/
		objSt.close();
	}

	public static void modificarCamionBD(String numbastidor, int id, Connection objConexion) throws SQLException {
		
		/** Preparamos la insert*/
		String query = "update camion set idestado = ? where numbastidor = ?"; 
		
		/**Creamos las preparedstaments*/
		PreparedStatement objSt = objConexion.prepareStatement(query);
		
		objSt.setInt(1, id);
		objSt.setString(2, numbastidor);
		
		/** Ejecutamos la query que hemos preparado*/
		objSt.execute();

		/** Cerramos el preparedStatement*/
		objSt.close();
		
	}

	public static void modificarMotoBD(String numbastidor, int id, Connection objConexion) throws SQLException {

		/** Preparamos la insert*/
		String query = "update moto set idestado = ? where numbastidor = ?"; 
		
		/**Creamos las preparedstaments*/
		PreparedStatement objSt = objConexion.prepareStatement(query);
		
		objSt.setInt(1, id);
		objSt.setString(2, numbastidor);
		
		/** Ejecutamos la query que hemos preparado*/
		objSt.execute();

		/** Cerramos el preparedStatement*/
		objSt.close();
	}

}
