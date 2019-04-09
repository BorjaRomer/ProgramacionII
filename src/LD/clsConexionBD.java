package LD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class clsConexionBD {
	
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
	
	public Connection conectarBD() {
		
        Connection objConexion = null;

        try { 
        	
        	objConexion = DriverManager.getConnection (url, user, password);
        
        } catch (SQLException e) {
            System.out.println("Ha fallado la conexi�n" + e);
        }

        return objConexion;

	}	
	
	public void desconectarBD(Connection conexion) {
		
        try { 
        	
        	conexion.close();
        	
        } catch (SQLException e) {
            System.out.println("Ha fallado la desconexi�n" +  e);
        }

	}

}
