import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JTextArea;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class us extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public void university() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					us frame = new us();
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
	public us() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Ajinkya D Y Patil Technical Campus, Lohegaon");
		setBounds(100, 100, 1280, 750);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon(us.class.getResource("/Images/uni.jpg")));
		lblNewLabel.setBounds(0, 0, 941, 703);
		contentPane.add(lblNewLabel);
		
		JTextArea txtrTheUniversityShop = new JTextArea();
		txtrTheUniversityShop.setFont(new Font("Kristen ITC", Font.BOLD, 17));
		txtrTheUniversityShop.setText(">This Shop Is available for the\r\n  each and every Campus Students.\r\n\r\n>The Shop consists of every \r\n  essential things required by \r\n  students of any Field.");
		txtrTheUniversityShop.setBounds(942, 130, 320, 174);
		contentPane.add(txtrTheUniversityShop);
		
		JTextArea txtrTheUniversityShop_1 = new JTextArea();
		txtrTheUniversityShop_1.setFont(new Font("Kristen ITC", Font.BOLD, 26));
		txtrTheUniversityShop_1.setText("THE UNIVERSITY \r\nSHOP");
		txtrTheUniversityShop_1.setBounds(942, 13, 320, 104);
		contentPane.add(txtrTheUniversityShop_1);
		
		JButton btnNewButton = new JButton("Back");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				More m1 = new More();
				m1.NewScreen1(); 
				dispose();
			}
		});
		btnNewButton.setFont(new Font("Lucida Calligraphy", Font.BOLD, 25));
		btnNewButton.setBounds(1032, 485, 181, 58);
		contentPane.add(btnNewButton);
	}

}
