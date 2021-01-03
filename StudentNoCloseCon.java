import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Image;

public class StudentNoCloseCon extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StudentNoCloseCon frame = new StudentNoCloseCon();
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
	public StudentNoCloseCon() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(200,200,1359,879);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("You are not a close contact!!");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel.setBounds(12, 30, 287, 50);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Stay healthy!");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_1.setBounds(12, 91, 287, 50);
		contentPane.add(lblNewLabel_1);
		
		JButton btnBackButton = new JButton("Back");
		btnBackButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				CollStudentMenu collstmenu = new CollStudentMenu();
				collstmenu.setVisible(true);
			}
		});
		btnBackButton.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnBackButton.setBounds(12, 325, 97, 41);
		contentPane.add(btnBackButton);
		
		JLabel lblImage14 = new JLabel("");
		Image img14 = new ImageIcon(this.getClass().getResource("social.png")).getImage();
		lblImage14.setIcon(new ImageIcon(img14));
		lblImage14.setBounds(442, 203, 163, 139);
		contentPane.add(lblImage14);
		
		JLabel lblImage13 = new JLabel("");
		Image img13 = new ImageIcon(this.getClass().getResource("patient.png")).getImage();
		lblImage13.setIcon(new ImageIcon(img13));
		lblImage13.setBounds(438, 106, 62, 77);
		contentPane.add(lblImage13);
	}

}