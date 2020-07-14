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
import java.awt.Color;

public class clab3 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public void clab3screen() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					clab3 frame = new clab3();
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
	public clab3() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1280, 750);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setIcon(new ImageIcon(clab3.class.getResource("/image2/Picture91.png")));
		lblNewLabel.setBounds(0, 0, 1153, 624);
		contentPane.add(lblNewLabel);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 1262, 703);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JButton btnNewButton_2 = new JButton("Back");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				comp1 cbp = new comp1();
				cbp.comp1screen(); 
				dispose();
			}
		});
		btnNewButton_2.setFont(new Font("Comic Sans MS", Font.BOLD, 24));
		btnNewButton_2.setBounds(1124, 643, 109, 36);
		panel.add(btnNewButton_2);
		
		JButton btnNewButton_1 = new JButton("<<--");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				clab2 clb2 = new clab2();
				clb2.clab2screen(); 
				dispose();
			}
		});
		btnNewButton_1.setFont(new Font("Forte", Font.BOLD, 22));
		btnNewButton_1.setBounds(994, 651, 97, 25);
		panel.add(btnNewButton_1);
		
		JLabel lblLabNo = new JLabel("Lab no. 342 : Research Lab");
		lblLabNo.setForeground(new Color(255, 255, 255));
		lblLabNo.setBackground(new Color(0, 0, 0));
		lblLabNo.setFont(new Font("Forte", Font.BOLD, 22));
		lblLabNo.setBounds(12, 28, 289, 57);
		panel.add(lblLabNo);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setBounds(-268, 5, 1798, 750);
		lblNewLabel_1.setIcon(new ImageIcon(clab3.class.getResource("/image2/mac - Copy.jpg")));
		panel.add(lblNewLabel_1);
	}

}
