import java.util.Scanner;

public class bank {
	
	

	public static void main(String[] args) {
		int choice;
		
		user s= new user();
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Your Choice:");
		choice=sc.nextInt();
		
			switch (choice) {
		case 1:
			s.Accountopen();
			break;
		case 2:
			s.Deposite();
			break;
		case 3:
			s.Withdraw();
			break;	

		default:
			System.out.println("invalid Choice!");
			break;
		}	
		
	}
		
}	
	


class user{
	

	String Name;
	long Aadhar_Number;
	long Pan_Number;
	int Balance;
	
	 

	public void Accountopen() {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Your Name:");
		Name=sc.next();
		System.out.println("Enter Your Aadhar Number:");
		Aadhar_Number=sc.nextLong();
		System.out.println("Enter Your Pan Number:");
		Pan_Number=sc.nextLong();
		System.out.println("your Name :"+Name);
		System.out.println("your Aadhar Number:"+Aadhar_Number);
		System.out.println("your Pan Number :"+Pan_Number);
		System.out.println("your Account Has Been Successfully Created!");
	}
		public void Deposite() {
			int Deposite_Amount;
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter Your Deposite Amount:");
			Deposite_Amount=sc.nextInt();
			
			Balance=Deposite_Amount+Balance;
			System.out.println("Your Balance After Deposite :"+Balance);	
		}
		public void Withdraw() {
			int Withdraw_Amount;
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter Your Withdraw Amount:");
			Withdraw_Amount=sc.nextInt();
			
			if(Balance<Withdraw_Amount)
			{
				System.out.println("Low Balance!");
			}else {
			Balance=Balance-Withdraw_Amount;
			System.out.println("Your Balance After Withdraw :"+Balance);
			}
			
		
			
			
		}

	
}

	


