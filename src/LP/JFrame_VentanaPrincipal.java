package LP;

import javax.swing.JFrame;
import java.awt.EventQueue;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JLabel;


public class JFrame_VentanaPrincipal extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	private final String VISUALIZAR_COCHE = "visualizar_coche";
	
	public static void CargarVP() {
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JFrame_VentanaPrincipal ventanaprincipal = new JFrame_VentanaPrincipal();
					ventanaprincipal.setLocationRelativeTo(null);
					ventanaprincipal.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public JFrame_VentanaPrincipal() {
		
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Industria 4.0\\Desktop\\ProgramII\\ECLIPSE\\ProgramacionII\\Archivos gr\u00E1ficos\\iconfinder_magnifier_and_car_1421622.png"));
		setTitle("DESGUACE");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 793, 546);
		getContentPane().setLayout(null);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 777, 23);
		getContentPane().add(menuBar);
		
		JMenu MenuArchivo = new JMenu("Archivo");
		menuBar.add(MenuArchivo);
		
		JMenuItem CambiarOperario = new JMenuItem("Cambiar operario");
		MenuArchivo.add(CambiarOperario);
		
		JMenuItem EstadisticasDelDia = new JMenuItem("Estadisticas del dia");
		MenuArchivo.add(EstadisticasDelDia);
		
		JMenuItem Salir = new JMenuItem("Salir");
		MenuArchivo.add(Salir);
		
		JMenu Registros = new JMenu("Registros");
		menuBar.add(Registros);
		
		JMenuItem RegistrarCoche = new JMenuItem("Registrar coche");
		Registros.add(RegistrarCoche);
		
		JMenuItem RegistrarMoto = new JMenuItem("Registrar moto");
		Registros.add(RegistrarMoto);
		
		JMenuItem RegistrarCamion = new JMenuItem("Registrar camion");
		Registros.add(RegistrarCamion);
		
		JMenu Visualizar = new JMenu("Visualizar");
		menuBar.add(Visualizar);
		
		JMenuItem VisualizarCoche = new JMenuItem("Visualizar coches");
		VisualizarCoche.setActionCommand(VISUALIZAR_COCHE);
		VisualizarCoche.addActionListener(this);
		Visualizar.add(VisualizarCoche);
		
		JMenuItem VisualizarMotos = new JMenuItem("Visualizar motos");
		Visualizar.add(VisualizarMotos);
		
		JMenuItem VisualizarCamiones = new JMenuItem("Visualizar camiones");
		Visualizar.add(VisualizarCamiones);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Industria 4.0\\Desktop\\ProgramII\\ECLIPSE\\ProgramacionII\\Archivos gr\u00E1ficos\\desguace.jpg"));
		lblNewLabel.setBounds(0, 21, 777, 88);
		getContentPane().add(lblNewLabel);
	}
	
	public void actionPerformed(ActionEvent a) {
		
		switch(a.getActionCommand()) {
		
		case VISUALIZAR_COCHE:
			TablaMostrarCoches.CargarMC();
		
		}
	}
}
