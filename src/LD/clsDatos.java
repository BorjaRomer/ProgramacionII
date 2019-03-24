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
			    	ResultSet rs = st.executeQuery ("select * from alumno");
			    	
			    	System.out.println("ALUMNOS RECUPERADOS");
			    	System.out.println("-------------------");
			    	
			    	// Recorremos el resultado, mientras haya registros para leer, y escribimos el resultado en pantalla. 
			    	while (rs.next()) 
			    	{ 
			    	    System.out.println (rs.getInt ("id") + " " + rs.getString ("nombre") + " " + 
			    	    		rs.getString("apellido")  + " " + rs.getString("dni")); 
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

	
	
		
		public void insertarBD(int id, String nombre, String apellido, String dni) {
			
			// Instancias la clase que hemos creado anteriormente
		    clsConexionBD SQL = new clsConexionBD();
		    
			// Llamas al método que tiene la clase y te devuelve una conexión
		    Connection objConn = SQL.conectarBD();
		    
		    try { 
			    if ( objConn != null ) {
			    	// Preparamos la insert 
			    	String query = "insert into alumno (id, nombre, apellido, dni) values (?, ?, ?, ?)";
			    	
			    	//Creamos las preparedstaments
			    	PreparedStatement objSt = objConn.prepareStatement(query);
			    	objSt.setInt(1, id);
			    	objSt.setString(2, nombre);
			    	objSt.setString(3, apellido);
			    	objSt.setString(4, dni);
			    	
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
		
		public void eliminarBD(int id) {
			
			// Instancias la clase que hemos creado anteriormente
		    clsConexionBD SQL = new clsConexionBD();
		    
			// Llamas al método que tiene la clase y te devuelve una conexión
		    Connection objConn = SQL.conectarBD();
		    
		    try { 
			    if ( objConn != null ) {
			    	// Preparamos el delete 
			    	String query = "delete from alumno where id = ?";
			    	 
			    	//Creamos las preparedstaments
			    	PreparedStatement objSt = objConn.prepareStatement(query);
			    	objSt.setInt(1, id);
			    			    	
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
	


