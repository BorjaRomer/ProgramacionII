package LP;

import java.awt.EventQueue;

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
import java.awt.SystemColor;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JToolBar;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;

public class JFrame_AltaMoto extends JFrame implements ActionListener {
	private static final long serialVersionUID = 1L;
	
	clsGestor objGestor = new clsGestor();
	
	private JPanel contentPane;
	private JTextField numbastidor;
	private JTextField marca;
	private JTextField modelo;
	private JTextField cv;
	private JTextField cilindrada;
	private JTextField aniofabricacion;
	private JTextField color;
	private JTextField kilometros;
	private JTextField tamano;
	private JTextField valor;
	JComboBox<String> comboEstado;
	JComboBox<String> comboTipo;
	JList<String> list;
	DefaultListModel<String> listModelo;

	
	public final String BOTON_GUARDAR = "BOTON_GUARDAR";
	public final String BOTOT_SALIR = "BOTON_SALIR";
	public final String BOTON_ATRAS = "BOTON_ATRAS";
	
	public static void CargarAM() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JFrame_AltaMoto frame = new JFrame_AltaMoto();
					frame.setVisible(true);
					frame.setLocationRelativeTo(null);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}


	/**
	 * Create the frame.
	 */
	public JFrame_AltaMoto() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(
				"C:\\Users\\Industria 4.0\\Desktop\\ProgramII\\ECLIPSE\\ProgramacionII\\Archivos gr\u00E1ficos\\iconfinder_magnifier_and_car_1421622.png"));
		setTitle("DESGUACE - Registro de moto");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 663, 463);
		contentPane = new JPanel();
		contentPane.setToolTipText("");
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane(list);
		TitledBorder borderpanel3 = new TitledBorder(new EtchedBorder(), "Registros");
		scrollPane.setBorder(borderpanel3);
		scrollPane.setBounds(327, 272, 310, 141);
		contentPane.add(scrollPane);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Industria 4.0\\Desktop\\ProgramII\\ECLIPSE\\ProgramacionII\\Archivos gr\u00E1ficos\\desguace.jpg"));
		lblNewLabel.setBounds(0, 40, 647, 56);
		contentPane.add(lblNewLabel);


		
		JPanel panel = new JPanel();
		TitledBorder borderpanel = new TitledBorder(new EtchedBorder(), "Características");
		panel.setBorder(borderpanel);
		panel.setBackground(SystemColor.textHighlightText);
		panel.setBounds(10, 102, 627, 159);
		contentPane.add(panel);
		panel.setLayout(null);

		JLabel lblNBasridor = new JLabel("N\u00BA Bastidor:");
		lblNBasridor.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblNBasridor.setBounds(37, 32, 66, 14);
		panel.add(lblNBasridor);
		
		numbastidor = new JTextField();
		numbastidor.setBounds(108, 29, 124, 20);
		panel.add(numbastidor);
		numbastidor.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Marca:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblNewLabel_1.setBounds(286, 32, 46, 14);
		panel.add(lblNewLabel_1);

		marca = new JTextField();
		marca.setBounds(330, 29, 71, 20);
		panel.add(marca);
		marca.setColumns(10);
		

		JLabel lblModelo = new JLabel("Modelo:");
		lblModelo.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblModelo.setBounds(441, 32, 46, 14);
		panel.add(lblModelo);

		modelo = new JTextField();
		modelo.setBounds(497, 29, 71, 20);
		panel.add(modelo);
		modelo.setColumns(10);
		
		JLabel lblCv = new JLabel("Cv:");
		lblCv.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblCv.setBounds(241, 74, 31, 14);
		panel.add(lblCv);

		cv = new JTextField();
		cv.setBounds(268, 71, 46, 20);
		panel.add(cv);
		cv.setColumns(10);
		

		JLabel lblCilindrada = new JLabel("Cilindrada:");
		lblCilindrada.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblCilindrada.setBounds(42, 74, 61, 14);
		panel.add(lblCilindrada);

		cilindrada = new JTextField();
		cilindrada.setBounds(124, 71, 86, 20);
		panel.add(cilindrada);
		cilindrada.setColumns(10);
		
		JLabel lblKilmetros = new JLabel("Kil\u00F3metros:");
		lblKilmetros.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblKilmetros.setBounds(402, 115, 66, 14);
		panel.add(lblKilmetros);

		kilometros = new JTextField();
		kilometros.setBounds(468, 112, 86, 20);
		panel.add(kilometros);
		kilometros.setColumns(10);

		JLabel lblColor = new JLabel("Color:");
		lblColor.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblColor.setBounds(268, 115, 37, 14);
		panel.add(lblColor);

		color = new JTextField();
		color.setBounds(307, 112, 61, 20);
		panel.add(color);
		color.setColumns(10);
		
		JLabel lblAoFabricacin = new JLabel("A\u00F1o Fabricaci\u00F3n:");
		lblAoFabricacin.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblAoFabricacin.setBounds(368, 74, 83, 14);
		panel.add(lblAoFabricacin);

		aniofabricacion = new JTextField();
		aniofabricacion.setBounds(468, 71, 86, 20);
		panel.add(aniofabricacion);
		aniofabricacion.setColumns(10);

		JLabel lblTamao = new JLabel("Tama\u00F1o:");
		lblTamao.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblTamao.setBounds(53, 115, 83, 14);
		panel.add(lblTamao);

		tamano = new JTextField();
		tamano.setBounds(124, 112, 86, 20);
		panel.add(tamano);
		tamano.setColumns(10);

	
		
		JPanel panel_1 = new JPanel();
		TitledBorder borderpanel1 = new TitledBorder(new EtchedBorder(), "Tasación");
		panel_1.setBorder(borderpanel1);
		panel_1.setBounds(10, 272, 307, 141);
		contentPane.add(panel_1);
		panel_1.setLayout(null);

		JLabel lblValor = new JLabel("Valor(\u20AC):");
		lblValor.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblValor.setBounds(20, 39, 52, 14);
		panel_1.add(lblValor);

		valor = new JTextField();
		valor.setBounds(71, 36, 67, 20);
		panel_1.add(valor);
		valor.setColumns(10);
		
		JLabel lblEstado = new JLabel("Estado:");
		lblEstado.setFont(new Font("Tahoma", Font.PLAIN, 11));
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
		lblTipo.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblTipo.setBounds(173, 39, 38, 14);
		panel_1.add(lblTipo);

		comboTipo = new JComboBox<String>();
		comboTipo.setFont(new Font("Tahoma", Font.PLAIN, 11));
		comboTipo.addItem("Deportiva");
		comboTipo.addItem("Naked");
		comboTipo.addItem("Enduro");
		comboTipo.addItem("Trial");
		comboTipo.addItem("Supermotard");
		comboTipo.addItem("Custom");
		comboTipo.addItem("Ciclomotor");
		comboTipo.setBounds(204, 35, 77, 22);
		panel_1.add(comboTipo);

		JToolBar toolBar = new JToolBar();
		toolBar.setBounds(0, 0, 647, 91);
		contentPane.add(toolBar);

		JButton BotonAtras = new JButton("");
		BotonAtras.setActionCommand(BOTON_ATRAS);
		BotonAtras.addActionListener(this);
		BotonAtras.setIcon(new ImageIcon(
				"C:\\Users\\Industria 4.0\\Desktop\\ProgramII\\ECLIPSE\\ProgramacionII\\Archivos gr\u00E1ficos\\iconfinder_back_38976.png"));
		toolBar.add(BotonAtras);

		JButton BotonGuardar = new JButton("");
		BotonGuardar.setActionCommand(BOTON_GUARDAR);
		BotonGuardar.addActionListener(this);
		BotonGuardar.setIcon(new ImageIcon(
				"C:\\Users\\Industria 4.0\\Desktop\\ProgramII\\ECLIPSE\\ProgramacionII\\Archivos gr\u00E1ficos\\guardar.png"));
		toolBar.add(BotonGuardar);



	}
	

	public void actionPerformed(ActionEvent e) {
		
		
				
		switch (e.getActionCommand()) {

		case BOTON_GUARDAR:

			try {
				int idestado2;
				int idtipo2;
				int tamano2=Integer.parseInt(tamano.getText());
				String numbastidor2 = numbastidor.getText();
				String marca2 = marca.getText();
				String modelo2 = modelo.getText();
				int cv2 = Integer.parseInt(cv.getText());
				int cilindrada2 = Integer.parseInt(cilindrada.getText());
				int kilometros2 = Integer.parseInt(kilometros.getText());
				String color2 = color.getText();
				int aniofabricacion2 = Integer.parseInt(aniofabricacion.getText());
				Date fecha2 = new Date();


				//estado1 = (String) comboEstado.getSelectedItem();

				//tipo1 = (String) comboTipo.getSelectedItem();
				
				int estadoIndex = comboEstado.getSelectedIndex();
				idestado2 = estadoIndex + 1;
		
				int tipoIndex = comboTipo.getSelectedIndex();
				idtipo2 = tipoIndex + 1;
				
				listModelo.addElement("Nº Bastidor: " + numbastidor2 + ",  Marca: " + marca2 + ",  Modelo: " + modelo2);

				try {
					objGestor.CrearMoto(numbastidor2, marca2, modelo2, cv2, aniofabricacion2, fecha2, color2, kilometros2, idtipo2, cilindrada2, tamano2, idestado2);
				} catch (SQLException a) {
					System.out.println("Error al registrar una moto");
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
			valor.setText(null);
			
			break;
			
		case BOTON_ATRAS:
			
			dispose();
			
		}
	}
}



