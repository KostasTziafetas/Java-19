import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.SystemColor;

public class UniversityAdministrationLogin extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UniversityAdministrationLogin frame = new UniversityAdministrationLogin();
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
	public UniversityAdministrationLogin() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(200,200,1359,879);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setForeground(SystemColor.menu);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblUniversityAdministrationLogin = new JLabel("Enter your password:");
		lblUniversityAdministrationLogin.setFont(new Font("Bookman Old Style", Font.BOLD, 30));
		lblUniversityAdministrationLogin.setBounds(47, 38, 657, 84);
		contentPane.add(lblUniversityAdministrationLogin);

		JLabel lblVAT = new JLabel("Password");
		lblVAT.setFont(new Font("Bookman Old Style", Font.BOLD, 30));
		lblVAT.setBounds(47, 247, 187, 84);
		contentPane.add(lblVAT);

		textField = new JTextField();
		textField.setBackground(SystemColor.menu);
		textField.setBounds(295, 247, 657, 84);
		contentPane.add(textField);
		textField.setColumns(10);

		JButton btnUniversityAdministrationLogin = new JButton("Login");
		btnUniversityAdministrationLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String code = textField.getText();
				if (code.equals("123")) {
					JOptionPane.showMessageDialog(contentPane, "You are successfully logined.");
					UniversityAdministrationMenu uniadminmenu = new UniversityAdministrationMenu();
					uniadminmenu.setVisible(true);
					setVisible(false);
				} else {
					JOptionPane.showMessageDialog(contentPane, "You have inserted a wrong code.");
				}
			}
		});
		btnUniversityAdministrationLogin.setFont(new Font("Bookman Old Style", Font.BOLD, 35));
		btnUniversityAdministrationLogin.setBounds(1029, 529, 215, 71);
		contentPane.add(btnUniversityAdministrationLogin);

		JButton btnBackButton = new JButton("Back");
		btnBackButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				setVisible(false);
				MainMenu mainmenu = new MainMenu();
				mainmenu.setVisible(true);
			}
		});
		btnBackButton.setFont(new Font("Bookman Old Style", Font.BOLD, 35));
		btnBackButton.setBounds(37, 529, 215, 71);
		contentPane.add(btnBackButton);
		
		Image img3 = new ImageIcon(this.getClass().getResource("ok.png")).getImage();
		btnUniversityAdministrationLogin.setIcon(new ImageIcon(img3));
		btnUniversityAdministrationLogin.setFont(new Font("Tahoma", Font.BOLD, 24));
		contentPane.add(btnUniversityAdministrationLogin);
		
		Image img4 = new ImageIcon(this.getClass().getResource("close (1).png")).getImage();
		btnBackButton.setIcon(new ImageIcon(img4));
		btnBackButton.setFont(new Font("Tahoma", Font.BOLD, 24));
		contentPane.add(btnBackButton);
	}

}
