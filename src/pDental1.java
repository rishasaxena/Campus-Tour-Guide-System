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

public class pDental1 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public void dentalscreenclass() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					pDental1 frame = new pDental1();
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
	public pDental1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Ajinkya D Y Patil Technical Campus, Lohegaon");
		setBounds(100, 100, 1280, 750);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon(pDental1.class.getResource("/Images/1539726396409.jpg")));
		lblNewLabel.setBounds(0, 0, 770, 703);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon(pDental1.class.getResource("/Images/IMG20181015170733.jpg")));
		lblNewLabel_1.setBounds(770, 0, 492, 544);
		contentPane.add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("Home");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				Main bc4 = new Main();
				bc4.NewScreen(); 
				dispose();
			}
		});
		btnNewButton.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		btnNewButton.setBounds(946, 587, 130, 52);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setIcon(new ImageIcon(pDental1.class.getResource("/Images/blur.jpg")));
		lblNewLabel_2.setBounds(0, 0, 1262, 703);
		contentPane.add(lblNewLabel_2);
	}

}
