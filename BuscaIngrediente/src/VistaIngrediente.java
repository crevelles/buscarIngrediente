import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;

public class VistaIngrediente extends JFrame {

	private JPanel contentPane;
	JTextField textId;
	JTextField textNombre;
	JTextField textDescrip;
	JLabel lblError;
	JButton btnSalir;
	JButton btnBuscar;


	public VistaIngrediente() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 559, 334);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Identificador\r\n");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 27));
		lblNewLabel.setBounds(46, 43, 150, 33);
		contentPane.add(lblNewLabel);
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setFont(new Font("Tahoma", Font.PLAIN, 27));
		lblNombre.setBounds(46, 99, 150, 33);
		contentPane.add(lblNombre);
		
		JLabel lblDescripcin = new JLabel("Descripci\u00F3n");
		lblDescripcin.setFont(new Font("Tahoma", Font.PLAIN, 27));
		lblDescripcin.setBounds(46, 158, 150, 33);
		contentPane.add(lblDescripcin);
		
		textId = new JTextField();
		textId.setBounds(227, 43, 134, 33);
		contentPane.add(textId);
		textId.setColumns(10);
		
		textNombre = new JTextField();
		textNombre.setColumns(10);
		textNombre.setBounds(227, 99, 269, 33);
		contentPane.add(textNombre);
		
		textDescrip = new JTextField();
		textDescrip.setColumns(10);
		textDescrip.setBounds(227, 158, 269, 33);
		contentPane.add(textDescrip);
		
		btnBuscar = new JButton("Buscar");
		btnBuscar.setFont(new Font("Tahoma", Font.PLAIN, 19));
		btnBuscar.setBounds(376, 43, 120, 35);
		contentPane.add(btnBuscar);
		
		btnSalir = new JButton("salir");
		btnSalir.setFont(new Font("Tahoma", Font.PLAIN, 19));
		btnSalir.setBounds(376, 221, 120, 35);
		contentPane.add(btnSalir);
		
		lblError = new JLabel("");
		lblError.setForeground(Color.RED);
		lblError.setBounds(46, 221, 315, 35);
		contentPane.add(lblError);
	}
		public void setControlador(Controlador c){
			btnBuscar.addActionListener(c);
			btnSalir.addActionListener(c);
		}
}
