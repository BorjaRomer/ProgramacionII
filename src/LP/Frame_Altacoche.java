package LP;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.DefaultComboBoxModel;

public class Frame_Altacoche extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	
	private JPanel contentPane;
	private JTextField numbastidor;
	private JTextField marca;
	private JTextField modelo;
	private JTextField cv;
	private JTextField cilindrada;
	private JTextField aniofabricacion;
	private JTextField color;
	private JTextField kilometros;
	private JComboBox<String> comb_combustible = new JComboBox<>();
	private JComboBox<String> comb_estado = new JComboBox<>();
	private JComboBox<String> comb_tipocoche = new JComboBox<>();
	private String opcombustible;
	private int opestado;
	private int tipocoche;
	
	

	public String getOpcombustible() {
		return opcombustible;
	}

	public int getOpestado() {
		return opestado;
	}

	public int getTipocoche() {
		return tipocoche;
	}

	public JTextField getCv() {
		return cv;
	}

	public JTextField getCilindrada() {
		return cilindrada;
	}

	public JTextField getAniofabricacion() {
		return aniofabricacion;
	}

	public JTextField getColor() {
		return color;
	}

	public JTextField getKilometros() {
		return kilometros;
	}

	public JTextField getNumbastidor() {
		return numbastidor;
	}

	public JTextField getMarca() {
		return marca;
	}

	public JTextField getModelo() {
		return modelo;
	}

	/**
	 * Create the frame.
	 */
	@SuppressWarnings("unchecked") 
	public Frame_Altacoche() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 504, 450);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{81, 0, 0, 0};
		gbl_contentPane.rowHeights = new int[]{28, 14, 14, 14, 14, 14, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_contentPane.columnWeights = new double[]{0.0, 0.0, 1.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);
		
		JLabel lblNewLabel = new JLabel("Num. Bastidor");
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.anchor = GridBagConstraints.NORTH;
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel.gridx = 0;
		gbc_lblNewLabel.gridy = 1;
		contentPane.add(lblNewLabel, gbc_lblNewLabel);
		
		numbastidor = new JTextField();
		GridBagConstraints gbc_textField = new GridBagConstraints();
		gbc_textField.insets = new Insets(0, 0, 5, 0);
		gbc_textField.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField.gridx = 2;
		gbc_textField.gridy = 1;
		contentPane.add(numbastidor, gbc_textField);
		numbastidor.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Marca");
		GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
		gbc_lblNewLabel_1.anchor = GridBagConstraints.NORTH;
		gbc_lblNewLabel_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_1.gridx = 0;
		gbc_lblNewLabel_1.gridy = 2;
		contentPane.add(lblNewLabel_1, gbc_lblNewLabel_1);
		
		marca = new JTextField();
		GridBagConstraints gbc_textField_1 = new GridBagConstraints();
		gbc_textField_1.insets = new Insets(0, 0, 5, 0);
		gbc_textField_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_1.gridx = 2;
		gbc_textField_1.gridy = 2;
		contentPane.add(marca, gbc_textField_1);
		marca.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Modelo");
		GridBagConstraints gbc_lblNewLabel_2 = new GridBagConstraints();
		gbc_lblNewLabel_2.anchor = GridBagConstraints.NORTH;
		gbc_lblNewLabel_2.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_2.gridx = 0;
		gbc_lblNewLabel_2.gridy = 3;
		contentPane.add(lblNewLabel_2, gbc_lblNewLabel_2);
		
		modelo = new JTextField();
		GridBagConstraints gbc_textField_2 = new GridBagConstraints();
		gbc_textField_2.insets = new Insets(0, 0, 5, 0);
		gbc_textField_2.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_2.gridx = 2;
		gbc_textField_2.gridy = 3;
		contentPane.add(modelo, gbc_textField_2);
		modelo.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Cv");
		GridBagConstraints gbc_lblNewLabel_3 = new GridBagConstraints();
		gbc_lblNewLabel_3.anchor = GridBagConstraints.NORTH;
		gbc_lblNewLabel_3.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_3.gridx = 0;
		gbc_lblNewLabel_3.gridy = 4;
		contentPane.add(lblNewLabel_3, gbc_lblNewLabel_3);
		
		cv = new JTextField();
		GridBagConstraints gbc_textField_3 = new GridBagConstraints();
		gbc_textField_3.insets = new Insets(0, 0, 5, 0);
		gbc_textField_3.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_3.gridx = 2;
		gbc_textField_3.gridy = 4;
		contentPane.add(cv, gbc_textField_3);
		cv.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("Cilindrada");
		GridBagConstraints gbc_lblNewLabel_4 = new GridBagConstraints();
		gbc_lblNewLabel_4.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_4.anchor = GridBagConstraints.NORTH;
		gbc_lblNewLabel_4.gridx = 0;
		gbc_lblNewLabel_4.gridy = 5;
		contentPane.add(lblNewLabel_4, gbc_lblNewLabel_4);
		
		cilindrada = new JTextField();
		GridBagConstraints gbc_textField_4 = new GridBagConstraints();
		gbc_textField_4.insets = new Insets(0, 0, 5, 0);
		gbc_textField_4.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_4.gridx = 2;
		gbc_textField_4.gridy = 5;
		contentPane.add(cilindrada, gbc_textField_4);
		cilindrada.setColumns(10);
		
		JLabel lblAoDeFabricacin = new JLabel("A\u00F1o");
		GridBagConstraints gbc_lblAoDeFabricacin = new GridBagConstraints();
		gbc_lblAoDeFabricacin.insets = new Insets(0, 0, 5, 5);
		gbc_lblAoDeFabricacin.gridx = 0;
		gbc_lblAoDeFabricacin.gridy = 6;
		contentPane.add(lblAoDeFabricacin, gbc_lblAoDeFabricacin);
		
		aniofabricacion = new JTextField();
		GridBagConstraints gbc_textField_5 = new GridBagConstraints();
		gbc_textField_5.insets = new Insets(0, 0, 5, 0);
		gbc_textField_5.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_5.gridx = 2;
		gbc_textField_5.gridy = 6;
		contentPane.add(aniofabricacion, gbc_textField_5);
		aniofabricacion.setColumns(10);
		
		JLabel lblColor = new JLabel("Color");
		GridBagConstraints gbc_lblColor = new GridBagConstraints();
		gbc_lblColor.insets = new Insets(0, 0, 5, 5);
		gbc_lblColor.gridx = 0;
		gbc_lblColor.gridy = 7;
		contentPane.add(lblColor, gbc_lblColor);
		
		color = new JTextField();
		GridBagConstraints gbc_textField_6 = new GridBagConstraints();
		gbc_textField_6.insets = new Insets(0, 0, 5, 0);
		gbc_textField_6.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_6.gridx = 2;
		gbc_textField_6.gridy = 7;
		contentPane.add(color, gbc_textField_6);
		color.setColumns(10);
		
		JLabel lblKilometros = new JLabel("Kilometros");
		GridBagConstraints gbc_lblKilometros = new GridBagConstraints();
		gbc_lblKilometros.insets = new Insets(0, 0, 5, 5);
		gbc_lblKilometros.gridx = 0;
		gbc_lblKilometros.gridy = 8;
		contentPane.add(lblKilometros, gbc_lblKilometros);
		
		kilometros = new JTextField();
		GridBagConstraints gbc_textField_7 = new GridBagConstraints();
		gbc_textField_7.insets = new Insets(0, 0, 5, 0);
		gbc_textField_7.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_7.gridx = 2;
		gbc_textField_7.gridy = 8;
		contentPane.add(kilometros, gbc_textField_7);
		kilometros.setColumns(10);
		
		JLabel lblCombustible = new JLabel("Combustible");
		GridBagConstraints gbc_lblCombustible = new GridBagConstraints();
		gbc_lblCombustible.insets = new Insets(0, 0, 5, 5);
		gbc_lblCombustible.gridx = 0;
		gbc_lblCombustible.gridy = 9;
		contentPane.add(lblCombustible, gbc_lblCombustible);
		
		JComboBox<String> comb_combustible = new JComboBox<>();
		comb_combustible.setModel(new DefaultComboBoxModel(new String[] {"Gasolina", "Diesel"}));
		GridBagConstraints gbc_comboBox = new GridBagConstraints();
		gbc_comboBox.insets = new Insets(0, 0, 5, 0);
		gbc_comboBox.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBox.gridx = 2;
		gbc_comboBox.gridy = 9;
		contentPane.add(comb_combustible, gbc_comboBox);
		comb_combustible.addActionListener(this);
		
		JLabel lblTipoDeCoche = new JLabel("Tipo de coche");
		GridBagConstraints gbc_lblTipoDeCoche = new GridBagConstraints();
		gbc_lblTipoDeCoche.insets = new Insets(0, 0, 5, 5);
		gbc_lblTipoDeCoche.gridx = 0;
		gbc_lblTipoDeCoche.gridy = 10;
		contentPane.add(lblTipoDeCoche, gbc_lblTipoDeCoche);
		
		JComboBox <String>comb_tipocoche = new JComboBox<>();
		comb_tipocoche.setModel(new DefaultComboBoxModel(new String[] {"Deportivo ", "Monovolumen", "Todoterreno", "Coupe"}));
		GridBagConstraints gbc_comboBox_1 = new GridBagConstraints();
		gbc_comboBox_1.insets = new Insets(0, 0, 5, 0);
		gbc_comboBox_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBox_1.gridx = 2;
		gbc_comboBox_1.gridy = 10;
		contentPane.add(comb_tipocoche, gbc_comboBox_1);
		comb_tipocoche.addActionListener(this);
		
		
		
		JLabel lblEstado = new JLabel("Estado");
		GridBagConstraints gbc_lblEstado = new GridBagConstraints();
		gbc_lblEstado.insets = new Insets(0, 0, 5, 5);
		gbc_lblEstado.gridx = 0;
		gbc_lblEstado.gridy = 11;
		contentPane.add(lblEstado, gbc_lblEstado);
		
		JComboBox <String>comb_estado = new JComboBox<>();
		comb_estado.setModel(new DefaultComboBoxModel(new String[] {"Optimo", "Despiece", "Chatarra", "Venta"}));
		GridBagConstraints gbc_comboBox_2 = new GridBagConstraints();
		gbc_comboBox_2.insets = new Insets(0, 0, 5, 0);
		gbc_comboBox_2.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBox_2.gridx = 2;
		gbc_comboBox_2.gridy = 11;
		contentPane.add(comb_estado, gbc_comboBox_2);
		comb_estado.addActionListener(this);
		
		
		JButton btnGuardar = new JButton("Atr\u00E1s");
		btnGuardar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		GridBagConstraints gbc_btnGuardar = new GridBagConstraints();
		gbc_btnGuardar.insets = new Insets(0, 0, 0, 5);
		gbc_btnGuardar.gridx = 1;
		gbc_btnGuardar.gridy = 14;
		contentPane.add(btnGuardar, gbc_btnGuardar);
		
		JButton btnNewButton = new JButton("Guardar");
		GridBagConstraints gbc_btnNewButton = new GridBagConstraints();
		gbc_btnNewButton.gridx = 2;
		gbc_btnNewButton.gridy = 14;
		contentPane.add(btnNewButton, gbc_btnNewButton);
		
		
		
	}
	
	
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource() == comb_combustible){
			
			if(comb_combustible.getSelectedItem().equals("Gasolina")){
				opcombustible = "gasolina";
				}
			
			if(comb_combustible.getSelectedItem().equals("Diesel")){
				opcombustible = "diesel";
				}

		}
		
		if(e.getSource() == comb_estado){
			if(comb_estado.getSelectedItem().equals("Optimo")){	
			opestado = 1;	
			}
			
			if(comb_estado.getSelectedItem().equals("Despiece")){	
			opestado = 2;	
			}
			
			if(comb_estado.getSelectedItem().equals("Chatarra")){	
			opestado = 3;	
			}
			
			if(comb_estado.getSelectedItem().equals("Venta")){	
			opestado = 4;	
			}
			
		}
	}

	public JComboBox<String> getComb_combustible() {
		return comb_combustible;
	}

	public JComboBox<String> getComb_estado() {
		return comb_estado;
	}

	public JComboBox<String> getComb_tipocoche() {
		return comb_tipocoche;
	}

	public void setComb_combustible(JComboBox<String> comb_combustible) {
		this.comb_combustible = comb_combustible;
	}

	public void setComb_estado(JComboBox<String> comb_estado) {
		this.comb_estado = comb_estado;
	}

	public void setComb_tipocoche(JComboBox<String> comb_tipocoche) {
		this.comb_tipocoche = comb_tipocoche;
	}
}
	
	
	
