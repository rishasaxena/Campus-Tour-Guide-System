import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class More extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public void NewScreen1(){
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					More frame = new More();
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
	public More() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Ajinkya D Y Patil Technical Campus, Lohegaon");
		setBounds(100, 100, 1280, 750);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setForeground(new Color(255, 255, 255));
		panel.setBackground(new Color(250, 250, 210));
		panel.setBounds(199, 34, 677, 64);
		contentPane.add(panel);
		
		JLabel lblNewLabel = new JLabel("More Facilities In Campus");
		lblNewLabel.setForeground(new Color(128, 0, 128));
		lblNewLabel.setFont(new Font("Snap ITC", Font.BOLD, 40));
		panel.add(lblNewLabel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(102, 205, 170));
		panel_1.setBounds(47, 156, 450, 74);
		contentPane.add(panel_1);
		
		JLabel lblNewLabel_1 = new JLabel("> Girls And Boys Hostel");
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setFont(new Font("Segoe Print", Font.BOLD, 30));
		panel_1.add(lblNewLabel_1);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(216, 191, 216));
		panel_2.setBounds(47, 243, 450, 74);
		contentPane.add(panel_2);
		
		JLabel lblNewLabel_2 = new JLabel("> The University Shop  ");
		lblNewLabel_2.setForeground(new Color(255, 255, 255));
		lblNewLabel_2.setFont(new Font("Segoe Print", Font.BOLD, 30));
		panel_2.add(lblNewLabel_2);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(173, 216, 230));
		panel_3.setBounds(47, 330, 484, 74);
		contentPane.add(panel_3);
		
		JLabel lblNewLabel_3 = new JLabel("> Tuck Shop And Canteen");
		lblNewLabel_3.setForeground(new Color(255, 255, 255));
		lblNewLabel_3.setFont(new Font("Segoe Print", Font.BOLD, 30));
		panel_3.add(lblNewLabel_3);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBackground(new Color(240, 128, 128));
		panel_4.setBounds(47, 417, 412, 74);
		contentPane.add(panel_4);
		
		JLabel lblNewLabel_4 = new JLabel("> Sports Department");
		lblNewLabel_4.setForeground(new Color(255, 255, 255));
		lblNewLabel_4.setFont(new Font("Segoe Print", Font.BOLD, 30));
		panel_4.add(lblNewLabel_4);
		
		JPanel panel_5 = new JPanel();
		panel_5.setForeground(new Color(255, 255, 255));
		panel_5.setBackground(new Color(192, 192, 192));
		panel_5.setBounds(47, 504, 412, 64);
		contentPane.add(panel_5);
		
		JLabel lblNewLabel_5 = new JLabel("> Student's Parking  ");
		lblNewLabel_5.setForeground(new Color(255, 255, 255));
		lblNewLabel_5.setFont(new Font("Segoe Print", Font.BOLD, 30));
		panel_5.add(lblNewLabel_5);
		
		JButton btnNewButton = new JButton("View Details");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				hostel h = new hostel();
				h.host(); 
				dispose();
			}
		});
		btnNewButton.setFont(new Font("Vivaldi", Font.BOLD, 20));
		btnNewButton.setBounds(779, 156, 157, 41);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("View Details");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				us uni1 = new us();
				uni1.university(); 
				dispose();
			}
		});
		btnNewButton_1.setFont(new Font("Vivaldi", Font.BOLD, 20));
		btnNewButton_1.setBounds(779, 243, 157, 41);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("View Details");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tuc shop = new tuc();
				shop.Tuckshop(); 
				dispose();
			}
		});
		btnNewButton_2.setFont(new Font("Vivaldi", Font.BOLD, 20));
		btnNewButton_2.setBounds(779, 330, 157, 41);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("View Details");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				sports lal = new sports();
				lal.Sports1(); 
				dispose();
			}
		});
		btnNewButton_3.setFont(new Font("Vivaldi", Font.BOLD, 20));
		btnNewButton_3.setBounds(779, 417, 157, 41);
		contentPane.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("View Details");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				park pr1 = new park();
				pr1.parking(); 
				dispose();
			}
		});
		btnNewButton_4.setFont(new Font("Vivaldi", Font.BOLD, 20));
		btnNewButton_4.setBounds(779, 504, 157, 41);
		contentPane.add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("<-- Back");
		btnNewButton_5.setForeground(new Color(255, 255, 0));
		btnNewButton_5.setBackground(new Color(255, 0, 0));
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				Main mo1 = new Main();
				mo1.NewScreen(); 
				dispose();
			}
		});
		btnNewButton_5.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		btnNewButton_5.setBounds(779, 610, 157, 54);
		contentPane.add(btnNewButton_5);
		
		JLabel lblNewLabel_6 = new JLabel("New label");
		lblNewLabel_6.setIcon(new ImageIcon(More.class.getResource("/Images/blur.jpg")));
		lblNewLabel_6.setBounds(0, 0, 1262, 703);
		contentPane.add(lblNewLabel_6);
	}
}
