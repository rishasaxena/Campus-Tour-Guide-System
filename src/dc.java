import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.UIManager;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class dc extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public void dcscreen() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					dc frame = new dc();
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
	public dc() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Ajinkya D Y Patil Technical Campus, Lohegaon");
		setBounds(100, 100, 1280, 750);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 222, 173));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTextArea txtrDypdcAdvantageDilip = new JTextArea();
		txtrDypdcAdvantageDilip.setFont(new Font("Book Antiqua", Font.BOLD, 16));
		txtrDypdcAdvantageDilip.setText("                                             D Y Patil D C Centre For Automotive Research And Studies                   \r\n\r\n\r\nDYPDC is a youthful and innovative institution that aims to distinguish itself through passionate commitment to excellence in all of its \r\nendeavors.Innovation is integral to all our pursuits with inspiration, intuition, imagination and innovation being our guiding terms. \r\nOur students will be leaders and innovators. We are committed to:\r\n\r\nCreate and disseminate knowledge through a range of high-quality academic programs in a student-centered learning environment \r\nemphasizing intellectual achievement and employability.\r\n\r\nWork through a matrix of four imperatives in all academic and research pursuits, viz. what is desirable for people, what is feasible \r\nthrough technology, what is viable for business and what is good for society and the environment.\r\n\r\nDYPDC Advantage\r\nDilip Chhabria\r\nDYPDC offers pioneering undergraduate and postgraduate programs in the areas of Automobile Design and Innovation. With our \r\nhighly experiential, hands-on programs supported by excellent facilities and highly motivated faculty, we transform individuals into \r\nthe thinkers, dreamers and designers of tomorrow.\r\n\r\nDYPDC brings together the strengths of Dilip Chhabria in the area of Automobile Design and Innovation with that of the prestigious \r\nDY Patil Group in the area of education to bring you a whole new world of career opportunities.\r\n\r\nThe capability to innovate is increasingly important in a globalized, industrialized, and knowledge-based economy. Innovation alone\r\n will ensure that the Indian economy maintains its competitive edge and provides a good quality of life for people of India. The Government \r\nof India, having recognized the importance of Innovation has declared the present decade of 2010-2020 as the 'Decade of Innovation'.\r\n\r\nDYPDC offers highly experiential, hands-on programs with a unique learning experience to explore new ways of generating cutting-edge solutions \r\nusing creativity and design principles. The emphasis at DYPDC is always on creating an exciting and charged environment, where a mix of youthful\r\n vibrancy with experience & maturity, global viewpoint with local reality, emerging technology with traditional wisdom, and existing knowledge with\r\n rebellion and constant questioning will lead to an exciting journey throughout the programs.");
		txtrDypdcAdvantageDilip.setBounds(12, 13, 1250, 601);
		contentPane.add(txtrDypdcAdvantageDilip);
		
		JButton btnNewButton = new JButton("Images");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				pdc dc = new pdc();
				dc.pdcscreen(); 
				dispose();
			}
		});
		btnNewButton.setBackground(new Color(205, 133, 63));
		btnNewButton.setFont(new Font("Comic Sans MS", Font.BOLD, 23));
		btnNewButton.setBounds(969, 645, 179, 45);
		contentPane.add(btnNewButton);
	}

}
