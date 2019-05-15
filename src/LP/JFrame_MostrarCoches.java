package LP;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import Comun.itfProperty;
import LN.clsGestor;
import java.awt.Toolkit;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import javax.swing.JComboBox;

public class JFrame_MostrarCoches extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;

	private JPanel contentPane;
	private final String CARGAR_TABLA = "carga_tabla";

	private ArrayList<itfProperty> vehiculos;
	JTable table;
	JScrollPane scrolltabla;
	private int orden = 0;
	private clsGestor objGestor;
	JComboBox<String> comboOrdenar;

	public JFrame_MostrarCoches(clsGestor _objGestor) {
		
		objGestor = _objGestor;

		setIconImage(Toolkit.getDefaultToolkit().getImage(
				"C:\\Users\\Industria 4.0\\Desktop\\ProgramII\\ECLIPSE\\ProgramacionII\\Archivos gr\u00E1ficos\\iconfinder_magnifier_and_car_1421622.png"));

		setTitle("DESGUACE");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 793, 476);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(0, 0, 0, 0));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(
				"C:\\Users\\Industria 4.0\\Desktop\\ProgramII\\ECLIPSE\\ProgramacionII\\Archivos gr\u00E1ficos\\desguace.jpg"));
		lblNewLabel.setBounds(0, 0, 777, 57);
		contentPane.add(lblNewLabel);

		JButton boton = new JButton("Cargar Tabla");
		boton.setActionCommand(CARGAR_TABLA);
		boton.addActionListener(this);
		boton.setBounds(314, 74, 107, 23);
		contentPane.add(boton);
		
		JLabel lblOrdenarPor = new JLabel("Ordenar por:");
		lblOrdenarPor.setBounds(87, 78, 77, 14);
		contentPane.add(lblOrdenarPor);
		
		comboOrdenar = new JComboBox<String>();
		comboOrdenar.addItem("");
		comboOrdenar.addItem("Marca");
		comboOrdenar.addItem("Potencia(cv)");
		comboOrdenar.setBounds(174, 74, 84, 22);
		contentPane.add(comboOrdenar);
		
		CrearTabla();

	}

	public void actionPerformed(ActionEvent e) {

		switch (e.getActionCommand()) {

		case CARGAR_TABLA:
			
			int OrdenarIndex = comboOrdenar.getSelectedIndex();
			orden = OrdenarIndex;
			CrearTabla();
			
			break;
		}

	}

	public void CrearTabla() {
		
		vehiculos = objGestor.DameCoches(orden);

		table = null;

		ModeloTabla tcm = new ModeloTabla(vehiculos);

		table = new JTable(tcm);
		table.setPreferredScrollableViewportSize(new Dimension(500, 70));
		table.setFillsViewportHeight(true);
		table.setEnabled(true);
		table.setRowSelectionAllowed(true);
		tcm.fireTableDataChanged();

		scrolltabla = new JScrollPane(table);
		scrolltabla.setBounds(87, 128, 603, 164);
		getContentPane().add(scrolltabla);
		tcm.setData(vehiculos);
	}
}
