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

public class park extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public void parking() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					park frame = new park();
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
	public park() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Ajinkya D Y Patil Technical Campus, Lohegaon");
		setBounds(100, 100, 1280, 750);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon(park.class.getResource("/Images/par.jpg")));
		lblNewLabel.setBounds(0, 0, 1262, 598);
		contentPane.add(lblNewLabel);
		
		JTextArea txtrThereIs = new JTextArea();
		txtrThereIs.setFont(new Font("Kristen ITC", Font.BOLD, 21));
		txtrThereIs.setText("> There is a Vast n Spacious Parking for Campus professors,\r\n    Students and Visitors.\r\n> There are 3 Parking grounds inside the Campus.");
		txtrThereIs.setBounds(10, 608, 726, 95);
		contentPane.add(txtrThereIs);
		
		JButton btnNewButton = new JButton("Back");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				More p1 = new More();
				p1.NewScreen1(); 
				dispose();
			}
		});
		btnNewButton.setFont(new Font("Viner Hand ITC", Font.BOLD, 25));
		btnNewButton.setBounds(960, 611, 163, 68);
		contentPane.add(btnNewButton);
	}

}
