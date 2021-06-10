import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

import javax.swing.*;

public class Frame extends JFrame implements ActionListener{
	
	Panel panel;
	ImageIcon icon;
	TextField textField;
	String zmienna;
	Button clear;
	
	ArrayList<String> list = new ArrayList<String>();
	Calculations calculations = new Calculations();
	OperatorPrecedence operatorPrecedence = new OperatorPrecedence();

	
	Frame(){
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(420,550);
		this.setResizable(false);
		this.setLayout(null);
		this.setTitle("Calculator");
		icon = new ImageIcon("calculator.png");
		this.setIconImage(icon.getImage()); 

		clear = new Button("Clear");
		clear.setBounds(3,440,400,70);
		clear.addActionListener(this);
		this.add(clear);
		
		panel = new Panel();
		panel.setBounds(3,60,400,380);
		textField = new TextField();
		textField.setBounds(3,0,400,50);
		textField.setFont(new Font(null, Font.PLAIN, 30));
		textField.setEditable(false);		
		
		
		this.add(panel);
		this.add(textField);
		
		this.setVisible(true);
		
		panel.coma.addActionListener(this);
		panel.one.addActionListener(this);
		panel.two.addActionListener(this);
		panel.three.addActionListener(this);
		panel.four.addActionListener(this);
		panel.five.addActionListener(this);
		panel.six.addActionListener(this);
		panel.seven.addActionListener(this);
		panel.eight.addActionListener(this);
		panel.nine.addActionListener(this);
		panel.zero.addActionListener(this);
		
		panel.equals.addActionListener(this);
		panel.add.addActionListener(this);
		panel.multiply.addActionListener(this);
		panel.divide.addActionListener(this);
		panel.subtract.addActionListener(this);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == panel.coma) {
			zmienna = textField.getText();
			textField.setText(zmienna + ".");
			zmienna = textField.getText();
			panel.coma.setEnabled(false);
		}
		else if(e.getSource() == panel.one) {
			zmienna = textField.getText();
			textField.setText(zmienna + "1");
			zmienna = textField.getText();
		}
		else if(e.getSource() == panel.two) {
			zmienna = textField.getText();
			textField.setText(zmienna + "2");
			zmienna = textField.getText();
		}
		else if(e.getSource() == panel.three) {
			zmienna = textField.getText();
			textField.setText(zmienna + "3");
			zmienna = textField.getText();
		}
		else if(e.getSource() == panel.four) {
			zmienna = textField.getText();
			textField.setText(zmienna + "4");
			zmienna = textField.getText();
		}
		else if(e.getSource() == panel.five) {
			zmienna = textField.getText();
			textField.setText(zmienna + "5");
			zmienna = textField.getText();
		}
		else if(e.getSource() == panel.six) {
			zmienna = textField.getText();
			textField.setText(zmienna + "6");
			zmienna = textField.getText();
		}
		else if(e.getSource() == panel.seven) {
			zmienna = textField.getText();
			textField.setText(zmienna + "7");
			zmienna = textField.getText();
		}
		else if(e.getSource() == panel.eight) {
			zmienna = textField.getText();
			textField.setText(zmienna + "8");
			zmienna = textField.getText();
		}
		else if(e.getSource() == panel.nine) {
			zmienna = textField.getText();
			textField.setText(zmienna + "9");
			zmienna = textField.getText();
		}
		else if(e.getSource() == panel.zero) {
			zmienna = textField.getText();
			textField.setText(zmienna + "0");
			zmienna = textField.getText();
		}
		else if(e.getSource() == clear) {
			textField.setText("");
			list.clear();
			panel.ActivationOfButtons();
			
		}
		else if(e.getSource() == panel.add) {
			list.add(textField.getText());
			list.add("+");
			
			textField.setText("");
			panel.coma.setEnabled(true);
			
		    
		}
		else if(e.getSource() == panel.subtract) {
			list.add(textField.getText());
			list.add("-");
			
			textField.setText("");
			panel.coma.setEnabled(true);
			
		    
		}
		else if(e.getSource() == panel.multiply) {
			list.add(textField.getText());
			list.add("*");
			
			textField.setText("");
			panel.coma.setEnabled(true);
			
		    
		}
		else if(e.getSource() == panel.divide) {
			list.add(textField.getText());
			list.add("/");
			
			textField.setText("");
			panel.coma.setEnabled(true);
			
		    
		}
		else if(e.getSource() == panel.equals) {
			list.add(textField.getText());
			
			list = operatorPrecedence.ChangingPositionOfOperators(list);
			list = calculations.EvaluatingExpression(list);
			
			textField.setText(list.get(0));
			
			panel.DeactivationOfButtons();
	
			}
		}
	}
