package LN;

import java.util.Date;
import Comun.clsComparatorValor;
import Comun.clsExcepcionPropia;
import Comun.itfProperty;
import java.util.ArrayList;
import java.util.Collections;
import LD.clsDatos;
import java.sql.ResultSet;
import java.sql.SQLException;

public class clsGestor {

	/** Creamos objeto de la clase Datos para utilizar sus funciones */
	clsDatos objDatos = new clsDatos();

	/** ArrayList donde se contiene todos los pedidos */
	private ArrayList<clsPedido> pedidos = new ArrayList<>();
	
	/**
	 * Funcion ArrayList itfProperty donde se devuelven los pedidos a la logica de
	 * presentacion
	 */
	public ArrayList<itfProperty> DamePedidos() {
		ArrayList<itfProperty> retorno = new ArrayList<itfProperty>();
		for (clsPedido p : pedidos) {
			retorno.add(p);
		}
		return retorno;
	}

	/** ArrayList donde van a contener los estados de los vehiculos */
	private ArrayList<clsEstado> estados = new ArrayList<>();

	/**
	 * Funcion ArrayList itfProperty donde se devuelven los estados a la logica de
	 * presentacion
	 */
	public ArrayList<itfProperty> DameEstados() {
		ArrayList<itfProperty> retorno = new ArrayList<itfProperty>();
		for (clsEstado a : estados) {
			retorno.add(a);
		}
		return retorno;
	}

	/** ArrayList donde se va a contener a los operarios */
	private ArrayList<clsOperario> operarios = new ArrayList<>();

	/**
	 * Funcion ArrayList itfProperty donde se devuelven los usuarios a la logica de
	 * presentaicion
	 */
	public ArrayList<itfProperty> DameOperarios() {
		ArrayList<itfProperty> retorno = new ArrayList<itfProperty>();
		for (clsOperario a : operarios) {
			retorno.add(a);
		}
		return retorno;
	}

	/** ArrayList donde van a contener los tipo de coches */
	private ArrayList<clsTipoCoche> tipocoche = new ArrayList<>();

	public ArrayList<itfProperty> DameTipoCoche() {
		ArrayList<itfProperty> retorno = new ArrayList<itfProperty>();
		for (clsTipoCoche o : tipocoche) {
			retorno.add(o);
		}
		return retorno;
	}

	/** ArrayList donde van a contener los tipos de motos */
	private ArrayList<clsTipoMoto> tipomoto = new ArrayList<>();

	public ArrayList<itfProperty> DameTipoMoto() {
		ArrayList<itfProperty> retorno = new ArrayList<itfProperty>();
		for (clsTipoMoto m : tipomoto) {
			retorno.add(m);
		}

		return retorno;
	}

	/** ArrayList donde van a contener los tipos de camiones */
	private ArrayList<clsTipoCamion> tipocamion = new ArrayList<>();

	public ArrayList<itfProperty> DameTipoCamion() {
		ArrayList<itfProperty> retorno = new ArrayList<itfProperty>();
		for (clsTipoCamion c : tipocamion) {
			retorno.add(c);
		}
		return retorno;
	}

	/** Creamos ArrayList de vehiculos */
	private ArrayList<clsVehiculo> vehiculos = new ArrayList<>();
	
	public ArrayList<itfProperty> DameCochesv2() {
		ArrayList<itfProperty> retorno = new ArrayList<>();
		for (clsVehiculo v : vehiculos) {
			if(v instanceof clsCoche) {
				retorno.add(v);
			}
		}
		return retorno;
	}
	
	public ArrayList<itfProperty> DameCamionesv2() {
		ArrayList<itfProperty> retorno = new ArrayList<>();
		for (clsVehiculo v : vehiculos) {
			if(v instanceof clsCamion) {
				retorno.add(v);
			}
		}
		return retorno;
	}
	
	public ArrayList<itfProperty> DameMotosv2() {
		ArrayList<itfProperty> retorno = new ArrayList<>();
		for (clsVehiculo v : vehiculos) {
			if(v instanceof clsMoto) {
				retorno.add(v);
			}
		}
		return retorno;
	}

	/**
	 * Funcion ArrayList donde se guardan los vehiculos
	 */
	public ArrayList<itfProperty> DameCoches(int orden, String marca, int estado) {

		if (orden == 1) {
			/** Se instancia la clase Comparator con el metodo CompareTo */
			clsComparatorValor comparadorvalor = new clsComparatorValor();
			/**
			 * Con el metodo sort ordenamos los vehiculos mediante la clase Comparator
			 * creada
			 */
			Collections.sort(vehiculos, comparadorvalor);
		}
		if (orden == 2) {
			/**
			 * Interfaz Comparable implementada en vehiculos que ordena por potencia en
			 * caballos
			 */
			Collections.sort(vehiculos);
		}

		ArrayList<itfProperty> retorno = new ArrayList<itfProperty>();

		/**
		 * Se recorre el Array de vehiculos para devolver solo los que sean objetos de
		 * la clase Coche
		 */

		for (clsVehiculo a : vehiculos) {

			if (a.idestado == estado || estado == 0) {

				if (marca == null || marca.equals("Todos")) {
					if (a instanceof clsCoche) {
						retorno.add(a);
					}
		
				} else if (marca != null) {
					if (a instanceof clsCoche) {
						if (a.marca.equals(marca)) {
							retorno.add(a);
						}
					}
				}
			}
		}

		return retorno;
	}

	public ArrayList<itfProperty> DameCamiones(int orden, String marca, int estado) {

		if (orden == 1) {
			/** Se instancia la clase Comparator con el metodo CompareTo */
			clsComparatorValor comparadorvalor = new clsComparatorValor();
			/**
			 * Con el metodo sort ordenamos los vehiculos mediante la clase Comparator
			 * creada
			 */
			Collections.sort(vehiculos, comparadorvalor);
		}
		if (orden == 2) {
			/**
			 * Interfaz Comparable implementada en vehiculos que ordena por potencia en
			 * caballos
			 */
			Collections.sort(vehiculos);
		}

		ArrayList<itfProperty> retorno = new ArrayList<itfProperty>();

		for (clsVehiculo a : vehiculos) {

			if (a.idestado == estado || estado == 0) {

				if (marca == null || marca.equals("Todos")) {
					if (a instanceof clsCamion) {
						retorno.add(a);
					}

				} else if (marca != null) {
					if (a instanceof clsCamion) {
						if (a.marca.equals(marca)) {
							retorno.add(a);
						}
					}
				}
			}
		}
		return retorno;
	}

	public ArrayList<itfProperty> DameMotos(int orden, String marca, int estado) {

		if (orden == 1) {
			/** Se instancia la clase Comparator con el metodo CompareTo */
			clsComparatorValor comparadorvalor = new clsComparatorValor();
			/**
			 * Con el metodo sort ordenamos los vehiculos mediante la clase Comparator
			 * creada
			 */
			Collections.sort(vehiculos, comparadorvalor);
		}
		if (orden == 2) {
			/**
			 * Interfaz Comparable implementada en vehiculos que ordena por potencia en
			 * caballos
			 */
			Collections.sort(vehiculos);
		}

		ArrayList<itfProperty> retorno = new ArrayList<itfProperty>();

		for (clsVehiculo a : vehiculos) {

			if (a.idestado == estado || estado == 0) {

				if (marca == null || marca.equals("Todos")) {
					if (a instanceof clsMoto) {
						retorno.add(a);
					}

				} else if (marca != null) {
					if (a instanceof clsMoto) {
						if (a.marca.equals(marca)) {
							retorno.add(a);
						}
					}
				}
			}
		}
		return retorno;
	}
	
	public void comprobarVenta(String numbastidor) throws clsExcepcionPropia {
		
		for (clsVehiculo v: vehiculos) {
				if (v.numbastidor.equals(numbastidor)) {
					if (v.idestado != 1) {
						
						throw new clsExcepcionPropia();
					}
					break;
				}
		}
		
	}

	/**
	 * Funcion para comprobar operarios al introducirse en la venta JFrame_Loging
	 */
	public boolean comprobarOperario(String operario, String contraseña) {

		boolean retorno = false;

		/**
		 * Se recorren todos los operarios para comprobar que coinciden con los datos
		 * introducidos desde la ventana JFrame_Loging
		 */
		for (clsOperario o : operarios) {
			if (o.getIdoperario().equals(operario) && o.getContrasea().equals(contraseña)) {
				retorno = true;
				break;
			}

		}

		return retorno;
	}
	
	public void modificarEstadoCoche (String numbastidor) throws SQLException {
		
		int id;
		/** Se crea conexion con BD */
		objDatos.conectarBD();
		
		for (clsVehiculo v: vehiculos) {
			for (clsEstado e: estados) {
				if(v instanceof clsCoche) {
					if(v.getNumbastidor().equals(numbastidor)) {
						if (e.getDescripcion().equals("Vendido")) {
							id = e.getIdestado();
							v.setIdestado(id);
							objDatos.modificarEstadoCocheBD(numbastidor, id);
							break;
						}
					}
				}
			}
		}
		
		/** Se desconecta la BD */
		objDatos.desconectarBD();
	}
	
	public void modificarEstadoCamion (String numbastidor) throws SQLException {
		
		int id;
		/** Se crea conexion con BD */
		objDatos.conectarBD();
		
		for (clsVehiculo v: vehiculos) {
			for (clsEstado e: estados) {
				if(v instanceof clsCamion) {
					if(v.getNumbastidor().equals(numbastidor)) {
						if (e.getDescripcion().equals("Vendido")) {
							id = e.getIdestado();
							v.setIdestado(id);
							objDatos.modificarEstadoCamionBD(numbastidor, id);
							break;
						}
					}
				}
			}
		}
		
		/** Se desconecta la BD */
		objDatos.desconectarBD();
	}
	
	public void modificarEstadoMoto(String numbastidor) throws SQLException {
		
		int id;
		/** Se crea conexion con BD */
		objDatos.conectarBD();
		
		for (clsVehiculo v: vehiculos) {
			for (clsEstado e: estados) {
				if(v instanceof clsMoto) {
					if(v.getNumbastidor().equals(numbastidor)) {
						if (e.getDescripcion().equals("Vendido")) {
							id = e.getIdestado();
							v.setIdestado(id);
							objDatos.modificarEstadoMotoBD(numbastidor, id);
							break;
						}
					}
				}
			}
		}
		
		/** Se desconecta la BD */
		objDatos.desconectarBD();
	}
		
		

	public void RecogerpedidosBD() throws SQLException {
		/** Se crea conexion con BD */
		objDatos.conectarBD();
		ResultSet rs;

		/** Se llama a la funcion recoger tipos de coche de la clase Datos */
		rs = objDatos.recogerpedidosBD();

		/** Recorre el ResultSet añadiendo los objetos en el ArrayList */
		while (rs.next()) {
			clsPedido objPedido = new clsPedido(rs.getInt("idpedido"), rs.getDouble("precio"),
					rs.getString("numbastidor"), rs.getString("dnicliente"), rs.getString("idoperario"),rs.getString("tipopedido"));
			pedidos.add(objPedido);
		}

		/** Se desconecta la BD */
		objDatos.desconectarBD();

	}

	public void Crearpedido(double precio, String numbastidor, String dnicliente, String idoperario, String tipopedido) throws SQLException {
		
		/** Se crea el objeto pedido y se añade al ArrayList de pedidos */
		clsPedido objPedido = new clsPedido(precio, numbastidor, dnicliente, idoperario, tipopedido);
		pedidos.add(objPedido);
		
		/** Se conecta la BD */
		objDatos.conectarBD();
		
		/** Se pasa por parámetro los atributos a la clase datos para introducir en la BD*/
		objDatos.insertatpedidosBD(precio, numbastidor, dnicliente, idoperario, tipopedido);
		
		/** Se desconecta la BD */
		objDatos.desconectarBD();

	}

	public void RecogeroperariosBD() throws SQLException {
		/** Se crea conexion con BD */
		objDatos.conectarBD();
		ResultSet rs;

		/** Se llama a la funcion recoger tipos de coche de la clase Datos */
		rs = objDatos.recogeroperariosBD();

		/** Recorre el ResultSet añadiendo los objetos en el ArrayList */
		while (rs.next()) {
			clsOperario objOperario = new clsOperario(rs.getString("idoperario"), rs.getString("contrasea"),
					rs.getString("nombre"), rs.getString("apellido"), rs.getString("dni"));
			operarios.add(objOperario);
		}

		/** Se desconecta la BD */
		objDatos.desconectarBD();

	}

	public void RecogertipococheBD() throws SQLException {
		/** Se crea conexion con BD */
		objDatos.conectarBD();
		ResultSet rs;

		/** Se llama a la funcion recoger tipos de coche de la clase Datos */
		rs = objDatos.recogertipococheBD();

		/** Recorre el ResultSet añadiendo los objetos en el ArrayList */
		while (rs.next()) {
			clsTipoCoche objTipoCoche = new clsTipoCoche(rs.getInt("idtipocoche"), rs.getString("descripcion"));
			tipocoche.add(objTipoCoche);
		}

		/** Se desconecta la BD */
		objDatos.desconectarBD();

	}

	public void RecogertipomotoBD() throws SQLException {

		/** Se crea conexion con BD */
		objDatos.conectarBD();
		ResultSet rs;

		/** Se llama a la funcion recoger tipos de moto de la clase Datos */
		rs = objDatos.recogertipomotoBD();

		/** Recorre el ResultSet añadiendo los objetos en el ArrayList */
		while (rs.next()) {
			clsTipoMoto objTipoMoto = new clsTipoMoto(rs.getInt("idtipomoto"), rs.getString("descripcion"));
			tipomoto.add(objTipoMoto);
		}

		/** Se desconecta la BD */
		objDatos.desconectarBD();

	}

	public void RecogertipocamionBD() throws SQLException {

		/** Se crea conexion con BD */
		objDatos.conectarBD();
		ResultSet rs;

		/** Se llama a la funcion recoger tipos de coche de la clase Datos */
		rs = objDatos.recogertipocamionBD();

		/** Recorre el ResultSet añadiendo los objetos en el ArrayList */
		while (rs.next()) {
			clsTipoCamion objTipoCamion = new clsTipoCamion(rs.getInt("idtipocamion"), rs.getString("descripcion"));
			tipocamion.add(objTipoCamion);
		}

		/** Se desconecta la BD */
		objDatos.desconectarBD();

	}

	public void RecogerestadosBD() throws SQLException {

		/** Se crea conexion con BD */
		objDatos.conectarBD();
		ResultSet rs;

		/** Se llama a la funcion recoger estados de la clase Datos */
		rs = objDatos.recogerestadoBD();

		/** Recorre el ResultSet añadiendo los objetos en el ArrayList */
		while (rs.next()) {
			clsEstado objEstado = new clsEstado(rs.getInt("idestado"), rs.getString("descripcion"));
			estados.add(objEstado);
		}

		/** Se desconecta la BD */
		objDatos.desconectarBD();
	}

	/**
	 * Funcion recoger de base de datos desde clsGestor en el que utilizamos el
	 * objeto Datos para llamar a la funcion consultar datos
	 */
	public void RecogercocheBD() throws SQLException {

		/** Se crea conexion con BD */
		objDatos.conectarBD();
		ResultSet rs;

		/** Funcion recoger coches de la BD */
		rs = objDatos.recogercocheBD();

		/** Se recorre el ResultSet añadiendo los objetos en el ArrayList */
		while (rs.next()) {
			clsCoche objCoche = new clsCoche(rs.getString("numbastidor"), rs.getString("marca"), rs.getString("modelo"),
					rs.getInt("cv"), rs.getDate("aniofabricacion"), rs.getDate("fecha"), rs.getString("color"),
					rs.getInt("kilometros"), rs.getInt("idtipocoche"), rs.getString("combustible"),
					rs.getInt("cilindrada"), rs.getInt("idestado"), rs.getInt("valor"), rs.getString("idoperario"));

			vehiculos.add(objCoche);
		}

		/** Se desconecta la BD */
		objDatos.desconectarBD();
	}

	/**
	 * Funcion recoger de base de datos desde clsGestor en el que utilizamos el
	 * objeto Datos para llamar a la funcion consultar datos
	 */
	public void RecogermotoBD() throws SQLException {

		/** Se crea conexion con BD */
		objDatos.conectarBD();
		ResultSet rs;

		/** Funcion recoger coches de la BD */
		rs = objDatos.recogermotoBD();

		/** Se recorre el ResultSet añadiendo los objetos en el ArrayList */
		while (rs.next()) {
			clsMoto objMoto = new clsMoto(rs.getString("numbastidor"), rs.getString("marca"), rs.getString("modelo"),
					rs.getInt("cv"), rs.getDate("aniofabricacion"), rs.getDate("fecha"), rs.getString("color"),
					rs.getInt("kilometros"), rs.getInt("idtipomoto"), rs.getInt("cilindrada"), rs.getString("tamaño"),
					rs.getInt("idestado"), rs.getInt("valor"), rs.getString("idoperario"));

			/** Se añade el objeto reocgido de bbdd al Array */
			vehiculos.add(objMoto);
		}

		/** Se desconecta la BD */
		objDatos.desconectarBD();
	}

	/**
	 * Funcion recoger de base de datos desde clsGestor en el que utilizamos el
	 * objeto Datos para llamar a la funcion consultar datos
	 */
	public void RecogercamionBD() throws SQLException {

		/** Se crea conexion con BD */
		objDatos.conectarBD();
		ResultSet rs;

		/** Funcion recoger coches de la BD */
		rs = objDatos.recogercamionBD();

		/** Se recorre el ResultSet añadiendo los objetos en el ArrayList */
		while (rs.next()) {
			clsCamion objCamion = new clsCamion(rs.getString("numbastidor"), rs.getString("marca"),
					rs.getString("modelo"), rs.getInt("cv"), rs.getDate("aniofabricacion"), rs.getDate("fecha"),
					rs.getString("color"), rs.getInt("kilometros"), rs.getInt("idtipocamion"), rs.getInt("altura"),
					rs.getInt("carga"), rs.getInt("idestado"), rs.getInt("valor"), rs.getString("idoperario"));

			vehiculos.add(objCamion);
		}

		/** Se desconecta la BD */
		objDatos.desconectarBD();
	}

	/**
	 * Funcion eliminar de base de datos desde clsGestor en el que utilizamos el
	 * objeto Datos para llamar a la funcion eliminar datos
	 */
	public void EliminarcocheBD(String numerobastidor) throws SQLException {

		/** Establecer conexion con BD */
		objDatos.conectarBD();

		for (clsVehiculo e : vehiculos) {
			if (e instanceof clsCoche) {
				if (e.numbastidor.equals(numerobastidor)) {

					vehiculos.remove(e);

					/** Funcion de clsDatos para eliminar el objeto de la BBDD */
					objDatos.eliminarcocheBD(numerobastidor);

					break;
				}
			}
		}
		/** Desconectar la BD */
		objDatos.desconectarBD();
	}

	/**
	 * Funcion eliminar de base de datos desde clsGestor en el que utilizamos el
	 * objeto Datos para llamar a la funcion eliminar datos
	 */
	public void EliminarmotoBD(String numerobastidor) throws SQLException {

		/** Establecer conexion con BD */
		objDatos.conectarBD();

		for (clsVehiculo e : vehiculos) {
			if (e instanceof clsMoto) {
				if (e.numbastidor.equals(numerobastidor)) {

					vehiculos.remove(e);
					System.out.println("Se ha eliminado del ArrayList");

					/** Funcion de clsDatos para eliminar el objeto de la BBDD */
					objDatos.eliminarmotoBD(numerobastidor);

					break;
				}
			}
		}
		/** Desconectar la BD */
		objDatos.desconectarBD();
	}

	/**
	 * Funcion eliminar de base de datos desde clsGestor en el que utilizamos el
	 * objeto Datos para llamar a la funcion eliminar datos
	 */
	public void EliminarcamionBD(String numerobastidor) throws SQLException {

		/** Establecer conexion con BD */
		objDatos.conectarBD();

		for (clsVehiculo e : vehiculos) {
			if (e instanceof clsCamion) {
				if (e.numbastidor.equals(numerobastidor)) {

					/**
					 * Cuando se llama a la función eliminar coche tambien se elimina del ArrayList
					 */
					vehiculos.remove(e);

					/** Funcion de clsDatos para eliminar el objeto de la BBDD */
					objDatos.eliminarcamionBD(numerobastidor);

					break;

				}
			}
		}
		/** Desconectar la BD */
		objDatos.desconectarBD();
	}

	/**
	 * Funcion Crear coche para que se comunique con el Menu Principal y guardars
	 * los atributos en la instancia objeto coche. De esta manera solo se comunica
	 * con el Menu Principal la Clase Gestor.
	 */
	public void CrearCoche(String numbastidor, String marca, String modelo, int cv, Date aniofabricacion, Date fecha,
			String color, int kilometros, int idtipocoche, String combustible, int cilindrada, int idestado, int valor,
			String idoperario) throws SQLException {

		clsCoche objCoche = new clsCoche(numbastidor, marca, modelo, cv, aniofabricacion, fecha, color, kilometros,
				idtipocoche, combustible, cilindrada, idestado, valor, idoperario);

		/** Se conecta la BD */
		objDatos.conectarBD();

		/** Se pasa por parámetro los atributos para introducirlos en la BD */
		objDatos.insertarcocheBD(numbastidor, marca, modelo, cv, aniofabricacion, fecha, color, kilometros, idtipocoche,
				combustible, cilindrada, idestado, valor, idoperario);

		/** Se desconecta la BD */
		objDatos.desconectarBD();

		/** Añadimos al AarrayList el objeto creado */
		vehiculos.add(objCoche);
	}

	/**
	 * Funcion Crear camion para que se comunique con el Menu Principal y guardars
	 * los atributos en la instancia objeto camion. De esta manera solo se comunica
	 * con el Menu Principal la Clase Gestor.
	 */
	public void CrearCamion(String numbastidor, String marca, String modelo, int cv, Date aniofabricacion, Date fecha,
			String color, int kilometros, int idtipocamion, int altura, int carga, int idestado, int valor,
			String idoperario) throws SQLException {

		clsCamion objCamion = new clsCamion(numbastidor, marca, modelo, cv, aniofabricacion, fecha, color, kilometros,
				idtipocamion, altura, carga, idestado, valor, idoperario);

		/** Se conecta la BD */
		objDatos.conectarBD();

		/** Se pasa por parámetro los atributos para introducirlos en la BD */
		objDatos.insertarcamionBD(numbastidor, marca, modelo, cv, aniofabricacion, fecha, color, kilometros,
				idtipocamion, altura, carga, idestado, valor, idoperario);

		/** Se desconecta la BD */
		objDatos.desconectarBD();

		/** Añadimos al ArrayList el objeto creado */
		vehiculos.add(objCamion);
	}

	/**
	 * Funcion Crear moto para que se comunique con el Menu Principal y guardars los
	 * atributos en la instancia objeto moto. De esta manera solo se comunica con el
	 * Menu Principal la Clase Gestor.
	 */
	public void CrearMoto(String numbastidor, String marca, String modelo, int cv, Date aniofabricacion, Date fecha,
			String color, int kilometros, int idtipomoto, int cilindrada, String tamaño, int idestado, int valor,
			String idoperario) throws SQLException {

		clsMoto objMoto = new clsMoto(numbastidor, marca, modelo, cv, aniofabricacion, fecha, color, kilometros,
				idtipomoto, cilindrada, tamaño, idestado, valor, idoperario);

		/** Se conecta la BD */
		objDatos.conectarBD();

		/** Se pasa por parámetro los atributos para introducirlos en la BD */
		objDatos.insertarmotoBD(numbastidor, marca, modelo, cv, aniofabricacion, fecha, color, kilometros, idtipomoto,
				cilindrada, tamaño, idestado, valor, idoperario);

		/** Se desconecta la BD */
		objDatos.desconectarBD();

		/** Añadimos al ArrayList el objeto creado */
		vehiculos.add(objMoto);
	}

}
