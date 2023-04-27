package Main;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Ventana extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JButton btnEjercicio1;
	private JButton btnEjercicio2;
	private JButton btnEjercicio3;
	private JLabel lblNewLabel;

	public Ventana() {
		//Configuracion de la ventana principal
		setTitle("Trabajo Practico N°4");
		setBounds(100, 100, 450, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//Configurar el panel de los botones
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		//Crear los botones
		btnEjercicio1 = new JButton("EJERCICIO 1");
		btnEjercicio2= new JButton("EJERCICIO 2");
		btnEjercicio3 = new JButton("EJERCICIO 3");
		
		//Agregar y configurar los botones en el panel
		contentPane.add(btnEjercicio1);
		contentPane.add(btnEjercicio2);
		contentPane.add(btnEjercicio3);
		
		btnEjercicio1.setBounds(163, 82, 108, 33);
		btnEjercicio2.setBounds(163, 131, 108, 33);
		btnEjercicio3.setBounds(163, 184, 108, 33);
		
		//Agregar acciones a los botones
		
		btnEjercicio1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Ejercicio1 v = new Ejercicio1();
				v.setVisible(true);
			}
		});
		
		
		btnEjercicio2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Ejercicio2 v = new Ejercicio2();
				v.setVisible(true);
			}
		});
		
		btnEjercicio3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Ejercicio3 v = new Ejercicio3();
				v.setVisible(true);
			}
		});
		
		//Configurar Label
		
		lblNewLabel = new JLabel("GRUPO NRO: 7");
		lblNewLabel.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 18));
		lblNewLabel.setBounds(31, 29, 166, 33);
		contentPane.add(lblNewLabel);
	}
	
	public void cambiarVisibilidad(boolean estado)
	{
		setVisible(estado); //cambio true por estado, no lo habia cambiado
	}

}
