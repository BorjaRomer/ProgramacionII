package LP;

import javax.swing.JFrame;
import java.awt.Toolkit;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import LN.clsGestor;
import java.awt.Font;

public class JFrame_VentanaPrincipal extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	private final String VISUALIZAR_COCHE = "visualizar_coche";
	private final String REGISTRAR_COCHE = "registrar_coche";
	private final String CAMBIAR_OPERARIO = "cambiar_operario";
	private clsGestor objGestor;
	
	public JFrame_VentanaPrincipal(clsGestor _objGestor) {
		
		/**
		 * Se recibe el objGestor creado al inicio de la aplicacion porque es el objeto
		 * que recoge todos los datos de la bbdd y los guarda en los ArrayList
		 */
		objGestor = _objGestor;
		
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Industria 4.0\\Desktop\\ProgramII\\ECLIPSE\\ProgramacionII\\Archivos gr\u00E1ficos\\iconfinder_magnifier_and_car_1421622.png"));
		setTitle("DESGUACE");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 631, 406);
		getContentPane().setLayout(null);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 777, 29);
		getContentPane().add(menuBar);
		
		JMenu MenuArchivo = new JMenu("Archivo");
		MenuArchivo.setFont(new Font("Segoe UI", Font.BOLD, 12));
		menuBar.add(MenuArchivo);
		
		JMenuItem CambiarOperario = new JMenuItem("Cambiar operario");
		CambiarOperario.setActionCommand(CAMBIAR_OPERARIO);
		CambiarOperario.addActionListener(this);
		MenuArchivo.add(CambiarOperario);
		
		JMenuItem EstadisticasDelDia = new JMenuItem("Estadisticas del dia");
		MenuArchivo.add(EstadisticasDelDia);
		
		JMenuItem Salir = new JMenuItem("Salir");
		MenuArchivo.add(Salir);
		
		JMenu Registros = new JMenu("Registros");
		Registros.setFont(new Font("Segoe UI", Font.BOLD, 12));
		menuBar.add(Registros);
		
		JMenuItem RegistrarCoche = new JMenuItem("Registrar coche");
		RegistrarCoche.setActionCommand(REGISTRAR_COCHE);
		RegistrarCoche.addActionListener(this);
		Registros.add(RegistrarCoche);
		
		JMenuItem RegistrarMoto = new JMenuItem("Registrar moto");
		Registros.add(RegistrarMoto);
		
		JMenuItem RegistrarCamion = new JMenuItem("Registrar camion");
		Registros.add(RegistrarCamion);
		
		JMenu Visualizar = new JMenu("Visualizar");
		Visualizar.setFont(new Font("Segoe UI", Font.BOLD, 12));
		menuBar.add(Visualizar);
		
		JMenuItem VisualizarCoche = new JMenuItem("Visualizar coches");
		VisualizarCoche.setActionCommand(VISUALIZAR_COCHE);
		VisualizarCoche.addActionListener(this);
		Visualizar.add(VisualizarCoche);
		
		JMenuItem VisualizarMotos = new JMenuItem("Visualizar motos");
		Visualizar.add(VisualizarMotos);
		
		JMenuItem VisualizarCamiones = new JMenuItem("Visualizar camiones");
		Visualizar.add(VisualizarCamiones);
	}
	
	public void actionPerformed(ActionEvent a) {
		
		switch(a.getActionCommand()) {
		
		/** Se cierra la ventana actual y se abre la de logearse */
		case CAMBIAR_OPERARIO:
			dispose();
			JFrame_Loging frame = new JFrame_Loging(objGestor);
			frame.setLocationRelativeTo(null);
			frame.setVisible(true);
			break;
		
			/** Se abre la ventana para mostrar los coches */
		case VISUALIZAR_COCHE:
			JFrame_MostrarCoches frame2 = new JFrame_MostrarCoches(objGestor);
			frame2.setLocationRelativeTo(null);
			frame2.setVisible(true);
			break;
			
			/** Se abre la ventana para registrar un coche */
		case REGISTRAR_COCHE:
			JFrame_AltaCoche frame1 = new JFrame_AltaCoche(objGestor);
			frame1.setLocationRelativeTo(null);
			frame1.setVisible(true);
			break;
		}
	}
}
