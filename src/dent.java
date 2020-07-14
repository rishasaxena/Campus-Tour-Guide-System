import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class dent extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public void dentalscreen() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					dent frame = new dent();
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
	public dent() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Ajinkya D Y Patil Technical Campus, Lohegaon");
		setBounds(100, 100, 1280, 750);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(224, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTextArea txtrDYPatil = new JTextArea();
		txtrDYPatil.setFont(new Font("Book Antiqua", Font.BOLD, 16));
		txtrDYPatil.setText("\t\t\t\tD Y Patil Dental School\r\n\r\nWelcome To D Y Patil Dental School\r\nIt's a tough task for students to select a good profession after 12th Science. To propel in this competitive world we have to choose\r\n proper career and an excellent institution.\r\n\r\nDentistry is a profession where you will constantly learn, come across new challenges which will allow you to help society. It is a\r\n rewarding profession where we get to help others, and regularly change people's lives for the better. Dentistry offers stimulating\r\n career options. In addition to private practice, excellent opportunities exist in teaching and research, careers with government agencies\r\n or in industry.\r\nHere we D Y Patil Dental School (DYPDS) welcome you to our dynamic group. The University will inspire you to bring your distinctness to\r\n your chosen field of study, will guide you to open your mind, help you find the essential you, your voice as an innovator. A curriculum that\r\n stimulates interest and develops knowledge, skills and deep understanding. Our commitment to personal attention distinguishes DYPDS\r\n from other institutions. A supportive staff where everyone has one single aim, that is to advance student development and success. DYPDS\r\n is one of the few institutions in the country focusing on research and leading the convergence of humanities, ethics and inventions. Our distinctive\r\n programs prepare you for a successful, rewarding career. We don't offer run-of-the-mill programs offered by several others. We offer programs\r\n specially designed and based on the real needs and challenges faced by the science and society. We wish you for the wonderful journey ahead......\r\n\r\nOUR PHILOSOPHY\r\n\r\nThe Group Strongly Believes That Leadership Positions Drive Growth. Leadership Positions Serve Customers Better, Attract Partners And Intellectual\r\n Capital, And Lead To Large Savings That Benefits All Stakeholders.\r\n\r\nMission\r\nA Pioneer In The Field Of Education With Rich Experience Of Over Two Decades, The Group Has Evolved A Pattern Of Education That Is In-Tune With\r\n The Changing Needs Of Today's Business Environment And Globalisation. Our Reputation For Uncompromising Standards With Access To An Abundant\r\n Pool Of Skill, Knowledge And Resources Makes Us An Ideal Choice For Students Embarking On A Career In Creating Powerful Identities Of Their Own.\r\n\r\nVision\r\nBy Delivering Broad, Deep And Integrated Capabilities In A Timely, Efficient And Creative Manner, The Group Will Continue To Create Exceptional Value\r\n For Its Customers And Employees. The Group Sees Quality Of Infrastructure, Academic Delivery And The Talent & Motivation Of Its Manpower As A Strategic \r\nRoadmap To Success.\r\n\r\n\r\nAppreciated And Admired As A Frontrunner In The Education Scenario, The D Y Patil Group Has Become A Name Synonymous With Quality Education.\r\n");
		txtrDYPatil.setBounds(0, 0, 1262, 646);
		contentPane.add(txtrDYPatil);
		
		JButton btnNewButton = new JButton("Images");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pDental1 dntal1 = new pDental1();
				dntal1.dentalscreenclass(); 
				dispose();
			}
		});
		btnNewButton.setBackground(new Color(173, 216, 230));
		btnNewButton.setFont(new Font("Comic Sans MS", Font.BOLD, 21));
		btnNewButton.setBounds(1032, 646, 139, 44);
		contentPane.add(btnNewButton);
	}

}

