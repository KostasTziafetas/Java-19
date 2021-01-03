import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Image;

import javax.swing.JTextPane;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.SystemColor;

public class AddNewStaffCase extends JFrame {

	private JPanel contentPane;
	public static String AFM2;
	private JTextField textField;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AddNewStaffCase frame = new AddNewStaffCase();
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
	public AddNewStaffCase() {
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
		
		JLabel lblNewLabel = new JLabel("Please insert the TIN:");
		lblNewLabel.setFont(new Font("Bookman Old Style", Font.PLAIN, 35));
		lblNewLabel.setBounds(37, 28, 697, 74);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("TIN:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_1.setBounds(157, 244, 105, 82);
		contentPane.add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("Submit");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int tempAfm = 0;
				String result = " ";
				int pointer = 0;
				do {
				    try {
                        AFM2 = textField.getText();
				        tempAfm = Integer.parseInt(AFM2);
				    } catch(Exception exc) {
					    pointer = 1 ;
					    JOptionPane.showMessageDialog(contentPane, "You have inserted a wrong TIN number.");
					    
				    }
				} while (result != " ");
				result = UpdateTheRecords.checkIfAFMExist(tempAfm);
				if (pointer == 0) {
				    if (result.equals("true")) {
				    	UpdateTheRecords.changeTheStatus(tempAfm, "p", "staff");
				    	JOptionPane.showMessageDialog(contentPane, "The staff member has been added successfully as a positive case.");
					    setVisible(false);
					    NewPosStaffCaseMenu staffpos = new NewPosStaffCaseMenu();
					    staffpos.setVisible(true);
				    }else if (result.equals("false")) {
					    JOptionPane.showMessageDialog(contentPane, "You have inserted a wrong TIN number.");
				    }
				}

			}
		});
		btnNewButton.setBounds(1034, 529, 215, 71);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Back");
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				UniversityAdministrationMenu uniadmenu = new UniversityAdministrationMenu();
				uniadmenu.setVisible(true);
			}
		});
		btnNewButton_1.setBounds(47, 529, 215, 71);
		contentPane.add(btnNewButton_1);
		
		JLabel lblImage11 = new JLabel("");
		Image img11 = new ImageIcon(this.getClass().getResource("wash-your-hands.png")).getImage();
		lblImage11.setIcon(new ImageIcon(img11));
		lblImage11.setBounds(489, 462, 183, 101);
		contentPane.add(lblImage11);
		
		JLabel lblImage12 = new JLabel("");
		Image img12 = new ImageIcon(this.getClass().getResource("viruss.png")).getImage();
		lblImage12.setIcon(new ImageIcon(img12));
		lblImage12.setBounds(1049, 62, 142, 128);
		contentPane.add(lblImage12);
	}
}
