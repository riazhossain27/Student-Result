package Student_Result;

import java.awt.EventQueue;
import java.applet.*;
import java.awt.*;
import java.awt.event.*;
import java.text.DecimalFormat;
import java.util.EventObject;

import javax.swing.*;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.JSeparator;
import javax.swing.JTextArea;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.JTextComponent;

import About_us.aboutus;
import logn.LoginSystem;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.event.AncestorListener;
import javax.swing.event.AncestorEvent;

public class StudentResults {

	protected static final JLabel Student_id = null;
	protected static final Object Reset = null;
	private JFrame frame;
	private JButton clear;
	private JButton reset;

	private JTextField textField_StudentID;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTable table;
	private JTextField textField_12;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StudentResults window = new StudentResults();
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
	public StudentResults() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setForeground(Color.RED);
		frame.setBounds(0, 0, 1380, 800);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(new LineBorder(new Color(255, 0, 0), 4), "Student Result Systems",
				TitledBorder.CENTER, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel.setBounds(10, 11, 585, 393);
		frame.getContentPane().add(panel);
		panel.setLayout(null);

		JLabel lblNewLabel = new JLabel("Student_ID");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 23));
		lblNewLabel.setBounds(10, 30, 136, 20);
		panel.add(lblNewLabel);

		textField_StudentID = new JTextField();
		textField_StudentID.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(java.awt.event.KeyEvent evt) {

				char iNumber = evt.getKeyChar();
				if (!(Character.isDigit(iNumber)) || (iNumber == KeyEvent.VK_BACK_SPACE)
						|| (iNumber == KeyEvent.VK_DELETE)) {
					evt.consume();
				}

			}
		});
		textField_StudentID.setFont(new Font("Tahoma", Font.BOLD, 24));
		textField_StudentID.setBounds(164, 27, 120, 27);
		panel.add(textField_StudentID);
		textField_StudentID.setColumns(10);

		textField_1 = new JTextField();
		textField_1.setFont(new Font("Tahoma", Font.BOLD, 24));
		textField_1.setColumns(10);
		textField_1.setBounds(164, 80, 120, 27);
		panel.add(textField_1);

		JLabel lblFirstname = new JLabel("FirstName");
		lblFirstname.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblFirstname.setBounds(10, 83, 136, 20);
		panel.add(lblFirstname);

		textField_2 = new JTextField();
		textField_2.setFont(new Font("Tahoma", Font.BOLD, 24));
		textField_2.setColumns(10);
		textField_2.setBounds(164, 133, 120, 27);
		panel.add(textField_2);

		JLabel lblCourseCode = new JLabel("Last Name");
		lblCourseCode.setFont(new Font("Tahoma", Font.BOLD, 19));
		lblCourseCode.setBounds(10, 136, 136, 20);
		panel.add(lblCourseCode);

		textField_3 = new JTextField();
		textField_3.setFont(new Font("Tahoma", Font.BOLD, 24));
		textField_3.setColumns(10);
		textField_3.setBounds(164, 244, 120, 27);
		panel.add(textField_3);

		JLabel lblTotalScr = new JLabel("Total Score");
		lblTotalScr.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblTotalScr.setBounds(10, 247, 136, 20);
		panel.add(lblTotalScr);

		textField_4 = new JTextField();
		textField_4.setFont(new Font("Tahoma", Font.BOLD, 24));
		textField_4.setColumns(10);
		textField_4.setBounds(164, 294, 120, 27);
		panel.add(textField_4);

		JLabel lblAva = new JLabel("Average");
		lblAva.setFont(new Font("Tahoma", Font.BOLD, 23));
		lblAva.setBounds(10, 294, 136, 27);
		panel.add(lblAva);

		textField_5 = new JTextField("");
		textField_5.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(java.awt.event.KeyEvent evt) {

				char iNumber = evt.getKeyChar();
				if (!(Character.isDigit(iNumber)) || (iNumber == KeyEvent.VK_BACK_SPACE)
						|| (iNumber == KeyEvent.VK_DELETE)) {
					evt.consume();
				}

			}
		});
		textField_5.setFont(new Font("Tahoma", Font.BOLD, 24));
		textField_5.setColumns(10);
		textField_5.setBounds(448, 30, 120, 27);
		panel.add(textField_5);

		JLabel lblMaths = new JLabel("Maths");
		lblMaths.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblMaths.setBounds(294, 33, 136, 20);
		panel.add(lblMaths);

		textField_6 = new JTextField("");
		textField_6.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(java.awt.event.KeyEvent evt) {

				char iNumber = evt.getKeyChar();
				if (!(Character.isDigit(iNumber)) || (iNumber == KeyEvent.VK_BACK_SPACE)
						|| (iNumber == KeyEvent.VK_DELETE)) {
					evt.consume();
				}

			}
		});
		textField_6.setFont(new Font("Tahoma", Font.BOLD, 24));
		textField_6.setColumns(10);
		textField_6.setBounds(448, 80, 120, 27);
		panel.add(textField_6);

		JLabel lblEnglish = new JLabel("English");
		lblEnglish.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblEnglish.setBounds(294, 83, 136, 20);
		panel.add(lblEnglish);

		textField_7 = new JTextField("");
		textField_7.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(java.awt.event.KeyEvent evt) {

				char iNumber = evt.getKeyChar();
				if (!(Character.isDigit(iNumber)) || (iNumber == KeyEvent.VK_BACK_SPACE)
						|| (iNumber == KeyEvent.VK_DELETE)) {
					evt.consume();
				}

			}
		});
		textField_7.setFont(new Font("Tahoma", Font.BOLD, 24));
		textField_7.setColumns(10);
		textField_7.setBounds(448, 133, 120, 27);
		panel.add(textField_7);

		JLabel lblBiology = new JLabel("Biology");
		lblBiology.setFont(new Font("Tahoma", Font.BOLD, 23));
		lblBiology.setBounds(294, 133, 136, 27);
		panel.add(lblBiology);

		textField_8 = new JTextField("");
		textField_8.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(java.awt.event.KeyEvent evt) {

				char iNumber = evt.getKeyChar();
				if (!(Character.isDigit(iNumber)) || (iNumber == KeyEvent.VK_BACK_SPACE)
						|| (iNumber == KeyEvent.VK_DELETE)) {
					evt.consume();
				}

			}
		});
		textField_8.setFont(new Font("Tahoma", Font.BOLD, 24));
		textField_8.setColumns(10);
		textField_8.setBounds(448, 244, 120, 27);
		panel.add(textField_8);

		JLabel lblComputing = new JLabel("Computing");
		lblComputing.setFont(new Font("Tahoma", Font.BOLD, 23));
		lblComputing.setBounds(294, 245, 136, 27);
		panel.add(lblComputing);

		textField_9 = new JTextField("");
		textField_9.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(java.awt.event.KeyEvent evt) {

				char iNumber = evt.getKeyChar();
				if (!(Character.isDigit(iNumber)) || (iNumber == KeyEvent.VK_BACK_SPACE)
						|| (iNumber == KeyEvent.VK_DELETE)) {
					evt.consume();
				}

			}
		});
		textField_9.setFont(new Font("Tahoma", Font.BOLD, 24));
		textField_9.setColumns(10);
		textField_9.setBounds(448, 290, 120, 27);
		panel.add(textField_9);

		JLabel lblPhy = new JLabel("Physics");
		lblPhy.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblPhy.setBounds(294, 293, 136, 28);
		panel.add(lblPhy);

		textField_10 = new JTextField("");
		textField_10.setFont(new Font("Tahoma", Font.BOLD, 18));
		textField_10.setColumns(10);
		textField_10.setBounds(164, 347, 120, 27);
		panel.add(textField_10);

		JLabel lblRanking = new JLabel("Ranking");
		lblRanking.setFont(new Font("Tahoma", Font.BOLD, 22));
		lblRanking.setBounds(10, 349, 136, 24);
		panel.add(lblRanking);

		textField_11 = new JTextField("");
		textField_11.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(java.awt.event.KeyEvent evt) {

				char iNumber = evt.getKeyChar();
				if (!(Character.isDigit(iNumber)) || (iNumber == KeyEvent.VK_BACK_SPACE)
						|| (iNumber == KeyEvent.VK_DELETE)) {
					evt.consume();
				}

			}
		});
		textField_11.setFont(new Font("Tahoma", Font.BOLD, 24));
		textField_11.setColumns(10);
		textField_11.setBounds(448, 347, 120, 27);
		panel.add(textField_11);

		JLabel lblAddMath = new JLabel("Economices");
		lblAddMath.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblAddMath.setBounds(294, 350, 136, 20);
		panel.add(lblAddMath);

		JLabel lblCourseCode_1 = new JLabel("Course Code");
		lblCourseCode_1.setFont(new Font("Tahoma", Font.PLAIN, 23));
		lblCourseCode_1.setBounds(10, 183, 136, 20);
		panel.add(lblCourseCode_1);

		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] { "CSE47", "CSE32", "CSE45", "CSE37" }));
		comboBox.setFont(new Font("Tahoma", Font.PLAIN, 24));
		comboBox.setBounds(164, 180, 120, 27);
		panel.add(comboBox);

		JSeparator separator = new JSeparator();
		separator.setBounds(10, 218, 565, 2);
		panel.add(separator);

		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(10, 167, 565, 2);
		panel.add(separator_1);

		JLabel lblCheme = new JLabel("Chemistry");
		lblCheme.setFont(new Font("Tahoma", Font.BOLD, 22));
		lblCheme.setBounds(294, 176, 136, 27);
		panel.add(lblCheme);

		textField_12 = new JTextField("");
		textField_12.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(java.awt.event.KeyEvent evt) {

				char iNumber = evt.getKeyChar();
				if (!(Character.isDigit(iNumber)) || (iNumber == KeyEvent.VK_BACK_SPACE)
						|| (iNumber == KeyEvent.VK_DELETE)) {
					evt.consume();
				}

			}
		});
		textField_12.setFont(new Font("Tahoma", Font.BOLD, 24));
		textField_12.setColumns(10);
		textField_12.setBounds(448, 176, 120, 27);
		panel.add(textField_12);

		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new TitledBorder(new LineBorder(new Color(255, 0, 0), 4), "Student Transcript",
				TitledBorder.CENTER, TitledBorder.TOP, null, null));
		panel_1.setBounds(743, 11, 600, 393);
		frame.getContentPane().add(panel_1);

		JTextArea textArea = new JTextArea();
		textArea.addAncestorListener(new AncestorListener() {
			public void ancestorAdded(AncestorEvent arg0) {
			}

			public void ancestorMoved(AncestorEvent arg0) {
			}

			public void ancestorRemoved(AncestorEvent arg0) {
			}
		});
		panel_1.setLayout(new BorderLayout(0, 0));
		panel_1.add(textArea);

		table = new JTable();
		table.setCellSelectionEnabled(true);
		table.setSurrendersFocusOnKeystroke(true);
		table.addAncestorListener(new AncestorListener() {
			public void ancestorAdded(AncestorEvent arg0) {
			}

			public void ancestorMoved(AncestorEvent arg0) {
			}

			public void ancestorRemoved(AncestorEvent arg0) {
			}
		});
		table.setBorder(new LineBorder(new Color(0, 0, 0)));
		table.setFont(new Font("Tahoma", Font.PLAIN, 20));
		table.setModel(new DefaultTableModel(new Object[][] {,},
				new String[] { "Student_ID", "Sure Name", "Course_Code", "Math", "English", "Computing", "Chemistry",
						"Biology", "Economices", "Average", "Ranking", "Total Score" }));
		table.setBounds(10, 434, 1344, 160);
		frame.getContentPane().add(table);

		JButton btnNewButton = new JButton("Add Results");
		btnNewButton.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent arg0) {

				double[] R = new double[10];

				R[0] = Double.parseDouble(textField_5.getText());
				R[1] = Double.parseDouble(textField_6.getText());
				R[2] = Double.parseDouble(textField_7.getText());
				R[3] = Double.parseDouble(textField_8.getText());
				R[4] = Double.parseDouble(textField_9.getText());
				R[5] = Double.parseDouble(textField_11.getText());
				R[6] = Double.parseDouble(textField_12.getText());
				R[9] = (R[0] + R[1] + R[2] + R[3] + R[4] + R[5] + R[6]);
				R[8] = R[9] / 7;

				String Average = String.format("%.2f", R[8]);
				textField_4.setText(Average);

				String iTotal = String.format("%.2f", R[9]);
				textField_3.setText(iTotal);

				if (R[9] >= 700) {

					textField_10.setText("1st");

				}

				else if (R[9] >= 600) {

					textField_10.setText("2nd");
				} else if (R[9] >= 500) {

					textField_10.setText("2nd");
				} else if (R[9] >= 400) {

					textField_10.setText("3rd");
				} else if (R[9] >= 300) {

					textField_10.setText("Chart Of You");
				}

				else if (R[9] >= 200) {

					textField_10.setText("Fail");
				}

				// ==================================================

				DefaultTableModel model = (DefaultTableModel) table.getModel();
				model.addRow(new Object[] {

						textField_StudentID.getText().toString(), textField_1.getText().toString(),
						textField_2.getText().toString(), textField_3.getText().toString(),
						textField_4.getText().toString(), textField_5.getText().toString(),
						textField_6.getText().toString(), textField_7.getText().toString(),
						textField_8.getText().toString(), textField_9.getText().toString(),
						textField_10.getText().toString(), textField_12.getText().toString() });

			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnNewButton.setBounds(46, 620, 141, 38);
		frame.getContentPane().add(btnNewButton);

		JButton btnDleate = new JButton("Delete");
		btnDleate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				// ============================================

				DefaultTableModel model = (DefaultTableModel) table.getModel();
				if (table.getSelectedRow() == 1) {
					if (table.getRowCount() == 0) {

						JOptionPane.showMessageDialog(null, "No data ti delete", "Student Result System",
								JOptionPane.OK_OPTION);
					} else {
						JOptionPane.showMessageDialog(null, "Select a row to delete", "Student Result System",
								JOptionPane.OK_OPTION);
					}
				} else {
					model.removeRow(table.getSelectedRow());

				}
			}
		});
		btnDleate.setFont(new Font("Tahoma", Font.BOLD, 22));
		btnDleate.setBounds(368, 618, 141, 38);
		frame.getContentPane().add(btnDleate);

		JButton btnTranscript = new JButton("Transcript");
		btnTranscript.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String s1 = textField_StudentID.getText().toString();
				String s2 = textField_1.getText().toString();
				String s3 = textField_2.getText().toString();
				String s4 = textField_5.getText().toString();
				String s5 = textField_6.getText().toString();
				String s6 = textField_7.getText().toString();
				String s7 = textField_8.getText().toString();
				String s8 = textField_9.getText().toString();
				String s9 = textField_11.getText().toString();
				String s10 = textField_12.getText().toString();
				String s11 = textField_3.getText().toString();
				String s12 = textField_4.getText().toString();
				String s13 = textField_10.getText().toString();

				if (s1.isEmpty() || s2.isEmpty()) {
					System.out.println("field is empty");
				}

				textArea.setText(s13);
				textArea.setText("Student Result System\n=============================================\n\nStudent ID: "
						+ s1 + "\nFirst Name : " + s2 + " " + s3 + "\nMaths: " + s4 + "\nEnglish: " + s5 + "\nBiology: "
						+ s6 + "\nComputing: " + s7 + "\nPhysics: " + s8 + "\nEconomices: " + s9 + "\nChemistry: " + s10
						+ "\n\n=============================================\n\n" + "" + "" + "Total Score: " + s11
						+ "\nAverage: " + s12 + "\nRanking: " + s13
						+ "\n\n=============================================");

			}
		});
		btnTranscript.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnTranscript.setBounds(530, 620, 141, 38);
		frame.getContentPane().add(btnTranscript);

		JButton btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener() {
			private EventObject event;

			public void actionPerformed(ActionEvent e) {

				textField_StudentID.setText("");
				textField_1.setText("");
				textField_2.setText("");
				textField_3.setText("");
				textField_4.setText("");
				textField_5.setText("");
				textField_6.setText("");
				textField_7.setText("");
				textField_8.setText("");
				textField_9.setText("");
				textField_10.setText("");
				textField_11.setText("");
				textField_12.setText("");
				textArea.setText("");

			}

		});
		btnReset.setFont(new Font("Tahoma", Font.BOLD, 22));
		btnReset.setBounds(691, 618, 141, 38);
		frame.getContentPane().add(btnReset);

		JButton button_2 = new JButton("Exit");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				frame = new JFrame("Exit");
				if (JOptionPane.showConfirmDialog(frame, "Confirm if you want to exit", "Student Result System",
						JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION) {
					System.exit(0);
				}

			}
		});
		button_2.setFont(new Font("Tahoma", Font.BOLD, 22));
		button_2.setBounds(856, 618, 141, 38);
		frame.getContentPane().add(button_2);

		JSeparator separator_2 = new JSeparator();
		separator_2.setBounds(20, 681, 1323, 2);
		frame.getContentPane().add(separator_2);

		JSeparator separator_3 = new JSeparator();
		separator_3.setBounds(20, 605, 1323, 2);
		frame.getContentPane().add(separator_3);

		JButton btnPrint = new JButton("Print");
		btnPrint.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				try {

					textArea.print();

				} catch (java.awt.print.PrinterException e) {
					System.err.format("No Printer Found", e.getMessage());
				}

			}
		});
		btnPrint.setFont(new Font("Tahoma", Font.BOLD, 22));
		btnPrint.setBounds(209, 618, 141, 38);
		frame.getContentPane().add(btnPrint);

		JLabel lblStudentid = new JLabel("Student ID");
		lblStudentid.setEnabled(false);
		lblStudentid.setHorizontalAlignment(SwingConstants.CENTER);
		lblStudentid.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblStudentid.setBounds(26, 415, 66, 20);
		frame.getContentPane().add(lblStudentid);

		JLabel lblStudentId = new JLabel("First Name");
		lblStudentId.setHorizontalAlignment(SwingConstants.CENTER);
		lblStudentId.setEnabled(false);
		lblStudentId.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblStudentId.setBounds(121, 415, 108, 20);
		frame.getContentPane().add(lblStudentId);

		JLabel lblSureName = new JLabel("Sure Name");
		lblSureName.setEnabled(false);
		lblSureName.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblSureName.setBounds(256, 415, 66, 20);
		frame.getContentPane().add(lblSureName);

		JLabel lblTotalScore = new JLabel("Total Score");
		lblTotalScore.setEnabled(false);
		lblTotalScore.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblTotalScore.setBounds(368, 415, 66, 20);
		frame.getContentPane().add(lblTotalScore);

		JLabel lblAverage = new JLabel("Average");
		lblAverage.setEnabled(false);
		lblAverage.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblAverage.setBounds(482, 415, 66, 20);
		frame.getContentPane().add(lblAverage);

		JLabel lblMaths_1 = new JLabel("Maths");
		lblMaths_1.setEnabled(false);
		lblMaths_1.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblMaths_1.setBounds(602, 415, 66, 20);
		frame.getContentPane().add(lblMaths_1);

		JLabel lblEnglish_1 = new JLabel("English");
		lblEnglish_1.setEnabled(false);
		lblEnglish_1.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblEnglish_1.setBounds(706, 415, 66, 20);
		frame.getContentPane().add(lblEnglish_1);

		JLabel lblBiology_1 = new JLabel("Biology");
		lblBiology_1.setEnabled(false);
		lblBiology_1.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblBiology_1.setBounds(826, 415, 66, 20);
		frame.getContentPane().add(lblBiology_1);

		JLabel lblComputing_1 = new JLabel("Computing");
		lblComputing_1.setEnabled(false);
		lblComputing_1.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblComputing_1.setBounds(930, 415, 66, 20);
		frame.getContentPane().add(lblComputing_1);

		JLabel lblPhysics = new JLabel("Physics");
		lblPhysics.setEnabled(false);
		lblPhysics.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblPhysics.setBounds(1045, 415, 66, 20);
		frame.getContentPane().add(lblPhysics);

		JLabel lblRanking_1 = new JLabel("Ranking");
		lblRanking_1.setEnabled(false);
		lblRanking_1.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblRanking_1.setBounds(1160, 415, 66, 20);
		frame.getContentPane().add(lblRanking_1);

		JLabel lblChemistry = new JLabel("Chemistry");
		lblChemistry.setEnabled(false);
		lblChemistry.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblChemistry.setBounds(1266, 415, 66, 20);
		frame.getContentPane().add(lblChemistry);

		JButton about_us = new JButton("About Us");
		about_us.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				aboutus info = new aboutus();
				aboutus.main(null);

			}
		});
		about_us.setFont(new Font("Tahoma", Font.BOLD, 22));
		about_us.setBounds(1025, 618, 141, 38);
		frame.getContentPane().add(about_us);

		JButton btnLogout = new JButton("Logout");
		btnLogout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				frame = new JFrame("Exit");
				if (JOptionPane.showConfirmDialog(frame, "Confirm if you want to Logout", "",
						JOptionPane.CLOSED_OPTION) == JOptionPane.OK_OPTION) {
					System.exit(0);

				}

			}

		});
		btnLogout.setFont(new Font("Tahoma", Font.BOLD, 22));
		btnLogout.setBounds(1198, 620, 141, 38);
		frame.getContentPane().add(btnLogout);
	}

	public JTable getTable() {
		return table;
	}
}
