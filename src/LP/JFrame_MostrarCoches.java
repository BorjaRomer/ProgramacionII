package LP;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import Comun.clsConstantes;
import Comun.itfProperty;
import LN.clsGestor;
import java.awt.Toolkit;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;
import javax.swing.border.TitledBorder;


public class JFrame_MostrarCoches extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;

	private JPanel contentPane;

	private String[] nombreColumnas = { "Nº Bastidor", "Marca", "Modelo" };

	private ArrayList<itfProperty> vehiculos;
	private String[][] lista;

	private int orden = 1;
	private JTable table;

	public static void CargarMC() {

		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JFrame_MostrarCoches MostrarCoches = new JFrame_MostrarCoches();
					MostrarCoches.setLocationRelativeTo(null);
					MostrarCoches.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public JFrame_MostrarCoches() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(
				"C:\\Users\\Industria 4.0\\Desktop\\ProgramII\\ECLIPSE\\ProgramacionII\\Archivos gr\u00E1ficos\\iconfinder_magnifier_and_car_1421622.png"));

		setTitle("DESGUACE");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 793, 450);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(0, 0, 0, 0));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(
				"C:\\Users\\Industria 4.0\\Desktop\\ProgramII\\ECLIPSE\\ProgramacionII\\Archivos gr\u00E1ficos\\desguace.jpg"));
		lblNewLabel.setBounds(0, 0, 777, 50);
		contentPane.add(lblNewLabel);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBorder(new EmptyBorder(0, 0, 0, 0));
		scrollPane.setBounds(77, 89, 700, 251);
		contentPane.add(scrollPane);

		lista = new String[vehiculos.size()][3];
		
		lista = listaVehiculos();

		table = new JTable();
		table.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		table.setModel(new DefaultTableModel(lista, nombreColumnas));

		scrollPane.setViewportView(table);

	}

	public void actionPerformed(ActionEvent arg0) {

	}
	
	public String[][] listaVehiculos(){
		
		clsGestor objGestor = new clsGestor();
		vehiculos = objGestor.DameCoches(orden);
		
		String[][] lista1 = new String[vehiculos.size()][3];
		
		for(itfProperty v: vehiculos) {
		for (int i = 0; i < vehiculos.size(); i++) {
			
			lista1[i][0] = (String) v.getProperty(clsConstantes.PROPIEDAD_NUMBASTIDOR);
			lista1[i][0] = (String) v.getProperty(clsConstantes.PROPIEDAD_MARCA);
			lista1[i][0] = (String) v.getProperty(clsConstantes.PROPIEDAD_MODELO);
			
		}
		}
		
		return lista1;	
	}
}
