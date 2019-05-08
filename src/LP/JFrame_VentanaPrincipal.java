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


public class JFrame_VentanaPrincipal extends JFrame {

	private static final long serialVersionUID = 1L;
	
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
		CambiarOperario.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
				JFrame_Loging login = new JFrame_Loging();
				login.setLocationRelativeTo(null);
				login.setVisible(true);
			
			}
		});
		
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
		Visualizar.add(VisualizarCoche);
		VisualizarCoche.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				TablaMostrarCoches tabla = new TablaMostrarCoches();
				tabla.setLocationRelativeTo(null);
				tabla.setVisible(true);
			}
		});
		
		JMenuItem VisualizarMotos = new JMenuItem("Visualizar motos");
		Visualizar.add(VisualizarMotos);
		
		JMenuItem VisualizarCamiones = new JMenuItem("Visualizar camiones");
		Visualizar.add(VisualizarCamiones);
		Salir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Industria 4.0\\Desktop\\ProgramII\\ECLIPSE\\ProgramacionII\\Archivos gr\u00E1ficos\\desguace.jpg"));
		lblNewLabel.setBounds(0, 21, 777, 88);
		getContentPane().add(lblNewLabel);
	}
}
