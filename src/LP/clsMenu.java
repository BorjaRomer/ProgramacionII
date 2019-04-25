package LP;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import Comun.itfProperty;
import LN.clsGestor;
import Comun.clsConstantes;
import Comun.clsExcepcionNB;
import LP.Frame;

public class clsMenu {
	
	
	/**Menu principal donde se interactua con el usuario dandole las opciones de registro de nuestrto desguace. 
	 Podemos dar de alta cualquier vehiculo y mostrarlos.*/ 
	
	
	 public static void MenuPrincipal() {
		
		/**Creamos el objeto Gestor en el inicio de la aplicacion.*/
		clsGestor objGestor = new clsGestor();
		
		/**Recogemos todo de la BD*/
		try {
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
		
		System.out.println("Bienvenido a la aplicacion");
		
		
		/**Creamos el Frame*/
		
		Frame miventana = new Frame();
		miventana.setVisible(true);
		int opcion = miventana.getOpcombo();
		
		do{
		
		switch(opcion) {
		
		case 1: AltaCoche(objGestor);
		break;
		case 2: AltaCamion(objGestor);
		break;
		case 3: AltaMoto(objGestor);
		break;
		case 4: MostrarCoches(objGestor);
		break;
		case 5: BajaCoche(objGestor);
		break;
		case 6: BajaCamion(objGestor);
		break;
		case 7: BajaMoto(objGestor);
		break;
		
		}
		
		}while(opcion!=8);
		
	}
	
	 /**Funcion para buscar un registro de datos guardados y eliminarlo del ArrayList y de la BBDD*/
	private static void BajaCoche(clsGestor objGestor) {
		
		/**Pedimos al usuario que coche quiere eliminar*/
		System.out.print("Escribe el Nº de bastidor del vehiculo: ");
		String numerobastidor = UtilidadesLP.leerCadena();
		
		try {
			objGestor.EliminarcocheBD(numerobastidor);
		} catch (SQLException e) {
			System.out.println("El vehiculo no se ha eliminado correctamente");
			e.printStackTrace();
		}
	
	}
	
	private static void BajaCamion(clsGestor objGestor) {
		
	}
	
	private static void BajaMoto(clsGestor objGestor) {
		
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
		
		String cilindrada = menualtamoto.getCilindrada().getText();
		
		String aniofabricacion1 = menualtamoto.getAniofabricacion().getText();
		int aniofabricacion = Integer.parseInt(aniofabricacion1);
		
		String color = menualtamoto.getColor().getText();
		
		String kilometros1 = menualtamoto.getKilometros().getText();
		int kilometros = Integer.parseInt(kilometros1);
		
		String tamano1 = menualtamoto.getTamano().getText();
		int tamano = Integer.parseInt(tamano1);
		
		
		Date fecha = new Date();
		
	
		int opc = menualtamoto.getTipomoto();
		
		
		System.out.print("Tipo de moto: ");
		int idtipomoto = UtilidadesLP.leerEntero();

		System.out.print("Tamaño: ");
		int tamaño = UtilidadesLP.leerEntero();
		System.out.println("Estado del coche: \n"+
        		"----\n" +
        "1) Optimo.\n" +
        "2) Despiece.\n" +
        "3) Chatarra.\n" +
        "4) Venta.\n" );
		System.out.println("Elige una opcion: ");
		int idestado = 0;
		int opcion = UtilidadesLP.leerEntero();
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
		
		objGestor.CrearMoto(numbastidor, marca, modelo, cv, aniofabricacion, fecha, color, kilometros, idtipomoto, cilindrada, tamaño, idestado);
		
	}
	
	/**
	 * Meter datos en las variables de objGestor en la funcion CrearCamion.
	 */

	private static void AltaCamion(clsGestor objGestor) throws clsExcepcionNB {
		System.out.print("Numero de bastidor: ");
		String numbastidor = UtilidadesLP.leerCadena();
		if(numbastidor.length()<4) {
			throw new clsExcepcionNB();
		}
		System.out.print("Marca: ");
		String marca = UtilidadesLP.leerCadena();
		System.out.print("Modelo: ");
		String modelo = UtilidadesLP.leerCadena();
		System.out.print("Cv: ");
		int cv = UtilidadesLP.leerEntero();
		System.out.print("Año de Fabricación: ");
		int aniofabricacion = UtilidadesLP.leerEntero();
		Date fecha = new Date();
		System.out.print("Color: ");
		String color = UtilidadesLP.leerCadena();
		System.out.print("Kilometros: ");
		int kilometros = UtilidadesLP.leerEntero();
		System.out.print("Tipo de camion: ");
		int idtipocamion = UtilidadesLP.leerEntero();
		System.out.print("Altura: ");
		int altura = UtilidadesLP.leerEntero();
		System.out.print("Anchura: ");
		int anchura = UtilidadesLP.leerEntero();
		System.out.println("Estado del coche: \n"+
        		"----\n" +
        "1) Optimo.\n" +
        "2) Despiece.\n" +
        "3) Chatarra.\n" +
        "4) Venta.\n" );
		System.out.println("Elige una opcion: ");
		int idestado = 0;
		int opcion = UtilidadesLP.leerEntero();
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
		if(numbastidor.length()<4) {
			throw new clsExcepcionNB();
		}
		
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
