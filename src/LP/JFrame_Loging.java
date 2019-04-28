package LP;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import LN.clsGestor;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;

public class JFrame_Loging extends JFrame {

	
	private static final long serialVersionUID = 1L;
	
	private JPanel contentPane;
	private JTextField Textoperario;
	private JPasswordField Textcontraseña;
	
	
	public JFrame_Loging() {
		
		JFrame_VentanaPrincipal ventanaprincipal = new JFrame_VentanaPrincipal();
		
		clsGestor objGestor = new clsGestor();
		
		setFont(new Font("Dialog", Font.BOLD, 14));
		setTitle("Loging");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel Operario = new JLabel("Operario:");
		Operario.setFont(new Font("Tahoma", Font.PLAIN, 14));
		Operario.setBounds(99, 50, 62, 27);
		contentPane.add(Operario);
	
		Textoperario = new JTextField();
		Textoperario.setBounds(206, 55, 86, 20);
		contentPane.add(Textoperario);
		Textoperario.setColumns(10);
		
		JLabel Contrasea = new JLabel("Contrase\u00F1a:");
		Contrasea.setFont(new Font("Tahoma", Font.PLAIN, 14));
		Contrasea.setBounds(99, 101, 86, 27);
		contentPane.add(Contrasea);
		
		Textcontraseña = new JPasswordField();
		Textcontraseña.setBounds(206, 106, 86, 20);
		contentPane.add(Textcontraseña);
		
		
		JButton Entrar = new JButton("Entrar");
		Entrar.addActionListener(new ActionListener() {
			@SuppressWarnings("deprecation")
			public void actionPerformed(ActionEvent arg0) {

			if(objGestor.comprobarOperario(Textoperario.getText(), Textcontraseña.getText())== true) {
				JOptionPane.showInternalMessageDialog(null, "Usuario correcto");
				ventanaprincipal.setVisible(true);
				dispose();
				
			}else{
				JOptionPane.showInternalMessageDialog(null, "Usuario o contraseña incorrecto");
			}
			}
		});
		
		Entrar.setBounds(96, 195, 89, 23);
		contentPane.add(Entrar);
		
		JButton Salir = new JButton("Salir");
		Salir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		Salir.setBounds(256, 195, 89, 23);
		contentPane.add(Salir);
		
	}

}
