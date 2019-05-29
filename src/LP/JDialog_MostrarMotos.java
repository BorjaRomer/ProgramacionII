package LP;

import static Comun.clsConstantes.*;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSeparator;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.JToolBar;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableCellRenderer;

import Comun.clsExcepcionPropia;
import Comun.itfProperty;
import LN.clsGestor;

public class JDialog_MostrarMotos extends JDialog implements ActionListener {

	private static final long serialVersionUID = 1L;

	private final String CARGAR_TABLA = "carga_tabla";
	private final String BOTON_VENDER = "boton_vender";
	private final String BOTON_ELIMINAR = "boton_eliminar";
	private final String BOTON_ATRAS = "boton_atras";
	private final String BOTON_INTERNAL_SALIR = "boton_internal_salir";
	private final String BOTON_INTERNAL_VENDER = "boton_internal_vender";

	private JPanel contentPane;
	private JInternalFrame internal_venta;
	private ArrayList<itfProperty> motos;
	private ArrayList<itfProperty> motos2;
	private ArrayList<itfProperty> tipomoto;
	private ArrayList<itfProperty> estados;
	private JTable table_1;
	private JScrollPane scrolltabla;
	private int orden = 0;
	private clsGestor objGestor;
	private JComboBox<String> comboOrdenar;
	private String marca;
	private int estado;
	private JSeparator separator;
	private JButton btnRecambio;
	private DefaultTableCellRenderer alinearCentro;
	private int fila;
	private String numbastidor;
	private JComboBox<String> comboMarc;
	private JComboBox<String> comboEstado;
	private ModeloTablaMotos tcm;
	private String operario;
	private JTextField textInPrecio;
	private JTextField textIndni;
	private JList<String> listInVenta;
	private DefaultListModel<String> listModelo;

	public JDialog_MostrarMotos(clsGestor _objGestor, String _operario) {

		setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);

		objGestor = _objGestor;
		operario = _operario;

		setIconImage(Toolkit.getDefaultToolkit().getImage(
				"C:\\Users\\Industria 4.0\\Desktop\\ProgramII\\ECLIPSE\\ProgramacionII\\Archivos gr\u00E1ficos\\iconfinder_magnifier_and_car_1421622.png"));
		setTitle("DESGUACE - Mostrar motos");
		setBounds(100, 100, 747, 436);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(0, 0, 0, 0));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JButton botonRecargar = new JButton("");
		botonRecargar.setIcon(new ImageIcon(
				"C:\\Users\\Industria 4.0\\Desktop\\ProgramII\\ECLIPSE\\ProgramacionII\\Archivos gr\u00E1ficos\\iconfinder_icons_reload_1564525 (1).png"));
		botonRecargar.setActionCommand(CARGAR_TABLA);
		botonRecargar.addActionListener(this);

		internal_venta = new JInternalFrame("DESGUACE - Venta de moto");
		internal_venta.setFont(new Font("Dialog", Font.PLAIN, 12));
		internal_venta.setFrameIcon(new ImageIcon(
				"C:\\Users\\Industria 4.0\\Desktop\\ProgramII\\ECLIPSE\\ProgramacionII\\Archivos gr\u00E1ficos\\iconfinder_magnifier_and_car_1421622.png"));
		internal_venta.setClosable(true);
		internal_venta.setBounds(152, 79, 427, 239);
		contentPane.add(internal_venta);
		internal_venta.setBorder(new LineBorder(new Color(0, 0, 0)));
		internal_venta.getContentPane().setLayout(null);

		JButton btnInVender = new JButton("");
		btnInVender.setIcon(new ImageIcon(
				"C:\\Users\\Industria 4.0\\Desktop\\ProgramII\\ECLIPSE\\ProgramacionII\\Archivos gr\u00E1ficos\\iconfinder_15_Tick_16x16_173960.png"));
		btnInVender.setActionCommand(BOTON_INTERNAL_VENDER);
		btnInVender.addActionListener(this);
		btnInVender.setBounds(322, 89, 55, 41);
		internal_venta.getContentPane().add(btnInVender);

		JButton btnInAtras = new JButton("");
		btnInAtras.setIcon(new ImageIcon(
				"C:\\Users\\Industria 4.0\\Desktop\\ProgramII\\ECLIPSE\\ProgramacionII\\Archivos gr\u00E1ficos\\cancelar.png"));
		btnInAtras.setActionCommand(BOTON_INTERNAL_SALIR);
		btnInAtras.addActionListener(this);
		btnInAtras.setBounds(322, 148, 55, 41);
		internal_venta.getContentPane().add(btnInAtras);

		JLabel lblPrecio = new JLabel("Precio final (\u20AC):");
		lblPrecio.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblPrecio.setBounds(64, 103, 86, 14);
		internal_venta.getContentPane().add(lblPrecio);

		textInPrecio = new JTextField();
		TextPrompt Ejnum = new TextPrompt("Ej: 5650.50", textInPrecio);
		Ejnum.changeAlpha(0.75f);
		Ejnum.changeStyle(Font.ITALIC);
		Ejnum.setForeground(Color.LIGHT_GRAY);
		textInPrecio.setBounds(160, 100, 86, 20);
		internal_venta.getContentPane().add(textInPrecio);
		textInPrecio.setColumns(10);

		JLabel lblndni = new JLabel("DNI Comprador:");
		lblndni.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblndni.setBounds(61, 151, 89, 14);
		internal_venta.getContentPane().add(lblndni);

		textIndni = new JTextField();
		textIndni.setBounds(160, 148, 86, 20);
		internal_venta.getContentPane().add(textIndni);
		textIndni.setColumns(10);

		listInVenta = new JList<String>();
		listInVenta.setFont(new Font("Tahoma", Font.ITALIC, 13));
		listInVenta.setBounds(26, 42, 362, 25);
		internal_venta.getContentPane().add(listInVenta);
		listModelo = new DefaultListModel<String>();
		listInVenta.setModel(listModelo);

		JLabel lblInTitulo = new JLabel("MOTO SELECCIONADA:");
		lblInTitulo.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblInTitulo.setBounds(26, 21, 169, 20);
		internal_venta.getContentPane().add(lblInTitulo);

		JLabel lblInFondo = new JLabel("");
		lblInFondo.setIcon(new ImageIcon(
				"C:\\Users\\Industria 4.0\\Desktop\\ProgramII\\ECLIPSE\\ProgramacionII\\Archivos gr\u00E1ficos\\line_horizontal_light_color-680270.jpg"));
		lblInFondo.setBounds(0, 0, 425, 223);
		internal_venta.getContentPane().add(lblInFondo);

		JToolBar toolBar = new JToolBar();
		toolBar.setBounds(0, 0, 777, 42);
		contentPane.add(toolBar);

		JButton btnAtras = new JButton();
		btnAtras.setActionCommand(BOTON_ATRAS);
		btnAtras.addActionListener(this);
		btnAtras.setOpaque(false);
		btnAtras.setContentAreaFilled(false);
		btnAtras.setBorderPainted(false);
		btnAtras.setIcon(new ImageIcon(
				"C:\\Users\\Industria 4.0\\Desktop\\ProgramII\\ECLIPSE\\ProgramacionII\\Archivos gr\u00E1ficos\\iconfinder_back_38976.png"));
		toolBar.add(btnAtras);
		botonRecargar.setBounds(604, 100, 77, 42);
		contentPane.add(botonRecargar);

		JLabel lblOrdenarPor = new JLabel("Ordenar por:");
		lblOrdenarPor.setBounds(209, 115, 77, 14);
		contentPane.add(lblOrdenarPor);

		comboOrdenar = new JComboBox<String>();
		comboOrdenar.addItem("Elige");
		comboOrdenar.addItem("Valor");
		comboOrdenar.addItem("Potencia(cv)");
		comboOrdenar.setBounds(286, 111, 84, 22);
		contentPane.add(comboOrdenar);

		JLabel lblMarca = new JLabel("Marca:");
		lblMarca.setBounds(37, 115, 46, 14);
		contentPane.add(lblMarca);

		comboMarc = new JComboBox<String>();
		comboMarc.setModel(new DefaultComboBoxModel<String>(new String[] { "Todos", "Beta", "Bmw", "Derbi", "Ducati",
				"GasGas", "Honda", "Huqsvarna", "Kawasaki", "Ktm", "Rieju", "Vespino" }));
		comboMarc.setBounds(80, 111, 84, 22);
		contentPane.add(comboMarc);

		JLabel lblEstado = new JLabel("Estado:");
		lblEstado.setBounds(421, 115, 46, 14);
		contentPane.add(lblEstado);

		estados = objGestor.DameEstados();
		comboEstado = new JComboBox<String>();
		comboEstado.setBounds(469, 111, 77, 22);
		comboEstado.addItem("Elige");
		for (itfProperty e : estados) {
			comboEstado.addItem((String) e.getProperty(PROPIEDAD_ESTADO_DESCRIPCION));
		}
		contentPane.add(comboEstado);

		JLabel lblEncontrarCoches = new JLabel("BUSQUEDA DE MOTOS");
		lblEncontrarCoches.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblEncontrarCoches.setBounds(263, 53, 204, 27);
		contentPane.add(lblEncontrarCoches);

		JLabel FondoSeparatorUp = new JLabel();
		FondoSeparatorUp.setIcon(new ImageIcon(
				"C:\\Users\\Industria 4.0\\Desktop\\ProgramII\\ECLIPSE\\ProgramacionII\\Archivos gr\u00E1ficos\\line_horizontal_light_color-680270.jpg"));
		FondoSeparatorUp.setVerticalAlignment(SwingConstants.TOP);
		FondoSeparatorUp.setFont(new Font("Tahoma", Font.BOLD, 14));
		FondoSeparatorUp.setForeground(Color.BLACK);
		FondoSeparatorUp.setBounds(0, 40, 731, 125);
		contentPane.add(FondoSeparatorUp);

		separator = new JSeparator();
		separator.setBounds(0, 166, 729, 231);
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
			marca = (String) comboMarc.getSelectedItem();
			estado = comboEstado.getSelectedIndex();
			CrearTabla();

			break;

		case BOTON_VENDER:

			fila = table_1.getSelectedRow();

			if (fila == -1) {

				JOptionPane.showInternalMessageDialog(null, "No has seleccionado ninguna moto");

			} else {

				numbastidor = (String) table_1.getValueAt(fila, 0);

				try {

					objGestor.comprobarVenta(numbastidor);
					internal_venta.setVisible(true);
					motos2 = objGestor.DameMotosv2();

					for (itfProperty m : motos2) {
						if (m.getProperty(PROPIEDAD_NUMBASTIDOR).equals(numbastidor)) {
							listModelo.addElement("------ " + m.getProperty(PROPIEDAD_MARCA) + " ------ "
									+ m.getProperty(PROPIEDAD_MODELO) + " ------ Tasación Inicial: "
									+ m.getProperty(PROPIEDAD_VALOR) + " ------");
							break;
						}
					}

				} catch (clsExcepcionPropia e1) {

					JOptionPane.showInternalMessageDialog(null, "Solo puedes vender vehiculos en estado optimo");
				}

			}

			break;

		case BOTON_ELIMINAR:

			fila = table_1.getSelectedRow();
			if (fila == -1) {
				JOptionPane.showInternalMessageDialog(null, "No has seleccionado ninguna moto");
			} else {
				numbastidor = (String) table_1.getValueAt(fila, 0);
				int respuesta = JOptionPane.showConfirmDialog(null, "¿Estas seguro de que quieres elimnarlo?");
				if (respuesta == 0) {
					try {
						objGestor.EliminarmotoBD(numbastidor);
						JOptionPane.showInternalMessageDialog(null, "Se ha eliminado correctamente");
						CrearTabla();
					} catch (SQLException e1) {
						e1.printStackTrace();
					}
				}
			}

			break;

		case BOTON_ATRAS:

			/** Se cierra la venta */
			dispose();
			break;
			
		case BOTON_INTERNAL_SALIR:

			internal_venta.dispose();
			listModelo.removeAllElements();
			break;

		case BOTON_INTERNAL_VENDER:

			try {

				double precio = Double.parseDouble(textInPrecio.getText());
				String dnicliente = textIndni.getText();
				String tipopedido = "Moto";

				try {

					objGestor.Crearpedido(precio, numbastidor, dnicliente, operario, tipopedido);
					JOptionPane.showInternalMessageDialog(null, "Vendido");
					internal_venta.dispose();
					objGestor.modificarEstadoMoto(numbastidor);

				} catch (SQLException e1) {
					JOptionPane.showInternalMessageDialog(null, "No se ha podido realizar la venta");
				}

			} catch (Exception a) {
				JOptionPane.showInternalMessageDialog(null, "Rellena todos los campos");
			}

			textInPrecio.setText(null);
			textIndni.setText(null);

			break;

		}

	}

	public void CrearTabla() {

		motos = objGestor.DameMotos(orden, marca, estado);
		tipomoto = objGestor.DameTipoMoto();

		tcm = new ModeloTablaMotos(motos, tipomoto);
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
		tcm.setData(motos, tipomoto);

		alinearCentro = new DefaultTableCellRenderer();
		alinearCentro.setHorizontalAlignment(SwingConstants.CENTER);
		for (int i = 0; i < 7; ++i) {
			table_1.getColumnModel().getColumn(i).setCellRenderer(alinearCentro);
		}

		JLabel FondoSeparatorDown = new JLabel("");
		FondoSeparatorDown.setIcon(new ImageIcon(
				"C:\\Users\\Industria 4.0\\Desktop\\ProgramII\\ECLIPSE\\ProgramacionII\\Archivos gr\u00E1ficos\\line_horizontal_light_color-680270.jpg"));
		FondoSeparatorDown.setBounds(0, 166, 731, 231);
		contentPane.add(FondoSeparatorDown);

	}
}
