import java.awt.Button;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;

public class Panel extends JPanel{
	
	Button one = new Button("1");
	Button two = new Button("2");
	Button three = new Button("3");
	Button four = new Button("4");
	Button five = new Button("5");
	Button six = new Button("6");
	Button seven = new Button("7");
	Button eight = new Button("8");
	Button nine = new Button("9");
	Button zero = new Button("0");
	Button add = new Button("+");
	Button subtract = new Button("-");
	Button multiply = new Button("*");
	Button divide = new Button("/");
	Button equals = new Button("=");
	Button coma = new Button(",");
	
	Panel(){
		this.setLayout(new GridLayout(4,4));
		this.add(one);
		this.add(two);
		this.add(three);
		this.add(add);
		this.add(four);
		this.add(five);
		this.add(six);
		this.add(subtract);
		this.add(seven);
		this.add(eight);
		this.add(nine);
		this.add(multiply);
		this.add(coma);
		this.add(zero);
		this.add(equals);
		this.add(divide);
	}
	public void DeactivationOfButtons() {
		one.setEnabled(false);
		two.setEnabled(false);
		three.setEnabled(false);
		four.setEnabled(false);
		five.setEnabled(false);
		six.setEnabled(false);
		seven.setEnabled(false);
		eight.setEnabled(false);
		nine.setEnabled(false);
		zero.setEnabled(false);
		
		add.setEnabled(false);
		subtract.setEnabled(false);
		multiply.setEnabled(false);
		divide.setEnabled(false);
		equals.setEnabled(false);

		coma.setEnabled(false);

	}
	public void ActivationOfButtons() {
		one.setEnabled(true);
		two.setEnabled(true);
		three.setEnabled(true);
		four.setEnabled(true);
		five.setEnabled(true);
		six.setEnabled(true);
		seven.setEnabled(true);
		eight.setEnabled(true);
		nine.setEnabled(true);
		zero.setEnabled(true);
		
		add.setEnabled(true);
		subtract.setEnabled(true);
		multiply.setEnabled(true);
		divide.setEnabled(true);
		equals.setEnabled(true);

		coma.setEnabled(true);

	}
	
	}



