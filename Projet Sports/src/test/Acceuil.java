package test;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Color;

public class Acceuil extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
	
				try {
					Acceuil frame = new Acceuil();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
		
	}

	/**
	 * Create the frame.
	 */
	public Acceuil() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(280, 100, 548, 468);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Graphisme");
		lblNewLabel.setBackground(new Color(255, 255, 255));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setOpaque(true);
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Hp\\Documents\\projet d'integration\\Images\\cube.png"));
		lblNewLabel.setBounds(-4, 0, 264, 128);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Natation");
		lblNewLabel_1.setBackground(new Color(255, 255, 255));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\Hp\\Documents\\projet d'integration\\Images\\nager.png"));
		lblNewLabel_1.setOpaque(true);
		lblNewLabel_1.setBounds(267, 0, 267, 128);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblFitness = new JLabel("Fitness");
		lblFitness.setOpaque(true);
		lblFitness.setBackground(new Color(255, 255, 255));
		lblFitness.setHorizontalAlignment(SwingConstants.CENTER);
		lblFitness.setIcon(new ImageIcon("C:\\Users\\Hp\\Documents\\projet d'integration\\Images\\fitness.png"));
		lblFitness.setBounds(-4, 131, 264, 133);
		contentPane.add(lblFitness);
		
		JLabel lblSidentifier = new JLabel("S'identifier");
		lblSidentifier.setHorizontalAlignment(SwingConstants.CENTER);
		lblSidentifier.setBackground(new Color(255, 255, 255));
		lblSidentifier.setIcon(new ImageIcon("C:\\Users\\Hp\\Documents\\projet d'integration\\Images\\profile.png"));
		lblSidentifier.setOpaque(true);
		lblSidentifier.setBounds(267, 132, 267, 132);
		contentPane.add(lblSidentifier);
		
		JLabel lblZumba = new JLabel("Zumba");
		lblZumba.setBackground(new Color(255, 255, 255));
		lblZumba.setHorizontalAlignment(SwingConstants.CENTER);
		lblZumba.setOpaque(true);
		lblZumba.setIcon(new ImageIcon("C:\\Users\\Hp\\Documents\\projet d'integration\\Images\\pngegg.png"));
		lblZumba.setBounds(-4, 266, 264, 122);
		contentPane.add(lblZumba);
		
		JLabel lblNewLabel_5 = new JLabel("Running");
		lblNewLabel_5.setOpaque(true);
		lblNewLabel_5.setBackground(new Color(255, 255, 255));
		lblNewLabel_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5.setIcon(new ImageIcon("C:\\Users\\Hp\\Documents\\projet d'integration\\Images\\running.png"));
		lblNewLabel_5.setBounds(267, 266, 267, 122);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Application de sport");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_6.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_6.setBounds(0, 387, 534, 34);
		contentPane.add(lblNewLabel_6);
	}

}
