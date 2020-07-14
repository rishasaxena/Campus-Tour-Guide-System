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

public class soevnt extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public void soevntscreen() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					soevnt frame = new soevnt();
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
	public soevnt() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1280, 750);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton_1 = new JButton("-->>");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				soent2 nt = new soent2();
				nt.soentscreen(); 
				dispose();
			}
		});
		btnNewButton_1.setFont(new Font("Forte", Font.BOLD, 22));
		btnNewButton_1.setBounds(1095, 665, 97, 25);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton = new JButton("<<--");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				comp1 cw = new comp1();
				cw.comp1screen(); 
				dispose();
			}
		});
		btnNewButton.setFont(new Font("Forte", Font.BOLD, 22));
		btnNewButton.setBounds(961, 665, 97, 25);
		contentPane.add(btnNewButton);
		
		JLabel lblAceDay = new JLabel("ACE DAY");
		lblAceDay.setForeground(new Color(255, 255, 255));
		lblAceDay.setFont(new Font("Comic Sans MS", Font.BOLD, 30));
		lblAceDay.setBounds(571, 298, 158, 50);
		contentPane.add(lblAceDay);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon(soevnt.class.getResource("/image2/kj.png")));
		lblNewLabel.setBounds(37, 0, 1200, 703);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon(soevnt.class.getResource("/Images/blur.jpg")));
		lblNewLabel_1.setBounds(0, 0, 1262, 703);
		contentPane.add(lblNewLabel_1);
	}

}
