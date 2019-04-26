package LD;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;

public class clsCocheBD {

	public static ResultSet recogerBD(Connection objConexion) throws SQLException {

		/**Creamos la Tabla para recoger de BBDD*/
		ResultSet rs = null;

		/**Preparamos la consulta*/
		Statement st = objConexion.createStatement();
		rs = st.executeQuery("select * from coche");

		return rs;
	}

	public static void insertarBD(String numbastidor, String marca, String modelo, int cv, int aniofabricacion, Date fecha,
			String color, int kilometros, int idtipocoche, String combustible, String cilindrada, int idestado,
			Connection objConexion) throws SQLException {

		/** Convertimos el tipo util.Date a sql.Date que entiende el MySQL*/
		java.sql.Date fechasql = new java.sql.Date(fecha.getTime());

		/**Preparamos la insert*/
		String query = "insert into coche (numbastidor, marca, modelo, cv, aniofabricacion, fecha, color, kilometros, idtipocoche, combustible, cilindrada, idestado) values (?,?,?,?,?,?,?,?,?,?,?,?)";

		/**Creamos las preparedstaments*/
		PreparedStatement objSt = objConexion.prepareStatement(query);
		objSt.setString(1, numbastidor);
		objSt.setString(2, marca);
		objSt.setString(3, modelo);
		objSt.setInt(4, cv);
		objSt.setInt(5, aniofabricacion);
		objSt.setDate(6, fechasql);
		objSt.setString(7, color);
		objSt.setInt(8, kilometros);
		objSt.setInt(9, idtipocoche);
		objSt.setString(10, combustible);
		objSt.setString(11, cilindrada);
		objSt.setInt(12, idestado);

		/** Ejecutamos la query que hemos preparado*/
		objSt.execute();

		System.out.println("Se ha insertado el registro correctamente en la BD");

		/** Cerramos el preparedStatement*/
		objSt.close();

	}

	/** Elimnar de la query un coche*/
	public static void eliminarBD(String numbastidor, Connection objConexion) throws SQLException {

		/** Preparamos la query con la sentencia de MySQL*/
		String query = "delete from coche where numbastidor = ?";

		/** Creamos las preparedstaments*/
		PreparedStatement objSt = objConexion.prepareStatement(query);
		objSt.setString(1, numbastidor);

		/** Ejecutamos la query que hemos preparado*/
		objSt.execute();
		
		System.out.println("Se ha eliminado de la BD");
		
		/** Cerramos el preparedStatement*/
		objSt.close();

	}

}
