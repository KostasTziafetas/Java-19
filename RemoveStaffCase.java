import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Image;

import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class RemoveStaffCase extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	public static String AFM5;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RemoveStaffCase frame = new RemoveStaffCase();
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
	public RemoveStaffCase() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(200,200,1359,879);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Insert the staff member TIN number:");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel.setBounds(26, 37, 681, 57);
		contentPane.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(113, 125, 564, 58);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("TIN");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_1.setBounds(37, 125, 66, 58);
		contentPane.add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("Submit");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int tempAfm = 0;
				String result = " ";
				int pointer = 0;
				do {
				    try {
                        AFM5 = textField.getText();
				        tempAfm = Integer.parseInt(AFM5);
				    } catch(Exception exc) {
					    pointer = 1 ;
					    JOptionPane.showMessageDialog(contentPane, "You have inserted a wrong TIN number.");
					    
				    }
				} while (result != " ");
				result = UpdateTheRecords.checkIfAFMExist(tempAfm);
				if (pointer == 0) {
				    if (result.equals("true")) {
				    	UpdateTheRecords.changeTheStatus(tempAfm, "n", "staff");
				    	JOptionPane.showMessageDialog(contentPane, "The staff member has bacame a negative case.");
					    setVisible(false);
				    }else if (result.equals("false")) {
					    JOptionPane.showMessageDialog(contentPane, "You have inserted a wrong ID.");
				    }
				}

			}
		});
		btnNewButton.setBounds(499, 309, 178, 50);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Back");
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				setVisible(false);
				UniversityAdministrationMenu uniadmenu = new UniversityAdministrationMenu();
				uniadmenu.setVisible(true);
			}
		});
		btnNewButton_1.setBounds(31, 309, 178, 50);
		contentPane.add(btnNewButton_1);
		
		JLabel lblImage11 = new JLabel("");
		Image img11 = new ImageIcon(this.getClass().getResource("wash-your-hands.png")).getImage();
		lblImage11.setIcon(new ImageIcon(img11));
		lblImage11.setBounds(560, 11, 84, 101);
		contentPane.add(lblImage11);
		
		JLabel lblImage12 = new JLabel("");
		Image img12 = new ImageIcon(this.getClass().getResource("viruss.png")).getImage();
		lblImage12.setIcon(new ImageIcon(img12));
		lblImage12.setBounds(329, 215, 142, 128);
		contentPane.add(lblImage12);
	}

}
