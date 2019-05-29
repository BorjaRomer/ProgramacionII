package LP;

import java.sql.SQLException;
import LN.clsGestor;

public class clsMenu {
	
	/**Menu principal donde se interactua con el usuario dandole las opciones de registro de nuestrto desguace. 
	 Podemos dar de alta cualquier vehiculo y mostrarlos.*/ 
	 public static void MenuPrincipal() {
		
		/**Creamos el objeto Gestor en el inicio de la aplicacion.*/
		clsGestor objGestor = new clsGestor();
		
		/**Recogemos todo de la BD*/
		try {
			/**Recogemos todos los pedidos de la BD*/
			objGestor.RecogerpedidosBD();
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
		}	
		
		/*Se pasa el objGestor a la ventana Loging para poder acceder a los datos de la clase gestor en la que se han recogido los registros*/
		JFrame_Loging objFrame = new JFrame_Loging(objGestor);
		objFrame.setLocationRelativeTo(null);
		objFrame.setVisible(true);
		
		
	 } 
	
}
