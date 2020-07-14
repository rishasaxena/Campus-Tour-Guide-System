import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.UIManager;
import java.awt.SystemColor;

import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void NewScreen() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main frame = new Main();
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
	public Main() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Ajinkya D Y Patil Technical Campus, Lohegaon");
		setBounds(100, 100, 1280, 750);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(238, 130, 238));
		panel.setBounds(44, 145, 499, 70);
		contentPane.add(panel);
		
		JLabel label = new JLabel("> D Y P School Of Engineering");
		label.setForeground(new Color(255, 255, 255));
		label.setFont(new Font("Segoe Print", Font.BOLD, 30));
		label.setBackground(new Color(147, 112, 219));
		panel.add(label);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(64, 224, 208));
		panel_1.setBounds(44, 231, 822, 70);
		contentPane.add(panel_1);
		
		JLabel label_1 = new JLabel("> D Y Patil School Of Engineering And Technology ");
		label_1.setForeground(new Color(255, 255, 255));
		label_1.setFont(new Font("Segoe Print", Font.BOLD, 30));
		panel_1.add(label_1);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(255, 192, 203));
		panel_2.setBounds(44, 314, 558, 70);
		contentPane.add(panel_2);
		
		JLabel label_2 = new JLabel("> D Y Patil School Of Management");
		label_2.setForeground(new Color(255, 255, 255));
		label_2.setFont(new Font("Segoe Print", Font.BOLD, 30));
		panel_2.add(label_2);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(135, 206, 250));
		panel_3.setBounds(44, 397, 664, 70);
		contentPane.add(panel_3);
		
		JLabel label_3 = new JLabel("> D Y Patil D C For Automotive Research");
		label_3.setForeground(new Color(255, 255, 255));
		label_3.setFont(new Font("Segoe Print", Font.BOLD, 30));
		panel_3.add(label_3);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBackground(new Color(176, 196, 222));
		panel_4.setBounds(44, 480, 427, 70);
		contentPane.add(panel_4);
		
		JLabel label_4 = new JLabel("> D Y Patil Dental School");
		label_4.setVerticalAlignment(SwingConstants.TOP);
		label_4.setHorizontalAlignment(SwingConstants.LEFT);
		label_4.setForeground(Color.WHITE);
		label_4.setFont(new Font("Segoe Print", Font.BOLD, 30));
		panel_4.add(label_4);
		
		JPanel panel_5 = new JPanel();
		panel_5.setForeground(new Color(255, 255, 255));
		panel_5.setBackground(new Color(245, 245, 220));
		panel_5.setBounds(279, 27, 755, 75); 
		contentPane.add(panel_5);
		
		JLabel lblNewLabel = new JLabel("List Of Colleges In Campus");
		lblNewLabel.setForeground(new Color(128, 0, 128));
		lblNewLabel.setFont(new Font("Snap ITC", Font.BOLD, 42));
		panel_5.add(lblNewLabel);
		
		JPanel panel_6 = new JPanel();
		panel_6.setBackground(new Color(192, 192, 192));
		panel_6.setBounds(937, 145, 181, 49);
		contentPane.add(panel_6);
		
		JButton btnNewButton_1 = new JButton("View Details");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				soe1 so = new soe1();
				so.SoeScreen(); 
				dispose();
			}
		});
		btnNewButton_1.setFont(new Font("Vivaldi", Font.BOLD, 20));
		panel_6.add(btnNewButton_1);
		
		JPanel panel_7 = new JPanel();
		panel_7.setBackground(new Color(192, 192, 192));
		panel_7.setBounds(937, 231, 181, 49);
		contentPane.add(panel_7);
		
		JButton btnNewButton = new JButton("View Details");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				soet sot = new soet();
				sot.soetscreen(); 
				dispose();
			}
		});
		btnNewButton.setFont(new Font("Vivaldi", Font.BOLD, 20));
		panel_7.add(btnNewButton);
		
		JPanel panel_8 = new JPanel();
		panel_8.setBackground(new Color(192, 192, 192));
		panel_8.setBounds(937, 314, 181, 49);
		contentPane.add(panel_8);
		
		JButton btnNewButton_2 = new JButton("View Details");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				som sm = new som();
				sm.somscreen(); 
				dispose();
			}
		});
		btnNewButton_2.setFont(new Font("Vivaldi", Font.BOLD, 20));
		panel_8.add(btnNewButton_2);
		
		JPanel panel_9 = new JPanel();
		panel_9.setBackground(new Color(192, 192, 192));
		panel_9.setBounds(937, 397, 181, 49);
		contentPane.add(panel_9);
		
		JButton btnNewButton_3 = new JButton("View Details");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dc d = new dc();
				d.dcscreen(); 
				dispose();
			}
		});
		btnNewButton_3.setFont(new Font("Vivaldi", Font.BOLD, 20));
		panel_9.add(btnNewButton_3);
		
		JPanel panel_10 = new JPanel();
		panel_10.setBackground(new Color(192, 192, 192));
		panel_10.setBounds(937, 480, 181, 49);
		contentPane.add(panel_10);
		
		JButton btnNewButton_4 = new JButton("View Details");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dent pdnt = new dent();
				pdnt.dentalscreen(); 
				dispose();
			}
		});
		btnNewButton_4.setFont(new Font("Vivaldi", Font.BOLD, 20));
		panel_10.add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("Other Facilities -->");
		btnNewButton_5.setForeground(new Color(255, 0, 0));
		btnNewButton_5.setBackground(new Color(128, 0, 0));
		btnNewButton_5.setFont(new Font("Comic Sans MS", Font.BOLD, 23));
		btnNewButton_5.setBounds(888, 623, 262, 49);
		contentPane.add(btnNewButton_5);
		
		JButton btnNewButton_6 = new JButton("Campus Layout");
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Map mp = new Map();
				mp.MapScreen(); 
				dispose();
			}
		});
		btnNewButton_6.setFont(new Font("Comic Sans MS", Font.BOLD, 23));
		btnNewButton_6.setForeground(new Color(255, 0, 0));
		btnNewButton_6.setBounds(581, 623, 249, 49);
		contentPane.add(btnNewButton_6);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon(Main.class.getResource("/Images/blur.jpg")));
		lblNewLabel_1.setBounds(0, 0, 1274, 703);
		contentPane.add(lblNewLabel_1);
        btnNewButton_5.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent f) {
				
				More mo = new More();
				mo.NewScreen1(); 
				dispose();
			}
			}); 
	}
}
