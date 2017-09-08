package bankaccount;

public class BankAccountTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BankAccount b1 = new BankAccount(10.0,20.0);
		System.out.println("b1's check balance: " + b1.getCheck_bal());
		
		b1.depositMoney(13.0, "checking");
		b1.depositMoney(7.0, "savings");
		
		BankAccount b2 = new BankAccount(5.0,10.0);
		b2.depositMoney(10, "checking");
		b2.withdrawMoney(20.0, "savings");
		b2.depositMoney(100.0, "savings");
		b2.withdrawMoney(20.0, "savings");


	}

}
