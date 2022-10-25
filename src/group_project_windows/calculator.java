package group_project_windows;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.GridLayout;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class calculator extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JPanel panel_1;
	private JPanel panel_2;
	private JLabel lblNewLabel_3;
	private JTextArea textArea;
	private JButton btnNewButton;
	private JButton btnNewButton_1;
	private JButton btnNewButton_2;
	private JButton btnNewButton_3;
	private JButton btnNewButton_4;
	private JButton btnNewButton_5;
	private JButton btnNewButton_6;
	private JButton btnNewButton_7;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					calculator frame = new calculator();
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
	public calculator() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 698, 217);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.NORTH);
		panel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JLabel lblNewLabel = new JLabel("First Number");
		panel.add(lblNewLabel);
		
		textField = new JTextField();
		panel.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Second Number");
		panel.add(lblNewLabel_1);
		
		textField_1 = new JTextField();
		panel.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Word");
		panel.add(lblNewLabel_2);
		
		textField_2 = new JTextField();
		panel.add(textField_2);
		textField_2.setColumns(10);
		
		panel_2 = new JPanel();
		contentPane.add(panel_2, BorderLayout.SOUTH);
		panel_2.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		lblNewLabel_3 = new JLabel("Output");
		panel_2.add(lblNewLabel_3);
		
		textArea = new JTextArea();
		textArea.setColumns(25);
		panel_2.add(textArea);
		
		panel_1 = new JPanel();
		contentPane.add(panel_1, BorderLayout.CENTER);
		panel_1.setLayout(new GridLayout(2, 0, 10, 10));
		btnNewButton = new JButton("ADD");
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setBackground(Color.GRAY);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String x;
				String y;
				double w;
				double z;
				x = textField.getText();
				y = textField_1.getText();
				w = Double.parseDouble(x);
				z = Double.parseDouble(y);
				textArea.setText(String.format("%.2f",add(w,z)));				
			}
		});
		panel_1.add(btnNewButton);
		
		btnNewButton_1 = new JButton("SUBTRACT");
		btnNewButton_1.setBackground(Color.GRAY);
		btnNewButton_1.setForeground(Color.WHITE);
		btnNewButton_1.setFocusPainted(false);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String x;
				String y;
				double w;
				double z;
				x = textField.getText();
				y = textField_1.getText();
				w = Double.parseDouble(x);
				z = Double.parseDouble(y);
				textArea.setText(String.format("%.2f",subtract(w,z)));
				
			}
		});
		panel_1.add(btnNewButton_1);
		
		btnNewButton_2 = new JButton("DIVIDE");
		btnNewButton_2.setForeground(Color.WHITE);
		btnNewButton_2.setBackground(Color.GRAY);
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String x;
				String y;
				double w;
				double z;
				x = textField.getText();
				y = textField_1.getText();
				w = Double.parseDouble(x);
				z = Double.parseDouble(y);
				textArea.setText(String.format("%.2f",divide(w,z)));
			}
		});
		panel_1.add(btnNewButton_2);
		
		btnNewButton_3 = new JButton("MULTIPLY");
		btnNewButton_3.setForeground(Color.WHITE);
		btnNewButton_3.setBackground(Color.GRAY);
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String x;
				String y;
				double w;
				double z;
				x = textField.getText();
				y = textField_1.getText();
				w = Double.parseDouble(x);
				z = Double.parseDouble(y);
				textArea.setText(String.format("%.2f",multiply(w,z)));
			}
		});
		panel_1.add(btnNewButton_3);
		
		btnNewButton_4 = new JButton("REVERSE");
		btnNewButton_4.setForeground(Color.WHITE);
		btnNewButton_4.setBackground(Color.GRAY);
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String w = textField_2.getText();
				textArea.setText(reverseW(w));
				
			}
		});
		panel_1.add(btnNewButton_4);
		
		btnNewButton_5 = new JButton("REPEAT");
		btnNewButton_5.setForeground(Color.WHITE);
		btnNewButton_5.setBackground(Color.GRAY);
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String w = textField_2.getText();
				textArea.setText(repeat(w));
				
			}
		});
		panel_1.add(btnNewButton_5);
		
		btnNewButton_6 = new JButton("REMOVE FIRST LETTER");
		btnNewButton_6.setForeground(Color.WHITE);
		btnNewButton_6.setBackground(Color.GRAY);
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String w = textField_2.getText();
				textArea.setText(remove_first(w));
			}
		});
		panel_1.add(btnNewButton_6);
		
		btnNewButton_7 = new JButton("REMOVE LAST LETTER");
		btnNewButton_7.setForeground(Color.WHITE);
		btnNewButton_7.setBackground(Color.GRAY);
		btnNewButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String w = textField_2.getText();
				textArea.setText(remove_last(w));
			}
		});
		panel_1.add(btnNewButton_7);
		
	}
	public double add(double w, double z) {
		double result = w + z;
		return result;
	}
	
	public double subtract(double w, double z) {
		double result = w - z;
		return result;
	}
	
	public double divide(double w, double z) {
		double result = w/z;
		return result;
	}
	
	public double multiply(double w, double z) {
		double result = w*z;
		return result;
	}
	
	public String reverseW(String w) {
		String result = "";
		for (int i = 1; i<w.length()+1;i++) {
			result += w.charAt((w.length() - i));			
		}

	return result;	
	}
	
	public String repeat(String w) {
		String result = "";
		for (int i=0; i<w.length();i++) {
			result += w + " ";
		}
	return result;	
	}
	
	public String remove_first(String w) {
		String result = "";
		for (int i = 1; i<w.length();i++) {
			result += w.charAt(i);			
		}
		
	return result;	
	}
	
	public String remove_last(String w) {
		String result = "";
		for (int i = 0; i<w.length()-1;i++) {
			result += w.charAt(i);			
		}
	return result;	
	}
		
}

		

