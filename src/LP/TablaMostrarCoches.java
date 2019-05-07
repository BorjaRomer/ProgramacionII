package LP;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTable;
import javax.swing.JLabel;

import java.awt.BorderLayout;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JScrollPane;

import Comun.clsConstantes;
import Comun.itfProperty;
import LN.clsGestor;


public class TablaMostrarCoches extends JFrame {

	private static final long serialVersionUID = 1L;
	
	private JPanel contentPane;
	
	private String [] nombreColumnas = {"Nº Bastidor","Marca","Modelo","Potencia","Año Fabricación","Fecha regidtro","Color","Kilómetros","Tipo coche",
			"Combustible", "Cilindrada", "Estado"};
	
	private JTable table;
	
	private JScrollPane scrollPane;
	
	private ArrayList<itfProperty> vehiculos;
	
	private int orden;
	
	public TablaMostrarCoches() {
		
		clsGestor objGestor = new clsGestor();
		vehiculos = objGestor.DameCoches(orden);
		
		setTitle("DESGUACE");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 793, 450);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		table = new JTable();
		table.setBounds(45, 69, 683, 242);
		contentPane.add(table);
		
		DefaultTableModel tableModel = new DefaultTableModel();

		table.setLayout(new BorderLayout());
		tableModel.setColumnIdentifiers(nombreColumnas);
		Object[] fila = new Object[tableModel.getColumnCount()];
		for (int i = 0; i < vehiculos.size(); i++) {

			fila[0] = vehiculos.get(i).getProperty(clsConstantes.PROPIEDAD_NUMBASTIDOR);
			fila[1] = vehiculos.get(i).getProperty(clsConstantes.PROPIEDAD_MARCA);
			fila[2] = vehiculos.get(i).getProperty(clsConstantes.PROPIEDAD_MODELO);
			fila[3] = vehiculos.get(i).getProperty(clsConstantes.PROPIEDAD_CV);
			tableModel.addRow(fila);
		}
			
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Industria 4.0\\Desktop\\ProgramII\\ECLIPSE\\ProgramacionII\\Archivos gr\u00E1ficos\\desguace.jpg"));
		lblNewLabel.setBounds(0, 0, 777, 42);
		contentPane.add(lblNewLabel);
		
		scrollPane = new JScrollPane(table);
		scrollPane.setBounds(44, 75, 685, 243);
		contentPane.add(scrollPane);
	}
}
