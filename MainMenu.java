import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Image;

import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JToggleButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class MainMenu extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainMenu frame = new MainMenu();
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
	public MainMenu() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(200,200,1359,879);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblMainMenu = new JLabel("Main Menu");
		lblMainMenu.setHorizontalAlignment(SwingConstants.CENTER);
		lblMainMenu.setFont(new Font("Bookman Old Style", Font.BOLD, 35));
		lblMainMenu.setBounds(467, 11, 348, 78);
		contentPane.add(lblMainMenu);

		JButton btnExitButton1 = new JButton("Exit");
		btnExitButton1.setFont(new Font("Tahoma", Font.BOLD, 24));
		btnExitButton1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);

			}
		});
		btnExitButton1.setBounds(37, 529, 215, 71);
		contentPane.add(btnExitButton1);

		JButton btnCollStudent = new JButton("College Student");
		btnCollStudent.setFont(new Font("Bookman Old Style", Font.BOLD, 27));
		btnCollStudent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CollStudentLogin collstudentlogin = new CollStudentLogin();
				collstudentlogin.setVisible(true);
				setVisible(false);
			}
		});
		btnCollStudent.setBounds(436, 175, 430, 78);
		contentPane.add(btnCollStudent);

		JButton btnGenStaff = new JButton("General Staff");
		btnGenStaff.setFont(new Font("Bookman Old Style", Font.BOLD, 27));
		btnGenStaff.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				GeneralStaffLogin generalstafflogin = new GeneralStaffLogin();
				generalstafflogin.setVisible(true);
				setVisible(false);
			}
		});
		btnGenStaff.setBounds(436, 272, 429, 78);
		contentPane.add(btnGenStaff);

		JLabel lblNewLabel = new JLabel("Sign in as:");
		lblNewLabel.setFont(new Font("Bookman Old Style", Font.BOLD, 27));
		lblNewLabel.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel.setBounds(385, 100, 393, 45);
		contentPane.add(lblNewLabel);

		JButton btnUniversityAdministrationButton = new JButton("University Administration");
		btnUniversityAdministrationButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				UniversityAdministrationLogin universityadministrationlogin = new UniversityAdministrationLogin();
				universityadministrationlogin.setVisible(true);
				setVisible(false);
			}
		});
		btnUniversityAdministrationButton.setFont(new Font("Bookman Old Style", Font.BOLD, 27));
		btnUniversityAdministrationButton.setBounds(436, 371, 430, 78);
		contentPane.add(btnUniversityAdministrationButton);
		
		JLabel lblImage7 = new JLabel("");
		Image img7 = new ImageIcon(this.getClass().getResource("mask (3).png")).getImage();
		lblImage7.setIcon(new ImageIcon(img7));
		lblImage7.setBounds(991, 368, 165, 163);
		contentPane.add(lblImage7);
		
		JLabel lblImage4 = new JLabel("");
		Image img4 = new ImageIcon(this.getClass().getResource("corona.png")).getImage();
		lblImage4.setIcon(new ImageIcon(img4));
		lblImage4.setBounds(37, 100, 136, 148);
		contentPane.add(lblImage4);
	}
}
