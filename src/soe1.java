import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import java.awt.Font;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class soe1 extends JFrame {

	/**
	 * Launch the application.
	 */
	public void SoeScreen() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					soe1 frame = new soe1();
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
	public soe1() {
		getContentPane().setBackground(new Color(255, 228, 225));
		setTitle("Ajinkya D Y Patil Technical Campus, Lohegaon");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1280, 750);
		getContentPane().setLayout(null);
		
		JTextArea txtrTheCollegeHas = new JTextArea();
		txtrTheCollegeHas.setBackground(new Color(255, 228, 225));
		txtrTheCollegeHas.setFont(new Font("Book Antiqua", Font.BOLD, 16));
		txtrTheCollegeHas.setText("The college has a cool glow with brilliant scenic beauty. The workplace has been equipped with powerful and versatile\r\nsoftware. It has helped in improving personal productivity, quicker disposal of files, optimal use of resources, creating\r\nfriendly environment and improve morale. It is the holistic approach of education that holds meaning in our lives.\r\n  Hence, we focus at comprehensive education which is all inclusive and proves to be the best for the professional \r\n in - the - making. Our aim is to impart the best of the knowledge to our students with well-equipped extracurricular \r\nand EQ related inputs and the desire and ability to learn, lead, excel to make them responsible and respected citizens.\r\n\r\nCourse Intake :-\r\nDiploma Computer Engineering - 60\r\nDiploma Mechanical Engineering - 120 \r\nB.E.-Computer Engineering - 120 \r\nB.E.-Electronics & Telecommunication Engineering - 120\r\nB.E.-Mechanical Engineering - 180\r\nB.E.-Civil Engineering - 60 \r\nM.E.- Electronics & Telecommunication Engineering (VLSI Design and Embedded System) - 24  \r\nM.E.-Mechanical Design Engineering - 24 \r\nM.E.-Computer Engineering - 24\r\n\r\nVision and Mission\r\n\r\nVision\r\nTo attain Academic Excellence by end of year 2022.\r\n\r\n \r\nMission\r\n1)      DYPSOE steadily translate its vision into reality through innovation, student's accomplishments, faculty integration \r\n         with industries and society inclusive of academic programs.\r\n2)      DYPSOE strategy hinges its core belief that all programs must enhance the employability of students and also \r\n         develop enterpreneur through an integrated and interdisciplinary approach.\r\n3)      DYPSOE establishes linkages with industries and creates center of learning to ensure that the curriculum is contemporary.\r\n\r\n ");
		txtrTheCollegeHas.setBounds(0, 0, 1262, 629);
		getContentPane().add(txtrTheCollegeHas);
		
		JButton btnImages = new JButton("Images");
		btnImages.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				psoe1 pso = new psoe1();
				pso.soe1sc(); 
				dispose();
			}
		});
		btnImages.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		btnImages.setBounds(1038, 642, 149, 48);
		getContentPane().add(btnImages);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon(soe1.class.getResource("/Images/logo.jpg")));
		lblNewLabel.setBounds(991, 39, 196, 121);
		getContentPane().add(lblNewLabel);
	}

}
