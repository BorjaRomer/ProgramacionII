package LP;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import LN.clsGestor;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;
import java.awt.Toolkit;
import java.awt.Color;

/*
 * Clase en el que se comprueba el usuario introducido
 */
public class JFrame_Loging extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;

	private final String BOTON_SALIR = "boton_salir";
	private final String BOTON_ENTRAR = "boton_entrar";

	private JPanel contentPane;
	private JTextField Textoperario;
	private JPasswordField Textcontraseña;
	private clsGestor objGestor;
	
	JFrame_VentanaPrincipal ventanaPrincipal;

	/*
	 * Constructor de la clase
	 */
	public JFrame_Loging(clsGestor _objGestor) {

		objGestor = _objGestor;

		setIconImage(Toolkit.getDefaultToolkit().getImage(JFrame_Loging.class.getResource("/Data/icono.png")));

		setFont(new Font("Dialog", Font.BOLD, 14));
		setTitle("DESGUACE");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel Operario = new JLabel("Operario:");
		Operario.setForeground(Color.BLACK);
		Operario.setFont(new Font("Tahoma", Font.BOLD, 15));
		Operario.setBounds(173, 73, 86, 27);
		contentPane.add(Operario);
		Textoperario = new JTextField();
		Textoperario.setBounds(286, 78, 86, 20);
		contentPane.add(Textoperario);
		Textoperario.setColumns(10);

		JLabel Contrasea = new JLabel("Contrase\u00F1a:");
		Contrasea.setForeground(Color.BLACK);
		Contrasea.setFont(new Font("Tahoma", Font.BOLD, 15));
		Contrasea.setBounds(173, 115, 102, 27);
		contentPane.add(Contrasea);

		Textcontraseña = new JPasswordField();
		Textcontraseña.setBounds(286, 120, 86, 20);
		contentPane.add(Textcontraseña);

		JButton Entrar = new JButton("Entrar");
		Entrar.setActionCommand(BOTON_ENTRAR);
		Entrar.addActionListener(this);
		Entrar.setBounds(96, 211, 89, 23);
		contentPane.add(Entrar);

		JButton Salir = new JButton("Salir");
		Salir.setActionCommand(BOTON_SALIR);
		Salir.addActionListener(this);
		Salir.setBounds(259, 211, 89, 23);
		contentPane.add(Salir);

		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(JFrame_Loging.class.getResource("/Data/pc.png")));
		lblNewLabel_1.setBounds(51, 58, 73, 96);
		contentPane.add(lblNewLabel_1);

		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(JFrame_Loging.class.getResource("/Data/free-vector-texturas-background.jpg")));
		lblNewLabel.setBounds(0, 0, 434, 261);
		contentPane.add(lblNewLabel);
	}

	public void actionPerformed(ActionEvent a) {

		switch (a.getActionCommand()) {
		
		/*
		 * Se comprueba que el usuario existe y se abre la ventana principal
		 */
		case BOTON_ENTRAR:
				
				String operario = Textoperario.getText();
				@SuppressWarnings("deprecation") String contraseña = Textcontraseña.getText();
				
				/**Se comprueba que coincidan los operarios registrados con los que estan introduciendo*/
				if (objGestor.comprobarOperario(operario, contraseña) == true) {

					dispose();

					/** Si el usuario se logea correctamente se abre la ventana principal */
					ventanaPrincipal = new JFrame_VentanaPrincipal(objGestor, operario);
					ventanaPrincipal.setLocationRelativeTo(null);
					ventanaPrincipal.setVisible(true);
					
				}else {
				
				/**Si no coinciden con los operarios autorizados salta un mensaje de incorrecto*/
				JOptionPane.showInternalMessageDialog(null, "Usuario o contraseña incorrecto");
				Textoperario.setText("");
				Textcontraseña.setText("");
				}
			
			break;

			/** El programa se cierra */
		case BOTON_SALIR:

			System.exit(0);
			break;
		}
	}

}
