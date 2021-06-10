import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Queue;
import java.util.Stack;

public class OperatorPrecedence {

	ArrayList<String> ChangingPositionOfOperators (ArrayList<String> inputExpression) {
		

		Queue<String> kolejka = new ArrayDeque<>();
		Stack<String> stos = new Stack<>();
		while (inputExpression.isEmpty() == false) {
			
			
			if (
					inputExpression.get(0).equals("+") ||
					inputExpression.get(0).equals("-") ||
					inputExpression.get(0).equals("*") ||
					inputExpression.get(0).equals("/") ){
				
				
				if(inputExpression.get(0).equals("+") || inputExpression.get(0).equals("-")) {
					
					if(stos.isEmpty() != true) {
						kolejka.add(stos.peek());
						stos.pop();
					}
					stos.add(inputExpression.get(0));
					inputExpression.remove(0);
				}
				else {
					stos.add(inputExpression.get(0));
					inputExpression.remove(0);
				}
			}
			else {
				kolejka.add(inputExpression.get(0));
				inputExpression.remove(0);
			}
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
		}

		
		ArrayList<String> outputExpression = new ArrayList<>();
		
		while(kolejka.isEmpty() == false) {
			outputExpression.add(kolejka.peek());
			kolejka.remove();
		}
		while(stos.isEmpty() == false) {
			outputExpression.add(stos.peek());
			stos.pop();
		}
		return outputExpression;
	}
	
	
}
