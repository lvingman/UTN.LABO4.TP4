package Main;


import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.math.RoundingMode;
import java.text.DecimalFormat;

public class Ejercicio2 extends JFrame {

	//declaración de los componentes

	private static final long serialVersionUID = 1L;
	private JPanel contentPane, panel1, panel2;
	private JTextField tfNota_1, tfNota_2, tfNota_3, tfPromedio, tfCondicion;
	private JLabel lblNota_1, lblNota_2, lblNota_3, lblTPS, lblaux, lblPromedio, lblCondicion;
	private JComboBox<String> cbTPS;
	private JButton btnCalcular, btnNuevo, btnSalir;

	
	public Ejercicio2() {
		
		//configuracion de la ventana 
		
		setTitle("Promedio");
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		setBounds(600, 100, 396, 400);
		contentPane = new JPanel();
		contentPane.setBorder(null);
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		//Creación del panel 1
		
		panel1 = new JPanel();
		panel1.setBorder(new TitledBorder(null, "Notas del Estudiante", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel1.setBounds(10, 34, 239, 157);
		getContentPane().add(panel1);
		panel1.setLayout(null);
		
		lblNota_1 = new JLabel("Nota 1:");
		lblNota_1.setBounds(10, 36, 45, 14);
		panel1.add(lblNota_1);
		
		lblNota_2 = new JLabel("Nota 2:");
		lblNota_2.setBounds(10, 60, 45, 14);
		panel1.add(lblNota_2);
		
		lblNota_3 = new JLabel("Nota 3:");
		lblNota_3.setBounds(10, 85, 45, 14);
		panel1.add(lblNota_3);
		
		lblTPS = new JLabel("TPS");
		lblTPS.setBounds(23, 114, 32, 14);
		panel1.add(lblTPS);
		
		lblaux = new JLabel("");
		lblaux.setBounds(23, 114, 32, 14);
		lblaux.setVisible(false);
		panel1.add(lblaux);
		
		tfNota_1 = new JTextField();
		tfNota_1.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) 
			{
				int key = e.getKeyChar();
				boolean numeros = (key >= 48) && (key <= 57) || (key == 46);
				if(!numeros)
				{
					e.consume();
				}
				
				if((Float.parseFloat(tfNota_1.getText() + (char)key)) > 10) {
					e.consume();
				}
				
				if(tfNota_1.getText().contains(".") && (key == 46)) {
					e.consume();
				}
				
				if(tfNota_1.getText().contains("10") && (key == 46)) {
					e.consume();
				}	
				
				if(tfNota_1.getText().trim().length() == 3)
				{
					e.consume();
				}
			}
		});
		tfNota_1.setBounds(82, 33, 131, 20);
		panel1.add(tfNota_1);
		tfNota_1.setColumns(10);
		
		tfNota_2 = new JTextField();
		tfNota_2.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) 
			{
				int key = e.getKeyChar();
				boolean numeros = (key >= 48) && (key <= 57) || (key == 46);
				if(!numeros)
				{
					e.consume();
				}
				
				if((Float.parseFloat(tfNota_2.getText() + (char)key)) > 10) {
					e.consume();
				}
				
				if(tfNota_2.getText().contains(".") && (key == 46)) {
					e.consume();
				}
				
				if(tfNota_2.getText().contains("10") && (key == 46)) {
					e.consume();
				}	
				
				if(tfNota_2.getText().trim().length() == 3)
				{
					e.consume();
				}
			}
		});
		tfNota_2.setColumns(10);
		tfNota_2.setBounds(82, 57, 131, 20);
		panel1.add(tfNota_2);
		
		tfNota_3 = new JTextField();
		tfNota_3.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) 
			{
				int key = e.getKeyChar();
				boolean numeros = (key >= 48) && (key <= 57) || (key == 46);
				if(!numeros)
				{
					e.consume();
				}
				
				if((Float.parseFloat(tfNota_3.getText() + (char)key)) > 10) {
					e.consume();
				}
				
				if(tfNota_3.getText().contains(".") && (key == 46)) {
					e.consume();
				}
				
				if(tfNota_3.getText().contains("10") && (key == 46)) {
					e.consume();
				}	
				
				if(tfNota_3.getText().trim().length() == 3)
				{
					e.consume();
				}
			}
		});
		tfNota_3.setColumns(10);
		tfNota_3.setBounds(82, 82, 131, 20);
		panel1.add(tfNota_3);
		
		cbTPS = new JComboBox<String>();
		cbTPS.addItem("-SELECCIONE-");
		cbTPS.addItem("APROBADO");
		cbTPS.addItem("DESAPROBADO");
		cbTPS.setBounds(82, 111, 131, 20);
		panel1.add(cbTPS);
		cbTPS.addItemListener(new ItemListener() {
			@Override
			public void itemStateChanged(ItemEvent e) {
				lblaux.setText((String)cbTPS.getSelectedItem());
				
			}
			});
		
		//Creación del panel 2
		
		panel2 = new JPanel();
		panel2.setBorder(new TitledBorder(null, "Notas del Estudiante", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel2.setBounds(10, 214, 239, 104);
		getContentPane().add(panel2);
		panel2.setLayout(null);
		
		lblPromedio = new JLabel("Promedio:");
		lblPromedio.setBounds(10, 35, 63, 14);
		panel2.add(lblPromedio);
		
		lblCondicion = new JLabel("Condicion");
		lblCondicion.setBounds(10, 60, 63, 14);
		panel2.add(lblCondicion);
		
		tfPromedio = new JTextField();
		tfPromedio.setBounds(83, 32, 131, 20);
		panel2.add(tfPromedio);
		tfPromedio.setColumns(10);
		tfPromedio.setEditable(false);
		
		tfCondicion = new JTextField();
		tfCondicion.setColumns(10);
		tfCondicion.setBounds(83, 57, 131, 20);
		tfCondicion.setEditable(false);
		panel2.add(tfCondicion);
		
		btnCalcular = new JButton("CALCULAR");
		btnCalcular.setBounds(259, 103, 111, 33);
		contentPane.add(btnCalcular);
		//ActionListener COMENTADO
		//btnCalcular.addActionListener(new eventoBotonCalcular(tfNota_1,tfNota_2,tfNota_3,tfPromedio,tfCondicion,lblaux)); //falta desarrollar el evento, no lo agrego para que los demás tengan que desarrollar
		
		
		//Accion del boton calcular
		
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String n1 = tfNota_1.getText();
				String n2 = tfNota_2.getText();
				String n3 = tfNota_3.getText();
				int item = cbTPS.getSelectedIndex();
				

				if(verificaCamposCompletos(n1, n2, n3, item)) 
				{
					float nota1 = Float.parseFloat(n1);
					float nota2 = Float.parseFloat(n2);
					float nota3 = Float.parseFloat(n3);
					
					verificarCondiciones(nota1, nota2, nota3);
				}
				
				
			}
		});
		
		btnNuevo = new JButton("NUEVO");
		btnNuevo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				 tfNota_1.setText(null);
				 tfNota_1.setBackground(Color.white);
				 tfNota_2.setText(null);
				 tfNota_2.setBackground(Color.white);
			     tfNota_3.setText(null);
				 tfNota_3.setBackground(Color.white);
				 tfPromedio.setText(null);
				 tfCondicion.setText(null);
				 cbTPS.setSelectedIndex(0);
				 cbTPS.setBackground(Color.white);
	
			}
		});
		btnNuevo.setBounds(259, 158, 111, 33);
		contentPane.add(btnNuevo);
		
		btnSalir = new JButton("SALIR");
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				System.exit(0);
			}
		});
		btnSalir.setBounds(259, 210, 111, 33);
		contentPane.add(btnSalir);
		 
	}
	
	private void verificarCondiciones(float nota1, float nota2, float nota3) 
	{
		float promedioAux = (nota1 + nota2 + nota3) / 3; 
		
		DecimalFormat df = new DecimalFormat();
		df.setMaximumFractionDigits(2);
		
		String promedio = df.format(promedioAux);
		
		
		int itemTP = cbTPS.getSelectedIndex();
		
		
		if(itemTP == 1) {

			if(nota1 < 6 || nota2 < 6 || nota3 < 6) {
				tfCondicion.setText("LIBRE");
			}
			if(nota1 >= 8 && nota2 >= 8 && nota3 >= 8) {
				tfCondicion.setText("PROMOCIONADO");
			}
			if((nota1 >=6 && nota1<8) || (nota2 >=6 && nota2<8) || (nota3 >=6 && nota3 <8) ) {
				tfCondicion.setText("REGULAR");

			}
			
			cbTPS.setBackground(Color.WHITE);
			tfPromedio.setText(promedio);

		}
		if(itemTP==2) {
			tfPromedio.setText(promedio);
			cbTPS.setBackground(Color.WHITE);

			tfCondicion.setText("LIBRE");
		}
	
	
	}
	
	private boolean verificaCamposCompletos(String n1, String n2, String n3, int item) 
	{
		
		if(n1.isEmpty() || n2.isEmpty() || n3.isEmpty() || item == 0) 
		{
			if(n1.isEmpty()) {
				tfNota_1.setBackground(Color.red);
			}
			else {
					tfNota_1.setBackground(Color.WHITE);
				}
			if(n2.isEmpty()) {
				tfNota_2.setBackground(Color.red);
			}else {
				tfNota_2.setBackground(Color.WHITE);
			}if(n3.isEmpty()) {
				tfNota_3.setBackground(Color.red);
			}else {
				tfNota_3.setBackground(Color.WHITE);
			}if(item == 0) {
				cbTPS.setBackground(Color.red);
			}else {
				cbTPS.setBackground(Color.WHITE);
			}
			return false;			
	}else {
		return true;
	}
	}
}

