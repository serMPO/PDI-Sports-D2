package test;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Dimension;
import javax.swing.JRadioButton;

public class Register extends JFrame implements ActionListener{

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_4;
	private JTextField textField_5;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
			
				try {
					Register frame = new Register();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			
		
	}

	/**
	 * Create the frame.
	 */
	public Register() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(280, 100, 448, 468);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setOpaque(true);
		lblNewLabel.setBackground(new Color(32, 178, 170));
		lblNewLabel.setBounds(0, 10, 434, 28);
		contentPane.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(138, 71, 258, 19);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(138, 118, 258, 19);
		contentPane.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(138, 170, 258, 19);
		contentPane.add(textField_2);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(138, 266, 258, 19);
		contentPane.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(138, 318, 258, 19);
		contentPane.add(textField_5);
		
		JButton btnNewButton = new JButton("Cancel");
		btnNewButton.setBackground(new Color(105, 105, 105));
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setBounds(72, 380, 85, 21);
		contentPane.add(btnNewButton);
		
		JButton btnSubmit = new JButton("Submit");
		btnSubmit.setForeground(new Color(255, 255, 255));
		btnSubmit.setBackground(SystemColor.controlDkShadow);
		btnSubmit.setBounds(292, 380, 85, 21);
		contentPane.add(btnSubmit);
		
		JLabel lblNewLabel_1 = new JLabel("Nom");
		lblNewLabel_1.setBounds(83, 74, 45, 13);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Prenom");
		lblNewLabel_1_1.setBounds(72, 121, 56, 13);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Adresse mail");
		lblNewLabel_1_2.setBounds(43, 173, 85, 13);
		contentPane.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_3 = new JLabel("Profession");
		lblNewLabel_1_3.setBounds(50, 269, 78, 13);
		contentPane.add(lblNewLabel_1_3);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Oui");
		rdbtnNewRadioButton.addActionListener(this);
		rdbtnNewRadioButton.setBounds(151, 217, 103, 21);
		contentPane.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNon = new JRadioButton("Non");
		rdbtnNon.setBounds(293, 217, 103, 21);
		contentPane.add(rdbtnNon);
		
		JLabel lblNewLabel_1_3_1 = new JLabel("Etes vous sportif?");
		lblNewLabel_1_3_1.setBounds(27, 221, 107, 13);
		contentPane.add(lblNewLabel_1_3_1);
		
		JLabel lblNewLabel_1_3_2 = new JLabel("Mot de passe");
		lblNewLabel_1_3_2.setBounds(50, 321, 78, 13);
		contentPane.add(lblNewLabel_1_3_2);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// action du bouton oui qui demande des renseignements supplementaire sur le sport du client
		
	}
}
