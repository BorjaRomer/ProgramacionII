package LD;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class clsDatos {
	
		
		public void consultarBD() {
			// Instancias la clase que hemos creado anteriormente
		    clsConexionBD SQL = new clsConexionBD();
		    
			// Llamas al método que tiene la clase y te devuelve una conexión
		    Connection objConn = SQL.conectarBD();
		    
		    try { 
			    if ( objConn != null ) {
			    	// Preparamos la consulta 
			    	Statement st = objConn.createStatement(); 
			    	ResultSet rs = st.executeQuery ("select * from coche");
			    	
			    	System.out.println("COCHES RECUPERADOS");
			    	System.out.println("-------------------");
			    	
			    	// Recorremos el resultado, mientras haya registros para leer, y escribimos el resultado en pantalla. 
			    	while (rs.next()) 
			    	{ 
			    	    System.out.println (rs.getInt ("numbastidor") + " " + rs.getString ("marca")); 
			    	    		
			    	}
			    	
			    	//Cerramos el resulset
			    	rs.close();
			    	//Cerramos el statement
			    	st.close();
			    	//Cerramos la conexión
			    	objConn.close();
			    	
			    } else {
			    	System.out.println("No existe conexión");
			    }
		    
		    } catch (SQLException e) {
		        System.out.println("Ha fallado la consulta: " + e);
		    }
		}

	 		
		public void insertarBD(String numbastidor, String marca) {
			
			// Instancias la clase que hemos creado anteriormente
		    clsConexionBD SQL = new clsConexionBD();
		    
			// Llamas al método que tiene la clase y te devuelve una conexión
		    Connection objConn = SQL.conectarBD();
		    
		    try { 
			    if ( objConn != null ) {
			    	// Preparamos la insert 
			    	String query = "insert into coche (numbastidor, marca) values (?, ?,)";
			    	
			    	//Creamos las preparedstaments
			    	PreparedStatement objSt = objConn.prepareStatement(query);
			    	objSt.setString(1, numbastidor);
			    	objSt.setString(2, marca);
			    	
			    	
			    	//Ejecutamos la query que hemos preparado
			  		objSt.execute();
			    	
			    	System.out.println("Se ha insertado el registro correctamente");
			    	
			    	//Cerramos el preparedStatement
			    	objSt.close();
			    	
			    	//Cerramos la conexión
			    	objConn.close();
			    	
			    } else {
			    	System.out.println("No existe conexión");
			    }
		    
		    } catch (SQLException e) {
		        System.out.println("No se ha podido realizar el insert: " + e);
		    }
		}
		
		public void eliminarBD(String numbastidor) {
			
			// Instancias la clase que hemos creado anteriormente
		    clsConexionBD SQL = new clsConexionBD();
		    
			// Llamas al método que tiene la clase y te devuelve una conexión
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
			    	
			    	//Cerramos la conexión
			    	objConn.close();
			    	
			    } else {
			    	System.out.println("No existe conexión");
			    }
		    
		    } catch (SQLException e) {
		        System.out.println("No se ha podido eliminar el registro: " + e);
		    }
		}

	}
	


