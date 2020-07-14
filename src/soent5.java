import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Color;

public class soent5 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public void soent5screen() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					soent5 frame = new soent5();
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
	public soent5() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1280, 750);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("<<--");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				soent4 sbd= new soent4();
				sbd.soent4screen();
				dispose();
			}
		});
		btnNewButton.setFont(new Font("Forte", Font.BOLD, 22));
		btnNewButton.setBounds(1165, 576, 97, 25);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("-->>");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				soent6 sbe= new soent6();
				sbe.soent6screen();
				dispose();
			}
		});
		btnNewButton_1.setFont(new Font("Forte", Font.BOLD, 22));
		btnNewButton_1.setBounds(1165, 637, 97, 25);
		contentPane.add(btnNewButton_1);
		
		JLabel lblTeaachersDayCelebration = new JLabel("Teaachers Day Celebration");
		lblTeaachersDayCelebration.setForeground(new Color(255, 255, 255));
		lblTeaachersDayCelebration.setFont(new Font("Forte", Font.BOLD, 30));
		lblTeaachersDayCelebration.setBounds(405, 354, 442, 115);
		contentPane.add(lblTeaachersDayCelebration);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon(soent5.class.getResource("/image2/teacherday.png")));
		lblNewLabel.setBounds(104, 0, 1025, 703);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon(soent5.class.getResource("/Images/blur.jpg")));
		lblNewLabel_1.setBounds(0, 0, 1262, 703);
		contentPane.add(lblNewLabel_1);
	}

}
