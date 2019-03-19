package LP;

import java.util.ArrayList;
import java.util.Date;

import Comun.itfProperty;
import LN.clsGestor;



public class clsMenu {
	
	
	/**
	 * Hola que ase
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
                "1) Dar de alta Coche.\n" +
                "2) Dar de alta Camion.\n" +
                "3) Dar de alta Moto.\n" +
                "4) Mostrar registros.\n" +
                "5) Dar de baja Vehiculo.\n" +
                "6) Salir.\n");
		
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
		
		}
		
		}while(opcion!=6);
		
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
		for (itfProperty recorrido: vehiculos ) {
			if(recorrido.getProperty("numbastidor").equals(numerobastidor)) {
				System.out.println("El vehiculo ha sido encontrado");
			}
		}
	}

	/**
	 * Funcion para leer el ArrayList instanciado en clsGesotr y que se encuentra en el objGestor que hemos creado en el Menu Principal.
	 * Por eso pasamos por paramtero el objGestor.
	 */
	private static void MostrarRegistros(clsGestor objGestor) {
		
		ArrayList<itfProperty> vehiculos;
		vehiculos = objGestor.DameVehiculos();
		for(itfProperty v:vehiculos) {
			System.out.println(v.getProperty("numbastidor"));
		}
	}

	/**
	 * Meter datos en las variables de objGestor en la funcion CrearCoche.
	 */
	
	private static void AltaMoto(clsGestor objGestor) {
		System.out.print("Numero de bastidor: ");
		String numbastidor = UtilidadesLP.leerCadena();
		System.out.print("Marca: ");
		String marca = UtilidadesLP.leerCadena();
		String estado = null;
		System.out.print("Elige el estado del vehículo: ");
		System.out.println("\n"+
                "1) Optimo.\n" +
                "2) Desguazable.\n" +
                "3) Chatarra.\n");
		int est =  UtilidadesLP.leerEntero();
		switch (est) {
		case 1: estado = "Optimo";
		break;
		case 2: estado = "Desguazable";
		break;
		case 3: estado = "Chatarra";
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
		
		objGestor.CrearMoto(numbastidor, marca, estado, fecha, color, kilometros, tipomoto, cilindrada, tamaño);
		
	}
	
	/**
	 * Meter datos en las variables de objGestor en la funcion CrearCamion.
	 */

	private static void AltaCamion(clsGestor objGestor) {
		System.out.print("Numero de bastidor: ");
		String numbastidor = UtilidadesLP.leerCadena();
		System.out.print("Marca: ");
		String marca = UtilidadesLP.leerCadena();
		String estado = null;
		System.out.print("Elige el estado del vehículo: ");
		System.out.println("\n"+
                "1) Optimo.\n" +
                "2) Desguazable.\n" +
                "3) Chatarra.\n");
		int est =  UtilidadesLP.leerEntero();
		switch (est) {
		case 1: estado = "Optimo";
		break;
		case 2: estado = "Desguazable";
		break;
		case 3: estado = "Chatarra";
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
		
		objGestor.CrearCamion(numbastidor, marca, estado, fecha, color, kilometros, tipocamion, altura, anchura);
		
	}
	
	/**
	 * Meter datos en las variables de objGestor en la funcion CrearMoto.
	 */

	private static void AltaCoche(clsGestor objGestor) {
		System.out.print("Numero de bastidor: ");
		String numbastidor = UtilidadesLP.leerCadena();
		System.out.print("Marca: ");
		String marca = UtilidadesLP.leerCadena();
		String estado = null;
		System.out.print("Elige el estado del vehículo: ");
		System.out.println("\n"+
                "1) Optimo.\n" +
                "2) Desguazable.\n" +
                "3) Chatarra.\n");
		int est =  UtilidadesLP.leerEntero();
		switch (est) {
		case 1: estado = "Optimo";
		break;
		case 2: estado = "Desguazable";
		break;
		case 3: estado = "Chatarra";
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
		System.out.print("Modelo: ");
		String modelo = UtilidadesLP.leerCadena();
		
		objGestor.CrearCoche(numbastidor, marca, estado, fecha, color, kilometros, tipocoche, combustible, modelo);
	}

}
