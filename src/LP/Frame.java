package LP;

import LN.clsEstado;
import LN.clsGestor;
import LP.clsMenu;
import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JComboBox;
import javax.swing.JMenuBar;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.Choice;
import javax.swing.JList;
import javax.swing.DefaultComboBoxModel;
import java.awt.Color;
import java.awt.Font;

public class Frame extends JFrame implements ActionListener {
	
	private String[] opciones = {""};
	private JPanel contentPane;
	private JComboBox comboBox = new JComboBox();
	private int opcombo;

	public int getOpcombo() {
		return opcombo;
	}

	public void setOpcombo(int opcombo) {
		this.opcombo = opcombo;
	}



	/**
	 * Create the frame.
	 */
	public Frame()  {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 513, 329);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setToolTipText("");
		setJMenuBar(menuBar);
		Label label = new Label("Menu Principal");
		label.setBackground(new Color(204, 204, 204));
		label.setFont(new Font("BankGothic Md BT", Font.PLAIN, 12));
		label.setForeground(new Color(0, 153, 153));
		menuBar.add(label);
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		
		JComboBox comboBox = new JComboBox();
		comboBox.setEditable(true);
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Registrar camion", "Registrar coche", "Registrar moto", "Mostrar coches", "Dar de baja camion", "Dar de baja coche", "Dar de baja moto"}));
		comboBox.addActionListener(this);
		contentPane.add(comboBox);
	}
	
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
	
		if(e.getSource() == comboBox){
			
			if(comboBox.getSelectedItem().equals("Registrar coche")){
				opcombo = 1;
				}
			if(comboBox.getSelectedItem().equals("Registrar camion")){
				opcombo = 2;
				}
		
			if(comboBox.getSelectedItem().equals("Registrar moto")){
				opcombo = 3;
				}
			if(comboBox.getSelectedItem().equals("Mostrar coche")){
				opcombo = 4;
				}
			if(comboBox.getSelectedItem().equals("Dar de baja coche")){
				opcombo = 5;
				}
			if(comboBox.getSelectedItem().equals("Dar de baja camion")){
				opcombo = 6;
				}
			
			if(comboBox.getSelectedItem().equals("Dar de baja moto")){
				opcombo = 7;
				}
			
		}	
				
	}
	
	
	
	
}



	


