  /*import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.CardLayout;
import java.awt.GridLayout;
import net.miginfocom.swing.MigLayout;
import java.awt.Color;

import java.awt.Font;
import java.awt.FlowLayout;
import javax.swing.JLayeredPane;
import javax.swing.BoxLayout;
import java.awt.Dimension;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Component;
import javax.swing.Box;
import javax.swing.UIManager;
import java.awt.Cursor;*/
import javax.swing.*;
import javax.swing.text.JTextComponent;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Guide extends JFrame {
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Guide frame = new Guide();
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
	public Guide() {
		setForeground(Color.BLACK);
		setTitle("Ajinkya D Y Patil Technical Campus, Lohegaon");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1280, 750);
		getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("GET STARTED");
		btnNewButton.setBackground(new Color(240, 128, 128));
		btnNewButton.setForeground(new Color(128, 0, 0));
		btnNewButton.setFont(new Font("Comic Sans MS", Font.BOLD, 22));
		btnNewButton.setBounds(735, 56, 211, 53);
		getContentPane().add(btnNewButton);
		
		textField = new JTextField();
		textField.setFont(new Font("Comic Sans MS", Font.BOLD, 22));
		textField.setBounds(44, 66, 286, 40);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(176, 224, 230));
		panel.setBounds(44, 13, 121, 40);
		getContentPane().add(panel);
		
		JLabel lblNewLabel = new JLabel("UserName");
		lblNewLabel.setForeground(new Color(85, 107, 47));
		lblNewLabel.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 20));
		panel.add(lblNewLabel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(176, 224, 230));
		panel_1.setBounds(381, 13, 121, 40);
		getContentPane().add(panel_1);
		
		JLabel lblNewLabel_1 = new JLabel("PassWord");
		lblNewLabel_1.setForeground(new Color(85, 107, 47));
		lblNewLabel_1.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 20));
		panel_1.add(lblNewLabel_1);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setFont(new Font("HoloLens MDL2 Assets", Font.BOLD, 22));
		textField_1.setBounds(381, 66, 286, 40);
		getContentPane().add(textField_1);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setIcon(new ImageIcon(Guide.class.getResource("/Images/160519122658_unspecified_14.jpg")));
		lblNewLabel_2.setBounds(0, 0, 1262, 703);
		getContentPane().add(lblNewLabel_2);
		
		btnNewButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String uname= textField.getText(); 
				String pass= textField_1.getText();
				
				if(uname.equals("dypsoe")&&pass.equals("project"))
				{
				Main m = new Main();
				m.NewScreen(); 
				dispose();
				}
				else
				{
					error e1 = new error();
					e1.error1(); 
					//dispose();
				}
			}
			}); 
		}
	}

