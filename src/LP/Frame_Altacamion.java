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

	public class Frame_Altacamion extends JFrame implements ActionListener {

		private static final long serialVersionUID = 1L;
		
		private JPanel contentPane;
		private JTextField numbastidor;
		private JTextField marca;
		private JTextField modelo;
		private JTextField cv;
		private JTextField aniofabricacion;
		private JTextField color;
		private int idtipocamion;
		private JComboBox<String>comb_estado = new JComboBox<>();
		private JComboBox<String>comb_tipocamion = new JComboBox<>();
		private int opestado;
		private int optipocamion;
		private JTextField altura;
		private JTextField anchura;
		private JTextField kilometros;
	
		public JTextField getKilometros() {
			return kilometros;
		}

		public void setKilometros(JTextField kilometros) {
			this.kilometros = kilometros;
		}

		public JComboBox<String> getComb_tipocamion() {
			return comb_tipocamion;
		}

		public int getOptipocamion() {
			return optipocamion;
		}

		public void setComb_tipocamion(JComboBox<String> comb_tipocamion) {
			this.comb_tipocamion = comb_tipocamion;
		}

		public void setOptipocamion(int optipocamion) {
			this.optipocamion = optipocamion;
		}


		public JTextField getAltura() {
			return altura;
		}

		public JTextField getAnchura() {
			return anchura;
		}

		public void setAltura(JTextField altura) {
			this.altura = altura;
		}

		public void setAnchura(JTextField anchura) {
			this.anchura = anchura;
		}

		public int getIdtipocamion() {
			return idtipocamion;
		}

		public void setIdtipocamion(int idtipocamion) {
			this.idtipocamion = idtipocamion;
		}

		public void setNumbastidor(JTextField numbastidor) {
			this.numbastidor = numbastidor;
		}

		public void setMarca(JTextField marca) {
			this.marca = marca;
		}

		public void setModelo(JTextField modelo) {
			this.modelo = modelo;
		}

		public void setCv(JTextField cv) {
			this.cv = cv;
		}


		public void setAniofabricacion(JTextField aniofabricacion) {
			this.aniofabricacion = aniofabricacion;
		}

		public void setColor(JTextField color) {
			this.color = color;
		}


		public void setOpestado(int opestado) {
			this.opestado = opestado;
		}


		public int getOpestado() {
			return opestado;
		}


		public JTextField getCv() {
			return cv;
		}

		public JTextField getAniofabricacion() {
			return aniofabricacion;
		}

		public JTextField getColor() {
			return color;
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
		
		public JComboBox<String> getComb_estado() {
			return comb_estado;
		}

		public void setComb_estado(JComboBox<String> comb_estado) {
			this.comb_estado = comb_estado;
		}

		/**
		 * Create the frame.
		 */
		
		@SuppressWarnings("unchecked") 
		public Frame_Altacamion() {
			setTitle("Dar de alta cami�n");
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setBounds(100, 100, 504, 450);
			contentPane = new JPanel();
			contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
			setContentPane(contentPane);
			GridBagLayout gbl_contentPane = new GridBagLayout();
			gbl_contentPane.columnWidths = new int[]{81, 0, 0, 0};
			gbl_contentPane.rowHeights = new int[]{28, 14, 14, 14, 14, 14, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
			gbl_contentPane.columnWeights = new double[]{0.0, 0.0, 1.0, Double.MIN_VALUE};
			gbl_contentPane.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
			contentPane.setLayout(gbl_contentPane);
			
			JLabel lblNewLabel = new JLabel("Num. Bastidor");
			GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
			gbc_lblNewLabel.anchor = GridBagConstraints.NORTH;
			gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
			gbc_lblNewLabel.gridx = 0;
			gbc_lblNewLabel.gridy = 1;
			contentPane.add(lblNewLabel, gbc_lblNewLabel);
			
			numbastidor = new JTextField();
			GridBagConstraints gbc_textField_4 = new GridBagConstraints();
			gbc_textField_4.insets = new Insets(0, 0, 5, 0);
			gbc_textField_4.fill = GridBagConstraints.HORIZONTAL;
			gbc_textField_4.gridx = 2;
			gbc_textField_4.gridy = 1;
			contentPane.add(numbastidor, gbc_textField_4);
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
			
				
			JLabel lblAoDeFabricacin = new JLabel("A\u00F1o");
			GridBagConstraints gbc_lblAoDeFabricacin = new GridBagConstraints();
			gbc_lblAoDeFabricacin.insets = new Insets(0, 0, 5, 5);
			gbc_lblAoDeFabricacin.gridx = 0;
			gbc_lblAoDeFabricacin.gridy = 5;
			contentPane.add(lblAoDeFabricacin, gbc_lblAoDeFabricacin);
			
			aniofabricacion = new JTextField();
			GridBagConstraints gbc_textField = new GridBagConstraints();
			gbc_textField.insets = new Insets(0, 0, 5, 0);
			gbc_textField.fill = GridBagConstraints.HORIZONTAL;
			gbc_textField.gridx = 2;
			gbc_textField.gridy = 5;
			contentPane.add(aniofabricacion, gbc_textField);
			aniofabricacion.setColumns(10);
			
			JLabel lblColor = new JLabel("Color");
			GridBagConstraints gbc_lblColor = new GridBagConstraints();
			gbc_lblColor.insets = new Insets(0, 0, 5, 5);
			gbc_lblColor.gridx = 0;
			gbc_lblColor.gridy = 6;
			contentPane.add(lblColor, gbc_lblColor);
			
			color = new JTextField();
			GridBagConstraints gbc_textField_5 = new GridBagConstraints();
			gbc_textField_5.insets = new Insets(0, 0, 5, 0);
			gbc_textField_5.fill = GridBagConstraints.HORIZONTAL;
			gbc_textField_5.gridx = 2;
			gbc_textField_5.gridy = 6;
			contentPane.add(color, gbc_textField_5);
			color.setColumns(10);
			
			JLabel lblKilometros = new JLabel("Kilometros");
			GridBagConstraints gbc_lblKilometros = new GridBagConstraints();
			gbc_lblKilometros.insets = new Insets(0, 0, 5, 5);
			gbc_lblKilometros.gridx = 0;
			gbc_lblKilometros.gridy = 7;
			contentPane.add(lblKilometros, gbc_lblKilometros);
			
			kilometros = new JTextField();
			GridBagConstraints gbc_textField_6 = new GridBagConstraints();
			gbc_textField_6.insets = new Insets(0, 0, 5, 0);
			gbc_textField_6.fill = GridBagConstraints.HORIZONTAL;
			gbc_textField_6.gridx = 2;
			gbc_textField_6.gridy = 7;
			contentPane.add(kilometros, gbc_textField_6);
			kilometros.setColumns(10);
			
			JLabel lblTipoDeCamin = new JLabel("Tipo de cami\u00F3n");
			GridBagConstraints gbc_lblTipoDeCamin = new GridBagConstraints();
			gbc_lblTipoDeCamin.insets = new Insets(0, 0, 5, 5);
			gbc_lblTipoDeCamin.gridx = 0;
			gbc_lblTipoDeCamin.gridy = 8;
			contentPane.add(lblTipoDeCamin, gbc_lblTipoDeCamin);
			
			JComboBox<String> comboBox = new JComboBox<>();
			comboBox.setModel(new DefaultComboBoxModel(new String[] {"R\u00EDgido", "Articulado", "De carretera", "Cisterna"}));
			GridBagConstraints gbc_comboBox = new GridBagConstraints();
			gbc_comboBox.insets = new Insets(0, 0, 5, 0);
			gbc_comboBox.fill = GridBagConstraints.HORIZONTAL;
			gbc_comboBox.gridx = 2;
			gbc_comboBox.gridy = 8;
			contentPane.add(comboBox, gbc_comboBox);
			
	
			JLabel lblEstado = new JLabel("Estado");
			GridBagConstraints gbc_lblEstado = new GridBagConstraints();
			gbc_lblEstado.insets = new Insets(0, 0, 5, 5);
			gbc_lblEstado.gridx = 0;
			gbc_lblEstado.gridy = 9;
			contentPane.add(lblEstado, gbc_lblEstado);
			
			
			JButton btnGuardar = new JButton("Atr\u00E1s");
			btnGuardar.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
				}
			});
			
			JComboBox <String>comb_estado_1 = new JComboBox<>();
			comb_estado_1.setModel(new DefaultComboBoxModel(new String[]{"Optimo", "Despiece", "Chatarra", "Venta"}));
			GridBagConstraints gbc_comb_estado_1 = new GridBagConstraints();
			gbc_comb_estado_1.insets = new Insets(0, 0, 5, 0);
			gbc_comb_estado_1.fill = GridBagConstraints.HORIZONTAL;
			gbc_comb_estado_1.gridx = 2;
			gbc_comb_estado_1.gridy = 9;
			contentPane.add(comb_estado_1, gbc_comb_estado_1);
			comb_estado_1.addActionListener(this);
			
			JLabel lblAltura = new JLabel("Altura");
			GridBagConstraints gbc_lblAltura = new GridBagConstraints();
			gbc_lblAltura.insets = new Insets(0, 0, 5, 5);
			gbc_lblAltura.gridx = 0;
			gbc_lblAltura.gridy = 10;
			contentPane.add(lblAltura, gbc_lblAltura);
			
			altura = new JTextField();
			GridBagConstraints gbc_textField_9 = new GridBagConstraints();
			gbc_textField_9.insets = new Insets(0, 0, 5, 0);
			gbc_textField_9.fill = GridBagConstraints.HORIZONTAL;
			gbc_textField_9.gridx = 2;
			gbc_textField_9.gridy = 10;
			contentPane.add(altura, gbc_textField_9);
			altura.setColumns(10);
			
			JLabel lblAnchura = new JLabel("Anchura");
			GridBagConstraints gbc_lblAnchura = new GridBagConstraints();
			gbc_lblAnchura.insets = new Insets(0, 0, 5, 5);
			gbc_lblAnchura.gridx = 0;
			gbc_lblAnchura.gridy = 11;
			contentPane.add(lblAnchura, gbc_lblAnchura);
			
			anchura = new JTextField();
			GridBagConstraints gbc_textField_8 = new GridBagConstraints();
			gbc_textField_8.insets = new Insets(0, 0, 5, 0);
			gbc_textField_8.fill = GridBagConstraints.HORIZONTAL;
			gbc_textField_8.gridx = 2;
			gbc_textField_8.gridy = 11;
			contentPane.add(anchura, gbc_textField_8);
			anchura.setColumns(10);
			GridBagConstraints gbc_btnGuardar = new GridBagConstraints();
			gbc_btnGuardar.insets = new Insets(0, 0, 0, 5);
			gbc_btnGuardar.gridx = 1;
			gbc_btnGuardar.gridy = 15;
			contentPane.add(btnGuardar, gbc_btnGuardar);
			
			JButton btnNewButton = new JButton("Guardar");
			GridBagConstraints gbc_btnNewButton = new GridBagConstraints();
			gbc_btnNewButton.gridx = 2;
			gbc_btnNewButton.gridy = 15;
			contentPane.add(btnNewButton, gbc_btnNewButton);
		}
		
		
		public void actionPerformed(ActionEvent e) {
			
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
			
			if(e.getSource() == comb_tipocamion){
				if(comb_tipocamion.getSelectedItem().equals("R�gido")){	
				optipocamion = 1;	
				}
				
				if(comb_tipocamion.getSelectedItem().equals("Articulado")){	
				optipocamion = 2;	
				}
				
				if(comb_tipocamion.getSelectedItem().equals("Cisterna")){	
				optipocamion = 3;	
				}
			
				
				if(comb_tipocamion.getSelectedItem().equals("De carretera")){	
				optipocamion = 4;
					
				}
			}
			
		}
	}		