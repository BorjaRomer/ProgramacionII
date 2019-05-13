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
import javax.swing.DefaultComboBoxModel;


	public class JFrame_AltaCamion extends JFrame implements ActionListener {

		private static final long serialVersionUID = 1L;
		
		public final String BOTON_GUARDAR = "BOTON_GUARDAR";
		public final String BOTOT_SALIR = "BOTON_SALIR";
		public final String BOTON_ATRAS = "BOTON_ATRAS";
		
		clsGestor objGestor = new clsGestor();
		
		private JPanel contentPane;
		private JTextField numbastidor;
		private JTextField marca;
		private JTextField modelo;
		private JTextField cv;
		private JTextField aniofabricacion;
		private JTextField color;
		private int idtipocamion;
		JComboBox<String>comboEstado;
		JComboBox<String>comboTipo;
		private JTextField altura;
		private JTextField anchura;
		private JTextField kilometros;
		JList<String> list;
		DefaultListModel<String> listModelo;
		private JTextField textField;
		private JTextField textField_1;
		private JTextField textField_2;
		private JTextField textField_3;
		private JTextField textField_5;
		private JTextField textField_6;
		private JTextField textField_7;
		private JTextField textField_8;
		private JTextField textField_9;
		private JTextField textField_10;
	
		public static void CargarAC() {
			EventQueue.invokeLater(new Runnable() {
				public void run() {
					try {
						JFrame_AltaCoche frame = new JFrame_AltaCoche();
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
		
		@SuppressWarnings("unchecked") 
		public JFrame_AltaCamion() {
			
			setIconImage(Toolkit.getDefaultToolkit().getImage(
					"C:\\Users\\Industria 4.0\\Desktop\\ProgramII\\ECLIPSE\\ProgramacionII\\Archivos gr\u00E1ficos\\iconfinder_magnifier_and_car_1421622.png"));
			setTitle("DESGUACE - Registro de coche");
			setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
			setBounds(100, 100, 663, 463);
			contentPane = new JPanel();
			contentPane.setToolTipText("");
			contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
			setContentPane(contentPane);
			contentPane.setLayout(null);

			JPanel panel = new JPanel();
			TitledBorder borderpanel = new TitledBorder(new EtchedBorder(), "Características");
			panel.setBorder(borderpanel);
			panel.setBackground(SystemColor.textHighlightText);
			panel.setBounds(10, 102, 627, 159);
			contentPane.add(panel);
			panel.setLayout(null);
			
			JLabel lblNmeroBastidor = new JLabel("Nº bastidor:");
			lblNmeroBastidor.setBounds(27, 30, 107, 14);
			panel.add(lblNmeroBastidor);
			
			JPanel panel_2 = new JPanel();
			panel_2.setBounds(0, 0, 10, 10);
			panel.add(panel_2);
			
			textField = new JTextField();
			textField.setBounds(94, 27, 86, 20);
			panel.add(textField);
			textField.setColumns(10);
			
			JLabel lblMarca = new JLabel("Marca:");
			lblMarca.setBounds(233, 30, 46, 14);
			panel.add(lblMarca);
			
			textField_1 = new JTextField();
			textField_1.setBounds(274, 27, 86, 20);
			panel.add(textField_1);
			textField_1.setColumns(10);
			
			JLabel lblModelo = new JLabel("Modelo:");
			lblModelo.setBounds(410, 30, 46, 14);
			panel.add(lblModelo);
			
			textField_2 = new JTextField();
			textField_2.setBounds(454, 27, 86, 20);
			panel.add(textField_2);
			textField_2.setColumns(10);
			
			JLabel lblCv = new JLabel("Cv:");
			lblCv.setBounds(94, 74, 28, 14);
			panel.add(lblCv);
			
			textField_3 = new JTextField();
			textField_3.setBounds(123, 71, 46, 20);
			panel.add(textField_3);
			textField_3.setColumns(10);
			
			JLabel lblAoFabricacin = new JLabel("Año Fabricación:");
			lblAoFabricacin.setBounds(27, 117, 86, 14);
			panel.add(lblAoFabricacin);
			
			textField_5 = new JTextField();
			textField_5.setBounds(123, 114, 77, 20);
			panel.add(textField_5);
			textField_5.setColumns(10);
			
			JLabel lblColor = new JLabel("Color:");
			lblColor.setBounds(253, 117, 46, 14);
			panel.add(lblColor);
			
			textField_6 = new JTextField();
			textField_6.setBounds(299, 114, 86, 20);
			panel.add(textField_6);
			textField_6.setColumns(10);
			
			JLabel lblKilmetros = new JLabel("Kilómetros:");
			lblKilmetros.setBounds(427, 117, 59, 14);
			panel.add(lblKilmetros);
			
			textField_7 = new JTextField();
			textField_7.setBounds(496, 114, 86, 20);
			panel.add(textField_7);
			textField_7.setColumns(10);
			
			JLabel lblAltura = new JLabel("Altura:");
			lblAltura.setBounds(253, 74, 46, 14);
			panel.add(lblAltura);
			
			textField_8 = new JTextField();
			textField_8.setBounds(295, 71, 65, 20);
			panel.add(textField_8);
			textField_8.setColumns(10);
			
			JLabel lblAnchura = new JLabel("Anchura:");
			lblAnchura.setBounds(410, 74, 46, 14);
			panel.add(lblAnchura);
			
			textField_9 = new JTextField();
			textField_9.setBounds(466, 71, 86, 20);
			panel.add(textField_9);
			textField_9.setColumns(10);
			

			JPanel panel_1 = new JPanel();
			TitledBorder borderpanel1 = new TitledBorder(new EtchedBorder(), "Tasación");
			panel_1.setBorder(borderpanel1);
			panel_1.setBounds(10, 272, 307, 141);
			contentPane.add(panel_1);
			panel_1.setLayout(null);
			
			JLabel lblValor = new JLabel("Valor(€):");
			lblValor.setBounds(10, 34, 46, 14);
			panel_1.add(lblValor);
			
			textField_10 = new JTextField();
			textField_10.setBounds(54, 31, 65, 20);
			panel_1.add(textField_10);
			textField_10.setColumns(10);
			
			JComboBox comboBox = new JComboBox();
			comboBox.setModel(new DefaultComboBoxModel(new String[] {"Rígido", "Articulado", "Cisterna", "De carretera"}));
			comboBox.setBounds(194, 30, 81, 22);
			panel_1.add(comboBox);
			
			JLabel lblTipo = new JLabel("Tipo:");
			lblTipo.setBounds(157, 34, 46, 14);
			panel_1.add(lblTipo);
			
			JLabel lblEstado = new JLabel("Estado:");
			lblEstado.setBounds(73, 87, 46, 14);
			panel_1.add(lblEstado);
			
			JComboBox comboBox_1 = new JComboBox();
			comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"Optimo", "Despiece", "Chatarra", "Venta"}));
			comboBox_1.setBounds(120, 83, 65, 22);
			panel_1.add(comboBox_1);
			

			JScrollPane scrollPane = new JScrollPane(list);
			TitledBorder borderpanel3 = new TitledBorder(new EtchedBorder(), "Registros");
			scrollPane.setBorder(borderpanel3);
			scrollPane.setBounds(327, 272, 310, 141);
			contentPane.add(scrollPane);
			
			JLabel lblNewLabel = new JLabel("");
			lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Industria 4.0\\Desktop\\ProgramII\\ECLIPSE\\ProgramacionII\\Archivos gr\u00E1ficos\\desguace.jpg"));
			lblNewLabel.setBounds(0, 40, 647, 56);
			contentPane.add(lblNewLabel);

		}
		
		
		public void actionPerformed(ActionEvent e) {switch (e.getActionCommand()) {

		case BOTON_GUARDAR:

			try {
				
				
				int idestado3;
				int idtipo3;
				String numbastidor3 = numbastidor.getText();
				String marca3 = marca.getText();
				String modelo3 = modelo.getText();
				int cv3 = Integer.parseInt(cv.getText());
				String cilindrada3 = cilindrada.getText();
				int kilometros3 = Integer.parseInt(kilometros.getText());
				String color3 = color.getText();
				int anchura3= Integer.parseInt(anchura.getText());
				int altura3 = Integer.parseInt(altura.getText());
					
				int aniofabricacion3 = Integer.parseInt(aniofabricacion.getText());
				Date fecha3 = new Date();
				

				//estado1 = (String) comboEstado.getSelectedItem();

				//tipo1 = (String) comboTipo.getSelectedItem();
				
				int estadoIndex = comboEstado.getSelectedIndex();
				idestado3 = estadoIndex + 1;
		
				int tipoIndex = comboTipo.getSelectedIndex();
				idtipo3 = tipoIndex + 1;
				
				listModelo.addElement("Nº Bastidor: " + numbastidor3 + ",  Marca: " + marca3 + ",  Modelo: " + modelo1);

				try {
					objGestor.CrearCoche(numbastidor1, marca1, modelo1, cv1, aniofabricacion1, fecha1, color1, kilometros1,
							idtipo1, combustible1, cilindrada1, idestado1);
				} catch (SQLException a) {
					System.out.println("Error al registrar un coche");
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
			valor.setText(null);
			
			break;
			
		case BOTON_ATRAS:
			
			dispose();
			
		}
	}
}
