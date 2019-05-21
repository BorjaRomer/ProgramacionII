package LP;

import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.ArrayList;
import Comun.itfProperty;
import LN.clsGestor;
import java.awt.Toolkit;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JTextField;
import javax.swing.JInternalFrame;
import javax.swing.border.LineBorder;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import javax.swing.table.DefaultTableCellRenderer;
import java.awt.Color;
import javax.swing.JSeparator;
import javax.swing.ImageIcon;
import javax.swing.JToolBar;
import javax.swing.SwingConstants;
import java.awt.Font;


public class JDialog_MostrarCoches extends JDialog implements ActionListener {

	private static final long serialVersionUID = 1L;

	private JPanel contentPane;
	private final String CARGAR_TABLA = "carga_tabla";
	private final String BOTON_VENDER = "boton_vender";
	private final String BOTON_ELIMINAR = "boton_eliminar";
	private final String BOTON_ATRAS = "boton_atras";

	private JInternalFrame internal_venta;
	private ArrayList<itfProperty> vehiculos;
	private JTable table_1;
	private JScrollPane scrolltabla;
	private int orden = 0;
	private clsGestor objGestor;
	private JComboBox<String> comboOrdenar;
	private JComboBox<String> comboMarca;
	private JTextField marca;
	private String marca1;
	private JSeparator separator;
	private JButton btnRecambio;
	private DefaultTableCellRenderer alinearCentro;
	private JTextField PRUEBA;
	private int fila;
	private String numbastidor;

	public JDialog_MostrarCoches(clsGestor _objGestor) {

		objGestor = _objGestor;

		setIconImage(Toolkit.getDefaultToolkit().getImage(
				"C:\\Users\\Industria 4.0\\Desktop\\ProgramII\\ECLIPSE\\ProgramacionII\\Archivos gr\u00E1ficos\\iconfinder_magnifier_and_car_1421622.png"));
		setTitle("DESGUACE - Mostrar coches");
		setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 747, 436);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(0, 0, 0, 0));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JButton boton = new JButton("");
		boton.setIcon(new ImageIcon(
				"C:\\Users\\Industria 4.0\\Desktop\\ProgramII\\ECLIPSE\\ProgramacionII\\Archivos gr\u00E1ficos\\iconfinder_icons_reload_1564525 (1).png"));
		boton.setActionCommand(CARGAR_TABLA);
		boton.addActionListener(this);

		internal_venta = new JInternalFrame("DESGUACE - Venta de coche");
		BasicInternalFrameUI bi = (BasicInternalFrameUI)internal_venta.getUI();
		bi.setNorthPane(null);
		internal_venta.setBounds(212, 73, 301, 127);
		contentPane.add(internal_venta);
		internal_venta.setBorder(new LineBorder(new Color(0, 0, 0)));
		internal_venta.getContentPane().setLayout(null);

		PRUEBA = new JTextField();
		PRUEBA.setBounds(64, 27, 86, 20);
		internal_venta.getContentPane().add(PRUEBA);
		PRUEBA.setColumns(10);

		JToolBar toolBar = new JToolBar();
		toolBar.setBounds(0, 0, 777, 42);
		contentPane.add(toolBar);

		JButton btnAtras = new JButton();
		btnAtras.setActionCommand(BOTON_ATRAS);
		btnAtras.addActionListener(this);
		btnAtras.setIcon(new ImageIcon(
				"C:\\Users\\Industria 4.0\\Desktop\\ProgramII\\ECLIPSE\\ProgramacionII\\Archivos gr\u00E1ficos\\iconfinder_back_38976.png"));
		toolBar.add(btnAtras);
		boton.setBounds(600, 99, 77, 42);
		contentPane.add(boton);

		JLabel lblOrdenarPor = new JLabel("Ordenar por:");
		lblOrdenarPor.setBounds(214, 115, 77, 14);
		contentPane.add(lblOrdenarPor);

		comboOrdenar = new JComboBox<String>();
		comboOrdenar.addItem("");
		comboOrdenar.addItem("Valor");
		comboOrdenar.addItem("Potencia(cv)");
		comboOrdenar.setBounds(286, 111, 84, 22);
		contentPane.add(comboOrdenar);

		JLabel lblMarca = new JLabel("Marca:");
		lblMarca.setBounds(41, 115, 46, 14);
		contentPane.add(lblMarca);

		marca = new JTextField();
		marca.setBounds(83, 112, 77, 20);
		contentPane.add(marca);
		marca.setColumns(10);

		JLabel lblEstado = new JLabel("Estado:");
		lblEstado.setBounds(425, 115, 46, 14);
		contentPane.add(lblEstado);

		JComboBox comboEstado = new JComboBox();
		comboEstado.setBounds(469, 111, 77, 22);
		contentPane.add(comboEstado);

		JLabel lblEncontrarCoches = new JLabel("ENCONTRAR COCHES POR:");
		lblEncontrarCoches.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblEncontrarCoches.setBounds(263, 53, 204, 27);
		contentPane.add(lblEncontrarCoches);

		JLabel lblNewLabel = new JLabel();
		lblNewLabel.setIcon(new ImageIcon(
				"C:\\Users\\Industria 4.0\\Desktop\\ProgramII\\ECLIPSE\\ProgramacionII\\Archivos gr\u00E1ficos\\line_horizontal_light_color-680270.jpg"));
		lblNewLabel.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel.setForeground(Color.BLACK);
		lblNewLabel.setBounds(0, 40, 731, 125);
		contentPane.add(lblNewLabel);

		separator = new JSeparator();
		separator.setBounds(2, 166, 729, 231);
		contentPane.add(separator);

		JButton btnEliminar = new JButton("");
		btnEliminar.setActionCommand(BOTON_ELIMINAR);
		btnEliminar.addActionListener(this);
		btnEliminar.setIcon(new ImageIcon(
				"C:\\Users\\Industria 4.0\\Desktop\\ProgramII\\ECLIPSE\\ProgramacionII\\Archivos gr\u00E1ficos\\iconfinder_miscellaneous-30_809419.png"));
		btnEliminar.setBounds(623, 255, 89, 42);
		contentPane.add(btnEliminar);

		JButton btnVender = new JButton("");
		btnVender.setIcon(new ImageIcon(
				"C:\\Users\\Industria 4.0\\Desktop\\ProgramII\\ECLIPSE\\ProgramacionII\\Archivos gr\u00E1ficos\\iconfinder_buy_2639786.png"));
		btnVender.setActionCommand(BOTON_VENDER);
		btnVender.addActionListener(this);
		btnVender.setBounds(623, 202, 89, 42);
		contentPane.add(btnVender);

		btnRecambio = new JButton("");
		btnRecambio.setIcon(new ImageIcon(
				"C:\\Users\\Industria 4.0\\Desktop\\ProgramII\\ECLIPSE\\ProgramacionII\\Archivos gr\u00E1ficos\\iconfinder_BT_c3tool_905663.png"));
		btnRecambio.setBounds(623, 308, 89, 48);
		contentPane.add(btnRecambio);

		this.setResizable(false);

		CrearTabla();

	}

	public void actionPerformed(ActionEvent e) {

		switch (e.getActionCommand()) {

		case CARGAR_TABLA:

			int OrdenarIndex = comboOrdenar.getSelectedIndex();
			orden = OrdenarIndex;
			marca1 = marca.getText();
			CrearTabla();
			break;

		case BOTON_VENDER:

			internal_venta.setVisible(true);
			fila = table_1.getSelectedRow();
			numbastidor = (String) table_1.getValueAt(fila, 0);

			break;
			
		case BOTON_ELIMINAR:
			
			fila = table_1.getSelectedRow();
			if (fila == -1) {
				JOptionPane.showMessageDialog(null, "No has escogido ninguna fila");
			}else {
				numbastidor = (String) table_1.getValueAt(fila, 0);
				int respuesta = JOptionPane.showConfirmDialog(null, "¿Estas seguro de que quieres elimnar el coche?");
				if(respuesta == 0) {
					try {
						objGestor.EliminarcocheBD(numbastidor);
					} catch (SQLException e1) {
						e1.printStackTrace();
					}
				}
			}
			

		case BOTON_ATRAS:

			/** Se cierra la venta */
			dispose();

		}

	}

	public void CrearTabla() {

		vehiculos = objGestor.DameCoches(orden, marca1);

		ModeloTabla tcm = new ModeloTabla(vehiculos);
		tcm.fireTableDataChanged();
		table_1 = new JTable(tcm);
		table_1.setFont(new Font("Tahoma", Font.ITALIC, 11));
		table_1.setPreferredScrollableViewportSize(new Dimension(500, 70));
		table_1.setFillsViewportHeight(true);
		table_1.setEnabled(true);
		table_1.setRowSelectionAllowed(true);

		scrolltabla = new JScrollPane(table_1);
		scrolltabla.setBounds(23, 191, 571, 173);
		getContentPane().add(scrolltabla);
		tcm.setData(vehiculos);

		alinearCentro = new DefaultTableCellRenderer();
		alinearCentro.setHorizontalAlignment(SwingConstants.CENTER);
		for (int i = 0; i < 7; ++i) {
			table_1.getColumnModel().getColumn(i).setCellRenderer(alinearCentro);
		}
	}
}
