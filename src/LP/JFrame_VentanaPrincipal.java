package LP;

import javax.swing.JFrame;
import java.awt.Toolkit;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class JFrame_VentanaPrincipal extends JFrame {

	private static final long serialVersionUID = 1L;

	public JFrame_VentanaPrincipal() {
		
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Industria 4.0\\Desktop\\ProgramII\\ECLIPSE\\ProgramacionII\\Archivos gr\u00E1ficos\\iconfinder_magnifier_and_car_1421622.png"));
		setTitle("DESGUACE");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 596, 371);
		getContentPane().setLayout(null);
		
		JButton ButtonCar = new JButton("");
		ButtonCar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Frame_Altacoche altacoche = new Frame_Altacoche();
				altacoche.setVisible(true);
				dispose();
			}
		});
		ButtonCar.setIcon(new ImageIcon("C:\\Users\\Industria 4.0\\Desktop\\ProgramII\\ECLIPSE\\ProgramacionII\\Archivos gr\u00E1ficos\\iconfinder_camaro_64_67528.png"));
		ButtonCar.setBounds(112, 22, 185, 110);
		getContentPane().add(ButtonCar);
		
		JButton ButtonMotorcycle = new JButton("");
		ButtonMotorcycle.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		ButtonMotorcycle.setIcon(new ImageIcon("C:\\Users\\Industria 4.0\\Desktop\\ProgramII\\ECLIPSE\\ProgramacionII\\Archivos gr\u00E1ficos\\iconfinder_Honda_Motorcycle_with_Trailer_88276.png"));
		ButtonMotorcycle.setBounds(307, 22, 185, 110);
		getContentPane().add(ButtonMotorcycle);
		
		JButton ButtonTruck = new JButton("");
		ButtonTruck.setIcon(new ImageIcon("C:\\Users\\Industria 4.0\\Desktop\\ProgramII\\ECLIPSE\\ProgramacionII\\Archivos gr\u00E1ficos\\iconfinder_TractorUnitBlack_22998.png"));
		ButtonTruck.setBounds(211, 143, 185, 110);
		getContentPane().add(ButtonTruck);
		
		JButton Salir = new JButton("Salir");
		Salir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		Salir.setBounds(403, 287, 89, 23);
		getContentPane().add(Salir);
		
		JButton CambiarOperario = new JButton("Cambiar operario");
		CambiarOperario.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		CambiarOperario.setBounds(112, 287, 136, 23);
		getContentPane().add(CambiarOperario);
	}
	
}
