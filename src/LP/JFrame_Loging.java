package LP;

import Comun.clsConstantes;
import Comun.itfProperty;
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
import java.util.ArrayList;
import java.awt.event.ActionEvent;

public class JFrame_Loging extends JFrame {

	
	private static final long serialVersionUID = 1L;
	
	private JPanel contentPane;
	private JTextField Textoperario;
	private JTextField Textcontrase�a;

	/**
	 * Se crea el frame.
	 */
	public JFrame_Loging() {
		
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
		
		Textcontrase�a = new JTextField();
		Textcontrase�a.setColumns(10);
		Textcontrase�a.setBounds(206, 106, 86, 20);
		contentPane.add(Textcontrase�a);
		
		JButton Entrar = new JButton("Entrar");
		Entrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				ArrayList<itfProperty> operarios;
				operarios = objGestor.DameOperarios();
				
				for(itfProperty o : operarios) {
					
					if(o.getProperty(clsConstantes.PROPIEDAD_USUARIO_IDOPERARIO).equals(getTextoperario()) && o.getProperty(clsConstantes.PROPIEDAD_USUARIO_CONTRASE�A).equals(getTextcontrase�a())) {
						
						JOptionPane.showMessageDialog(null, "Buenvenido a la aplicacion");
					}
						
				}
				JOptionPane.showMessageDialog(null, "Usuario o contrase�a incorrecto");	
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

	public JTextField getTextoperario() {
		return Textoperario;
	}

	public void setTextoperario(JTextField textoperario) {
		Textoperario = textoperario;
	}

	public JTextField getTextcontrase�a() {
		return Textcontrase�a;
	}

	public void setTextcontrase�a(JTextField textcontrase�a) {
		Textcontrase�a = textcontrase�a;
	}
	
	
}
