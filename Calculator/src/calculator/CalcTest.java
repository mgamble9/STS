package calculator;

public class CalcTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator calc = new Calculator();
//		calc.setOperand1(2.0);
//		calc.setOperand2(3.0);
//		calc.setOperation("+");
//		calc.performOperation();
//		calc.getResults();
//		calc.setOperand1(4.0);
//		calc.setOperand2(5.0);
//		calc.setOperation("-");
//		calc.performOperation();
//		calc.getResults();

		calc.performOperation(3);
		calc.performOperation("*");
		calc.performOperation(2);
		calc.performOperation("-");
		calc.performOperation(6);
		calc.performOperation("*");
		calc.performOperation(7);
		calc.performOperation("-");
		calc.performOperation(5);
		calc.performOperation("-");
		calc.performOperation(5);
		calc.performOperation("*");
		calc.performOperation(5);
		calc.performOperation("*");
		calc.performOperation(5);
		calc.performOperation("/");
		calc.performOperation(5);
		calc.performOperation("+");
		calc.performOperation(20);
		calc.performOperation("=");
		calc.getResults();
	}

}
