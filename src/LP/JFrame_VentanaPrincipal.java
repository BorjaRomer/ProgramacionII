package LP;

import javax.swing.JFrame;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import LN.clsGestor;
import java.awt.Font;
import javax.swing.JTabbedPane;
import javax.swing.JPanel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.border.BevelBorder;
import java.awt.Toolkit;
import javax.swing.SwingConstants;

/*
 * Clase de interfaz gráfica que es la principal del programa
 */
public class JFrame_VentanaPrincipal extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	private final String VISUALIZAR_COCHE = "visualizar_coche";
	private final String VISUALIZAR_CAMION = "visualizar_camion";
	private final String VISUALIZAR_MOTO = "visualizar_moto";
	private final String REGISTRAR_COCHE = "registrar_coche";
	private final String REGISTRAR_MOTO = "registrar_moto";
	private final String REGISTRAR_CAMION = "registrar_camion";
	private final String CAMBIAR_OPERARIO = "cambiar_operario";
	private final String ITEM_SALIR = "item_salir";
	private clsGestor objGestor;
	private String operario;
	
	/*
	 * Constructor
	 */
	public JFrame_VentanaPrincipal(clsGestor _objGestor, String _operario) {
		setIconImage(Toolkit.getDefaultToolkit().getImage(JFrame_VentanaPrincipal.class.getResource("/Data/icono.png")));
		setResizable(false);
	
		objGestor = _objGestor;
		
		operario = _operario;
		
		setTitle("DESGUACE");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 802, 493);
		getContentPane().setLayout(null);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 786, 29);
		getContentPane().add(menuBar);
		
		JMenu MenuArchivo = new JMenu("Archivo");
		MenuArchivo.setFont(new Font("Segoe UI", Font.BOLD, 12));
		menuBar.add(MenuArchivo);
		
		JMenuItem CambiarOperario = new JMenuItem("Cambiar operario");
		CambiarOperario.setIcon(new ImageIcon(JFrame_VentanaPrincipal.class.getResource("/Data/iconfinder_88_111104.png")));
		CambiarOperario.setActionCommand(CAMBIAR_OPERARIO);
		CambiarOperario.addActionListener(this);
		MenuArchivo.add(CambiarOperario);
		
		JMenuItem Salir = new JMenuItem("Salir");
		Salir.setIcon(new ImageIcon(JFrame_VentanaPrincipal.class.getResource("/Data/iconfinder_exit-enter-leave-in-door_2931187.png")));
		Salir.setActionCommand(ITEM_SALIR);
		Salir.addActionListener(this);
		MenuArchivo.add(Salir);
		
		JMenu Registros = new JMenu("Registros");
		Registros.setFont(new Font("Segoe UI", Font.BOLD, 12));
		menuBar.add(Registros);
		
		JMenuItem RegistrarCoche = new JMenuItem("Registrar coche");
		RegistrarCoche.setIcon(new ImageIcon(JFrame_VentanaPrincipal.class.getResource("/Data/iconfinder_icons_paste_1564521.png")));
		RegistrarCoche.setActionCommand(REGISTRAR_COCHE);
		RegistrarCoche.addActionListener(this);
		Registros.add(RegistrarCoche);
		
		JMenuItem RegistrarMoto = new JMenuItem("Registrar moto");
		RegistrarMoto.setIcon(new ImageIcon(JFrame_VentanaPrincipal.class.getResource("/Data/iconfinder_icons_paste_1564521.png")));
		RegistrarMoto.setActionCommand(REGISTRAR_MOTO);
		RegistrarMoto.addActionListener(this);
		Registros.add(RegistrarMoto);
		
		JMenuItem RegistrarCamion = new JMenuItem("Registrar camion");
		RegistrarCamion.setIcon(new ImageIcon(JFrame_VentanaPrincipal.class.getResource("/Data/iconfinder_icons_paste_1564521.png")));
		RegistrarCamion.setActionCommand(REGISTRAR_CAMION);
		RegistrarCamion.addActionListener(this);
		Registros.add(RegistrarCamion);
		
		JMenu Visualizar = new JMenu("Visualizar");
		Visualizar.setFont(new Font("Segoe UI", Font.BOLD, 12));
		menuBar.add(Visualizar);
		
		JMenuItem VisualizarCoche = new JMenuItem("Visualizar coches");
		VisualizarCoche.setIcon(new ImageIcon(JFrame_VentanaPrincipal.class.getResource("/Data/iconfinder_67_111124.png")));
		VisualizarCoche.setActionCommand(VISUALIZAR_COCHE);
		VisualizarCoche.addActionListener(this);
		Visualizar.add(VisualizarCoche);
		
		JMenuItem VisualizarMotos = new JMenuItem("Visualizar motos");
		VisualizarMotos.setIcon(new ImageIcon(JFrame_VentanaPrincipal.class.getResource("/Data/iconfinder_67_111124.png")));
		VisualizarMotos.setActionCommand(VISUALIZAR_MOTO);
		VisualizarMotos.addActionListener(this);
		Visualizar.add(VisualizarMotos);
		
		JMenuItem VisualizarCamiones = new JMenuItem("Visualizar camiones");
		VisualizarCamiones.setIcon(new ImageIcon(JFrame_VentanaPrincipal.class.getResource("/Data/iconfinder_67_111124.png")));
		VisualizarCamiones.setActionCommand(VISUALIZAR_CAMION);
		VisualizarCamiones.addActionListener(this);
		Visualizar.add(VisualizarCamiones);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.LEFT);
		tabbedPane.setBounds(0, 27, 786, 427);
		getContentPane().add(tabbedPane);
		
		JPanel panel_1 = new JPanel();
		panel_1.setForeground(Color.BLACK);
		tabbedPane.addTab("FUNCIONES", new ImageIcon(JFrame_VentanaPrincipal.class.getResource("/Data/icono.png")), panel_1, null);
		panel_1.setLayout(null);
		
		JButton btnRegCoche = new JButton("");
		btnRegCoche.setActionCommand(REGISTRAR_COCHE);
		btnRegCoche.addActionListener(this);
		btnRegCoche.setToolTipText("Insertar coche");
		btnRegCoche.setIcon(new ImageIcon(JFrame_VentanaPrincipal.class.getResource("/Data/Registro coche t.png")));
		btnRegCoche.setOpaque(false);
		btnRegCoche.setContentAreaFilled(false);
		btnRegCoche.setBorderPainted(false);
		btnRegCoche.setBounds(22, 81, 182, 112);
		panel_1.add(btnRegCoche);
		
		JButton btnReCamion = new JButton("");
		btnReCamion.setActionCommand(REGISTRAR_CAMION);
		btnReCamion.addActionListener(this);
		btnReCamion.setToolTipText("Insertar camion");
		btnReCamion.setOpaque(false);
		btnReCamion.setContentAreaFilled(false);
		btnReCamion.setBorderPainted(false);
		btnReCamion.setIcon(new ImageIcon(JFrame_VentanaPrincipal.class.getResource("/Data/Registro cami\u00F3n t.png")));
		btnReCamion.setBounds(237, 81, 182, 112);
		panel_1.add(btnReCamion);
		
		JButton btnReMoto = new JButton("");
		btnReMoto.setActionCommand(REGISTRAR_MOTO);
		btnReMoto.addActionListener(this);
		btnReMoto.setToolTipText("Insertar moto");
		btnReMoto.setOpaque(false);
		btnReMoto.setContentAreaFilled(false);
		btnReMoto.setBorderPainted(false);
		btnReMoto.setHorizontalTextPosition(SwingConstants.CENTER);
		btnReMoto.setIcon(new ImageIcon(JFrame_VentanaPrincipal.class.getResource("/Data/Registro moto t.png")));
		btnReMoto.setBounds(452, 93, 182, 112);
		panel_1.add(btnReMoto);
		
		JLabel titulo1 = new JLabel("REGISTRO DE VEH\u00EDCULOS");
		titulo1.setForeground(new Color(0, 0, 128));
		titulo1.setFont(new Font("Tahoma", Font.BOLD, 21));
		titulo1.setBounds(182, 19, 276, 26);
		panel_1.add(titulo1);
		
		JLabel fondoRe = new JLabel("");
		fondoRe.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		fondoRe.setIcon(new ImageIcon(JFrame_VentanaPrincipal.class.getResource("/Data/free-vector-texturas-background.jpg")));
		fondoRe.setBounds(0, 0, 657, 216);
		panel_1.add(fondoRe);
		
		JButton btnBuCoche = new JButton("");
		btnBuCoche.setActionCommand(VISUALIZAR_COCHE);
		btnBuCoche.addActionListener(this);
		btnBuCoche.setToolTipText("Buscar coches");
		btnBuCoche.setOpaque(false);
		btnBuCoche.setContentAreaFilled(false);
		btnBuCoche.setBorderPainted(false);
		btnBuCoche.setIcon(new ImageIcon(JFrame_VentanaPrincipal.class.getResource("/Data/B\u00FAsqueda coche t.png")));
		btnBuCoche.setBounds(22, 299, 182, 112);
		panel_1.add(btnBuCoche);
		
		JButton btnBuCamion = new JButton("");
		btnBuCamion.setActionCommand(VISUALIZAR_CAMION);
		btnBuCamion.addActionListener(this);
		btnBuCamion.setToolTipText("Buscar camiones");
		btnBuCamion.setOpaque(false);
		btnBuCamion.setContentAreaFilled(false);
		btnBuCamion.setBorderPainted(false);
		btnBuCamion.setIcon(new ImageIcon(JFrame_VentanaPrincipal.class.getResource("/Data/B\u00FAsqueda cami\u00F3n t.png")));
		btnBuCamion.setBounds(237, 299, 182, 112);
		panel_1.add(btnBuCamion);
		
		JButton btnBuMoto = new JButton("");
		btnBuMoto.setActionCommand(VISUALIZAR_MOTO);
		btnBuMoto.addActionListener(this);
		btnBuMoto.setToolTipText("Buscar motos");
		btnBuMoto.setOpaque(false);
		btnBuMoto.setContentAreaFilled(false);
		btnBuMoto.setBorderPainted(false);
		btnBuMoto.setIcon(new ImageIcon(JFrame_VentanaPrincipal.class.getResource("/Data/B\u00FAsqueda moto t.png")));
		btnBuMoto.setBounds(452, 299, 182, 112);
		panel_1.add(btnBuMoto);
		
		JLabel titulo2 = new JLabel("B\u00FASQUEDA DE VEH\u00EDCULOS");
		titulo2.setForeground(new Color(0, 0, 128));
		titulo2.setFont(new Font("Tahoma", Font.BOLD, 21));
		titulo2.setBounds(175, 240, 283, 26);
		panel_1.add(titulo2);
		
		JLabel fondoBu = new JLabel("");
		fondoBu.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		fondoBu.setIcon(new ImageIcon(JFrame_VentanaPrincipal.class.getResource("/Data/free-vector-texturas-background.jpg")));
		fondoBu.setBounds(0, 216, 657, 206);
		panel_1.add(fondoBu);
		
		JPanel panel = new JPanel();
		tabbedPane.addTab("ESTADISTICAS", new ImageIcon(JFrame_VentanaPrincipal.class.getResource("/Data/iconfinder_advantage_diagram_1034357.png")), panel, null);
		panel.setLayout(null);
	
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
			
		case ITEM_SALIR:
			System.exit(0);
		
			/** Se abre la ventana para mostrar los coches */
		case VISUALIZAR_COCHE:
			JDialog_MostrarCoches mostrarCoche = new JDialog_MostrarCoches(objGestor, operario);
			mostrarCoche.setModal(true);
			mostrarCoche.setLocationRelativeTo(null);
			mostrarCoche.setVisible(true);
			break;
			
			/** Se abre la ventana para mostrar los camiones */
		case VISUALIZAR_CAMION:
			JDialog_MostrarCamiones mostrarCamion = new JDialog_MostrarCamiones(objGestor, operario);
			mostrarCamion.setModal(true);
			mostrarCamion.setLocationRelativeTo(null);
			mostrarCamion.setVisible(true);
			break;
			
			/** Se abre la ventana para mostrar las motos */
		case VISUALIZAR_MOTO:
			JDialog_MostrarMotos mostrarMoto = new JDialog_MostrarMotos(objGestor, operario);
			mostrarMoto.setModal(true);
			mostrarMoto.setLocationRelativeTo(null);
			mostrarMoto.setVisible(true);
			break;
			
			/** Se abre la ventana para registrar un coche */
		case REGISTRAR_COCHE:
			JDialog_AltaCoche registrarCoche = new JDialog_AltaCoche(objGestor, operario);
			registrarCoche.setModal(true);
			registrarCoche.setLocationRelativeTo(null);
			registrarCoche.setVisible(true);
			break;
			
			/** Se abre la ventana para registrar una moto */
		case REGISTRAR_MOTO:
			JDialog_AltaMoto registrarMoto = new JDialog_AltaMoto(objGestor, operario);
			registrarMoto.setModal(true);
			registrarMoto.setLocationRelativeTo(null);
			registrarMoto.setVisible(true);
			break;
			
			/** Se abre la ventana para registrar un camion */
		case REGISTRAR_CAMION:
			JDialog_AltaCamion registrarCamion = new JDialog_AltaCamion(objGestor, operario);
			registrarCamion.setModal(true);
			registrarCamion.setLocationRelativeTo(null);
			registrarCamion.setVisible(true);
			break;
		}
	}
}
