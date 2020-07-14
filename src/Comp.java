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

public class Comp extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public void CompScreen() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Comp frame = new Comp();
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
	public Comp() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1280, 750);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("-->>");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				comp1 cp = new comp1();
				cp.comp1screen(); 
				dispose();
			}
		});
		btnNewButton.setFont(new Font("Forte", Font.BOLD, 22));
		btnNewButton.setBounds(1153, 665, 97, 25);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("<<--");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Soedept sdpt = new Soedept();
				sdpt.Soedeptscreen(); 
				dispose();
			}
		});
		btnNewButton_1.setFont(new Font("Forte", Font.BOLD, 22));
		btnNewButton_1.setBounds(1025, 665, 111, 25);
		contentPane.add(btnNewButton_1);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon(Comp.class.getResource("/Images/IMG20181015170305.jpg")));
		lblNewLabel.setBounds(0, 0, 1262, 703);
		contentPane.add(lblNewLabel);
	}

}
