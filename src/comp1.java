import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class comp1 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public void comp1screen() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					comp1 frame = new comp1();
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
	public comp1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1280, 750);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				clab cl = new clab();
				cl.clabscreen(); 
				dispose();
			}
		});
		btnNewButton.setBackground(new Color(255, 255, 255));
		btnNewButton.setHorizontalAlignment(SwingConstants.LEFT);
		btnNewButton.setIcon(new ImageIcon(comp1.class.getResource("/Images/images (1).jpg")));
		btnNewButton.setBounds(51, 76, 418, 135);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("New button");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				soevnt vnt = new soevnt();
				vnt.soevntscreen(); 
				dispose();
			}
		});
		btnNewButton_1.setHorizontalAlignment(SwingConstants.LEFT);
		btnNewButton_1.setIcon(new ImageIcon(comp1.class.getResource("/Images/images.jpg")));
		btnNewButton_1.setBounds(651, 147, 355, 155);
		contentPane.add(btnNewButton_1);
		 
		JButton btnNewButton_2 = new JButton("New button");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Faculty f = new Faculty();
				f.FacultyScreen(); 
				dispose();
			}
		});
		btnNewButton_2.setIcon(new ImageIcon(comp1.class.getResource("/Images/download.png")));
		btnNewButton_2.setBounds(184, 323, 244, 175);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("New button");
		btnNewButton_3.setIcon(new ImageIcon(comp1.class.getResource("/Images/download (1).png")));
		btnNewButton_3.setBounds(666, 418, 220, 233);
		contentPane.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("Back");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Comp cv= new Comp();
				cv.CompScreen();
				dispose();
			}
		});
		btnNewButton_4.setFont(new Font("Comic Sans MS", Font.BOLD, 23));
		btnNewButton_4.setBounds(1086, 649, 102, 41);
		contentPane.add(btnNewButton_4);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon(comp1.class.getResource("/Images/mac.jpg")));
		lblNewLabel.setBounds(0, 0, 1262, 703);
		contentPane.add(lblNewLabel);
	}

}
