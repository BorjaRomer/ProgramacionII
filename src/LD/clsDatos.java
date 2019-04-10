package LD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;


public class clsDatos {
	
	clsCocheBD objCocheBD = new clsCocheBD();
	
	//Nombre de la base de datos	
	public String database="desguace";
	
	//host
	public String hostname="localhost";
	
	//puerto
	public String port="3306";
	
	//Ruta de la base de datos (jdbc:mysql://localhost:3306/alumnoBD?useTimezone=true&serverTimezone=GMT&useSSL=false)
	public String url="jdbc:mysql://" + hostname + ":" + port + "/" + database + "?useTimezone=true&serverTimezone=GMT&useSSL=false";
	
	//Nombre de usuario
	public String user="root";
	
	//Password
	public String password="4392deusto";
	
	 Connection objConexion = null;
	 
	
public Connection conectarBD() {
	
    try { 
    	
    	objConexion = DriverManager.getConnection (url, user, password);
    
    } catch (SQLException e) {
        System.out.println("Ha fallado la conexión" + e);
    }
    
    return objConexion;
}	
	

public void desconectarBD(Connection conexion) {
	
    try { 
    	
    	conexion.close();
    	
    } catch (SQLException e) {
        System.out.println("Ha fallado la desconexión" +  e);
    }

}


public ResultSet recogercocheBD(Connection conexion) {
	
	ResultSet rs = objCocheBD.recogerBD(conexion);
	
	return rs;
}


public void insertarcocheBD(String numbastidor, String marca, String modelo, int cv, int aniofabricacion, Date fecha, String color, int kilometros,
		int idtipocoche, String combustible, String cilindrada, int idestado, Connection conexion) {
	
	objCocheBD.insertarBD(numbastidor, marca, modelo, cv, aniofabricacion, fecha, color, kilometros,
			idtipocoche, combustible, cilindrada, idestado, conexion);
}


public void eliminarcocheBD(String numbastidor, Connection conexion) throws SQLException {
	
		objCocheBD.eliminarBD(numbastidor, conexion);
	}
		
}
	


