import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JTextArea;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class sports extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public void Sports1() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					sports frame = new sports();
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
	public sports() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Ajinkya D Y Patil Technical Campus, Lohegaon");
		setBounds(100, 100, 1280, 750);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon(sports.class.getResource("/Images/1539741502134.jpg")));
		lblNewLabel.setBounds(0, 0, 767, 703);
		contentPane.add(lblNewLabel);
		
		JTextArea txtrDY = new JTextArea();
		txtrDY.setBackground(new Color(240, 248, 255));
		txtrDY.setFont(new Font("Kristen ITC", Font.BOLD, 20));
		txtrDY.setText("> D Y Patil Knowledge City Motivates Sports\r\n   activities with Enthusiasm.\r\n> Students can Play their Favorite Sports at \r\n    any time inside the Campus.\r\n> Almost every Sports equipments are \r\n    available for students in the Sports \r\n    Department.\r\n> As shown campus have Lawn tennis,Basket\r\n    ball, Swimming pool, Badminton courts etc.");
		txtrDY.setBounds(767, 13, 495, 279);
		contentPane.add(txtrDY);
		
		JButton btnNewButton = new JButton("Back");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				More sp1 = new More();
				sp1.NewScreen1(); 
				dispose();
			}
		});
		btnNewButton.setFont(new Font("Kristen ITC", Font.BOLD, 25));
		btnNewButton.setBounds(952, 587, 154, 42);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon(sports.class.getResource("/Images/blur.jpg")));
		lblNewLabel_1.setBounds(0, 0, 1262, 703);
		contentPane.add(lblNewLabel_1);
	}

}
