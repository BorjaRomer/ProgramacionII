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
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;
import LN.clsGestor;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JToolBar;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import java.awt.Color;
import javax.swing.JSlider;
import com.toedter.calendar.JDateChooser;
import static Comun.clsConstantes.*;
import Comun.itfProperty;
import javax.swing.DefaultComboBoxModel;

/*
 * Clase de interfaz visual para registrar un camion en la BBDD
 */
public class JDialog_AltaCamion extends JDialog implements ActionListener {

	public final String BOTON_GUARDAR = "BOTON_GUARDAR";
	public final String BOTOT_SALIR = "BOTON_SALIR";
	public final String BOTON_ATRAS = "BOTON_ATRAS";

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField numbastidor;
	private JTextField modelo;
	private JTextField cv;
	private JTextField kilometros;
	private JTextField color;
	private JTextField valor;
	private JTextField altura;
	private JComboBox<String> comboEstado;
	private JComboBox<String> comboTipo;
	private JComboBox<String> comboMarca;
	private JList<String> list;
	private DefaultListModel<String> listModelo;
	private JSlider slider;
	private JDateChooser aniofabricacion;
	private ArrayList<itfProperty> estados;
	private ArrayList<itfProperty> tipocamion;
	private clsGestor objGestor;
	private String operario;
	
	
	/*
	 * Constructor de la ventana
	 */
	public JDialog_AltaCamion(clsGestor _objGestor, String _operario) {
		setResizable(false);
		
		objGestor = _objGestor;
		operario = _operario;
		
		setIconImage(Toolkit.getDefaultToolkit().getImage(JDialog_AltaCamion.class.getResource("/Data/icono.png")));
		setTitle("DESGUACE - Registro de camion");
		setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 664, 411);
		contentPane = new JPanel();
		contentPane.setToolTipText("");
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Caracter\u00EDsticas", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 139)));
		panel.setBackground(Color.WHITE);
		panel.setBounds(10, 51, 627, 159);
		contentPane.add(panel);
		panel.setLayout(null);

		JLabel lblNBasridor = new JLabel("N\u00BA Bastidor:");
		lblNBasridor.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNBasridor.setBounds(37, 32, 66, 14);
		panel.add(lblNBasridor);

		numbastidor = new JTextField();
		TextPrompt Ejnum = new TextPrompt("Ej: VKL234355VB", numbastidor);
		Ejnum.changeAlpha(0.75f);
		Ejnum.changeStyle(Font.ITALIC);
		Ejnum.setForeground(Color.LIGHT_GRAY);
		numbastidor.setBounds(108, 29, 124, 20);
		panel.add(numbastidor);
		numbastidor.setColumns(10);

		JLabel lblmarca = new JLabel("Marca:");
		lblmarca.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblmarca.setBounds(286, 32, 46, 14);
		panel.add(lblmarca);
		
		comboMarca = new JComboBox<String>();
		comboMarca.setFont(new Font("Tahoma", Font.PLAIN, 11));
		comboMarca.setModel(new DefaultComboBoxModel<String>(new String[] {"Mercedes", "Man", "Scania", "Volvo", "Renault", "Daf"}));
		comboMarca.setBounds(330, 28, 80, 22);
		panel.add(comboMarca);

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
		lblCv.setBounds(220, 74, 31, 14);
		panel.add(lblCv);

		cv = new JTextField();
		cv.setBounds(245, 71, 46, 20);
		panel.add(cv);
		cv.setColumns(10);

		JLabel lblKilmetros = new JLabel("Kil\u00F3metros:");
		lblKilmetros.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblKilmetros.setBounds(412, 115, 66, 14);
		panel.add(lblKilmetros);

		kilometros = new JTextField();
		kilometros.setBounds(482, 112, 86, 20);
		panel.add(kilometros);
		kilometros.setColumns(10);

		JLabel lblColor = new JLabel("Color:");
		lblColor.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblColor.setBounds(280, 115, 37, 14);
		panel.add(lblColor);

		color = new JTextField();
		color.setBounds(317, 112, 61, 20);
		panel.add(color);
		color.setColumns(10);

		JLabel lblAoFabricacin = new JLabel("A\u00F1o Fabricaci\u00F3n:");
		lblAoFabricacin.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblAoFabricacin.setBounds(44, 115, 92, 14);
		panel.add(lblAoFabricacin);
		
		aniofabricacion = new JDateChooser();
		aniofabricacion.setBounds(146, 112, 104, 20);
		panel.add(aniofabricacion);
		
		slider = new JSlider();
		slider.setSnapToTicks(true);
		slider.setPaintTrack(false);
		slider.setPaintTicks(true);
		slider.setPaintLabels(true);
		slider.setMinorTickSpacing(500);
		slider.setMajorTickSpacing(2000);
		slider.setFont(new Font("Tahoma", Font.PLAIN, 9));
		slider.setMinimum(2000);
		slider.setMaximum(10000);
		slider.setBackground(Color.WHITE);
		slider.setBounds(386, 61, 200, 34);
		panel.add(slider);
		
		JLabel lblCarga = new JLabel("Carga:");
		lblCarga.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblCarga.setBounds(330, 74, 46, 14);
		panel.add(lblCarga);
		
		JLabel lblAltura = new JLabel("Altura(m):");
		lblAltura.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblAltura.setBounds(57, 74, 61, 14);
		panel.add(lblAltura);
		
		altura = new JTextField();
		altura.setBounds(122, 71, 46, 20);
		panel.add(altura);
		altura.setColumns(10);

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

		estados = objGestor.DameEstados();
		comboEstado = new JComboBox<String>();
		comboEstado.setFont(new Font("Tahoma", Font.PLAIN, 11));
		for (itfProperty e : estados) {
		comboEstado.addItem((String)e.getProperty(PROPIEDAD_ESTADO_DESCRIPCION));
		}
		comboEstado.setBounds(139, 91, 72, 22);
		panel_1.add(comboEstado);

		JLabel lblTipo = new JLabel("Tipo:");
		lblTipo.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblTipo.setBounds(173, 39, 38, 14);
		panel_1.add(lblTipo);

		tipocamion = objGestor.DameTipoCamion();
		comboTipo = new JComboBox<String>();
		comboTipo.setFont(new Font("Tahoma", Font.PLAIN, 11));
		for(itfProperty t : tipocamion) {
		comboTipo.addItem((String)t.getProperty(PROPIEDAD_TIPOCAMION_DESCRIPCION));
		}
		comboTipo.setBounds(204, 35, 77, 22);
		panel_1.add(comboTipo);

		JToolBar toolBar = new JToolBar();
		toolBar.setBackground(Color.WHITE);
		toolBar.setBounds(0, 0, 648, 40);
		contentPane.add(toolBar);

		JButton BotonAtras = new JButton("");
		BotonAtras.setToolTipText("Atras");
		BotonAtras.setOpaque(false);
		BotonAtras.setContentAreaFilled(false);
		BotonAtras.setBorderPainted(false);
		BotonAtras.setActionCommand(BOTON_ATRAS);
		BotonAtras.addActionListener(this);
		BotonAtras.setIcon(new ImageIcon(JDialog_AltaCamion.class.getResource("/Data/iconfinder_back_38976.png")));
		toolBar.add(BotonAtras);

		JButton BotonGuardar = new JButton("");
		BotonGuardar.setToolTipText("Insertar");
		BotonGuardar.setOpaque(false);
		BotonGuardar.setContentAreaFilled(false);
		BotonGuardar.setBorderPainted(false);
		BotonGuardar.setActionCommand(BOTON_GUARDAR);
		BotonGuardar.addActionListener(this);
		BotonGuardar.setIcon(new ImageIcon(JDialog_AltaCamion.class.getResource("/Data/guardar.png")));
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
		lblNewLabel.setIcon(new ImageIcon(JDialog_AltaCamion.class.getResource("/Data/desguace.jpg")));
		lblNewLabel.setBounds(0, 0, 648, 371);
		contentPane.add(lblNewLabel);

	}

	public void actionPerformed(ActionEvent e) {

		switch (e.getActionCommand()) {

		/*
		 * Se recogen los datos del Frame y se crea el objeto insertandolo en memoria y en la BBDD
		 */
		case BOTON_GUARDAR:

			try {
				
				/** Se recogen todos los datos de la venta introducidos por le usuario */
				int idestado1;
				int idtipo1;
				String numbastidor1 = numbastidor.getText();
				String marca1 = (String)comboMarca.getSelectedItem();
				String modelo1 = modelo.getText();
				int cv1 = Integer.parseInt(cv.getText());
				int kilometros1 = Integer.parseInt(kilometros.getText());
				String color1 = color.getText();
				Date aniofabricacion1 = aniofabricacion.getDate();
				int valor1 = Integer.parseInt(valor.getText());
				int altura1 = Integer.parseInt(altura.getText());
				Date fecha1 = new Date();
				int carga1 = slider.getValue();
				
				int estadoIndex = comboEstado.getSelectedIndex();
				idestado1 = estadoIndex + 1;
		
				int tipoIndex = comboTipo.getSelectedIndex();
				idtipo1 = tipoIndex + 1;
				
				/** Se muestra el coche registrado en ese momento */
				listModelo.addElement("Nº Bastidor: " + numbastidor1 + ",   Marca: " + marca1 + ",   Modelo: " + modelo1 + ",   Valor: " + valor1 + ",   Carga: " + carga1);

				/** Funcion de la clase Gestor para introducir un coche en la bbdd y en el ArrayList */
				try {
					objGestor.CrearCamion(numbastidor1, marca1, modelo1, cv1, aniofabricacion1, fecha1, color1, kilometros1,
							idtipo1, altura1, carga1, idestado1, valor1, operario);
				} catch (SQLException a) {
					JOptionPane.showInternalMessageDialog(null, "Ha habido un problema al registrar un camion");
					a.printStackTrace();
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
			altura.setText(null);
			valor.setText(null);
			
			break;
			/*
			 * Se cierra la ventana y veulve a la principal
			 */
		case BOTON_ATRAS:
			
			/** Se cierra la venta */
			dispose();
			
		}
	}
}