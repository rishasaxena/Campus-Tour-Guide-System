import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.UIManager;
import java.awt.SystemColor;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JRadioButton;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;

public class Soedept extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public void Soedeptscreen() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Soedept frame = new Soedept();
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
	public Soedept() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1280, 750);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("->");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Comp cmp = new Comp();
				cmp.CompScreen(); 
				dispose();
			}
		});
		btnNewButton.setForeground(new Color(0, 0, 0));
		btnNewButton.setBackground(new Color(0, 255, 255));
		btnNewButton.setFont(new Font("Franklin Gothic Heavy", Font.BOLD, 22));
		btnNewButton.setBounds(985, 196, 97, 25);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("->\r\n");
		btnNewButton_1.setFont(new Font("Franklin Gothic Heavy", Font.BOLD, 22));
		btnNewButton_1.setBounds(985, 285, 97, 25);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("->");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_2.setFont(new Font("Franklin Gothic Heavy", Font.BOLD, 22));
		btnNewButton_2.setBounds(985, 392, 97, 25);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("->");
		btnNewButton_3.setFont(new Font("Franklin Gothic Heavy", Font.BOLD, 22));
		btnNewButton_3.setBounds(985, 480, 97, 25);
		contentPane.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("Previous");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				psoe1 ps = new psoe1();
				ps.soe1sc(); 
				dispose();
			}
		});
		btnNewButton_4.setForeground(new Color(0, 0, 0));
		btnNewButton_4.setBackground(new Color(250, 128, 114));
		btnNewButton_4.setFont(new Font("Comic Sans MS", Font.BOLD, 35));
		btnNewButton_4.setBounds(998, 619, 175, 44);
		contentPane.add(btnNewButton_4);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(218, 165, 32));
		panel.setBounds(60, 196, 395, 50);
		contentPane.add(panel);
		
		JLabel lblNewLabel_1 = new JLabel("COMPUTER DEPARTMENT");
		lblNewLabel_1.setBackground(new Color(250, 240, 230));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.TRAILING);
		lblNewLabel_1.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel_1.setFont(new Font("Forte", Font.BOLD, 22));
		panel.add(lblNewLabel_1);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(199, 21, 133));
		panel_1.setBounds(60, 285, 395, 44);
		contentPane.add(panel_1);
		
		JLabel lblNewLabel_2 = new JLabel("CIVIL DEPARTMENT");
		lblNewLabel_2.setBackground(new Color(199, 21, 133));
		lblNewLabel_2.setFont(new Font("Forte", Font.BOLD, 22));
		panel_1.add(lblNewLabel_2);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(176, 196, 222));
		panel_2.setBounds(70, 392, 385, 44);
		contentPane.add(panel_2);
		
		JLabel lblNewLabel_3 = new JLabel("MECHANICAL DEPARTMENT");
		lblNewLabel_3.setBackground(new Color(128, 128, 0));
		lblNewLabel_3.setFont(new Font("Forte", Font.BOLD, 23));
		panel_2.add(lblNewLabel_3);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBackground(new Color(255, 255, 0));
		panel_4.setBounds(70, 480, 385, 44);
		contentPane.add(panel_4);
		
		JLabel lblNewLabel_4 = new JLabel("ENTC DEPARTMENT");
		lblNewLabel_4.setFont(new Font("Forte", Font.BOLD, 22));
		panel_4.add(lblNewLabel_4);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon(Soedept.class.getResource("/Images/logo.jpg")));
		lblNewLabel.setBounds(0, 0, 1262, 703);
		contentPane.add(lblNewLabel);
	}
}
