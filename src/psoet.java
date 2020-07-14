import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class psoet extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public void psoetscreen() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					psoet frame = new psoet();
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
	public psoet() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Ajinkya D Y Patil Technical Campus, Lohegaon");
		setBounds(100, 100, 1280, 750);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon(psoet.class.getResource("/Images/1539724592571.jpg")));
		lblNewLabel.setBounds(0, 0, 899, 714);
		contentPane.add(lblNewLabel);
		
		JPanel panel = new JPanel();
		panel.setBounds(905, 0, 424, 454);
		contentPane.add(panel);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon(psoet.class.getResource("/Images/IMG20181015174401.jpg")));
		panel.add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("Home\r\n");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Main bc1 = new Main();
				bc1.NewScreen(); 
				dispose();
			}
		});
		btnNewButton.setBackground(new Color(135, 206, 250));
		btnNewButton.setFont(new Font("Comic Sans MS", Font.BOLD, 25));
		btnNewButton.setBounds(965, 515, 210, 102);
		contentPane.add(btnNewButton);
	}

}
