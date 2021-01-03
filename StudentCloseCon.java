import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Image;

public class StudentCloseCon extends JFrame {

	private JPanel contentPane;
	public static String dateclosecont;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StudentCloseCon frame = new StudentCloseCon();
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
	public StudentCloseCon() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(200,200,1359,879);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("You are a close contact!");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel.setBounds(12, 13, 696, 25);
		contentPane.add(lblNewLabel);
		
		Student i = new Student();
		int tempAM = Integer.parseInt(CollStudentLogin.AM);
		dateclosecont = i.giveTheDateOfCloseCont(tempAM);
		JLabel lblNewLabel_1 = new JLabel("Have you had any of the following symptoms?");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_1.setBounds(12, 43, 696, 25);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("- Fever");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_2.setBounds(12, 72, 170, 25);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("- Cough");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_3.setBounds(12, 108, 170, 25);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("- Shortness of breath");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_4.setBounds(12, 144, 170, 25);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("- Sudden onset of anemia");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_5.setBounds(12, 180, 170, 25);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("- Tastelessness");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_6.setBounds(12, 216, 170, 25);
		contentPane.add(lblNewLabel_6);
		
		JButton btnNewButton = new JButton("Yes");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				StudentHeavySymptoms hs = new StudentHeavySymptoms();
				hs.setVisible(true);
			}
		});
		btnNewButton.setBounds(235, 137, 97, 43);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("No");
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				StudentLightSymptoms ls = new StudentLightSymptoms();
				ls.setVisible(true);
			}
		});
		btnNewButton_1.setBounds(235, 191, 97, 43);
		contentPane.add(btnNewButton_1);
		
		JButton btnBackButton = new JButton("Back");
		btnBackButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				CollStudentMenu collstmenu = new CollStudentMenu();
				collstmenu.setVisible(true);
			}
		});
		btnBackButton.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnBackButton.setBounds(12, 325, 97, 41);
		contentPane.add(btnBackButton);
		
		JLabel lblImage11 = new JLabel("");
		Image img11 = new ImageIcon(this.getClass().getResource("fever (1).png")).getImage();
		lblImage11.setIcon(new ImageIcon(img11));
		lblImage11.setBounds(609, 241, 73, 101);
		contentPane.add(lblImage11);
		
		JLabel lblImage13 = new JLabel("");
		Image img13 = new ImageIcon(this.getClass().getResource("loss-of-sense-of-smell.png")).getImage();
		lblImage13.setIcon(new ImageIcon(img13));
		lblImage13.setBounds(537, 140, 62, 101);
		contentPane.add(lblImage13);
		
		JLabel lblImage14 = new JLabel("");
		Image img14 = new ImageIcon(this.getClass().getResource("loss-of-sense-of-taste.png")).getImage();
		lblImage14.setIcon(new ImageIcon(img14));
		lblImage14.setBounds(537, 241, 62, 101);
		contentPane.add(lblImage14);
	}
}