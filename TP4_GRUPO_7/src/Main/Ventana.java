package Main;




import javax.swing.JButton;
import javax.swing.JFrame;

public class Ventana extends JFrame{
	
	private static final long serialVersionUID = 1L;
	
	private JButton boton1, boton2, boton3;
	
	public Ventana() {
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(500,500);
		setLocation(350,350);
		setTitle("Trabajo Practico Nº4");
		setLayout(null);
		
		// BOTON 1
		boton1 = new JButton();
		boton1.setText("Ejercicio 1");
		boton1.setBounds(20,25,140,30);
		getContentPane().add(boton1);
		setLayout(null);
		
		
		// BOTON 2
		boton2 = new JButton();
		boton2.setText("Ejercicio 2");
		boton2.setBounds(20,75,140,30);
		getContentPane().add(boton2);
		
		// BOTON 3
		boton3 = new JButton();
		boton3.setText("Ejercicio 3");
		boton3.setBounds(20,125,140,30);
		getContentPane().add(boton3);
		
		
		
	}
	
	public void cambiarVisibilidad(boolean estado) {
		setVisible(true);
	}
	
	
}


