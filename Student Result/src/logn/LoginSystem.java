package logn;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import Student_Result.StudentResults;

import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JSeparator;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.JTextPane;
import javax.swing.DropMode;
import javax.swing.JTextArea;
import java.awt.SystemColor;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;

public class LoginSystem {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginSystem window = new LoginSystem();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public LoginSystem() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setForeground(Color.YELLOW);
		frame.getContentPane().setBackground(Color.CYAN);
		frame.setBounds(350, 120, 670, 420);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JLabel lblNewLabel = new JLabel("Student Result System Login");
		lblNewLabel.setBackground(Color.ORANGE);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel.setBounds(342, 151, 264, 30);
		frame.getContentPane().add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("User Name :");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1.setBounds(342, 201, 108, 32);
		frame.getContentPane().add(lblNewLabel_1);

		JLabel lblNewLabel_2 = new JLabel("Password :");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_2.setBounds(340, 255, 110, 32);
		frame.getContentPane().add(lblNewLabel_2);

		textField = new JTextField();
		textField.setBounds(443, 204, 156, 26);
		frame.getContentPane().add(textField);
		textField.setColumns(10);

		textField_1 = new JTextField();
		textField_1.setBounds(443, 258, 156, 26);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);

		JButton btnNewButton = new JButton("Login");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String password = textField_1.getText();
				String username = textField.getText();

				if (password.contains("pass") && username.contains("admin"))

				{

					textField_1.setText(null);
					textField.setText(null);

					StudentResults info = new StudentResults();
					StudentResults.main(null);
				}

				else {

					JOptionPane.showMessageDialog(null, "Invalid Login Details", "Login Error",
							JOptionPane.ERROR_MESSAGE);
					textField_1.setText(null);
					textField.setText(null);
				}

			}
		});
		btnNewButton.setBounds(316, 328, 89, 23);
		frame.getContentPane().add(btnNewButton);

		JButton btnReset = new JButton("Reset");
		btnReset.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				textField.setText("");
				textField_1.setText("");
			}
		});
		btnReset.setBounds(425, 328, 89, 23);
		frame.getContentPane().add(btnReset);

		JButton btnExit = new JButton("Exit");
		btnExit.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				frame = new JFrame("Exit");
				if (JOptionPane.showConfirmDialog(frame, "Confirm if you want to exit", "Student Result System",
						JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION) {
					System.exit(0);
				}
			}
		});
		btnExit.setBounds(536, 328, 89, 23);
		frame.getContentPane().add(btnExit);

		JSeparator separator = new JSeparator();
		separator.setBounds(10, 143, 634, 2);
		frame.getContentPane().add(separator);

		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

			}
		});
		btnNewButton_1.setIcon(new ImageIcon("D:\\Student Result\\Student Result\\img\\group.jpg"));
		btnNewButton_1.setSelectedIcon(null);
		btnNewButton_1.setBackground(Color.WHITE);
		btnNewButton_1.setBounds(108, 25, 426, 103);
		frame.getContentPane().add(btnNewButton_1);

		JButton button = new JButton("");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		button.setIcon(new ImageIcon("D:\\Student Result\\Student Result\\img\\download.png"));
		button.setBackground(Color.CYAN);
		button.setBounds(43, 158, 224, 212);
		frame.getContentPane().add(button);

		JTextArea textArea = new JTextArea();
		textArea.setBounds(607, 54, -9, 23);
		frame.getContentPane().add(textArea);
	}
}
