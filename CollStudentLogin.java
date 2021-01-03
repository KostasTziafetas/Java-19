import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Image;

import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.SystemColor;

public class CollStudentLogin extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	public static String AM;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CollStudentLogin frame = new CollStudentLogin();
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
	public CollStudentLogin() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(200,200,1359,879);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);

		contentPane.setLayout(null);

		textField = new JTextField();
		textField.setBackground(SystemColor.menu);
		textField.setBounds(295, 247, 657, 84);
		contentPane.add(textField);
		textField.setColumns(10);

		JLabel lblCollStudentUserName = new JLabel("ID");
		lblCollStudentUserName.setHorizontalAlignment(SwingConstants.LEFT);
		lblCollStudentUserName.setFont(new Font("Bookman Old Style", Font.BOLD, 30));
		lblCollStudentUserName.setBounds(30, 247, 222, 84);
		contentPane.add(lblCollStudentUserName);

		JButton btnCollStudentLoginButton = new JButton("Login");
		btnCollStudentLoginButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int tempAm = 0;
				String result = " ";
				int pointer = 0;
				do {
				    try {
                        AM = textField.getText();
				        tempAm = Integer.parseInt(AM);
				    } catch(Exception exc) {
					    pointer = 1 ;
					    JOptionPane.showMessageDialog(contentPane, "You have inserted a wrong ID.");
				    }
				} while (result != " ");
				result = UpdateTheRecords.checkIfAmExist(tempAm);
				if (pointer == 0) {
				    if (result.equals("true")) {
					    JOptionPane.showMessageDialog(contentPane, "You are successfully logged in.");
					    setVisible(false);
					    CollStudentMenu csmenu = new CollStudentMenu();
					    csmenu.setVisible(true);

				    }else if (result.equals("false")) {
					    JOptionPane.showMessageDialog(contentPane, "You have inserted a wrong ID.");
				    }
				}

			}
		});
		btnCollStudentLoginButton.setFont(new Font("Tahoma", Font.BOLD, 24));
		btnCollStudentLoginButton.setBounds(1029, 529, 215, 71);
		contentPane.add(btnCollStudentLoginButton);

		JLabel lblLoginCollStudent = new JLabel("Enter your academic ID:");
		lblLoginCollStudent.setFont(new Font("Bookman Old Style", Font.BOLD, 30));
		lblLoginCollStudent.setBounds(47, 38, 626, 84);
		contentPane.add(lblLoginCollStudent);

		JButton btnBackButton = new JButton("Back");
		btnBackButton.setFont(new Font("Tahoma", Font.BOLD, 24));
		btnBackButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				MainMenu mainmenu = new MainMenu();
				mainmenu.setVisible(true);
			}
		});
		btnBackButton.setBounds(37, 529, 215, 71);
		contentPane.add(btnBackButton);
		
		Image img3 = new ImageIcon(this.getClass().getResource("ok.png")).getImage();
		btnCollStudentLoginButton.setIcon(new ImageIcon(img3));
		btnCollStudentLoginButton.setFont(new Font("Tahoma", Font.BOLD, 24));
		contentPane.add(btnCollStudentLoginButton);
		
		Image img4 = new ImageIcon(this.getClass().getResource("close (1).png")).getImage();
		btnBackButton.setIcon(new ImageIcon(img4));
		btnBackButton.setFont(new Font("Tahoma", Font.BOLD, 24));
		contentPane.add(btnBackButton);
		
		JLabel lblImage12 = new JLabel("");
		Image img12 = new ImageIcon(this.getClass().getResource("covid-19.png")).getImage();
		lblImage12.setIcon(new ImageIcon(img12));
		lblImage12.setBounds(1068, 55, 128, 106);
		contentPane.add(lblImage12);
	}

}