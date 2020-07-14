import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Faculty extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public void FacultyScreen() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Faculty frame = new Faculty();
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
	public Faculty() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1280, 750);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				comp1 cv1= new comp1();
				cv1.comp1screen();
				dispose();
			}
		});
		btnBack.setFont(new Font("Forte", Font.BOLD, 30));
		btnBack.setBounds(1073, 650, 140, 40);
		contentPane.add(btnBack);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon(Faculty.class.getResource("/image2/faculty1.jpg")));
		lblNewLabel.setBounds(59, 0, 1156, 703);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon(Faculty.class.getResource("/Images/blur.jpg")));
		lblNewLabel_1.setBounds(0, 0, 1262, 703);
		contentPane.add(lblNewLabel_1);
	}

}
