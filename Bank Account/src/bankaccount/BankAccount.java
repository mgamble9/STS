package bankaccount;

import java.util.Random;

public class BankAccount {

	private String acc_num;
	private double check_bal;
	private double save_bal;
	
	private static int tot_acc = 0;
	private static double tot_cash = 0.0;
	
	public BankAccount(double check_bal, double save_bal) {
		super();
		this.acc_num = rand_acc().toString();
		int acc_num_length = this.acc_num.length();
		this.acc_num = this.acc_num.substring(acc_num_length -10, acc_num_length);
		System.out.println("New account: " + this.acc_num + " with $" +
				check_bal + " in checking and $" + save_bal +
				" in savings.");
		this.check_bal = check_bal;
		this.save_bal = save_bal;
		tot_acc++;
		System.out.println("Total accounts: " + tot_acc);
		tot_cash += check_bal + save_bal;
		System.out.println("Total cash: $" + tot_cash);
	}

	private Long rand_acc() {
		Random random = new Random();
		Long rand_acc = random.nextLong();
//		System.out.println("New random long is: " + rand_acc);
		return rand_acc;
	}

	public void depositMoney(double money, String acc_type) {
		tot_cash += money;	
		System.out.println("Total cash: $" + tot_cash);
		if (acc_type == "checking") {
			this.check_bal += money;
			System.out.println("Check balance is now: $" + check_bal);
		}
		if (acc_type == "savings") {
			this.save_bal += money;
			System.out.println("Savings balance is now: $" + save_bal);
		}
	}

	public void withdrawMoney(double money, String acc_type) {
		if (acc_type == "checking") {
			if (this.check_bal < money) {
				System.out.println("Insufficient funds in checking.");
			}
			else {
				this.check_bal -= money;
				System.out.println("Check balance is now: $" + check_bal);
				tot_cash -= money;	
				System.out.println("Total cash: $" + tot_cash);
			}
		}
		if (acc_type == "savings") {
			if (this.save_bal < money) {
				System.out.println("Insufficient funds in savings.");
			}
			else {
				this.save_bal -= money;
				System.out.println("Check balance is now: $" + save_bal);
				tot_cash -= money;	
				System.out.println("Total cash: $" + tot_cash);
			}
		}
	}

	public String getAcc_num() {
		return acc_num;
	}

	public void setAcc_num(String acc_num) {
		this.acc_num = acc_num;
	}

	public double getCheck_bal() {
		return check_bal;
	}

	public void setCheck_bal(double check_bal) {
		this.check_bal = check_bal;
	}

	public double getSave_bal() {
		return save_bal;
	}

	public void setSave_bal(double save_bal) {
		this.save_bal = save_bal;
	}

//	public static int getTot_acc() {
//		return tot_acc;
//	}
//
//	public static void setTot_acc(int tot_acc) {
//		BankAccount.tot_acc = tot_acc;
//	}
//
//	public static double getTot_cash() {
//		return tot_cash;
//	}
//
//	public static void setTot_cash(double tot_cash) {
//		BankAccount.tot_cash = tot_cash;
//	}
	
}
