package LP;

import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JLabel;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;
import LN.clsGestor;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JToolBar;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import java.awt.Color;
import com.toedter.calendar.JDateChooser;
import static Comun.clsConstantes.*;
import Comun.itfProperty;

public class JDialog_AltaCoche extends JDialog implements ActionListener {

	public final String BOTON_GUARDAR = "BOTON_GUARDAR";
	public final String BOTOT_SALIR = "BOTON_SALIR";
	public final String BOTON_ATRAS = "BOTON_ATRAS";

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField numbastidor;
	private JTextField modelo;
	private JTextField cv;
	private JTextField cilindrada;
	private JTextField kilometros;
	private JTextField color;
	private JTextField valor;
	private ArrayList<itfProperty> tipocoche;
	private ArrayList<itfProperty> estados;
	private JComboBox<String> comboEstado;
	private JComboBox<String> comboTipo;
	private JComboBox<String> comboMarc;
	private JRadioButton gasolina;
	private JRadioButton diesel;
	private ButtonGroup combustible;
	private JList<String> list;
	private DefaultListModel<String> listModelo;
	private JDateChooser aniofabricacion;
	private clsGestor objGestor;
	private String operario;
	

	public JDialog_AltaCoche(clsGestor _objGestor, String _operario) {

		setResizable(false);

		operario = _operario;
		objGestor = _objGestor;

		setIconImage(Toolkit.getDefaultToolkit().getImage(
				"C:\\Users\\Industria 4.0\\Desktop\\ProgramII\\ECLIPSE\\ProgramacionII\\Archivos gr\u00E1ficos\\iconfinder_magnifier_and_car_1421622.png"));
		setTitle("DESGUACE - Registro de coche");
		setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 664, 411);
		contentPane = new JPanel();
		contentPane.setToolTipText("");
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JPanel panel_caracteristicas = new JPanel();
		panel_caracteristicas.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null),
				"Caracter\u00EDsticas", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 128)));
		panel_caracteristicas.setBackground(Color.WHITE);
		panel_caracteristicas.setBounds(10, 51, 627, 159);
		contentPane.add(panel_caracteristicas);
		panel_caracteristicas.setLayout(null);

		JLabel lblNBasridor = new JLabel("N\u00BA Bastidor:");
		lblNBasridor.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNBasridor.setBounds(37, 32, 66, 14);
		panel_caracteristicas.add(lblNBasridor);

		numbastidor = new JTextField();
		TextPrompt Ejnum = new TextPrompt("Ej: VKL234355VB", numbastidor);
		Ejnum.changeAlpha(0.75f);
		Ejnum.changeStyle(Font.ITALIC);
		Ejnum.setForeground(Color.LIGHT_GRAY);
		numbastidor.setBounds(108, 29, 124, 20);
		panel_caracteristicas.add(numbastidor);
		numbastidor.setColumns(10);

		JLabel lblNewLabel_1 = new JLabel("Marca:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1.setBounds(286, 32, 46, 14);
		panel_caracteristicas.add(lblNewLabel_1);

		comboMarc = new JComboBox<String>();
		comboMarc.setFont(new Font("Tahoma", Font.PLAIN, 11));
		comboMarc.setBounds(332, 28, 84, 22);
		panel_caracteristicas.add(comboMarc);
		comboMarc.setModel(new DefaultComboBoxModel<String>(new String[] { "Todos", "Audi", "Bmw", "Citroen", "Ferrari",
				"Ford", "Honda", "Kia", "Lexus", "Mercedes", "Mini", "Opel", "Volkswagen" }));

		JLabel lblModelo = new JLabel("Modelo:");
		lblModelo.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblModelo.setBounds(462, 32, 46, 14);
		panel_caracteristicas.add(lblModelo);

		modelo = new JTextField();
		modelo.setBounds(511, 29, 71, 20);
		panel_caracteristicas.add(modelo);
		modelo.setColumns(10);

		JLabel lblCv = new JLabel("Cv:");
		lblCv.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblCv.setBounds(241, 74, 31, 14);
		panel_caracteristicas.add(lblCv);

		cv = new JTextField();
		cv.setBounds(268, 71, 46, 20);
		panel_caracteristicas.add(cv);
		cv.setColumns(10);

		JLabel lblCilindrada = new JLabel("Cilindrada:");
		lblCilindrada.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblCilindrada.setBounds(37, 74, 61, 14);
		panel_caracteristicas.add(lblCilindrada);

		cilindrada = new JTextField();
		cilindrada.setBounds(101, 71, 86, 20);
		panel_caracteristicas.add(cilindrada);
		cilindrada.setColumns(10);

		JLabel lblKilmetros = new JLabel("Kil\u00F3metros:");
		lblKilmetros.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblKilmetros.setBounds(415, 115, 66, 14);
		panel_caracteristicas.add(lblKilmetros);

		kilometros = new JTextField();
		kilometros.setBounds(485, 112, 86, 20);
		panel_caracteristicas.add(kilometros);
		kilometros.setColumns(10);

		JLabel lblColor = new JLabel("Color:");
		lblColor.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblColor.setBounds(277, 115, 37, 14);
		panel_caracteristicas.add(lblColor);

		color = new JTextField();
		color.setBounds(314, 112, 61, 20);
		panel_caracteristicas.add(color);
		color.setColumns(10);

		JLabel lblCombustible = new JLabel("Combustible:");
		lblCombustible.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblCombustible.setBounds(369, 74, 86, 14);
		panel_caracteristicas.add(lblCombustible);

		gasolina = new JRadioButton("Gasolina");
		gasolina.setOpaque(false);
		gasolina.setContentAreaFilled(false);
		gasolina.setBorderPainted(false);
		gasolina.setFont(new Font("Tahoma", Font.PLAIN, 11));
		gasolina.setActionCommand("gasolina");
		gasolina.setBounds(458, 70, 71, 23);
		panel_caracteristicas.add(gasolina);

		diesel = new JRadioButton("Diesel");
		diesel.setOpaque(false);
		diesel.setContentAreaFilled(false);
		diesel.setBorderPainted(false);
		diesel.setFont(new Font("Tahoma", Font.PLAIN, 11));
		gasolina.setActionCommand("diesel");
		diesel.setBounds(531, 70, 61, 23);
		panel_caracteristicas.add(diesel);

		combustible = new ButtonGroup();
		combustible.add(diesel);
		combustible.add(gasolina);

		JLabel lblAoFabricacin = new JLabel("A\u00F1o Fabricaci\u00F3n:");
		lblAoFabricacin.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblAoFabricacin.setBounds(44, 115, 92, 14);
		panel_caracteristicas.add(lblAoFabricacin);

		aniofabricacion = new JDateChooser();
		aniofabricacion.setBounds(146, 112, 106, 20);
		panel_caracteristicas.add(aniofabricacion);

		JPanel panel_tasacion = new JPanel();
		panel_tasacion.setBackground(Color.WHITE);
		panel_tasacion.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null), "Tasaci\u00F3n",
				TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 128)));
		panel_tasacion.setBounds(10, 221, 307, 141);
		contentPane.add(panel_tasacion);
		panel_tasacion.setLayout(null);

		JLabel lblValor = new JLabel("Valor(\u20AC):");
		lblValor.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblValor.setBounds(20, 39, 52, 14);
		panel_tasacion.add(lblValor);

		valor = new JTextField();
		valor.setBounds(71, 36, 67, 20);
		panel_tasacion.add(valor);
		valor.setColumns(10);

		JLabel lblEstado = new JLabel("Estado:");
		lblEstado.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblEstado.setBounds(92, 95, 46, 14);
		panel_tasacion.add(lblEstado);

		estados = objGestor.DameEstados();
		comboEstado = new JComboBox<String>();
		comboEstado.setFont(new Font("Tahoma", Font.PLAIN, 11));
		for (itfProperty e : estados) {
			comboEstado.addItem((String) e.getProperty(PROPIEDAD_TIPOCOCHE_DESCRIPCION));
		}
		comboEstado.setBounds(139, 91, 72, 22);
		panel_tasacion.add(comboEstado);

		JLabel lblTipo = new JLabel("Tipo:");
		lblTipo.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblTipo.setBounds(173, 39, 38, 14);
		panel_tasacion.add(lblTipo);

		tipocoche = objGestor.DameTipoCoche();
		comboTipo = new JComboBox<String>();
		comboTipo.setFont(new Font("Tahoma", Font.PLAIN, 11));
		for (itfProperty t : tipocoche) {
			comboTipo.addItem((String) t.getProperty(PROPIEDAD_TIPOCOCHE_DESCRIPCION));
		}
		comboTipo.setBounds(204, 35, 77, 22);
		panel_tasacion.add(comboTipo);

		JToolBar toolBar = new JToolBar();
		toolBar.setBackground(Color.WHITE);
		toolBar.setBounds(0, 0, 648, 40);
		contentPane.add(toolBar);

		JButton BotonGuardar = new JButton("");
		BotonGuardar.setToolTipText("Insertar");
		BotonGuardar.setOpaque(false);
		BotonGuardar.setContentAreaFilled(false);
		BotonGuardar.setBorderPainted(false);
		BotonGuardar.setActionCommand(BOTON_GUARDAR);
		BotonGuardar.addActionListener(this);

		JButton BotonAtras = new JButton("");
		BotonAtras.setToolTipText("Atras");
		BotonAtras.setOpaque(false);
		BotonAtras.setContentAreaFilled(false);
		BotonAtras.setBorderPainted(false);
		BotonAtras.setActionCommand(BOTON_ATRAS);
		BotonAtras.addActionListener(this);
		BotonAtras.setIcon(new ImageIcon(
				"C:\\Users\\Industria 4.0\\Desktop\\ProgramII\\ECLIPSE\\ProgramacionII\\Archivos gr\u00E1ficos\\iconfinder_back_38976.png"));
		toolBar.add(BotonAtras);
		BotonGuardar.setIcon(new ImageIcon(
				"C:\\Users\\Industria 4.0\\Desktop\\ProgramII\\ECLIPSE\\ProgramacionII\\Archivos gr\u00E1ficos\\guardar.png"));
		toolBar.add(BotonGuardar);

		list = new JList<String>();
		list.setBackground(Color.WHITE);
		list.setBounds(19, 32, 299, 141);
		contentPane.add(list);
		list.setVisibleRowCount(4);
		listModelo = new DefaultListModel<String>();
		list.setModel(listModelo);

		JScrollPane scrollPane = new JScrollPane(list);
		scrollPane.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null), "Lista de Registros",
				TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 128)));
		scrollPane.setBounds(327, 221, 310, 141);
		contentPane.add(scrollPane);

		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Industria 4.0\\Desktop\\ProgramII\\ECLIPSE\\ProgramacionII\\Archivos gr\u00E1ficos\\desguace.jpg"));
		lblNewLabel.setBounds(0, 0, 648, 372);
		contentPane.add(lblNewLabel);

	}

	public void actionPerformed(ActionEvent e) {

		switch (e.getActionCommand()) {

		case BOTON_GUARDAR:

			try {

				/** Se recogen todos los datos de la venta introducidos por le usuario */
				String combustible1 = null;
				int idestado1;
				int idtipo1;
				String numbastidor1 = numbastidor.getText();
				String marca1 = (String) comboMarc.getSelectedItem();
				String modelo1 = modelo.getText();
				int cv1 = Integer.parseInt(cv.getText());
				int cilindrada1 = Integer.parseInt(cilindrada.getText());
				int kilometros1 = Integer.parseInt(kilometros.getText());
				String color1 = color.getText();
				Date aniofabricacion1 = aniofabricacion.getDate();
				int valor1 = Integer.parseInt(valor.getText());
				Date fecha1 = new Date();

				if (gasolina.isSelected()) {
					combustible1 = "gasolina";
				} else if (diesel.isSelected()) {
					combustible1 = "diesel";
				}

				int estadoIndex = comboEstado.getSelectedIndex();
				idestado1 = estadoIndex + 1;

				int tipoIndex = comboTipo.getSelectedIndex();
				idtipo1 = tipoIndex + 1;

				/** Se muestra el coche registrado en ese momento */
				listModelo.addElement("Nº Bastidor: " + numbastidor1 + ",   Marca: " + marca1 + ",   Modelo: " + modelo1
						+ ",   Valor: " + valor1);

				/**
				 * Funcion de la clase Gestor para introducir un coche en la bbdd y en el
				 * ArrayList
				 */
				try {
					objGestor.CrearCoche(numbastidor1, marca1, modelo1, cv1, aniofabricacion1, fecha1, color1,
							kilometros1, idtipo1, combustible1, cilindrada1, idestado1, valor1, operario);
				} catch (SQLException a) {
					JOptionPane.showInternalMessageDialog(null, "Ha habido un problema al registrar un coche");
				}

			} catch (Exception w) {
				JOptionPane.showInternalMessageDialog(null, "Rellene todos los campos correctamente");
			}

			numbastidor.setText(null);
			modelo.setText(null);
			cv.setText(null);
			aniofabricacion.setDate(null);
			color.setText(null);
			kilometros.setText(null);
			cilindrada.setText(null);
			combustible.clearSelection();
			valor.setText(null);

			break;

		case BOTON_ATRAS:

			/** Se cierra la venta */
			dispose();

		}
	}
}
