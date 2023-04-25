package main;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Ejercicio1 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField tfNombre;
	private JTextField tfApellido;
	private JTextField tfTelefono;
	private JTextField tfFechaNac;
	private JLabel lblLosDatosIngresados;
	private JLabel lblMostrar;
	
	public Ejercicio1() {
		setTitle("Contactos");
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		setBounds(600, 100, 380, 400);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNombre = new JLabel("NOMBRE");
		lblNombre.setBounds(41, 58, 65, 14);
		contentPane.add(lblNombre);
		
		JLabel lblApellido = new JLabel("APELLIDO");
		lblApellido.setBounds(41, 96, 65, 14);
		contentPane.add(lblApellido);
		
		JLabel lblTelefono = new JLabel("TELEFONO");
		lblTelefono.setBounds(41, 134, 65, 14);
		contentPane.add(lblTelefono);
		
		JLabel lblFechaNac = new JLabel("FECHA NAC.");
		lblFechaNac.setBounds(41, 180, 78, 14);
		contentPane.add(lblFechaNac);
		
		tfNombre = new JTextField();
		tfNombre.setBounds(141, 55, 201, 20);
		contentPane.add(tfNombre);
		tfNombre.setColumns(10);
		
		tfApellido = new JTextField();
		tfApellido.setColumns(10);
		tfApellido.setBounds(141, 93, 201, 20);
		contentPane.add(tfApellido);
		
		tfTelefono = new JTextField();
		tfTelefono.setColumns(10);
		tfTelefono.setBounds(141, 131, 201, 20);
		contentPane.add(tfTelefono);
		
		tfFechaNac = new JTextField();
		tfFechaNac.setBounds(141, 177, 201, 20);
		contentPane.add(tfFechaNac);
		tfFechaNac.setColumns(10);
		
		JButton btnMostrar = new JButton("MOSTRAR");
		btnMostrar.setBounds(238, 218, 104, 38);
		contentPane.add(btnMostrar);
		
		lblLosDatosIngresados = new JLabel("Los datos ingresados fueron:");
		lblLosDatosIngresados.setBounds(10, 277, 172, 14);
		contentPane.add(lblLosDatosIngresados);
		
		lblMostrar = new JLabel("");
		lblMostrar.setBounds(10, 316, 332, 14);
		contentPane.add(lblMostrar);
		
		
	}
	public void cambiarVisibilidad(boolean estado)
	{
		setVisible(true);
	}
	
}
