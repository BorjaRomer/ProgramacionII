package LP;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import Comun.itfProperty;
import LN.clsGestor;
import Comun.clsConstantes;
import Comun.clsExcepcionNB;


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
		
		/**Ventana inicial donde el operario se logea*/
		JFrame_Loging login = new JFrame_Loging();
		login.setLocationRelativeTo(null);
		login.setVisible(true);
		
		
		/**Menu Coche**/ 
		
		 //Frame_Menucoche menucoche = new Frame_Menucoche();
		 //menucoche.setVisible(true);
		 
		 int opcion1 =5; //menucoche.getOpcion(); 
		 
		 switch (opcion1) {
		 case 1: AltaCoche(objGestor);
			break;
		 case 2: BajaCoche(objGestor);
			break;
		 case 3: MostrarCoches(objGestor);
		 }
	
		/**Menu Moto*/
		 
		 //Frame_Menumoto menumoto = new Frame_Menumoto();
		 //menumoto.setVisible(true);
		 
		 int opcion2 = 5; //menumoto.getOpcion(); 
		 
		 switch (opcion2) {
		 case 1: AltaMoto(objGestor);
			break;
		 case 2: BajaMoto(objGestor);
			break;
		 case 3: MostrarMotos(objGestor);
		 }
	 
	 
		 /** Menu Camion*/
		 
		 //Frame_Menucamion menucamion = new Frame_Menucamion();
		 //menucamion.setVisible(true);
		 
		 int opcion3 = 5;//menucoche.getOpcion(); 
		 
		 switch (opcion3) {
		 case 1: AltaCamion(objGestor);
			break;
		 case 2: BajaCamion(objGestor);
			break;
		 case 3: MostrarCamiones(objGestor);
		 }
		
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
	
	private static void MostrarCamiones(clsGestor objGestor) {
		
	}
	
	private static void MostrarMotos(clsGestor objGestor) {
		
	}
	
	/**Funcion para leer el ArrayList instanciado en clsGestor y que se encuentra en el objGestor que hemos creado en el Menu Principal.
  	Por eso pasamos por paramtero el objGestor.*/
	 
	private static void MostrarCoches(clsGestor objGestor) {
		
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

	/**
	 * Meter datos en las variables de objGestor en la funcion CrearMotos.
	 */
	
	private static void AltaMoto(clsGestor objGestor) throws clsExcepcionNB {
		
		
		Frame_Altamoto menualtamoto = new Frame_Altamoto();
		menualtamoto.setVisible(true);
		
		String numbastidor = menualtamoto.getNumbastidor().getText();
		if(numbastidor.length()<4) {
			throw new clsExcepcionNB();
		}
		
		String marca = menualtamoto.getMarca().getText();
		
		String modelo = menualtamoto.getModelo().getText();
		
		String cv1 = menualtamoto.getCv().getText();
		int cv = Integer.parseInt(cv1);
		
		String cilindrada1 = menualtamoto.getCilindrada().getText();
		int cilindrada = Integer.parseInt(cilindrada1);
		
		String aniofabricacion1 = menualtamoto.getAniofabricacion().getText();
		int aniofabricacion = Integer.parseInt(aniofabricacion1);
		
		String color = menualtamoto.getColor().getText();
		
		String kilometros1 = menualtamoto.getKilometros().getText();
		int kilometros = Integer.parseInt(kilometros1);
		
		String tamano1 = menualtamoto.getTamano().getText();
		int tamano = Integer.parseInt(tamano1);
		
		
		Date fecha = new Date();
		int idtipomoto=0;
		int opcion = menualtamoto.getOptipomoto();
		
		
		switch (opcion) {
			case 1: idtipomoto=1;
				break;
				case 2: idtipomoto=2;
				break;
				case 3: idtipomoto=3;
				break;
				case 4: idtipomoto=4;
				break;
				case 5: idtipomoto=5;
				break;
				case 6: idtipomoto=6;
				break;
		}
	

		int opcion1 = menualtamoto.getOpestado();
		int idestado = 0;
		
		switch (opcion1){

		case 1: idestado=1;
		break;
		case 2: idestado=2;
		break;
		case 3: idestado=3;
		break;
		case 4: idestado=4;
		break;
		}
		
		try {
			objGestor.CrearMoto(numbastidor, marca, modelo, cv, aniofabricacion, fecha, color, kilometros, idtipomoto, cilindrada, tamano, idestado);
		} catch (SQLException e) {
			System.out.println("Error al registrar una moto");
		}
		
		
	}
	
	/**
	 * Meter datos en las variables de objGestor en la funcion CrearCamion.
	 */

	private static void AltaCamion(clsGestor objGestor) throws clsExcepcionNB {
		
		Frame_Altacamion menualtacamion = new Frame_Altacamion();
		menualtacamion.setVisible(true);
		
		String numbastidor = menualtacamion.getNumbastidor().getText();
		if(numbastidor.length()<4) {
			throw new clsExcepcionNB();
		}
		
		String marca = menualtacamion.getMarca().getText();
		
		String modelo = menualtacamion.getModelo().getText();
		
		String cv1 = menualtacamion.getCv().getText();
		int cv = Integer.parseInt(cv1);
				
		String aniofabricacion1 = menualtacamion.getAniofabricacion().getText();
		int aniofabricacion = Integer.parseInt(aniofabricacion1);
		
		String color = menualtacamion.getColor().getText();
		
		String kilometros1 = menualtacamion.getKilometros().getText();
		int kilometros = Integer.parseInt(kilometros1);
		
		Date fecha = new Date();
		
		int idestado = 0;
		int opcion = menualtacamion.getOpestado();
		
		switch (opcion) {
		
		case 1: idestado=1;
		break;
		case 2: idestado=2;
		break;
		case 3: idestado=3;
		break;
		case 4: idestado=4;
		break;
		}
		
		String altura1 = menualtacamion.getAltura().getText();
		int altura = Integer.parseInt(altura1);
		
		String anchura1 = menualtacamion.getAnchura().getText();
		int anchura = Integer.parseInt(anchura1);
		
		int op = menualtacamion.getOptipocamion();
		int idtipocamion = 0;
		
		switch (op) {
		
		case 1: idtipocamion=1;
		break;
		case 2: idtipocamion=2;
		break;
		case 3: idtipocamion=3;
		break;
		case 4: idtipocamion=4;
		break;
		}
		
	
		try {
			objGestor.CrearCamion(numbastidor, marca, modelo, cv, aniofabricacion, fecha, color, kilometros, idtipocamion, altura, anchura, idestado);
		} catch (SQLException e) {
			System.out.println("Error al registrar un camion");
		}
		
	}
	
	/**
	 * Meter datos en las variables de objGestor en la funcion CrearCoche.
	 */

	private static void AltaCoche(clsGestor objGestor) throws clsExcepcionNB {
		
		
		Frame_Altacoche menualtacoche = new Frame_Altacoche();
		menualtacoche.setVisible(true);
		
		
		String numbastidor = menualtacoche.getNumbastidor().getText();
		
		/**if(numbastidor.length()<4) {
			throw new clsExcepcionNB();
		}*/
		
		String marca = menualtacoche.getMarca().getText();
		
		String modelo = menualtacoche.getModelo().getText();
		
		String cv1 = menualtacoche.getCv().getText();
		int cv = Integer.parseInt(cv1);
		
		String cilindrada = menualtacoche.getCilindrada().getText();
		
		String aniofabricacion1 = menualtacoche.getAniofabricacion().getText();
		int aniofabricacion = Integer.parseInt(aniofabricacion1);
		
		String color = menualtacoche.getColor().getText();
		
		String kilometros1 = menualtacoche.getKilometros().getText();
		int kilometros = Integer.parseInt(kilometros1);
		
		Date fecha = new Date();
		
		String combustible = menualtacoche.getOpcombustible();
		
		int idtipocoche = 0;
		int opc = menualtacoche.getTipocoche();
		
		switch(opc) {
		case 1: idtipocoche=1;
		break;
		case 2: idtipocoche=2;
		break;
		case 3: idtipocoche=3;
		break;
		case 4: idtipocoche=4;
		break;
		}
			
		
		int idestado = 0;
		int opcion = menualtacoche.getOpestado();
		
		switch (opcion) {
		
		case 1: idestado=1;
		break;
		case 2: idestado=2;
		break;
		case 3: idestado=3;
		break;
		case 4: idestado=4;
		break;
		}
		
		try {
			objGestor.CrearCoche(numbastidor, marca, modelo, cv, aniofabricacion, fecha, color, kilometros, idtipocoche, combustible, cilindrada, idestado);
		} catch (SQLException e) {
			System.out.println("Error al registrar un coche");
		}
	}

}
