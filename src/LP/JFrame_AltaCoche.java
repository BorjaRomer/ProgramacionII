package LP;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.Date;
import javax.swing.JLabel;
import javax.swing.ButtonGroup;
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
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import java.awt.Color;

public class JFrame_AltaCoche extends JFrame implements ActionListener {

	public final String BOTON_GUARDAR = "BOTON_GUARDAR";
	public final String BOTOT_SALIR = "BOTON_SALIR";
	public final String BOTON_ATRAS = "BOTON_ATRAS";

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField numbastidor;
	private JTextField marca;
	private JTextField modelo;
	private JTextField cv;
	private JTextField cilindrada;
	private JTextField kilometros;
	private JTextField color;
	private JTextField aniofabricacion;
	private JTextField valor;
	JComboBox<String> comboEstado;
	JComboBox<String> comboTipo;
	JRadioButton gasolina;
	JRadioButton diesel;
	ButtonGroup combustible;
	JList<String> list;
	DefaultListModel<String> listModelo;
	clsGestor objGestor;

	public JFrame_AltaCoche(clsGestor _objGestor) {
		
		/**
		 * Se recibe el objGestor creado al inicio de la aplicacion porque es el objeto
		 * que recoge todos los datos de la bbdd y los guarda en los ArrayList
		 */
		objGestor = _objGestor;
		
		setIconImage(Toolkit.getDefaultToolkit().getImage(
				"C:\\Users\\Industria 4.0\\Desktop\\ProgramII\\ECLIPSE\\ProgramacionII\\Archivos gr\u00E1ficos\\iconfinder_magnifier_and_car_1421622.png"));
		setTitle("DESGUACE - Registro de coche");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 664, 411);
		contentPane = new JPanel();
		contentPane.setToolTipText("");
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null), "Caracter\u00EDsticas", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 128)));
		panel.setBackground(Color.WHITE);
		panel.setBounds(10, 51, 627, 159);
		contentPane.add(panel);
		panel.setLayout(null);

		JLabel lblNBasridor = new JLabel("N\u00BA Bastidor:");
		lblNBasridor.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNBasridor.setBounds(37, 32, 66, 14);
		panel.add(lblNBasridor);

		numbastidor = new JTextField();
		TextPrompt pepe = new TextPrompt("Ej: VKL234355VB", numbastidor);
		pepe.changeAlpha(0.75f);
		pepe.changeStyle(Font.ITALIC);
		pepe.setForeground(Color.LIGHT_GRAY);
		numbastidor.setBounds(108, 29, 124, 20);
		panel.add(numbastidor);
		numbastidor.setColumns(10);

		JLabel lblNewLabel_1 = new JLabel("Marca:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1.setBounds(286, 32, 46, 14);
		panel.add(lblNewLabel_1);

		marca = new JTextField();
		marca.setBounds(330, 29, 71, 20);
		panel.add(marca);
		marca.setColumns(10);

		JLabel lblModelo = new JLabel("Modelo:");
		lblModelo.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblModelo.setBounds(462, 32, 46, 14);
		panel.add(lblModelo);

		modelo = new JTextField();
		modelo.setBounds(511, 29, 71, 20);
		panel.add(modelo);
		modelo.setColumns(10);

		JLabel lblCv = new JLabel("Cv:");
		lblCv.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblCv.setBounds(241, 74, 31, 14);
		panel.add(lblCv);

		cv = new JTextField();
		cv.setBounds(268, 71, 46, 20);
		panel.add(cv);
		cv.setColumns(10);

		JLabel lblCilindrada = new JLabel("Cilindrada:");
		lblCilindrada.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblCilindrada.setBounds(37, 74, 61, 14);
		panel.add(lblCilindrada);

		cilindrada = new JTextField();
		cilindrada.setBounds(101, 71, 86, 20);
		panel.add(cilindrada);
		cilindrada.setColumns(10);

		JLabel lblKilmetros = new JLabel("Kil\u00F3metros:");
		lblKilmetros.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblKilmetros.setBounds(402, 115, 66, 14);
		panel.add(lblKilmetros);

		kilometros = new JTextField();
		kilometros.setBounds(474, 112, 86, 20);
		panel.add(kilometros);
		kilometros.setColumns(10);

		JLabel lblColor = new JLabel("Color:");
		lblColor.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblColor.setBounds(268, 115, 37, 14);
		panel.add(lblColor);

		color = new JTextField();
		color.setBounds(307, 112, 61, 20);
		panel.add(color);
		color.setColumns(10);

		JLabel lblCombustible = new JLabel("Combustible:");
		lblCombustible.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblCombustible.setBounds(369, 74, 86, 14);
		panel.add(lblCombustible);

		gasolina = new JRadioButton("Gasolina");
		gasolina.setOpaque(false);
		gasolina.setContentAreaFilled(false);
		gasolina.setBorderPainted(false);
		gasolina.setFont(new Font("Tahoma", Font.PLAIN, 11));
		gasolina.setActionCommand("gasolina");
		gasolina.setBounds(458, 70, 71, 23);
		panel.add(gasolina);

		diesel = new JRadioButton("Diesel");
		diesel.setOpaque(false);
		diesel.setContentAreaFilled(false);
		diesel.setBorderPainted(false);
		diesel.setFont(new Font("Tahoma", Font.PLAIN, 11));
		gasolina.setActionCommand("diesel");
		diesel.setBounds(531, 70, 61, 23);
		panel.add(diesel);

		combustible = new ButtonGroup();
		combustible.add(diesel);
		combustible.add(gasolina);

		JLabel lblAoFabricacin = new JLabel("A\u00F1o Fabricaci\u00F3n:");
		lblAoFabricacin.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblAoFabricacin.setBounds(44, 115, 92, 14);
		panel.add(lblAoFabricacin);

		aniofabricacion = new JTextField();
		aniofabricacion.setBounds(146, 112, 86, 20);
		panel.add(aniofabricacion);
		aniofabricacion.setColumns(10);

		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.WHITE);
		panel_1.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null), "Tasaci\u00F3n", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 128)));
		panel_1.setBounds(10, 221, 307, 141);
		contentPane.add(panel_1);
		panel_1.setLayout(null);

		JLabel lblValor = new JLabel("Valor(\u20AC):");
		lblValor.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblValor.setBounds(20, 39, 52, 14);
		panel_1.add(lblValor);

		valor = new JTextField();
		valor.setBounds(71, 36, 67, 20);
		panel_1.add(valor);
		valor.setColumns(10);

		JLabel lblEstado = new JLabel("Estado:");
		lblEstado.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblEstado.setBounds(92, 95, 46, 14);
		panel_1.add(lblEstado);

		comboEstado = new JComboBox<String>();
		comboEstado.setFont(new Font("Tahoma", Font.PLAIN, 11));
		comboEstado.addItem("Optimo");
		comboEstado.addItem("Despiece");
		comboEstado.addItem("Chatarra");
		comboEstado.addItem("Venta");
		comboEstado.setBounds(139, 91, 72, 22);
		panel_1.add(comboEstado);

		JLabel lblTipo = new JLabel("Tipo:");
		lblTipo.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblTipo.setBounds(173, 39, 38, 14);
		panel_1.add(lblTipo);

		comboTipo = new JComboBox<String>();
		comboTipo.setFont(new Font("Tahoma", Font.PLAIN, 11));
		comboTipo.addItem("Deportivo");
		comboTipo.addItem("Todoterreno");
		comboTipo.addItem("Monovolumen");
		comboTipo.addItem("Electrico");
		comboTipo.setBounds(204, 35, 77, 22);
		panel_1.add(comboTipo);

		JToolBar toolBar = new JToolBar();
		toolBar.setBackground(Color.WHITE);
		toolBar.setBounds(0, 0, 720, 40);
		contentPane.add(toolBar);

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

		JButton BotonGuardar = new JButton("");
		BotonGuardar.setToolTipText("Insertar");
		BotonGuardar.setOpaque(false);
		BotonGuardar.setContentAreaFilled(false);
		BotonGuardar.setBorderPainted(false);
		BotonGuardar.setActionCommand(BOTON_GUARDAR);
		BotonGuardar.addActionListener(this);
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
		scrollPane.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null), "Lista de Registros", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 128)));
		scrollPane.setBounds(327, 221, 310, 141);
		contentPane.add(scrollPane);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Industria 4.0\\Desktop\\ProgramII\\ECLIPSE\\ProgramacionII\\Archivos gr\u00E1ficos\\desguace.jpg"));
		lblNewLabel.setBounds(0, 40, 720, 384);
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
				String marca1 = marca.getText();
				String modelo1 = modelo.getText();
				int cv1 = Integer.parseInt(cv.getText());
				String cilindrada1 = cilindrada.getText();
				int kilometros1 = Integer.parseInt(kilometros.getText());
				String color1 = color.getText();
				int aniofabricacion1 = Integer.parseInt(aniofabricacion.getText());
				int valor1 = Integer.parseInt(valor.getText());
				Date fecha1 = new Date();

				if(gasolina.isSelected()) {
					combustible1 = "gasolina";
				}else if(diesel.isSelected()){
					combustible1 = "diesel";
				}
				
				int estadoIndex = comboEstado.getSelectedIndex();
				idestado1 = estadoIndex + 1;
		
				int tipoIndex = comboTipo.getSelectedIndex();
				idtipo1 = tipoIndex + 1;
				
				/** Se muestra el coche registrado en ese momento */
				listModelo.addElement("Nº Bastidor: " + numbastidor1 + ",   Marca: " + marca1 + ",   Modelo: " + modelo1 + ",   Valor: " + valor1);

				/** Funcion de la clase Gestor para introducir un coche en la bbdd y en el ArrayList */
				try {
					objGestor.CrearCoche(numbastidor1, marca1, modelo1, cv1, aniofabricacion1, fecha1, color1, kilometros1,
							idtipo1, combustible1, cilindrada1, idestado1);
				} catch (SQLException a) {
					JOptionPane.showInternalMessageDialog(null, "Ha habido un problema al registrar un coche");
					a.printStackTrace();
				}

			} catch (Exception w) {
				JOptionPane.showInternalMessageDialog(null, "Rellene todos los campos correctamente");
			}
			
			numbastidor.setText(null);
			marca.setText(null);
			modelo.setText(null);
			cv.setText(null);
			aniofabricacion.setText(null);
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
