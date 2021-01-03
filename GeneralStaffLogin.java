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
import java.awt.TextField;

import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;

public class GeneralStaffLogin extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	public static String AFM;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GeneralStaffLogin frame = new GeneralStaffLogin();
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
	public GeneralStaffLogin() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(200,200,1359,879);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		
		contentPane.setLayout(null);
		textField = new JTextField();
		textField.setBounds(188, 172, 485, 52);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblVAT = new JLabel("TIN");
		lblVAT.setHorizontalAlignment(SwingConstants.LEFT);
		lblVAT.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblVAT.setBounds(47, 171, 131, 53);
		contentPane.add(lblVAT);
		
		JButton btnGeneralStaffLogin = new JButton("Login");
		btnGeneralStaffLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int tempAfm = 0;
				String result = " ";
				int pointer = 0;
				do {
				    try {
                        AFM = textField.getText();
				        tempAfm = Integer.parseInt(AFM);
				    } catch(Exception exc) {
					    pointer = 1 ;
					    JOptionPane.showMessageDialog(contentPane, "You have inserted a wrong ID.");
				    }
				} while (result != " ");
				result = UpdateTheRecords.checkIfAFMExist(tempAfm);
				if (pointer == 0) {
				    if (result.equals("true")) {
					    JOptionPane.showMessageDialog(contentPane, "You are successfully logged in.");
					    setVisible(false);
					    GeneralStaffMenu staffmenu = new GeneralStaffMenu();
					    staffmenu.setVisible(true);

				    }else if (result.equals("false")) {
					    JOptionPane.showMessageDialog(contentPane, "You have inserted a wrong ID.");
				    }
				}

			}
		});
		btnGeneralStaffLogin.setFont(new Font("Tahoma", Font.BOLD, 24));
		btnGeneralStaffLogin.setBounds(492, 302, 181, 65);
		contentPane.add(btnGeneralStaffLogin);
		
		JLabel lblGeneralStaffLogin = new JLabel("Enter your TIN identification number:");
		lblGeneralStaffLogin.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblGeneralStaffLogin.setBounds(47, 38, 626, 84);
		contentPane.add(lblGeneralStaffLogin);
		
		JButton btnBackButton = new JButton("Back");
		btnBackButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				MainMenu mainmenu = new MainMenu();
				mainmenu.setVisible(true);
			}
		});
		btnBackButton.setFont(new Font("Tahoma", Font.BOLD, 24));
		btnBackButton.setBounds(47, 302, 181, 65);
		contentPane.add(btnBackButton);
		
		Image img3 = new ImageIcon(this.getClass().getResource("ok.png")).getImage();
		btnGeneralStaffLogin.setIcon(new ImageIcon(img3));
		btnGeneralStaffLogin.setFont(new Font("Tahoma", Font.BOLD, 24));
		contentPane.add(btnGeneralStaffLogin);
		
		Image img4 = new ImageIcon(this.getClass().getResource("close (1).png")).getImage();
		btnBackButton.setIcon(new ImageIcon(img4));
		btnBackButton.setFont(new Font("Tahoma", Font.BOLD, 24));
		contentPane.add(btnBackButton);
		
		JLabel lblImage12 = new JLabel("");
		Image img12 = new ImageIcon(this.getClass().getResource("covid-19.png")).getImage();
		lblImage12.setIcon(new ImageIcon(img12));
		lblImage12.setBounds(545, 38, 128, 106);
		contentPane.add(lblImage12);
	}
	
}