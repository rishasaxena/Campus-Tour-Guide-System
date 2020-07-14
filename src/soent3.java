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

public class soent3 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public void soent3screen() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					soent3 frame = new soent3();
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
	public soent3() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1280, 750);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("Sports Days");
		lblNewLabel_2.setForeground(new Color(255, 255, 255));
		lblNewLabel_2.setFont(new Font("Comic Sans MS", Font.BOLD, 35));
		lblNewLabel_2.setBounds(485, 314, 220, 85);
		contentPane.add(lblNewLabel_2);
		
		JButton btnNewButton = new JButton("-->>");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				soent4 sb= new soent4();
				sb.soent4screen();
				dispose();
			}
		});
		btnNewButton.setFont(new Font("Forte", Font.BOLD, 22));
		btnNewButton.setBounds(1146, 657, 96, 33);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon(soent3.class.getResource("/image2/sports.png")));
		lblNewLabel.setBounds(112, 0, 1021, 703);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton_2 = new JButton("<<--");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				soent2 sbc= new soent2();
				sbc.soentscreen();
				dispose();
			}
		});
		btnNewButton_2.setFont(new Font("Forte", Font.BOLD, 22));
		btnNewButton_2.setBounds(1146, 596, 97, 33);
		contentPane.add(btnNewButton_2);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon(soent3.class.getResource("/Images/mac_keyboard_lit_RESIZE_0.jpg")));
		lblNewLabel_1.setBounds(0, 0, 1262, 703);
		contentPane.add(lblNewLabel_1);
	}

}
