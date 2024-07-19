package java25;

public class bank21 {

	public static void main(String[] args) {
		bankacc b=new bankacc();
		b.setAccountnumber(34335);
		b.setBalance(10000);
		
		System.out.println("number is:"+b.getAccountnumber());
		System.out.println("balance is:"+b.getBalance());
		
		b.setAccountnumber(545454);
		b.setBalance(20500);
        
		System.out.println("After modifying");
		System.out.println("number is:"+b.getAccountnumber());
		System.out.println("balance is:"+b.getBalance());

	}

}

class bankacc{
	
	private double accountnumber;
	private double balance;
	public double getAccountnumber() {
		return accountnumber;
	}
	public void setAccountnumber(double accountnumber) {
		this.accountnumber = accountnumber;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	
	
}
