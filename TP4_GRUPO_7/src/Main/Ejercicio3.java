package Main;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;
import javax.swing.JRadioButton;
import javax.swing.JCheckBox;
import javax.swing.UIManager;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Ejercicio3 extends JFrame{
	
	//DECLARACION COMPONENTES
	
	private static final long serialVersionUID = 1L;
	private JPanel contentPane, panel1, panel2;
	private JTextField textField;

	private JRadioButton rbtWindows;
	private JRadioButton rbtMac;
	private JRadioButton rbtLinux;
	
	private ButtonGroup grupoSistemasOp;

	

	//CONF VENTANTA


	public Ejercicio3() {
		
		//configuracion de la ventana 
		
		setTitle("Seleccion multiple");
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		setBounds(600, 100, 434, 348);
		contentPane = new JPanel();
		contentPane.setBorder(null);
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		//PANEL 1
		
		// creo panel
		panel1 = new JPanel();
		panel1.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel1.setBounds(10, 11, 398, 66);
		getContentPane().add(panel1);
		panel1.setLayout(null);
		
		
		// instancia grupo de botones
		grupoSistemasOp = new ButtonGroup();
		
		// crea Radio buttons
		rbtWindows = new JRadioButton("Windows");
		rbtWindows.setBounds(176, 22, 84, 23);
		panel1.add(rbtWindows);
		
		rbtMac = new JRadioButton("Mac");
		rbtMac.setBounds(262, 22, 62, 23);
		panel1.add(rbtMac);
		
		rbtLinux = new JRadioButton("Linux");
		rbtLinux.setBounds(326, 22, 66, 23);
		panel1.add(rbtLinux);
		
		// agrego botones al grupo 
		grupoSistemasOp.add(rbtWindows);
		grupoSistemasOp.add(rbtMac);
		grupoSistemasOp.add(rbtLinux);
		
		JLabel lblPanel1 = new JLabel("Elije un sistema operativo");
		lblPanel1.setBounds(10, 26, 160, 14);
		panel1.add(lblPanel1);
		
		JPanel pnlPanel2 = new JPanel();
		pnlPanel2.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		pnlPanel2.setBounds(10, 88, 398, 125);
		contentPane.add(pnlPanel2);
		pnlPanel2.setLayout(null);
		
		JLabel lblEspecialidad = new JLabel("Elije una especialidad");
		lblEspecialidad.setBounds(10, 45, 122, 14);
		pnlPanel2.add(lblEspecialidad);
		
		JCheckBox cbxProgramacion = new JCheckBox("Programacion");
		cbxProgramacion.setBounds(164, 7, 116, 23);
		pnlPanel2.add(cbxProgramacion);
		
		JCheckBox cbxAdministracion = new JCheckBox("Administracion");
		cbxAdministracion.setBounds(164, 41, 116, 23);
		pnlPanel2.add(cbxAdministracion);
		
		JCheckBox cbxDisenoGrafico = new JCheckBox("Dise\u00F1o Grafico");
		cbxDisenoGrafico.setBounds(164, 80, 116, 23);
		pnlPanel2.add(cbxDisenoGrafico);
		
		JLabel lblHoras = new JLabel("Cantidad de Horas en el Computador:");
		lblHoras.setBounds(34, 224, 236, 17);
		contentPane.add(lblHoras);
		
		textField = new JTextField();
		textField.setBounds(280, 224, 69, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnAceptar = new JButton("Aceptar");
		btnAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				JOptionPane.showMessageDialog(null,"");
			}
		});
		
		btnAceptar.setBounds(293, 255, 89, 23);
		contentPane.add(btnAceptar);
		
	
	
	}
	
	
	
	
	
	
	public void cambiarVisibilidad(boolean estado)
	{
		setVisible(true);
	}
}
