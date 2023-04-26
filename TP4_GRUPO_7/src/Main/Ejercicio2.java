package Main;


import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;



public class Ejercicio2 extends JFrame  {

	private static final long serialVersionUID = 1L;
	
	private JPanel contentPane_1;
	private JTextField tfNota_1;
	private JTextField tfNota_2;
	private JTextField tfNota_3;
	private JComboBox<String> cbTPS;

	public Ejercicio2() {
		
		//configuracion ventana
		setTitle("Promedio");
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		setBounds(600, 100, 380, 400);
		
		//creacion PANEL 1
		contentPane_1 = new JPanel();
		contentPane_1.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane_1);
		contentPane_1.setLayout(null);
		
					// Crea labels y los agrega al PANEL 1
					JLabel lblNota_1 = new JLabel("Nota 1:");
					lblNota_1.setBounds(41, 58, 65, 14);
					contentPane_1.add(lblNota_1);
		
					JLabel lblNota_2 = new JLabel("Nota 2:");
					lblNota_2.setBounds(41, 96, 65, 14);
					contentPane_1.add(lblNota_2);
		
					JLabel lblNota_3 = new JLabel("Nota 3:");
					lblNota_3.setBounds(41, 134, 65, 14);
					contentPane_1.add(lblNota_3);
					
					JLabel lblTPS = new JLabel("TPS");
					lblTPS.setBounds(41, 180, 78, 14);
					contentPane_1.add(lblTPS);
					
					
						//crea textFields y los agrega al PANEL 1
					
							// textField Nota 1
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
							tfNota_1.setColumns(10);
							tfNota_1.setBounds(141, 55, 201, 20);
							contentPane_1.add(tfNota_1);
							
	
							// textField Nota 2
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
							tfNota_2.setBounds(141, 93, 201, 20);
							contentPane_1.add(tfNota_2);
							
							// textField Nota 3
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
							tfNota_3.setBounds(141, 131, 201, 20);
							contentPane_1.add(tfNota_3);
							
						// crea comboBox y lo agrega al PANEL 1
							cbTPS = new JComboBox<String>();
							cbTPS.setBounds(141, 177, 201, 20);
							add(cbTPS);
							cbTPS.addItem("Aprobado");
							cbTPS.addItem("Desaprobado");
							
					
					
		
		//creacion PANEL 2
		
		
				
				
	}
	
	public void cambiarVisibilidad(boolean estado)
	{
		setVisible(estado);
	}

	
	
	
}
