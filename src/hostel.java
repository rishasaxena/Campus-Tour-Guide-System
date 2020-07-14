import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JTextArea;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class hostel extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public void host() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					hostel frame = new hostel();
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
	public hostel() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Ajinkya D Y Patil Technical Campus, Lohegaon");
		setBounds(100, 100, 1280, 750);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon(hostel.class.getResource("/Images/1539726461290.jpg")));
		lblNewLabel.setBounds(-11, 0, 701, 703);
		contentPane.add(lblNewLabel);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBounds(688, 0, 574, 129);
		contentPane.add(panel);
		
		JTextArea txtrHostelFacilityIs = new JTextArea();
		txtrHostelFacilityIs.setFont(new Font("Comic Sans MS", Font.BOLD, 16));
		txtrHostelFacilityIs.setText("1. Hostel facility is available for Both Boys and Girls inside \r\nthe Campus. \r\n2. Provided with proper security measures, living environment & Hygine\r\nwith Mess Facility. \r\n3. It is more Affordable than living outside the campus.");
		panel.add(txtrHostelFacilityIs);
		
		JButton btnNewButton = new JButton("Home");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				More hm = new More();
				hm.NewScreen1(); 
				dispose();
			}
		});
		btnNewButton.setBackground(new Color(255, 250, 240));
		btnNewButton.setFont(new Font("Kristen ITC", Font.BOLD, 22));
		btnNewButton.setBounds(913, 561, 148, 58);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon(hostel.class.getResource("/Images/blur.jpg")));
		lblNewLabel_1.setBounds(0, 0, 1262, 703);
		contentPane.add(lblNewLabel_1);
	}

}
