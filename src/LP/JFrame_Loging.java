package LP;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import LN.clsGestor;
import java.awt.Font;
import java.awt.Image;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;
import java.awt.Toolkit;

public class JFrame_Loging extends JFrame {

	
	private static final long serialVersionUID = 1L;
	
	private JPanel contentPane;
	private JTextField Textoperario;
	private JPasswordField Textcontraseña;
	
	
	public JFrame_Loging() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Industria 4.0\\Desktop\\ProgramII\\ECLIPSE\\ProgramacionII\\Archivos gr\u00E1ficos\\iconfinder_magnifier_and_car_1421622.png"));
		
		JFrame_VentanaPrincipal ventanaprincipal = new JFrame_VentanaPrincipal();
		
		clsGestor objGestor = new clsGestor();
		
		setFont(new Font("Dialog", Font.BOLD, 14));
		setTitle("DESGUACE");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel Operario = new JLabel("Operario:");
		Operario.setFont(new Font("Tahoma", Font.PLAIN, 14));
		Operario.setBounds(172, 100, 62, 27);
		contentPane.add(Operario);
	
		Textoperario = new JTextField();
		Textoperario.setBounds(289, 105, 86, 20);
		contentPane.add(Textoperario);
		Textoperario.setColumns(10);
		
		JLabel Contrasea = new JLabel("Contrase\u00F1a:");
		Contrasea.setFont(new Font("Tahoma", Font.PLAIN, 14));
		Contrasea.setBounds(172, 149, 86, 27);
		contentPane.add(Contrasea);
		
		Textcontraseña = new JPasswordField();
		Textcontraseña.setBounds(289, 154, 86, 20);
		contentPane.add(Textcontraseña);
		
		
		JButton Entrar = new JButton("Entrar");
		Entrar.addActionListener(new ActionListener() {
			@SuppressWarnings("deprecation")
			public void actionPerformed(ActionEvent arg0) {

			if(objGestor.comprobarOperario(Textoperario.getText(), Textcontraseña.getText())== true) {
				ventanaprincipal.setLocationRelativeTo(null);
				ventanaprincipal.setVisible(true);
				dispose();
				
			}else{
				JOptionPane.showInternalMessageDialog(null, "Usuario o contraseña incorrecto");
			}
			}
		});
		
		Entrar.setBounds(96, 211, 89, 23);
		contentPane.add(Entrar);
		
		JButton Salir = new JButton("Salir");
		Salir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		Salir.setBounds(259, 211, 89, 23);
		contentPane.add(Salir);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Industria 4.0\\Desktop\\ProgramII\\ECLIPSE\\ProgramacionII\\Archivos gr\u00E1ficos\\desguace.jpg"));
		lblNewLabel.setBounds(0, 0, 434, 60);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\Industria 4.0\\Desktop\\ProgramII\\ECLIPSE\\ProgramacionII\\Archivos gr\u00E1ficos\\iconfinder_preferences-system-login_24276 (1).png"));
		lblNewLabel_1.setBounds(53, 91, 73, 96);
		contentPane.add(lblNewLabel_1);
		
	}
}
