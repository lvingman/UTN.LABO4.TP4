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
		
		//configuracion ventana
		setTitle("Contactos");
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		setBounds(600, 100, 380, 400);
		
		//creacion panel
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		// Crea labels y los agrega al panel
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
		
		
		//crea textFields y los agrega al apanel 
		tfNombre = new JTextField();
		tfNombre.setBounds(141, 55, 201, 20);
		contentPane.add(tfNombre);
		tfNombre.setColumns(10);
		
		tfApellido = new JTextField();
		tfApellido.setColumns(10);
		tfApellido.setBounds(141, 93, 201, 20);
		contentPane.add(tfApellido);
		
		tfTelefono = new JTextField();
		tfTelefono.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) 
			{
				int key = e.getKeyChar();
				boolean numeros = (key >= 48) &&(key <= 57);
				if(!numeros)
				{
					e.consume();
				}
				if(tfTelefono.getText().trim().length() == 10)
				{
					e.consume();
				}
			}
		});
		tfTelefono.setColumns(10);
		tfTelefono.setBounds(141, 131, 201, 20);
		contentPane.add(tfTelefono);
		
		tfFechaNac = new JTextField();
		tfFechaNac.setBounds(141, 177, 201, 20);
		contentPane.add(tfFechaNac);
		tfFechaNac.setColumns(10);
		
		
		// crea y agrega boton mostrar al panel
		JButton btnMostrar = new JButton("MOSTRAR");
		btnMostrar.setBounds(238, 218, 104, 38);
		contentPane.add(btnMostrar);
		
		
		// crea y agrega label de datos ingresados al panel
		lblLosDatosIngresados = new JLabel("Los datos ingresados fueron:");
		lblLosDatosIngresados.setBounds(10, 277, 172, 14);
		contentPane.add(lblLosDatosIngresados);
		
		lblLosDatosIngresadosFueron = new JLabel();
		lblLosDatosIngresadosFueron.setBounds(10, 300, 400, 14);
		contentPane.add(lblLosDatosIngresadosFueron);
		
		
		// crea y agrega label mostrar al panel
		lblMostrar = new JLabel("");
		lblMostrar.setBounds(10, 316, 332, 14);
		contentPane.add(lblMostrar);
		
		//Se completa Label con los datos ingresados
		
		btnMostrar.addActionListener(e ->{
			
			String nombre = tfNombre.getText().trim();
			String apellido = tfApellido.getText().trim();
			String telefono = tfTelefono.getText().trim();
			String fecha = tfFechaNac.getText().trim();

			lblMostrar.setText("");
			if(verificaCampos(nombre, apellido, telefono, fecha))
			{
				String resultado = nombre.trim().toUpperCase() + " " + apellido.trim().toUpperCase() + " " + telefono.trim() + " " + fecha.trim();
				lblLosDatosIngresadosFueron.setText(resultado);
				tfNombre.setBackground(Color.white);
				tfApellido.setBackground(Color.white);
				tfTelefono.setBackground(Color.white);
				tfFechaNac.setBackground(Color.white);
				limpiarTextFields();
			}
			else lblMostrar.setText("FALTAN COMPLETAR DATOS");
	
		});
		
		
	}
	
	
	
	public void cambiarVisibilidad(boolean estado)
	{
		setVisible(estado);
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
