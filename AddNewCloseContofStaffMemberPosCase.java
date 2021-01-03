import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Color;
import java.awt.SystemColor;

public class AddNewCloseContofStaffMemberPosCase extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	public static String AFM3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AddNewCloseContofStaffMemberPosCase frame = new AddNewCloseContofStaffMemberPosCase();
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
	public AddNewCloseContofStaffMemberPosCase() {
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
		
		JLabel lblNewLabel = new JLabel("Insert the TIN number of the close contact:");
		lblNewLabel.setFont(new Font("Bookman Old Style", Font.PLAIN, 35));
		lblNewLabel.setBounds(37, 28, 1212, 74);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Submit");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int tempAfm = 0;
				String result = " ";
				int pointer = 0;
				do {
				    try {
                        AFM3 = textField.getText();
				        tempAfm = Integer.parseInt(AFM3);
				    } catch(Exception exc) {
					    pointer = 1 ;
					    JOptionPane.showMessageDialog(contentPane, "You have inserted a wrong TIN number.");
				    }
				} while (result != " ");
				result = UpdateTheRecords.checkIfAFMExist(tempAfm);
				if (pointer == 0) {
				    if (result.equals("true")) {
				    	String mail = UpdateTheRecords.sendEmailToStaff(tempAfm);
				    	UpdateTheRecords.changeCloseCont(tempAfm, "true", "staff");
				    	setVisible(false);
				    	JOptionPane.showMessageDialog(contentPane, "The staff member has been added successfully as a close contact."
				    			+ "An email has been sent at: " + mail);
					    setVisible(true);
					    AnotherStaffMemberCloseCont o = new AnotherStaffMemberCloseCont();
					    o.setVisible(true);
				    }else if (result.equals("false")) {
					    JOptionPane.showMessageDialog(contentPane, "You have inserted a wrong TIN number.");
				    }
				}

			}
		});
		btnNewButton.setBounds(1034, 529, 215, 71);
		contentPane.add(btnNewButton);
		
		JButton btnBackButton;
		btnBackButton = new JButton("Back to menu");
		btnBackButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				setVisible(false);
				MainMenu mainmenu = new MainMenu();
				mainmenu.setVisible(true);
			}
		});
		btnBackButton.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnBackButton.setBounds(47, 529, 215, 71);
		contentPane.add(btnBackButton);
		
		JLabel lblNewLabel_1 = new JLabel("TIN");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 35));
		lblNewLabel_1.setBounds(37, 229, 132, 81);
		contentPane.add(lblNewLabel_1);
	}
}
