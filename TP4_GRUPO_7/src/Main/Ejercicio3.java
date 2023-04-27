package Main;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;
import javax.swing.JRadioButton;
import javax.swing.JCheckBox;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Ejercicio3 extends JFrame{
	
	//DECLARACION COMPONENTES
	
	private static final long serialVersionUID = 1L;
	private JPanel contentPane, panel1, panel2;
	private JTextField textField;
	private JLabel lblPanel1, lblEspecialidad, lblHoras;
	private JRadioButton rbtWindows, rbtMac, rbtLinux;
	private JCheckBox cbxProgramacion, cbxAdministracion, cbxDisenoGrafico;
	private ButtonGroup grupoSistemasOp;
	private JButton btnAceptar;
	JFrame jFrame =new JFrame();
	

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
		panel1.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel1.setBounds(10, 11, 398, 66);
		getContentPane().add(panel1);
		panel1.setLayout(null);
		
		
		// instancia grupo de botones
		grupoSistemasOp = new ButtonGroup();
		
		// crea Radio buttons
		rbtWindows = new JRadioButton("Windows");
		rbtWindows.setSelected(true);
		rbtWindows.setActionCommand("Windows"); //agrego ActionCommand
		rbtWindows.setBounds(176, 22, 84, 23);
		panel1.add(rbtWindows);
		
		rbtMac = new JRadioButton("Mac");
		rbtMac.setActionCommand("Mac"); //agrego ActionCommand
		rbtMac.setBounds(262, 22, 62, 23);
		panel1.add(rbtMac);
		
		rbtLinux = new JRadioButton("Linux");
		rbtLinux.setActionCommand("Linux"); //agrego ActionCommand
		rbtLinux.setBounds(326, 22, 66, 23);
		panel1.add(rbtLinux);
			
		// agrego botones al grupo 
		grupoSistemasOp.add(rbtWindows);
		grupoSistemasOp.add(rbtMac);
		grupoSistemasOp.add(rbtLinux);
		
		lblPanel1 = new JLabel("Elije un sistema operativo");
		lblPanel1.setBounds(10, 26, 160, 14);
		panel1.add(lblPanel1);
		
		panel2 = new JPanel();
		panel2.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel2.setBounds(10, 88, 398, 125);
		contentPane.add(panel2);
		panel2.setLayout(null);
		
		lblEspecialidad = new JLabel("Elije una especialidad");
		lblEspecialidad.setBounds(10, 45, 122, 14);
		panel2.add(lblEspecialidad);
		
		cbxProgramacion = new JCheckBox("Programacion");
		cbxProgramacion.setBounds(164, 7, 116, 23);
		panel2.add(cbxProgramacion);
		
		cbxAdministracion = new JCheckBox("Administracion");
		cbxAdministracion.setBounds(164, 41, 116, 23);
		panel2.add(cbxAdministracion);
		
		cbxDisenoGrafico = new JCheckBox("Dise\u00F1o Grafico");
		cbxDisenoGrafico.setBounds(164, 80, 116, 23);
		panel2.add(cbxDisenoGrafico);
		
		lblHoras = new JLabel("Cantidad de Horas en el Computador:");
		lblHoras.setBounds(34, 224, 236, 17);
		contentPane.add(lblHoras);
		
		textField = new JTextField();
		textField.setBounds(280, 224, 69, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		btnAceptar = new JButton("Aceptar");
		btnAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				String prog, adm, dis;
				
				if(cbxProgramacion.isSelected()) {
					prog =  cbxProgramacion.getText() + " - ";
				}
				else { prog = "";}
				if(cbxAdministracion.isSelected()) {
					adm =  cbxAdministracion.getText() + " - ";
				}
				else {adm = "";}
				if(cbxDisenoGrafico.isSelected()) {
					dis =  cbxDisenoGrafico.getText() + " - ";
				}
				else {dis = "";}
				if(textField.getText().isEmpty()) {
					textField.setText("0"); 
				}
							
				String Grupo = grupoSistemasOp.getSelection().getActionCommand(); 
				JOptionPane.showMessageDialog(jFrame, Grupo + " - " + prog + adm + dis + textField.getText() + " Hs");
				textField.setText("");
				cbxProgramacion.setSelected(false);
				cbxAdministracion.setSelected(false);
				cbxDisenoGrafico.setSelected(false);
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
