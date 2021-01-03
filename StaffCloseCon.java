import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class StaffCloseCon extends JFrame {

	private JPanel contentPane;
	public static String dateclosecont;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StaffCloseCon frame = new StaffCloseCon();
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
	public StaffCloseCon() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(200,200,1359,879);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("You are a close contact!");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel.setBounds(12, 13, 696, 41);
		contentPane.add(lblNewLabel);
		
		Staff i = new Staff();
		int tempAfm = Integer.parseInt(GeneralStaffLogin.AFM);
		dateclosecont = i.giveTheDateOfCloseCont(tempAfm);
		JLabel lblNewLabel_1 = new JLabel("Have you had any of the following symptoms?");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_1.setBounds(12, 57, 365, 32);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("- Fever");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_2.setBounds(12, 100, 181, 32);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("- Cough");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_3.setBounds(10, 138, 161, 32);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("- Shortness of breath");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_4.setBounds(12, 183, 181, 32);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("- Sudden onset of anemia");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_5.setBounds(12, 226, 181, 32);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("- Tastelessness");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_6.setBounds(12, 273, 161, 32);
		contentPane.add(lblNewLabel_6);
		
		JButton btnNewButton = new JButton("Yes");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				StaffHeavySymptoms hs = new StaffHeavySymptoms();
				hs.setVisible(true);
			}
		});
		btnNewButton.setBounds(203, 207, 97, 32);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("No");
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				StaffLightSymptoms ls = new StaffLightSymptoms();
				ls.setVisible(true);
			}
		});
		btnNewButton_1.setBounds(203, 263, 97, 32);
		contentPane.add(btnNewButton_1);
		
		JButton btnBackButton = new JButton("Back");
		btnBackButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				GeneralStaffMenu gstaffmenu = new GeneralStaffMenu();
				gstaffmenu.setVisible(true);
			}
		});
		btnBackButton.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnBackButton.setBounds(12, 325, 97, 41);
		contentPane.add(btnBackButton);
	}
}