import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class StudentStat extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StudentStat frame = new StudentStat();
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
	public StudentStat() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(200,200,1359,879);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("AUEB Statistics");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Trebuchet MS", Font.BOLD, 24));
		lblNewLabel.setBounds(190, 11, 354, 41);
		contentPane.add(lblNewLabel);
		int total_cases = UpdateTheRecords.totalPositiveNumber();
		double percent = total_cases/2550.0*100;
		String percent1 = String.format("%.2f", percent);
		JLabel lblNewLabel_1 = new JLabel("Total positive cases: " + total_cases + " ( " + percent1 + "% )");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(114, 65, 248, 41);
		contentPane.add(lblNewLabel_1);
		
		int student_cases = UpdateTheRecords.totalPositiveNumberofStudent();
		double percent22 = student_cases/2500.0*100;
		String percent2 = String.format("%.2f", percent22);
		JLabel lblNewLabel_2 = new JLabel("Student positive cases : " + student_cases + " ( " + percent2 + "% )");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_2.setBounds(114, 137, 248, 41);
		contentPane.add(lblNewLabel_2);
		
		int staff_cases = UpdateTheRecords.totalPositiveNumberofStaff();
		double percent33 = staff_cases/50.0*100;
		String percent3 = String.format("%.2f", percent33);
		JLabel lblNewLabel_3 = new JLabel("Staff positive cases : " + staff_cases + " ( " + percent3 + "% )" );
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_3.setBounds(114, 204, 248, 41);
		contentPane.add(lblNewLabel_3);
		
		int total_close_contacts = UpdateTheRecords.totalCloseContNumber();
		double percent44 = total_close_contacts/2550.0*100;
		String percent4 = String.format("%.2f", percent44);
		JLabel lblNewLabel_4 = new JLabel("Total close contacts : " + total_close_contacts + " ( " + percent4 + "% )");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_4.setBounds(372, 65, 248, 41);
		contentPane.add(lblNewLabel_4);
		
		int student_close_contacts = UpdateTheRecords.totalCloseContNumberofStudent();
		double percent55 = student_close_contacts/2500.0*100;
		String percent5 = String.format("%.2f", percent55);
		JLabel lblNewLabel_5 = new JLabel("Close contacts (students): " + student_close_contacts + " ( " + percent5 + "% )");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_5.setBounds(372, 137, 248, 41);
		contentPane.add(lblNewLabel_5);
		
		int staff_close_contacts = UpdateTheRecords.totalCloseContNumberofStaff();
		double percent66 = staff_close_contacts/50.0*100;
		String percent6 = String.format("%.2f", percent66);
		JLabel lblNewLabel_6 = new JLabel("Close contacts (staff): " + staff_close_contacts + " ( " + percent6 + "% )");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_6.setBounds(372, 204, 248, 41);
		contentPane.add(lblNewLabel_6);
		
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
		
		JLabel lblImage4 = new JLabel("");
		Image img4 = new ImageIcon(this.getClass().getResource("blood-test.png")).getImage();
		lblImage4.setIcon(new ImageIcon(img4));
		lblImage4.setBounds(326, 263, 76, 103);
		contentPane.add(lblImage4);
	}
}