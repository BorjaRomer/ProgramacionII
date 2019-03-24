package LP;

import java.util.ArrayList;
import java.util.Date;
import Comun.itfProperty;
import LN.clsGestor;
import Comun.clsConstantes;



public class clsMenu {
	
	/**
	 * Menu principal donde se interactua con el usuario dandole las opciones de registro de nuestrto desguace. 
	 * Podemos dar de alta cualquier vehiculo y mostrarlos con la fecha del momento exacto del registro.
	 */
	public static void MenuPrincipal() {
		System.out.println("Bienvenido a la aplicacion");
		int opcion;
		clsGestor objGestor = new clsGestor();
		
		do{
		System.out.println("\n" +
                "MENÚ\n" +
                "----\n" +
                "1) Registrar Coche.\n" +
                "2) Registrar Camion.\n" +
                "3) Registrar Moto.\n" +
                "4) Mostrar registros.\n" +
                "5) Dar de baja Vehiculo.\n" +
                "6) Cambiar el estado del vehiculo.\n" +
                "7) Salir.\n");
		
		System.out.print("Elige la opcion: ");
		opcion = UtilidadesLP.leerEntero();
		
		switch(opcion) {
		
		case 1: AltaCoche(objGestor);
		break;
		case 2: AltaCamion(objGestor);
		break;
		case 3: AltaMoto(objGestor);
		break;
		case 4: MostrarRegistros(objGestor);
		break;
		case 5: BajaVehiculo(objGestor);
		break;
		case 6:
		break;
		
		}
		
		}while(opcion!=7);
		
	}
	
	/**
	 * Funcion para buscar un registro de datos guardados y eliminarlo del ArrayList.
	 * Todavia no hemos conseguido eliminar el array.
	 */
	private static void BajaVehiculo(clsGestor objGestor) {
		System.out.print("Escribe el Nº de bastidor del vehiculo: ");
		String numerobastidor = UtilidadesLP.leerCadena();
		ArrayList<itfProperty> vehiculos;
		vehiculos = objGestor.DameVehiculos();
		for (itfProperty v: vehiculos ) {
			if(v.getProperty(clsConstantes.PROPIEDAD_NUMBASTIDOR).equals(numerobastidor)) {
				System.out.println("El vehiculo ha sido encontrado");
			
			}else
				System.out.println("No existe ningun vehiculo con ese Nº de bastidor");
		}
		
	}

	/**
	 * Funcion para leer el ArrayList instanciado en clsGesotr y que se encuentra en el objGestor que hemos creado en el Menu Principal.
	 * Por eso pasamos por paramtero el objGestor.
	 */
	private static void MostrarRegistros(clsGestor objGestor) {
		ArrayList<itfProperty> vehiculos;
		vehiculos = objGestor.DameVehiculos();
		int opcion;
		
		do {
			System.out.println("\n"+"¿Que quieres mostrar?");
			System.out.println(
	                "----\n" +
	                "1) Vehiculos optimos.\n" +
	                "2) Vehiculos para despiece.\n" +
	                "3) Vehiculos en chatarra.\n" +
	                "4) Vehiculos en venta" +
 	                "5) Salir.\n");
			
			System.out.print("Elige la opcion: ");
			opcion = UtilidadesLP.leerEntero();
			
			switch(opcion) {
			
			case 1: System.out.println("\n"+"Vehiculos en el taller: ");
				for(itfProperty v:vehiculos) {
				if(v.getProperty(clsConstantes.PROPIEDAD_ESTADO).equals("optimo")) {
				System.out.println();
				System.out.println(v.getProperty(clsConstantes.PROPIEDAD_MARCA));
				System.out.print(v.getProperty(clsConstantes.PROPIEDAD_NUMBASTIDOR));
				}
			}
			break;
			
			case 2: System.out.println("\n"+"Vehiculos para desguace: ");
				for(itfProperty v:vehiculos) {
					if(v.getProperty(clsConstantes.PROPIEDAD_ESTADO).equals("desguazable")) {
					System.out.println();
					System.out.println(v.getProperty(clsConstantes.PROPIEDAD_MARCA));
					System.out.print(v.getProperty(clsConstantes.PROPIEDAD_NUMBASTIDOR));
					}
				}
			break;
			
			case 3: System.out.println("\n"+"Vehiculos en la chatarra: ");
				for(itfProperty v:vehiculos) {
					if(v.getProperty(clsConstantes.PROPIEDAD_ESTADO).equals("chatarra")) {
					System.out.println();
					System.out.println(v.getProperty(clsConstantes.PROPIEDAD_MARCA));
					System.out.print(v.getProperty(clsConstantes.PROPIEDAD_NUMBASTIDOR));
					}
				}
			break;
			
			case 4: System.out.println("\n"+"Vehiculos en venta: ");
				for(itfProperty v:vehiculos) {
					if(v.getProperty(clsConstantes.PROPIEDAD_ESTADO).equals("venta")) {
					System.out.println();
					System.out.println(v.getProperty(clsConstantes.PROPIEDAD_MARCA));
					System.out.print(v.getProperty(clsConstantes.PROPIEDAD_NUMBASTIDOR));
					}
				}
			break;
			}
			
		}while(opcion!=5);
		
		}
	

	/**
	 * Meter datos en las variables de objGestor en la funcion CrearCoche.
	 */
	
	private static void AltaMoto(clsGestor objGestor) {
		System.out.print("Numero de bastidor: ");
		String numbastidor = UtilidadesLP.leerCadena();
		System.out.print("Marca: ");
		String marca = UtilidadesLP.leerCadena();
		System.out.print("Modelo: ");
		String modelo = UtilidadesLP.leerCadena();
		System.out.print("Cv: ");
		int cv = UtilidadesLP.leerEntero();
		System.out.print("Año de Fabricación: ");
		int aniofabricacion = UtilidadesLP.leerEntero();
		String estado = null;
		System.out.print("Elige el estado del vehículo: ");
		System.out.println("\n"+
                "1) Optimo (Taller).\n" +
                "2) Desguazable (Despiece del vehículo).\n" +
                "3) Chatarra.\n");
		int est =  UtilidadesLP.leerEntero();
		switch (est) {
		case 1: estado = "optimo";
		break;
		case 2: estado = "desguazable";
		break;
		case 3: estado = "chatarra";
		break;
		}
		Date fecha = new Date();
		System.out.print("Color: ");
		String color = UtilidadesLP.leerCadena();
		System.out.print("Kilometros: ");
		int kilometros = UtilidadesLP.leerEntero();
		System.out.print("Tipo de moto: ");
		String tipomoto = UtilidadesLP.leerCadena();
		System.out.print("Cilindrada: ");
		int cilindrada = UtilidadesLP.leerEntero();	
		System.out.print("Tamaño: ");
		int tamaño = UtilidadesLP.leerEntero();
		
		objGestor.CrearMoto(numbastidor, marca, modelo, cv, aniofabricacion, estado, fecha, color, kilometros, tipomoto, cilindrada, tamaño);
		
	}
	
	/**
	 * Meter datos en las variables de objGestor en la funcion CrearCamion.
	 */

	private static void AltaCamion(clsGestor objGestor) {
		System.out.print("Numero de bastidor: ");
		String numbastidor = UtilidadesLP.leerCadena();
		System.out.print("Marca: ");
		String marca = UtilidadesLP.leerCadena();
		System.out.print("Modelo: ");
		String modelo = UtilidadesLP.leerCadena();
		System.out.print("Cv: ");
		int cv = UtilidadesLP.leerEntero();
		System.out.print("Año de Fabricación: ");
		int aniofabricacion = UtilidadesLP.leerEntero();
		String estado = null;
		System.out.print("Elige el estado del vehículo: ");
		System.out.println("\n"+
                "1) Optimo (Taller).\n" +
                "2) Desguazable (Despiece del vehiculo).\n" +
                "3) Chatarra.\n");
		int est =  UtilidadesLP.leerEntero();
		switch (est) {
		case 1: estado = "optimo";
		break;
		case 2: estado = "desguazable";
		break;
		case 3: estado = "chatarra";
		break;
		}
		Date fecha = new Date();
		System.out.print("Color: ");
		String color = UtilidadesLP.leerCadena();
		System.out.print("Kilometros: ");
		int kilometros = UtilidadesLP.leerEntero();
		System.out.print("Tipo de camion: ");
		String tipocamion = UtilidadesLP.leerCadena();
		System.out.print("Altura: ");
		int altura = UtilidadesLP.leerEntero();
		System.out.print("Anchura: ");
		int anchura = UtilidadesLP.leerEntero();
		
		objGestor.CrearCamion(numbastidor, marca, modelo, cv, aniofabricacion, estado, fecha, color, kilometros, tipocamion, altura, anchura);
		
	}
	
	/**
	 * Meter datos en las variables de objGestor en la funcion CrearMoto.
	 */

	private static void AltaCoche(clsGestor objGestor) {
		System.out.print("Numero de bastidor: ");
		String numbastidor = UtilidadesLP.leerCadena();
		System.out.print("Marca: ");
		String marca = UtilidadesLP.leerCadena();
		System.out.print("Modelo: ");
		String modelo = UtilidadesLP.leerCadena();
		System.out.print("Cv: ");
		int cv = UtilidadesLP.leerEntero();
		System.out.print("Cilindrada: ");
		String cilindrada = UtilidadesLP.leerCadena();
		System.out.print("Año de Fabricación: ");
		int aniofabricacion = UtilidadesLP.leerEntero();
		String estado = null;
		System.out.print("Elige el estado del vehículo: ");
		System.out.println("\n"+
                "1) Optimo (Taller).\n" +
                "2) Desguazable (Despiece del vehiculo).\n" +
                "3) Chatarra.\n");
		int est =  UtilidadesLP.leerEntero();
		switch (est) {
		case 1: estado = "optimo";
		break;
		case 2: estado = "desguazable";
		break;
		case 3: estado = "chatarra";
		break;
		}
		Date fecha = new Date();
		System.out.print("Color: ");
		String color = UtilidadesLP.leerCadena();
		System.out.print("Kilometros: ");
		int kilometros = UtilidadesLP.leerEntero();
		System.out.print("Tipo de coche: ");
		String tipocoche = UtilidadesLP.leerCadena();
		System.out.print("Combustible: ");
		String combustible = UtilidadesLP.leerCadena();
		
		
		objGestor.CrearCoche(numbastidor, marca, modelo, cv, aniofabricacion, estado, fecha, color, kilometros, tipocoche, combustible, cilindrada);
	}

}
