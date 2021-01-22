package test;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.ImageIcon;
import java.awt.Cursor;
import javax.swing.JTextField;
import javax.swing.JButton;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Login extends JFrame implements ActionListener{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private final JLabel lblNewLabel = new JLabel("");
	private JTextField textField;
	private JTextField textField_1;
	private JLabel new_compte;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Login() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		lblNewLabel.setBounds(10, 10, 210, 243);
		lblNewLabel.setOpaque(true);
		lblNewLabel.setBackground(new Color(0, 128, 128));
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\Hp\\Documents\\projet d'integration\\Images\\profile.png"));
		lblNewLabel_1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblNewLabel_1.setBounds(53, 67, 128, 118);
		contentPane.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(250, 70, 160, 19);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(250, 154, 160, 19);
		contentPane.add(textField_1);
		
		JLabel lblNewLabel_2 = new JLabel("Identifiant");
		lblNewLabel_2.setBounds(250, 51, 76, 13);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Mot de passe");
		lblNewLabel_3.setBounds(250, 139, 76, 13);
		contentPane.add(lblNewLabel_3);
		
		new_compte = new JLabel("Cr\u00E9er un nouveau compte");
		new_compte.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				//action pour aller sur la page de créer un nouveau compte
				System.out.println("Vous avez cliqué sur créer un nouveau compte");
			}
		});
		new_compte.setHorizontalAlignment(SwingConstants.CENTER);
		new_compte.setForeground(new Color(255, 0, 0));
		new_compte.setBounds(250, 240, 160, 13);
		contentPane.add(new_compte);
		
		JButton btnNewButton = new JButton("Submit");
		//btnNewButton.addActionListener(this);
		btnNewButton.setBackground(new Color(128, 128, 128));
		btnNewButton.setBounds(342, 209, 84, 21);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Cancel");
		btnNewButton_1.addActionListener(this);
		btnNewButton_1.setBackground(new Color(128, 128, 128));
		btnNewButton_1.setBounds(230, 209, 91, 21);
		contentPane.add(btnNewButton_1);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("Vous avez cliqué sur cancel");
		
	}
	/*public void actionSubmit(ActionEvent submit) {
	System.out.println("Vous avez cliqué sur submit");
}*/
}
