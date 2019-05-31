package LD;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Clase que relaiza las consultas a BBDD realacionadas con los pedidos
 *
 */
public class clsPedidoBD {

	public static ResultSet recogerBD(Connection objConexion) throws SQLException {
	
		/**Creamos la Tabla para recoger de BBDD*/
		ResultSet rs = null;

		/**Preparamos la consulta*/
		Statement st = objConexion.createStatement();
		rs = st.executeQuery("select * from pedido");

		return rs;
	}

	public static void insertarBD(double precio, String numbastidor, String dnicliente, String idoperario, String tipopedido, Connection objConexion) throws SQLException {
		
		/** Preparamos la insert*/
		String query = "insert into pedido (precio, numbastidor, dnicliente, idoperario, tipopedido) values (?,?,?,?,?)";
		
		/**Creamos las preparedstaments*/
		PreparedStatement objSt = objConexion.prepareStatement(query);
		
		objSt.setDouble(1, precio);
		objSt.setString(2, numbastidor);
		objSt.setString(3, dnicliente);
		objSt.setString(4, idoperario);
		objSt.setString(5, tipopedido);
		
		/** Ejecutamos la query que hemos preparado*/
		objSt.execute();

		/** Cerramos el preparedStatement*/
		objSt.close();
		
	}
	
	
	
	

}
