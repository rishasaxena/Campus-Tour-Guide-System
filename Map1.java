package guide1;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Map1 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public void satmap1(){
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Map1 frame = new Map1();
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
	public Map1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1280, 750);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon(Map1.class.getResource("/img/Capture1.PNG")));
		lblNewLabel.setBounds(0, 0, 1264, 661);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("BacK");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnNewButton.setFont(new Font("Comic Sans MS", Font.BOLD, 30));
		btnNewButton.setBounds(972, 672, 128, 39);
		contentPane.add(btnNewButton);
	}

}
