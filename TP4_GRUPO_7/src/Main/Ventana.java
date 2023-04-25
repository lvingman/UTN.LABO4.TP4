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
	private JButton btnEjercicio;
	private JButton btnEjercicio_1;
	private JButton btnEjercicio_2;
	private JLabel lblNewLabel;

	public Ventana() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		setTitle("Trabajo Practico N°4");
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		btnEjercicio = new JButton("EJERCICIO 1");
		btnEjercicio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Ejercicio1 v = new Ejercicio1();
				v.setVisible(true);
			}
		});
		btnEjercicio.setBounds(163, 82, 108, 33);
		contentPane.add(btnEjercicio);
		
		btnEjercicio_1 = new JButton("EJERCICIO 2");
		btnEjercicio_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Ejercicio2 v = new Ejercicio2();
				v.setVisible(true);
			}
		});
		btnEjercicio_1.setBounds(163, 131, 108, 33);
		contentPane.add(btnEjercicio_1);
		
		btnEjercicio_2 = new JButton("EJERCICIO 3");
		btnEjercicio_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Ejercicio3 v = new Ejercicio3();
				v.setVisible(true);
			}
		});
		btnEjercicio_2.setBounds(163, 184, 108, 33);
		contentPane.add(btnEjercicio_2);
		
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
