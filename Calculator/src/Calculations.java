import java.util.ArrayList;
import java.util.Stack;

import javax.swing.JOptionPane;

public class Calculations {
	
	ArrayList<String> EvaluatingExpression(ArrayList<String> inputExpression) {
		
		Stack<String> stos = new Stack<>();

		while (inputExpression.isEmpty() == false) {
			
			 if (
					inputExpression.get(0).equals("+") ||
					inputExpression.get(0).equals("-") ||
					inputExpression.get(0).equals("*") ||
					inputExpression.get(0).equals("/") ){
				
				double x,y, result;
				
				x = Double.parseDouble(stos.peek());
				stos.pop();
				y = Double.parseDouble(stos.peek());
				stos.pop();
				
				
				if(inputExpression.get(0).equals("+")) {
					
					result = x+y;
					stos.add(Double.toString(result));
				}
				else if (inputExpression.get(0).equals("*")) {
					result = x*y;

					stos.add(Double.toString(result));				}
                else if (inputExpression.get(0).equals("-")) {
                	result = y-x;
					stos.add(Double.toString(result));
}
                else if (inputExpression.get(0).equals("/")) { 
                	
                	if(x == 0) {
                    	JOptionPane.showMessageDialog(null,"The program encountered a mathematical operation involving division by 0", "Divide by 0 error", JOptionPane.ERROR_MESSAGE);

                	}
                	
                	result = y/x;
					stos.add(Double.toString(result));    
}

				inputExpression.remove(0);
				
			}
			else {
				stos.add(inputExpression.get(0));
				inputExpression.remove(0);
			}

				

	}
		
		ArrayList<String> outputExpression = new ArrayList<>();

		outputExpression.add(stos.peek()); 

		return outputExpression;
	}
	
	
}
