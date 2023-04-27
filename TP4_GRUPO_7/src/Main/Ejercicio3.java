package Main;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;
import javax.swing.JRadioButton;
import javax.swing.JCheckBox;

public class Ejercicio3 extends JFrame{
	
	//DECLARACION COMPONENTES
	
	private static final long serialVersionUID = 1L;
	private JPanel contentPane, panel1, panel2;
	private JTextField tfNota_1, tfNota_2, tfNota_3, tfPromedio, tfCondicion;
	private JLabel lblNota_1, lblNota_2, lblNota_3, lblTPS, lblaux, lblPromedio, lblCondicion;
	private JComboBox<String> cbTPS;
	private JButton btnCalcular, btnNuevo, btnSalir;
	private JRadioButton rbtMac;
	private JRadioButton rbtLinux;
	private JTextField textField;

	

	//CONF VENTANTA


	public Ejercicio3() {
		
		//configuracion de la ventana 
		
		setTitle("Promedio");
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		setBounds(600, 100, 434, 348);
		contentPane = new JPanel();
		contentPane.setBorder(null);
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		//PANEL 1
		
		panel1 = new JPanel();
		panel1.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel1.setBounds(10, 11, 372, 66);
		getContentPane().add(panel1);
		panel1.setLayout(null);
		
		JRadioButton rbtWindows = new JRadioButton("Windows");
		rbtWindows.setBounds(150, 22, 84, 23);
		panel1.add(rbtWindows);
		
		rbtMac = new JRadioButton("Mac");
		rbtMac.setBounds(236, 22, 62, 23);
		panel1.add(rbtMac);
		
		rbtLinux = new JRadioButton("Linux");
		rbtLinux.setBounds(300, 22, 66, 23);
		panel1.add(rbtLinux);
		
		JLabel lblPanel1 = new JLabel("Elije un Sistema Operativo");
		lblPanel1.setBounds(10, 26, 153, 14);
		panel1.add(lblPanel1);
		
		JPanel pnlPanel2 = new JPanel();
		pnlPanel2.setBounds(10, 88, 372, 125);
		contentPane.add(pnlPanel2);
		pnlPanel2.setLayout(null);
		
		JLabel lblEspecialidad = new JLabel("Elije una Especialidad");
		lblEspecialidad.setBounds(42, 45, 107, 14);
		pnlPanel2.add(lblEspecialidad);
		
		JCheckBox cbxProgramacion = new JCheckBox("Programacion");
		cbxProgramacion.setBounds(233, 7, 97, 23);
		pnlPanel2.add(cbxProgramacion);
		
		JCheckBox cbxAdministracion = new JCheckBox("Administracion");
		cbxAdministracion.setBounds(233, 41, 97, 23);
		pnlPanel2.add(cbxAdministracion);
		
		JCheckBox cbxDisenoGrafico = new JCheckBox("Dise\u00F1o Grafico");
		cbxDisenoGrafico.setBounds(233, 80, 97, 23);
		pnlPanel2.add(cbxDisenoGrafico);
		
		JLabel lblHoras = new JLabel("Cantidad de Horas en el Computador:");
		lblHoras.setBounds(34, 224, 236, 17);
		contentPane.add(lblHoras);
		
		textField = new JTextField();
		textField.setBounds(280, 224, 69, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnAceptar = new JButton("Aceptar");
		btnAceptar.setBounds(293, 255, 89, 23);
		contentPane.add(btnAceptar);
		
	
	
	}
	
	
	
	
	
	
	public void cambiarVisibilidad(boolean estado)
	{
		setVisible(true);
	}
}
