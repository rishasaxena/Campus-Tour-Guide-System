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

public class pdc extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public void pdcscreen() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					pdc frame = new pdc();
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
	public pdc() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Ajinkya D Y Patil Technical Campus, Lohegaon");
		setBounds(100, 100, 1280, 702);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("Home");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Main bv = new Main();
				bv.NewScreen(); 
				dispose();
			}
		});
		btnNewButton.setBackground(new Color(255, 255, 255));
		btnNewButton.setFont(new Font("Comic Sans MS", Font.BOLD, 25));
		btnNewButton.setBounds(950, 536, 151, 73);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon(pdc.class.getResource("/Images/1539733762781.jpg")));
		lblNewLabel.setBounds(0, 0, 699, 680);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon(pdc.class.getResource("/Images/IMG20181015172412.jpg")));
		lblNewLabel_1.setBounds(789, -55, 427, 630);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setIcon(new ImageIcon(pdc.class.getResource("/Images/blur.jpg")));
		lblNewLabel_2.setBounds(0, 0, 1262, 655);
		contentPane.add(lblNewLabel_2);
	}

}
