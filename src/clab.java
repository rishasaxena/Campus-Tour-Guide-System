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

public class clab extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public void clabscreen() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					clab frame = new clab();
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
	public clab() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1280, 750);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton_1 = new JButton("-->>");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				clab2 cl2 = new clab2();
				cl2.clab2screen(); 
				dispose();
			}
		});
		btnNewButton_1.setFont(new Font("Forte", Font.BOLD, 22));
		btnNewButton_1.setBounds(1170, 678, 97, 25);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton = new JButton("<<--");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				comp1 cp1 = new comp1();
				cp1.comp1screen(); 
				dispose();
			}
		});
		btnNewButton.setFont(new Font("Forte", Font.BOLD, 22));
		btnNewButton.setBounds(1061, 678, 97, 25);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_4 = new JLabel("Lab no. 321 : Project Lab");
		lblNewLabel_4.setFont(new Font("Forte", Font.BOLD, 22));
		lblNewLabel_4.setBounds(41, 13, 253, 43);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon(clab.class.getResource("/Images/pic0.png")));
		lblNewLabel.setBounds(0, 2, 641, 368);
		contentPane.add(lblNewLabel);
		
		JLabel lblLabNo_2 = new JLabel("Lab no. 330 : Computer Graphics Lab");
		lblLabNo_2.setFont(new Font("Forte", Font.BOLD, 22));
		lblLabNo_2.setBounds(709, 382, 403, 43);
		contentPane.add(lblLabNo_2);
		
		JLabel lblLabNo_1 = new JLabel("Lab no. 327 : HardWare And Networks Lab");
		lblLabNo_1.setForeground(new Color(255, 255, 255));
		lblLabNo_1.setFont(new Font("Forte", Font.BOLD, 22));
		lblLabNo_1.setBounds(58, 396, 464, 43);
		contentPane.add(lblLabNo_1);
		
		JLabel lblLabNo = new JLabel("Lab no. 325 : Programming and Data Structures Lab");
		lblLabNo.setForeground(new Color(255, 255, 255));
		lblLabNo.setFont(new Font("Forte", Font.BOLD, 22));
		lblLabNo.setBounds(666, 13, 550, 43);
		contentPane.add(lblLabNo);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon(clab.class.getResource("/Images/Picture1.png")));
		lblNewLabel_1.setBounds(640, 2, 622, 367);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setIcon(new ImageIcon(clab.class.getResource("/image2/Picture2.png")));
		lblNewLabel_2.setBounds(0, 370, 641, 333);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("New label");
		lblNewLabel_3.setIcon(new ImageIcon(clab.class.getResource("/image2/Picture4.png")));
		lblNewLabel_3.setBounds(640, 370, 622, 333);
		contentPane.add(lblNewLabel_3);
	}

}
