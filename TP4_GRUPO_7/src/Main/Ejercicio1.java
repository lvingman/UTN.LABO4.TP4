package Main;

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
	private JLabel lblLosDatosIngresadosFueron;
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
		
		lblLosDatosIngresadosFueron = new JLabel();
		lblLosDatosIngresadosFueron.setBounds(10, 300, 400, 14);
		contentPane.add(lblLosDatosIngresadosFueron);
		
		lblMostrar = new JLabel("");
		lblMostrar.setBounds(10, 316, 332, 14);
		contentPane.add(lblMostrar);
		
		//Se completa Label con los datos ingresados
		
		btnMostrar.addActionListener(e ->{
			
			String nombre = tfNombre.getText();
			String apellido = tfApellido.getText();
			String telefono = tfTelefono.getText();
			String fecha = tfFechaNac.getText();

			if(verificaCampos(nombre, apellido, telefono, fecha))
			{
				String resultado = nombre + " " + apellido + " " + telefono + " " + fecha;
				lblLosDatosIngresadosFueron.setText(resultado);
				limpiarTextFields();
			}
			
			
		});
		
		
	}
	public void cambiarVisibilidad(boolean estado)
	{
		setVisible(true);
	}
	//, String apellido, String telefono, String fecha
	private boolean verificaCampos(String nombre, String apellido, String telefono, String fecha) 
	{
		boolean empty = false;
		
		if(nombre.equals(""))
		{
			tfNombre.setBackground(Color.red);
			empty = true;
		}
		if(apellido.equals("")) 
		{
			tfApellido.setBackground(Color.red);
			empty = true;

		}
		if(telefono.equals("")) 
		{
			tfTelefono.setBackground(Color.red);
			empty = true;

		}
		if(fecha.equals("")) 
		{
			tfFechaNac.setBackground(Color.red);
		    empty = true;

		}
		
		if(!empty)
		{
			return true;
		}else {
			return false;
		}
		
	}
	
	private void limpiarTextFields() 
	{
		tfNombre.setText("");
		tfApellido.setText("");
		tfTelefono.setText("");
		tfFechaNac.setText("");

		
	}
}
