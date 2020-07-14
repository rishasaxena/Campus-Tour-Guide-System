import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;

public class soent6 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public void soent6screen() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					soent6 frame = new soent6();
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
	public soent6() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1280, 750);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("<<--");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				soent5 sbo= new soent5();
				sbo.soent5screen();
				dispose();
			}
		});
		btnNewButton.setFont(new Font("Forte", Font.BOLD, 22));
		btnNewButton.setBounds(1140, 573, 97, 25);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Back");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				comp1 sbp= new comp1();
				sbp.comp1screen();
				dispose();
			}
		});
		btnNewButton_1.setFont(new Font("Comic Sans MS", Font.BOLD, 22));
		btnNewButton_1.setBounds(1140, 632, 97, 31);
		contentPane.add(btnNewButton_1);
		
		JLabel lblNewLabel_2 = new JLabel("Social Activities");
		lblNewLabel_2.setForeground(new Color(255, 255, 255));
		lblNewLabel_2.setFont(new Font("Comic Sans MS", Font.BOLD, 35));
		lblNewLabel_2.setBounds(496, 277, 331, 103);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon(soent6.class.getResource("/image2/social.png")));
		lblNewLabel.setBounds(125, 0, 1016, 703);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon(soent6.class.getResource("/Images/logo.jpg")));
		lblNewLabel_1.setBounds(0, 0, 1262, 749);
		contentPane.add(lblNewLabel_1);
	}

}
