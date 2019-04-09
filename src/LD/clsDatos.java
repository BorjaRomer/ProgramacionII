package LD;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;


public class clsDatos {
	
public ResultSet consultarBD() {
		
		// Instancias la clase que hemos creado anteriormente
	    clsConexionBD objConexionBD = new clsConexionBD();
	   
		// Llamas al m�todo que tiene la clase y te devuelve una conexi�n
	    Connection objConexion = objConexionBD.conectarBD();
	   
	
    try { 
	    if ( objConexion != null ) {
	    	
	    	//Creamos la Tabla para recoger de BBDD
		    ResultSet rs = null;
	    	// Preparamos la consulta 
	    	Statement st = objConexion.createStatement(); 
	    	rs = st.executeQuery ("select * from coche");
	    	
	    	// Recorremos el resultado, mientras haya registros para leer, y escribimos el resultado en pantalla. 
	    	while (rs.next()) {
	    		rs.getString ("numbastidor");
	    		rs.getString("marca");
	    	return rs;
	    	}
	    } else {
	    	System.out.println("No existe conexi�n");
	    }
    
    } catch (SQLException e) {
        System.out.println("Ha fallado la consulta: " + e);
    }
    objConexionBD.desconectarBD(objConexion);
    
	return null;
}



public void insertarBD(String numbastidor, String marca, String modelo, int cv, int aniofabricacion, Date fecha, String color, int kilometros,
		int idtipocoche, String combustible, String cilindrada, int idestado) {
	
	//Convertimos el tipo util.Date a sql.Date que entiende el MySQL
	java.sql.Date fechasql = new java.sql.Date(fecha.getTime());
	
	// Instancias la clase que hemos creado anteriormente
    clsConexionBD SQL = new clsConexionBD();
    
	// Llamas al m�todo que tiene la clase y te devuelve una conexi�n
    Connection objConn = SQL.conectarBD();
    
    try { 
	    if ( objConn != null ) {
	    	// Preparamos la insert 
	    	String query = "insert into coche (numbastidor, marca, modelo, cv, aniofabricacion, fecha, color, kilometros, idtipocoche, combustible, cilindrada, idestado) values (?,?,?,?,?,?,?,?,?,?,?,?)";
	    	
	    	//Creamos las preparedstaments
	    	PreparedStatement objSt = objConn.prepareStatement(query);
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
	    	
	    	//Ejecutamos la query que hemos preparado
	  		objSt.execute();
	    	
	    	System.out.println("Se ha insertado el registro correctamente");
	    	
	    	//Cerramos el preparedStatement
	    	objSt.close();
	    	
	    	//Cerramos la conexi�n
	    	objConn.close();
	    	
	    } else {
	    	System.out.println("No existe conexi�n");
	    }
    
    } catch (SQLException e) {
        System.out.println("No se ha podido realizar el insert: " + e);
    }
}

public void eliminarBD(String numbastidor) {
	
	// Instancias la clase que hemos creado anteriormente
    clsConexionBD SQL = new clsConexionBD();
    
	// Llamas al m�todo que tiene la clase y te devuelve una conexi�n
    Connection objConn = SQL.conectarBD();
    
    try { 
	    if ( objConn != null ) {
	    	// Preparamos el delete 
	    	String query = "delete from coche where numbastidor = ?";
	    	 
	    	//Creamos las preparedstaments
	    	PreparedStatement objSt = objConn.prepareStatement(query);
	    	objSt.setString(1, numbastidor);
	    			    	
	    	//Ejecutamos la query que hemos preparado
	    	objSt.execute();
	    	
	    	System.out.println("Se ha eliminado el registro correctamente");
	    	
	    	//Cerramos el preparedStatement
	    	objSt.close();
	    	
	    	//Cerramos la conexi�n
	    	objConn.close();
	    	
	    } else {
	    	System.out.println("No existe conexi�n");
	    }
    
    } catch (SQLException e) {
        System.out.println("No se ha podido eliminar el registro: " + e);
    }
}
		
}
	


