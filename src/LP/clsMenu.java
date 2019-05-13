package LP;
import java.sql.SQLException;
import java.util.ArrayList;
import Comun.itfProperty;
import LN.clsGestor;
import Comun.clsConstantes;



public class clsMenu {
	
	/**Menu principal donde se interactua con el usuario dandole las opciones de registro de nuestrto desguace. 
	 Podemos dar de alta cualquier vehiculo y mostrarlos.*/ 
	 public static void MenuPrincipal() {
		
		/**Creamos el objeto Gestor en el inicio de la aplicacion.*/
		clsGestor objGestor = new clsGestor();
		
		/**Recogemos todo de la BD*/
		try {
			/**Recogemos todos los operarios de la BD*/
			objGestor.RecogeroperariosBD();
			/**Recogemos todos los coches de la BD*/
			objGestor.RecogercocheBD();
			/**Recogemos todos las motos de la BD*/
			objGestor.RecogermotoBD();
			/**Recogemos todos los camiones de la BD*/
			objGestor.RecogercamionBD();
			/**Recogemos los estados de la BD*/
			objGestor.RecogerestadosBD();
			/**Recogemos los tipos de coches de la BD*/
			objGestor.RecogertipococheBD();
			/**Recogemos los tipos de motos de la BD*/
			objGestor.RecogertipomotoBD();
			/**Recogemos los tipos de camiones de la BD*/
			objGestor.RecogertipocamionBD();
		} catch (SQLException e) {
			System.out.println("No se han podido recoger bien los registros de la BBDD");
			e.printStackTrace();
		}	
		
		/*Se pasa el objGestor a la ventana Loging para poder acceder a los datos de la clase gestor en la que se han recogido los registros*/
		JFrame_Loging objFrame = new JFrame_Loging(objGestor);
		objFrame.setLocationRelativeTo(null);
		objFrame.setVisible(true);
		
		
	 } 
	 
	 /**Funcion para buscar un registro de datos guardados y eliminarlo del ArrayList y de la BBDD*/
	private static void BajaCoche(clsGestor objGestor) {
		
		/**Pedimos al usuario que coche quiere eliminar*/
		System.out.print("Escribe el Nº de bastidor del vehiculo: ");
		String numerobastidor = UtilidadesLP.leerCadena();
		
		try {
			objGestor.EliminarcocheBD(numerobastidor);
		} catch (SQLException e) {
			System.out.println("El coche no se ha eliminado correctamente");
			e.printStackTrace();
		}
	
	}
	
	 /**Funcion para buscar un registro de datos guardados y eliminarlo del ArrayList y de la BBDD*/
	private static void BajaCamion(clsGestor objGestor) {
		
		/**Pedimos al usuario que coche quiere eliminar*/
		System.out.print("Escribe el Nº de bastidor del vehiculo: ");
		String numerobastidor = UtilidadesLP.leerCadena();
		
		try {
			objGestor.EliminarcamionBD(numerobastidor);
		} catch (SQLException e) {
			System.out.println("El camion no se ha eliminado correctamente");
			e.printStackTrace();
		}
		
	}
	
	 /**Funcion para buscar un registro de datos guardados y eliminarlo del ArrayList y de la BBDD*/
	private static void BajaMoto(clsGestor objGestor) {
		
		/**Pedimos al usuario que coche quiere eliminar*/
		System.out.print("Escribe el Nº de bastidor del vehiculo: ");
		String numerobastidor = UtilidadesLP.leerCadena();
		
		try {
			objGestor.EliminarmotoBD(numerobastidor);
		} catch (SQLException e) {
			System.out.println("La moto no se ha eliminado correctamente");
			e.printStackTrace();
		}
		
	}
	
	
	/**Funcion para leer el ArrayList instanciado en clsGestor y que se encuentra en el objGestor que hemos creado en el Menu Principal.
  	Por eso pasamos por paramtero objGestor.*/
	 
	public static void MostrarCoches(clsGestor objGestor) {
		
		int orden = 0;
		System.out.println("\nOrdenar por:\n"+
				       "1)Marca.\n"+
				       "2)Potencia(cv).\n");
		System.out.print("Elige la opcion: ");
		orden = UtilidadesLP.leerEntero();
		
		ArrayList<itfProperty> vehiculos;
		vehiculos = objGestor.DameCoches(orden);
		int i = 0;
		int opcion;
		
		do {
			System.out.println("\n"+"¿Que quieres mostrar?");
			System.out.println(
	                "----\n" +
	                "1) Vehiculos optimos.\n" +
	                "2) Vehiculos para despiece.\n" +
	                "3) Vehiculos en chatarra.\n" +
	                "4) Vehiculos en venta.\n" +
 	                "5) Salir.\n");
			
			System.out.print("Elige la opcion: ");
			opcion = UtilidadesLP.leerEntero();
			
			switch(opcion) {
			
			case 1: System.out.println("\n"+"Vehiculos en el taller: ");
			for(itfProperty v:vehiculos) {
				i++;
				if(v.getProperty(clsConstantes.PROPIEDAD_ESTADO_ID).equals(1)) {
					System.out.println(i+". -->"+v+"");
				}
			}
			
			break;
			case 2: System.out.println("\n"+"Vehiculos para despiece: ");
			for(itfProperty v:vehiculos) {
				i++;
				if(v.getProperty(clsConstantes.PROPIEDAD_ESTADO_ID).equals(2)) {
					System.out.println(i+". -->"+v+"");
			}
		}
			break;
			
			case 3: System.out.println("\n"+"Vehiculos para chatarra: ");
			for(itfProperty v:vehiculos) {
				i++;
				if(v.getProperty(clsConstantes.PROPIEDAD_ESTADO_ID).equals(3)) {
					System.out.println(i+". -->"+v+"");
			}
		}
		
			break;
			case 4: System.out.println("\n"+"Vehiculos en venta: ");
			for(itfProperty v:vehiculos) {
				i++;
				if(v.getProperty(clsConstantes.PROPIEDAD_ESTADO_ID).equals(4)) {
					System.out.println(i+". -->"+v+"");
			}
		}	
	}
		}while(opcion!=5);
	}
	
	
	
	

}
