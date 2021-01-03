import java.awt.BorderLayout;
import java.awt.Color;
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
import java.awt.Frame;
import java.awt.SystemColor;

public class AddNewCloseContofStPosCase extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	public static String AM3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AddNewCloseContofStPosCase frame = new AddNewCloseContofStPosCase();
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
	public AddNewCloseContofStPosCase() {
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
		
		JLabel lblNewLabel = new JLabel("Please insert the academic id of the close contact:");
		lblNewLabel.setFont(new Font("Bookman Old Style", Font.PLAIN, 35));
		lblNewLabel.setBounds(37, 28, 1224, 86);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Submit");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 30));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int tempAm = 0;
				String result = " ";
				int pointer = 0;
				do {
				    try {
                        AM3 = textField.getText();
				        tempAm = Integer.parseInt(AM3);
				    } catch(Exception exc) {
					    pointer = 1 ;
					    JOptionPane.showMessageDialog(contentPane, "You have inserted a wrong ID.");
				    }
				} while (result != " ");
				result = UpdateTheRecords.checkIfAmExist(tempAm);
				if (pointer == 0) {
				    if (result.equals("true")) {
				    	String mail = UpdateTheRecords.sendEmailToStudent(tempAm);
				    	UpdateTheRecords.changeCloseCont(tempAm, "true", "student");
				    	setVisible(false);
				    	JOptionPane.showMessageDialog(contentPane, "The student has been added successfully as a close contact."
				    			+ "An email has been sent at: " + mail);
				    	 setVisible(true);
					    AnotherStCloseCont o = new AnotherStCloseCont();
					    o.setVisible(true);
				    }else if (result.equals("false")) {
					    JOptionPane.showMessageDialog(contentPane, "You have inserted a wrong ID.");
				    }
				}

			}
		});
		btnNewButton.setBounds(1034, 529, 215, 71);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Back to menu");
		btnNewButton_1.setFont(new Font("Bookman Old Style", Font.BOLD, 25));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				setVisible(false);
				UniversityAdministrationMenu uniadmenu = new UniversityAdministrationMenu();
				uniadmenu.setVisible(true);
			}
		});
		btnNewButton_1.setBounds(47, 529, 215, 71);
		contentPane.add(btnNewButton_1);
		
		JLabel lblNewLabel_1 = new JLabel("ID");
		lblNewLabel_1.setFont(new Font("Bookman Old Style", Font.BOLD, 35));
		lblNewLabel_1.setBounds(37, 229, 123, 82);
		contentPane.add(lblNewLabel_1);
	}
}
