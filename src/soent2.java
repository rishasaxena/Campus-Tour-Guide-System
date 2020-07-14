import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class soent2 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public void soentscreen() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					soent2 frame = new soent2();
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
	public soent2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1280, 750);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton_1 = new JButton("-->>");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				soent3 sq = new soent3();
				sq.soent3screen(); 
				dispose();
			}
		});
		btnNewButton_1.setFont(new Font("Forte", Font.BOLD, 22));
		btnNewButton_1.setBounds(1153, 638, 97, 25);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton = new JButton("<<--");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				soevnt st = new soevnt();
				st.soevntscreen(); 
				dispose();
			}
		});
		btnNewButton.setFont(new Font("Forte", Font.BOLD, 22));
		btnNewButton.setBounds(1153, 576, 97, 25);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_2 = new JLabel("Technical Eve");
		lblNewLabel_2.setBounds(492, 309, 198, 43);
		contentPane.add(lblNewLabel_2);
		lblNewLabel_2.setForeground(new Color(255, 255, 255));
		lblNewLabel_2.setFont(new Font("Comic Sans MS", Font.BOLD, 30));
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon(soent2.class.getResource("/image2/technial eve.png")));
		lblNewLabel.setBounds(127, 0, 1019, 703);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon(soent2.class.getResource("/Images/blur.jpg")));
		lblNewLabel_1.setBounds(0, 0, 1262, 703);
		contentPane.add(lblNewLabel_1);
		
		JPanel panel = new JPanel();
		panel.setBounds(526, 309, 205, 53);
		contentPane.add(panel);
	}

}
