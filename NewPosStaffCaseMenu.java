import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;

public class NewPosStaffCaseMenu extends JFrame {

	private JPanel contentPane;
	private JButton btnBackButton;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					NewPosStaffCaseMenu frame = new NewPosStaffCaseMenu();
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
	public NewPosStaffCaseMenu() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(200,200,1359,879);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("Add a staff member as a close\n"
				+ " contact of the positive case");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				AddNewCloseContofStaffMemberPosCase g = new AddNewCloseContofStaffMemberPosCase();
				g.setVisible(true);
			}
		});
		btnNewButton.setBounds(35, 177, 397, 46);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Add a student as a close contact of the positive case");
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				AddNewCloseContofStPosCase h = new AddNewCloseContofStPosCase();
				h.setVisible(true);
			}
		});
		btnNewButton_1.setBounds(35, 102, 397, 46);
		contentPane.add(btnNewButton_1);
		
		JLabel lblNewLabel = new JLabel("Choose:");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel.setBounds(37, 28, 640, 46);
		contentPane.add(lblNewLabel);
		
		JButton btnBackButton;
		btnBackButton = new JButton("Back");
		btnBackButton.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnBackButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				UniversityAdministrationMenu uniadmenu = new UniversityAdministrationMenu();
				uniadmenu.setVisible(true);
			}
		});
		btnBackButton.setBounds(31, 309, 178, 50);
		contentPane.add(btnBackButton);
	}
}
