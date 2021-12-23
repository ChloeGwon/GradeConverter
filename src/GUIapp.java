import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;

public class GUIapp extends JFrame {

	private JPanel contentPane;
	private JTextField grade1;
	private JTextField grade2;
	private JTextField grade3;
	private JTextField grade4;
	private JTextField grade5;
	private JTextField grade6;
	private JTextField grade7;
	private JTextField ttlPoint1;
	private JTextField ttlPoint2;
	private JTextField ttlPoint3;
	private JTextField ttlPoint4;
	private JTextField ttlPoint5;
	private JTextField ttlPoint6;
	private JTextField ttlPoint7;
	private JTextField textField_8;
	private JTextField yourPoint2;
	private JTextField yourPoint1;
	private JTextField yourPoint3;
	private JTextField yourPoint4;
	private JTextField yourPoint5;
	private JTextField yourPoint6;
	private JTextField yourPoint7;
	double finalGrade = 100;
	private JLabel grade;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUIapp frame = new GUIapp();
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
	public GUIapp() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 559, 690);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel lblNewLabel = new JLabel("Grade Converter");
		lblNewLabel.setFont(new Font("Lucida Grande", Font.PLAIN, 18));
		
		JLabel lblNewLabel_1 = new JLabel("Percentage of Total Grade");
		lblNewLabel_1.setFont(new Font("Lucida Grande", Font.PLAIN, 16));
		
		JLabel lblNewLabel_2 = new JLabel("Assessment1");
		
		JLabel lblNewLabel_3 = new JLabel("Assessment2");
		
		JLabel lblNewLabel_4 = new JLabel("Assessment3");
		
		JLabel lblNewLabel_5 = new JLabel("Assessment4");
		
		JLabel lblNewLabel_6 = new JLabel("Assessment5");
		
		JLabel lblNewLabel_7 = new JLabel("Assessment6");
		
		JLabel lblNewLabel_8 = new JLabel("%");
		
		JLabel lblNewLabel_8_1 = new JLabel("%");
		
		JLabel lblNewLabel_8_2 = new JLabel("%");
		
		JLabel lblNewLabel_8_3 = new JLabel("%");
		
		JLabel lblNewLabel_8_4 = new JLabel("%");
		
		JLabel lblNewLabel_8_5 = new JLabel("%");
		
		JLabel lblNewLabel_9 = new JLabel("Total Points");
		lblNewLabel_9.setFont(new Font("Lucida Grande", Font.PLAIN, 16));
		
		JLabel lblNewLabel_9_1 = new JLabel("Your Points");
		lblNewLabel_9_1.setFont(new Font("Lucida Grande", Font.PLAIN, 16));
		
		JButton btn = new JButton("Click to Calculate");
		
		JLabel lblNewLabel_10 = new JLabel("Your Current Grade:");
		lblNewLabel_10.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		
		grade = new JLabel("");
		grade.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		grade.setForeground(Color.BLUE);
		
		JLabel lblNewLabel_7_1 = new JLabel("Assessment7");
		
		JLabel lblNewLabel_8_5_1 = new JLabel("%");
		
		grade1 = new JTextField();
		grade1.setColumns(10);
		
		grade2 = new JTextField();
		grade2.setColumns(10);
		
		grade3 = new JTextField();
		grade3.setColumns(10);
		
		grade4 = new JTextField();
		grade4.setColumns(10);
		
		grade5 = new JTextField();
		grade5.setColumns(10);
		
		grade6 = new JTextField();
		grade6.setColumns(10);
		
		grade7 = new JTextField();
		grade7.setColumns(10);
		
		ttlPoint1 = new JTextField();
		ttlPoint1.setColumns(10);
		
		//From here! When calculate button is clicked, run this code below
		btn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				finalGrade = 100;
				if (!grade1.getText().isEmpty()) {
					//Get entered values
					double gradePercentage = Double.parseDouble(grade1.getText());
					double ttlPoint = Double.parseDouble(ttlPoint1.getText());
					double yourPoint = Double.parseDouble(yourPoint1.getText());
					
					setup(gradePercentage, ttlPoint, yourPoint);
				}
				
				if (!grade2.getText().isEmpty()) {
					//Get entered values
					double gradePercentage = Double.parseDouble(grade2.getText());
					double ttlPoint = Double.parseDouble(ttlPoint2.getText());
					double yourPoint = Double.parseDouble(yourPoint2.getText());
					//If till assessment2 is entered and the sum of grade percentage is greater than 100, throw exception
					//It's not inside setup method because some assessments might be blank and you can’t get text.
					try {
						if (Integer.parseInt(grade1.getText()) + Integer.parseInt(grade2.getText()) > 100) {
							throw new InvalidNumber();
						}
					}
					catch (Exception ex) {
						JOptionPane.showMessageDialog(null, ex.getMessage());
					}
					
					setup(gradePercentage, ttlPoint, yourPoint);
				}
				
				if (!grade3.getText().isEmpty()) {
					//Get entered values
					double gradePercentage = Double.parseDouble(grade3.getText());
					double ttlPoint = Double.parseDouble(ttlPoint3.getText());
					double yourPoint = Double.parseDouble(yourPoint3.getText());
					//If till assessment3 is entered and the sum of grade percentage is greater than 100, throw exception
					try {
						if (Integer.parseInt(grade1.getText()) + Integer.parseInt(grade2.getText()) + Integer.parseInt(grade3.getText()) > 100) {
							throw new InvalidNumber();
						}
					}
					catch (Exception ex) {
						JOptionPane.showMessageDialog(null, ex.getMessage());
					}
					
					setup(gradePercentage, ttlPoint, yourPoint);
				}
				
				if (!grade4.getText().isEmpty()) {
					//Get entered values
					double gradePercentage = Double.parseDouble(grade4.getText());
					double ttlPoint = Double.parseDouble(ttlPoint4.getText());
					double yourPoint = Double.parseDouble(yourPoint4.getText());
					//If till assessment4 is entered and the sum of grade percentage is greater than 100, throw exception
					try {
						if (Integer.parseInt(grade1.getText()) + Integer.parseInt(grade2.getText()) + Integer.parseInt(grade3.getText()) + 
								Integer.parseInt(grade4.getText()) > 100) {
							throw new InvalidNumber();
						}
					}
					catch (Exception ex) {
						JOptionPane.showMessageDialog(null, ex.getMessage());
					}
					
					setup(gradePercentage, ttlPoint, yourPoint);
				}
				
				if (!grade5.getText().isEmpty()) {
					//Get entered values
					double gradePercentage = Double.parseDouble(grade5.getText());
					double ttlPoint = Double.parseDouble(ttlPoint5.getText());
					double yourPoint = Double.parseDouble(yourPoint5.getText());
					//If till assessment5 is entered and the sum of grade percentage is greater than 100, throw exception
					try {
						if (Integer.parseInt(grade1.getText()) + Integer.parseInt(grade2.getText()) + Integer.parseInt(grade3.getText()) +
								Integer.parseInt(grade4.getText()) + Integer.parseInt(grade5.getText()) > 100) {
							throw new InvalidNumber();
						}
					}
					catch (Exception ex) {
						JOptionPane.showMessageDialog(null, ex.getMessage());
					}
					
					setup(gradePercentage, ttlPoint, yourPoint);
				}
				
				if (!grade6.getText().isEmpty()) {
					//Get entered values
					double gradePercentage = Double.parseDouble(grade6.getText());
					double ttlPoint = Double.parseDouble(ttlPoint6.getText());
					double yourPoint = Double.parseDouble(yourPoint6.getText());
					//If till assessment6 is entered and the sum of grade percentage is greater than 100, throw exception
					try {
						if (Integer.parseInt(grade1.getText()) + Integer.parseInt(grade2.getText()) + Integer.parseInt(grade3.getText()) +
								Integer.parseInt(grade4.getText()) + Integer.parseInt(grade5.getText()) + Integer.parseInt(grade6.getText()) > 100) {
							throw new InvalidNumber();
						}
					}
					catch (Exception ex) {
						JOptionPane.showMessageDialog(null, ex.getMessage());
					}
					
					setup(gradePercentage, ttlPoint, yourPoint);
				}
				
				if (!grade7.getText().isEmpty()) {
					//Get entered values
					double gradePercentage = Double.parseDouble(grade7.getText());
					double ttlPoint = Double.parseDouble(ttlPoint7.getText());
					double yourPoint = Double.parseDouble(yourPoint7.getText());
					//If till assessment7 is entered and the sum of grade percentage is greater than 100, throw exception
					try {
						if (Integer.parseInt(grade1.getText()) + Integer.parseInt(grade2.getText()) + Integer.parseInt(grade3.getText()) +
								Integer.parseInt(grade4.getText()) + Integer.parseInt(grade5.getText()) + Integer.parseInt(grade6.getText()) + 
								Integer.parseInt(grade7.getText()) > 100) {
							throw new InvalidNumber();
						}
					}
					catch (Exception ex) {
						JOptionPane.showMessageDialog(null, ex.getMessage());
					}
					
					setup(gradePercentage, ttlPoint, yourPoint);
				}
			}
		});
		
		ttlPoint2 = new JTextField();
		ttlPoint2.setColumns(10);

		ttlPoint3 = new JTextField();
		ttlPoint3.setColumns(10);
		
		ttlPoint4 = new JTextField();
		ttlPoint4.setColumns(10);
		
		ttlPoint5 = new JTextField();
		ttlPoint5.setColumns(10);
		
		ttlPoint6 = new JTextField();
		ttlPoint6.setColumns(10);
		
		ttlPoint7 = new JTextField();
		ttlPoint7.setColumns(10);
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		
		yourPoint2 = new JTextField();
		yourPoint2.setColumns(10);
		
		yourPoint1 = new JTextField();
		yourPoint1.setColumns(10);
		
		yourPoint3 = new JTextField();
		yourPoint3.setColumns(10);
		
		yourPoint4 = new JTextField();
		yourPoint4.setColumns(10);
		
		yourPoint5 = new JTextField();
		yourPoint5.setColumns(10);
		
		yourPoint6 = new JTextField();
		yourPoint6.setColumns(10);
		
		yourPoint7 = new JTextField();
		yourPoint7.setColumns(10);
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGap(16)
									.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
										.addComponent(lblNewLabel_1)
										.addGroup(gl_contentPane.createSequentialGroup()
											.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
												.addComponent(lblNewLabel_2)
												.addComponent(lblNewLabel_3)
												.addComponent(lblNewLabel_4)
												.addComponent(lblNewLabel_5)
												.addComponent(lblNewLabel_6)
												.addComponent(lblNewLabel_7)
												.addComponent(lblNewLabel_7_1, GroupLayout.PREFERRED_SIZE, 84, GroupLayout.PREFERRED_SIZE))
											.addGap(18)
											.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
												.addComponent(grade1, GroupLayout.PREFERRED_SIZE, 69, GroupLayout.PREFERRED_SIZE)
												.addComponent(grade2, GroupLayout.PREFERRED_SIZE, 69, GroupLayout.PREFERRED_SIZE)
												.addComponent(grade3, GroupLayout.PREFERRED_SIZE, 69, GroupLayout.PREFERRED_SIZE)
												.addComponent(grade4, GroupLayout.PREFERRED_SIZE, 69, GroupLayout.PREFERRED_SIZE)
												.addComponent(grade5, GroupLayout.PREFERRED_SIZE, 69, GroupLayout.PREFERRED_SIZE)
												.addComponent(grade6, GroupLayout.PREFERRED_SIZE, 69, GroupLayout.PREFERRED_SIZE)
												.addComponent(grade7, GroupLayout.PREFERRED_SIZE, 69, GroupLayout.PREFERRED_SIZE))
											.addPreferredGap(ComponentPlacement.RELATED)
											.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
												.addComponent(lblNewLabel_8_5_1, GroupLayout.PREFERRED_SIZE, 9, GroupLayout.PREFERRED_SIZE)
												.addComponent(lblNewLabel_8_5, GroupLayout.PREFERRED_SIZE, 9, GroupLayout.PREFERRED_SIZE)
												.addComponent(lblNewLabel_8_4, GroupLayout.PREFERRED_SIZE, 9, GroupLayout.PREFERRED_SIZE)
												.addComponent(lblNewLabel_8_3, GroupLayout.PREFERRED_SIZE, 9, GroupLayout.PREFERRED_SIZE)
												.addComponent(lblNewLabel_8_2, GroupLayout.PREFERRED_SIZE, 9, GroupLayout.PREFERRED_SIZE)
												.addComponent(lblNewLabel_8_1, GroupLayout.PREFERRED_SIZE, 9, GroupLayout.PREFERRED_SIZE)
												.addComponent(lblNewLabel_8))))
									.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
										.addGroup(gl_contentPane.createSequentialGroup()
											.addGap(37)
											.addComponent(lblNewLabel_9))
										.addGroup(gl_contentPane.createSequentialGroup()
											.addGap(49)
											.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
												.addComponent(ttlPoint2, GroupLayout.PREFERRED_SIZE, 69, GroupLayout.PREFERRED_SIZE)
												.addComponent(ttlPoint1, GroupLayout.PREFERRED_SIZE, 69, GroupLayout.PREFERRED_SIZE)
												.addComponent(ttlPoint3, GroupLayout.PREFERRED_SIZE, 69, GroupLayout.PREFERRED_SIZE)
												.addComponent(ttlPoint4, GroupLayout.PREFERRED_SIZE, 69, GroupLayout.PREFERRED_SIZE)
												.addComponent(ttlPoint5, GroupLayout.PREFERRED_SIZE, 69, GroupLayout.PREFERRED_SIZE)
												.addComponent(ttlPoint6, GroupLayout.PREFERRED_SIZE, 69, GroupLayout.PREFERRED_SIZE)
												.addComponent(ttlPoint7, GroupLayout.PREFERRED_SIZE, 69, GroupLayout.PREFERRED_SIZE))))
									.addPreferredGap(ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
									.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING, false)
										.addComponent(lblNewLabel_9_1, GroupLayout.PREFERRED_SIZE, 93, GroupLayout.PREFERRED_SIZE)
										.addGroup(gl_contentPane.createSequentialGroup()
											.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
												.addComponent(yourPoint1, GroupLayout.PREFERRED_SIZE, 69, GroupLayout.PREFERRED_SIZE)
												.addComponent(yourPoint2, GroupLayout.PREFERRED_SIZE, 69, GroupLayout.PREFERRED_SIZE)
												.addComponent(yourPoint3, GroupLayout.PREFERRED_SIZE, 69, GroupLayout.PREFERRED_SIZE)
												.addComponent(yourPoint4, GroupLayout.PREFERRED_SIZE, 69, GroupLayout.PREFERRED_SIZE)
												.addComponent(yourPoint5, GroupLayout.PREFERRED_SIZE, 69, GroupLayout.PREFERRED_SIZE)
												.addComponent(yourPoint6, GroupLayout.PREFERRED_SIZE, 69, GroupLayout.PREFERRED_SIZE)
												.addComponent(yourPoint7, GroupLayout.PREFERRED_SIZE, 69, GroupLayout.PREFERRED_SIZE))
											.addGap(11)))
									.addGap(270))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGap(167)
									.addComponent(lblNewLabel_10)
									.addGap(31)
									.addComponent(grade)))
							.addGap(218)
							.addComponent(textField_8, GroupLayout.PREFERRED_SIZE, 69, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(204)
							.addComponent(btn))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(189)
							.addComponent(lblNewLabel)))
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(18)
					.addComponent(lblNewLabel)
					.addGap(42)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_1)
						.addComponent(lblNewLabel_9)
						.addComponent(lblNewLabel_9_1, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE))
					.addGap(28)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_2)
						.addComponent(grade1, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_8)
						.addComponent(textField_8, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
						.addComponent(yourPoint1, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
						.addComponent(ttlPoint1, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE))
					.addGap(24)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_3)
						.addComponent(grade2, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_8_1)
						.addComponent(yourPoint2, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
						.addComponent(ttlPoint2, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE))
					.addGap(24)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblNewLabel_4)
								.addComponent(grade3, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblNewLabel_8_2))
							.addGap(27)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblNewLabel_5)
								.addComponent(grade4, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblNewLabel_8_3)
								.addComponent(yourPoint4, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
								.addComponent(ttlPoint4, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(yourPoint3, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
								.addComponent(ttlPoint3, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE))))
					.addGap(28)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_6)
						.addComponent(grade5, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_8_4)
						.addComponent(yourPoint5, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
						.addComponent(ttlPoint5, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE))
					.addGap(26)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_7)
						.addComponent(grade6, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_8_5)
						.addComponent(yourPoint6, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
						.addComponent(ttlPoint6, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE))
					.addGap(28)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_7_1)
						.addComponent(grade7, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_8_5_1)
						.addComponent(yourPoint7, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
						.addComponent(ttlPoint7, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
					.addComponent(btn)
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_10)
						.addComponent(grade))
					.addGap(28))
		);
		contentPane.setLayout(gl_contentPane);
	}
	
	public void setup(double gradePercentage, double ttlPoint, double yourPoint) {
			try {
			//Percent of total grade should be under 100. If not, throw exception.
			if (gradePercentage > 100) {
				throw new InvalidNumber();
			}
			//If your point is greater than total point, throw exception.
			if (yourPoint > ttlPoint) {
				throw new InvalidPoints();
			}
			//Calculate your point percentage of total grade 
			double division = ttlPoint / gradePercentage;
			double pointsPercentage = yourPoint / division;
			double deduction = gradePercentage - pointsPercentage;
			finalGrade -= deduction;
			
			DecimalFormat df = new DecimalFormat("##.##");
			grade.setText(df.format(finalGrade)+" ("+calculateLetter(finalGrade)+")");
		}
		catch (NumberFormatException ex) {
			JOptionPane.showMessageDialog(null, "Please enter number");
		}
		catch (Exception ex) {
			JOptionPane.showMessageDialog(null, ex.getMessage());
		}
	}
	
	public String calculateLetter(double finalGrade) {
		String letter = "";
		if (finalGrade >= 95)
			letter = "A+";
		else if (finalGrade < 95 && finalGrade >= 90)
			letter = "A";
		else if (finalGrade < 90 && finalGrade >= 85)
			letter = "A-";
		else if (finalGrade < 85 && finalGrade >= 80)
			letter = "B+";
		else if (finalGrade < 80 && finalGrade >= 75)
			letter = "B";
		else if (finalGrade < 75 && finalGrade >= 70)
			letter = "B-";
		else if (finalGrade < 70 && finalGrade >= 65)
			letter = "C+";
		else if (finalGrade < 65 && finalGrade >= 60)
			letter = "C";
		else if (finalGrade < 60 && finalGrade >= 55)
			letter = "C-";
		else if (finalGrade < 55 && finalGrade >= 50)
			letter = "P";
		else
			letter = "F";
		return letter;
	}
}
