package java25;

import java.util.Scanner;

public class bank13 {

	public static void main(String[] args) {
		savingaccount s=new savingaccount();
		s.deposite();
		s.withdraw();
		currentaccount c=new currentaccount();
		c.deposite();
		c.withdraw();
	}

}

abstract class bankaccount{
	
	abstract void deposite();
	abstract void withdraw();
}

class savingaccount extends bankaccount{

	float balance,dep_amt,with_amt;
	@Override
	void deposite() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Amount You Want to Deposite to savingaccount:");
		dep_amt=sc.nextFloat();
		balance=balance+dep_amt;
		System.out.println("balance after deposite:"+balance);
		
	}

	@Override
	void withdraw() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Amount You Want to Withdraw from savingaccount:");
		with_amt=sc.nextFloat();
		if(with_amt>balance)
		{
			System.out.println("low balance!");
		}
		else
		{
			balance=balance-with_amt;
			System.out.println("balance after withdrwal:"+balance);	
		}
		
		
		
	}
	
}

class currentaccount extends bankaccount{
    float balance,dep_amt,with_amt;
	@Override
	void deposite() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Amount You Want to Deposite to currentaccount:");
		dep_amt=sc.nextFloat();
		balance=balance+dep_amt;
		System.out.println("balance after deposite:"+balance);
		
	}

	@Override
	void withdraw() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Amount You Want to Withdraw from currentaccount:");
		with_amt=sc.nextFloat();
		if(with_amt>balance)
		{
			System.out.println("low balance!");
		}
		else
		{
			balance=balance-with_amt;
			System.out.println("balance after withdrwal:"+balance);	
		}
		
		
		
	}
	
}
