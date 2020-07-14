import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class soet extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public void soetscreen() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					soet frame = new soet();
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
	public soet() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Ajinkya D Y Patil Technical Campus, Lohegaon");
		setBounds(100, 100, 1280, 750);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTextArea txtrTheStudentWho = new JTextArea();
		txtrTheStudentWho.setFont(new Font("Book Antiqua", Font.BOLD, 16));
		txtrTheStudentWho.setText("The student who steps into our institute is not limited with the horizons of books and classroom coaching, instead we focus\r\non hands-on experience through practicals, projects, training and also understanding the tricks of the trade through interactions\r\nwith technical Gurus. The diversity of our offering enhances our ability to recognize the multiple intelligences that our students\r\npossess. We teach them to embrace change rather than resist it.\r\n\r\nOur College strives constantly to be one of the reputed colleges in the field of Engineering and Technology, in and around\r\nPune city. I feel privileged to invite you to our campus and I am confident that you will leave the campus equally privileged.\r\n\r\nOnce again, I welcome all the students who are willing to work hard in shaping a bright career for themselves and wish that\r\nthey will be competent enough to face the challenges and will be able to make significant & positive contributions towards\r\nthe progress of society & world at large along with proper understanding of human values.\r\n\r\nVision\r\nTo create outstanding professionals to serve the society through value based education.\r\n\r\nMission\r\n1)      Impart knowledge and skill based education in collaboration with industry, academia and research organizations.\r\n\r\n2)      To promote moral and professional ethics.\r\n\r\n3)      To nurture professionalism among young engineers to serve the need of society and industry.\r\n\r\nCourse Intake :-\r\nDiploma Computer Engineering - 60\r\nDiploma Mechanical Engineering - 120 \r\nB.E.-Computer Engineering - 120 \r\nB.E.-Electronics & Telecommunication Engineering - 120\r\nB.E.-Mechanical Engineering - 180\r\nB.E.-Civil Engineering - 60 \r\nB.E.-Automobile Engineering - 60\r\nM.E.- Electronics & Telecommunication Engineering (VLSI Design and Embedded System) - 24  \r\nM.E.-Mechanical Design Engineering - 24 \r\nM.E.-Computer Engineering - 24");
		txtrTheStudentWho.setBounds(12, 0, 1250, 642);
		contentPane.add(txtrTheStudentWho);
		
		JButton btnNewButton = new JButton("Images");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				psoet psot = new psoet();
				psot.psoetscreen(); 
				dispose();
			}
		});
		btnNewButton.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		btnNewButton.setBounds(1025, 655, 187, 35);
		contentPane.add(btnNewButton);
	}
}
