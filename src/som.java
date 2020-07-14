import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class som extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public void somscreen(){
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					som frame = new som();
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
	public som() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Ajinkya D Y Patil Technical Campus, Lohegaon");
		setBounds(100, 100, 1280, 750);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 245, 238));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTextArea txtrDYPatil = new JTextArea();
		txtrDYPatil.setFont(new Font("Book Antiqua", Font.BOLD, 16));
		txtrDYPatil.setText(" D Y Patil Technical Campus\u2019s, D Y Patil School of Management has evolved from a strong need to develop techno-managerial manpower for\r\n niche industry segments, in a socially conscious and integrated school of management. This need arises as a result of high degree of \r\nspecialization in an increasingly competitive environment.\r\n\r\nWe are responsible to bridge the requirements for business minds who can work seamlessly in the corporate environment so as to fulfill \r\nits basic objectives. The two-year full time Post Graduate Program in Management (MBA) lays the foundation for conceptual and analytical \r\nreasoning and gives the students an insight into the dynamics of the corporate world.\r\n\r\nWe have attempted to foster entrepreneurship spirit, encourage our students to take risk and think innovatively. This also provides students \r\nthe platform to manage scarce resources, & many more through the activities/ events of the institute.\r\n\r\nWe perceive that management education is far more than the traditional way of providing education, as it caters to the overall personality\r\n development needs of the budding managers which are the demand of the changing trend of current corporate environment.\r\n\r\nAs once famous person has said\r\n\"Formal education will make you a living; self-education will make you a fortune. ~ Jim Rohn\"\r\n\r\nThe Group Strongly Believes That Leadership Positions Drive Growth. Leadership Positions Serve Customers Better, Attract Partners And\r\n Intellectual Capital, And Lead To Large Savings That Benefits All Stakeholders.\r\n\r\n Mission\r\nA Pioneer In The Field Of Education With Rich Experience Of Over Two Decades, The Group Has Evolved A Pattern Of Education That Is \r\nIn-Tune With The Changing Needs Of Today's Business Environment And Globalization. Our Reputation For Uncompromising Standards\r\n With Access To An Abundant Pool Of Skill, Knowledge And Resources Makes Us An Ideal Choice For Students Embarking On A Career\r\n In Creating Powerful Identities Of Their Own.\r\n\r\n Vision\r\nBy Delivering Broad, Deep And Integrated Capabilities In A Timely, Efficient And Creative Manner, The Group Will Continue To Create\r\n Exceptional Value For Its Customers And Employees. The Group Sees Quality Of Infrastructure, Academic Delivery And The Talent &\r\n Motivation Of Its Manpower As A Strategic Road-map To Success.\r\n");
		txtrDYPatil.setBounds(0, 0, 1250, 606);
		contentPane.add(txtrDYPatil);
		
		JLabel label = new JLabel("");
		label.setBounds(1018, 619, 56, 16);
		contentPane.add(label);
		
		JButton btnNewButton = new JButton("Images\r\n");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				psom psm = new psom();
				psm.psomscreen(); 
				dispose();
			}
		});
		btnNewButton.setBackground(new Color(255, 192, 203));
		btnNewButton.setFont(new Font("Comic Sans MS", Font.BOLD, 21));
		btnNewButton.setBounds(994, 610, 179, 63);
		contentPane.add(btnNewButton);
	}

}
