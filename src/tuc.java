import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.JTextArea;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class tuc extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public void Tuckshop() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					tuc frame = new tuc();
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
	public tuc() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Ajinkya D Y Patil Technical Campus, Lohegaon");
		setBounds(100, 100, 1280, 750);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon(tuc.class.getResource("/Images/tck.jpg")));
		lblNewLabel.setBounds(0, 0, 742, 703);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon(tuc.class.getResource("/Images/IMG20181015174401.jpg")));
		lblNewLabel_1.setBounds(799, 0, 372, 469);
		contentPane.add(lblNewLabel_1);
		
		JTextArea txtrTheTuckShop = new JTextArea();
		txtrTheTuckShop.setBackground(new Color(240, 255, 240));
		txtrTheTuckShop.setFont(new Font("Kristen ITC", Font.BOLD, 18));
		txtrTheTuckShop.setText("> The Tuck Shop And Canteen Facilities are Available for Students\r\n    whenever they feel Hungry.\r\n> The Canteen is Handeled by Balaji caterers.\r\n> There are New Snacks vending automatic\r\n    machines providing different types of \r\n    snacks whenever needed.");
		txtrTheTuckShop.setBounds(745, 467, 517, 154);
		contentPane.add(txtrTheTuckShop);
		
		JButton btnNewButton = new JButton("Back");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				More tu1 = new More();
				tu1.NewScreen1(); 
				dispose();
			}
		});
		btnNewButton.setFont(new Font("Viner Hand ITC", Font.BOLD, 20));
		btnNewButton.setBounds(948, 644, 126, 46);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setIcon(new ImageIcon(tuc.class.getResource("/Images/blur.jpg")));
		lblNewLabel_2.setBounds(0, 0, 1262, 703);
		contentPane.add(lblNewLabel_2);
	}

}
