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

	public static void insertarBD(String numbastidor, String marca, String modelo, int cv, Date aniofabricacion, Date fecha,
			String color, int kilometros, int idtipocoche, String combustible, int cilindrada, int idestado, int valor, String idoperario,
			Connection objConexion) throws SQLException {

		/** Convertimos el tipo util.Date a sql.Date que entiende el MySQL*/
		java.sql.Date fechasql = new java.sql.Date(fecha.getTime());
		java.sql.Date aniofabricacion1 = new java.sql.Date(aniofabricacion.getTime());


		/**Preparamos la insert*/
		String query = "insert into coche (numbastidor, marca, modelo, cv, aniofabricacion, fecha, color, kilometros, idtipocoche, combustible, cilindrada, idestado, valor, idoperario) values (?,?,?,?,?,?,?,?,?,?,?,?,?,?)";

		/**Creamos las preparedstaments*/
		PreparedStatement objSt = objConexion.prepareStatement(query);
		objSt.setString(1, numbastidor);
		objSt.setString(2, marca);
		objSt.setString(3, modelo);
		objSt.setInt(4, cv);
		objSt.setDate(5, aniofabricacion1);
		objSt.setDate(6, fechasql);
		objSt.setString(7, color);
		objSt.setInt(8, kilometros);
		objSt.setInt(9, idtipocoche);
		objSt.setString(10, combustible);
		objSt.setInt(11, cilindrada);
		objSt.setInt(12, idestado);
		objSt.setInt(13, valor);
		objSt.setString(14, idoperario);

		/** Ejecutamos la query que hemos preparado*/
		objSt.execute();

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
		
		/** Cerramos el preparedStatement*/
		objSt.close();

	}

}
