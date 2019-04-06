package About_us;

import java.awt.EventQueue;

import javax.swing.JFrame;

import Student_Result.StudentResults;

import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import org.eclipse.wb.swing.FocusTraversalOnArray;
import java.awt.Component;

public class aboutus {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					aboutus window = new aboutus();
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
	public aboutus() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(153, 153, 153));
		frame.setBounds(0, 0, 1350, 700);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JButton btnNewButton = new JButton("");
		btnNewButton.setIcon(
				new ImageIcon("D:\\Student Result\\Student Result\\img\\Team_Members_ssssTemplates_9 copy.jpg"));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		frame.getContentPane().add(btnNewButton, BorderLayout.CENTER);

		JButton btnNewButton_1 = new JButton("Back Menu");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				StudentResults info = new StudentResults();
				StudentResults.main(null);

			}
		});
		frame.getContentPane().add(btnNewButton_1, BorderLayout.SOUTH);
		frame.getContentPane()
				.setFocusTraversalPolicy(new FocusTraversalOnArray(new Component[] { btnNewButton, btnNewButton_1 }));
	}

}
