package calculator;

import java.util.ArrayList;

public class Calculator implements java.io.Serializable {

		private ArrayList<Double> operands = new ArrayList<Double>();
		private ArrayList<String> operations = new ArrayList<String>();
		private double result = 0;
		private boolean divide = false;
		private boolean subtract = false;
		
		public Calculator() {
			super();
		}
		
//		public Calculator(double operand, String operation) {
//			super();
//			this.operand = operand;
//			this.operation = operation;
//		}

//		public void performOperation() {
//			System.out.println("calculating: " + this.operand1 + " " + this.operation +
//					" " + this.operand2);
//			if (this.operation == "+") {
//				this.result = this.operand1 + this.operand2;
//			}
//			else {
//				this.result = this.operand1 - this.operand2;
//			}
//		}
		
		public void performOperation(double op) {
			if (divide == true) {
				op = 1/op;
			}			
			if (subtract == true) {
				op = (-1) * op;
			}
			this.operands.add(op);
			System.out.println("New operand is: " + op);
			divide = false;
			subtract = false;
		}
		
		public void performOperation(String oper) {
			if (oper == "/") {
				oper = "*";
				divide = true;
			}
			if (oper == "-") {
				oper = "+";
				subtract = true;
			}
			if (oper == "=") {
				return;
			}
			this.operations.add(oper);
			System.out.println("New operation is: " + oper);
		}
		
		public static double multiply(double a, double b) {
			return a*b;
		}
		
		public void getResults() {
			while (operations.indexOf("*") != -1) {
				int idx = operations.indexOf("*");
				double mult = multiply(operands.get(idx), operands.get(idx+1));
				operands.set(idx, mult);
				operands.remove(idx+1);
				operations.remove(idx);
				System.out.println("Mutliplication result is: " + mult);
			}
			
			for (double num : operands) {
				result += num;
				System.out.println("New addition result is: " + result);
			}
			System.out.println("Result of operation: " + this.result);
		}

		

		
		

}
