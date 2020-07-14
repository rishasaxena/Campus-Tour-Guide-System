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

public class clab2 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public void clab2screen() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					clab2 frame = new clab2();
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
	public clab2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1280, 750);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton_1 = new JButton("-->>");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				clab3 cb3 = new clab3();
				cb3.clab3screen(); 
				dispose();
			}
		});
		btnNewButton_1.setFont(new Font("Forte", Font.BOLD, 22));
		btnNewButton_1.setBounds(1150, 678, 97, 25);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton = new JButton("<<--");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				clab clb = new clab();
				clb.clabscreen(); 
				dispose();
			}
		});
		btnNewButton.setFont(new Font("Forte", Font.BOLD, 22));
		btnNewButton.setBounds(1041, 678, 97, 25);
		contentPane.add(btnNewButton);
		
		JLabel lblLabNo = new JLabel("Lab no. 331 : Software Developement tools Lab");
		lblLabNo.setForeground(new Color(255, 255, 255));
		lblLabNo.setFont(new Font("Forte", Font.BOLD, 22));
		lblLabNo.setBounds(691, 25, 507, 43);
		contentPane.add(lblLabNo);
		
		JLabel lblLabNo_1 = new JLabel("Lab no. 333 : Software Lab");
		lblLabNo_1.setFont(new Font("Forte", Font.BOLD, 22));
		lblLabNo_1.setBounds(93, 25, 305, 43);
		contentPane.add(lblLabNo_1);
		
		JLabel lblLabNo_2 = new JLabel("Lab no. 338 : Computer Lab");
		lblLabNo_2.setFont(new Font("Forte", Font.BOLD, 22));
		lblLabNo_2.setBounds(119, 389, 294, 43);
		contentPane.add(lblLabNo_2);
		
		JLabel lblLabNo_3 = new JLabel("Lab no. 339 : Computer Networks Lab");
		lblLabNo_3.setForeground(new Color(255, 255, 255));
		lblLabNo_3.setFont(new Font("Forte", Font.BOLD, 22));
		lblLabNo_3.setBounds(659, 608, 400, 43);
		contentPane.add(lblLabNo_3);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon(clab2.class.getResource("/image2/Picture5.png")));
		lblNewLabel.setBounds(0, 0, 636, 350);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon(clab2.class.getResource("/image2/Picture6.png")));
		lblNewLabel_1.setBounds(636, 0, 626, 350);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setIcon(new ImageIcon(clab2.class.getResource("/image2/Picture7.png")));
		lblNewLabel_2.setBounds(0, 353, 636, 350);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("New label");
		lblNewLabel_3.setIcon(new ImageIcon(clab2.class.getResource("/image2/Picture8.png")));
		lblNewLabel_3.setBounds(636, 353, 626, 350);
		contentPane.add(lblNewLabel_3);
	}

}
