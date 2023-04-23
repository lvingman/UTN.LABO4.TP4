package Main;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Ejercicio1 {
	
	private JButton boton;
	
	Ventana ejercicio1 = new Ventana();

	public Ejercicio1()
	{
		ejercicio1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ejercicio1.setSize(500,500);
		ejercicio1.setLocation(350,350);
		ejercicio1.setTitle("Contactos");
		ejercicio1.setLayout(null);
		
		boton = new JButton();
		boton.setText("Mostrar");
		boton.setBounds(10,15, 140,30);
		ejercicio1.getContentPane().add(boton);
		boton.addActionListener(new eventoBoton());
	}
}

class eventoBoton implements ActionListener
{

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("Esta presionando boton Mostrar");
		
	}
	
}