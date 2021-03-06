import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Image;
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
		setBounds(0,0,1280,730);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setFont(new Font("Bookman Old Style", Font.PLAIN, 25));
		textField.setBackground(SystemColor.menu);
		textField.setBounds(295, 247, 657, 84);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblInsertTinofclosecontact = new JLabel("Please insert the TIN of the close contact:");
		lblInsertTinofclosecontact.setFont(new Font("Bookman Old Style", Font.PLAIN, 27));
		lblInsertTinofclosecontact.setBounds(37, 28, 722, 86);
		contentPane.add(lblInsertTinofclosecontact);
		
		JButton btnSubmitButton = new JButton("Submit");
		btnSubmitButton.setFont(new Font("Bookman Old Style", Font.BOLD, 35));
		btnSubmitButton.addActionListener(new ActionListener() {
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
		btnSubmitButton.setBounds(999, 529, 215, 71);
		contentPane.add(btnSubmitButton);
		
		JButton btnBackButton;
		btnBackButton = new JButton("Back");
		btnBackButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				setVisible(false);
				UniversityAdministrationMenu uniadminmenu = new UniversityAdministrationMenu();
				uniadminmenu.setVisible(true);
			}
		});
		btnBackButton.setFont(new Font("Bookman Old Style", Font.BOLD, 35));
		btnBackButton.setBounds(47, 529, 215, 71);
		contentPane.add(btnBackButton);
		
		JLabel lblTIN = new JLabel("TIN");
		lblTIN.setFont(new Font("Tahoma", Font.BOLD, 35));
		lblTIN.setBounds(160, 247, 102, 84);
		contentPane.add(lblTIN);
		
		JLabel lblImage10 = new JLabel("");
		Image img10 = new ImageIcon(this.getClass().getResource("135464593_1077636602678989_8400056473973577538_n.png")).getImage();
		lblImage10.setIcon(new ImageIcon(img10));
		lblImage10.setBounds(981, 0, 285, 233);
		contentPane.add(lblImage10);
		
		Image img4 = new ImageIcon(this.getClass().getResource("left-arrow (1).png")).getImage();
		btnBackButton.setIcon(new ImageIcon(img4));
		btnBackButton.setFont(new Font("Tahoma", Font.BOLD, 24));
		contentPane.add(btnBackButton);
		
		Image img3 = new ImageIcon(this.getClass().getResource("ok.png")).getImage();
		btnSubmitButton.setIcon(new ImageIcon(img3));
		btnSubmitButton.setFont(new Font("Tahoma", Font.BOLD, 24));
		contentPane.add(btnSubmitButton);
		
		JLabel lblImage12 = new JLabel("");
		Image img12 = new ImageIcon(this.getClass().getResource("lock.png")).getImage();
		lblImage12.setIcon(new ImageIcon(img12));
		lblImage12.setBounds(564, 387, 138, 141);
		contentPane.add(lblImage12);
	}
}
