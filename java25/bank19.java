package java25;

import java.util.Scanner;


public class bank19 {
	 public static void main(String[] args) {
	     Bank bank = new Bank(10); 
	     Scanner scanner = new Scanner(System.in);

	    
	     System.out.print("Enter initial balance for Savings Account: ");
	     double initialBalanceSA = scanner.nextDouble();
	     
	     System.out.print("Enter interest rate for Savings Account (%): ");
	     double interestRateSA = scanner.nextDouble();
	     
	     SavingsAccount savingsAccount = new SavingsAccount(initialBalanceSA, interestRateSA);

	     System.out.print("Enter initial balance for Current Account: ");
	     double initialBalanceCA = scanner.nextDouble();
	     
	     System.out.print("Enter overdraft limit for Current Account: ");
	     double overdraftLimitCA = scanner.nextDouble();
	     
	     CurrentAccount currentAccount = new CurrentAccount(initialBalanceCA, overdraftLimitCA);

	     
	     bank.addAccount(savingsAccount);
	     bank.addAccount(currentAccount);

	    
	     int choice = 0;
	     while (choice != 5) {
	         System.out.println("\nMenu:");
	         System.out.println("1. Deposit");
	         System.out.println("2. Withdraw");
	         System.out.println("3. Display Accounts");
	         System.out.println("4. Special Operations");
	         System.out.println("5. Exit");
	         System.out.print("Enter your choice: ");
	         choice = scanner.nextInt();

	         switch (choice) {
	             case 1:
	                 System.out.print("Enter amount to deposit: ");
	                 double depositAmount = scanner.nextDouble();
	                 System.out.print("Enter account type (1. Savings / 2. Current): ");
	                 int accountType = scanner.nextInt();
	                 if (accountType == 1) {
	                     savingsAccount.deposit(depositAmount);
	                 } else if (accountType == 2) {
	                     currentAccount.deposit(depositAmount);
	                 } else {
	                     System.out.println("Invalid account type.");
	                 }
	                 break;

	             case 2:
	                 System.out.print("Enter amount to withdraw: ");
	                 double withdrawAmount = scanner.nextDouble();
	                 System.out.print("Enter account type (1. Savings / 2. Current): ");
	                 accountType = scanner.nextInt();
	                 if (accountType == 1) {
	                     savingsAccount.withdraw(withdrawAmount);
	                 } else if (accountType == 2) {
	                     currentAccount.withdraw(withdrawAmount);
	                 } else {
	                     System.out.println("Invalid account type.");
	                 }
	                 break;

	             case 3:
	                 System.out.println("All Accounts:");
	                 bank.displayAccounts();
	                 break;

	             case 4:
	                 System.out.print("Enter special operation (1. Add Interest / 2. Apply Overdraft): ");
	                 int specialOperation = scanner.nextInt();
	                 if (specialOperation == 1) {
	                     savingsAccount.addInterest();
	                 } else if (specialOperation == 2) {
	                     currentAccount.applyOverdraft();
	                 } else {
	                     System.out.println("Invalid special operation.");
	                 }
	                 break;

	             case 5:
	                 System.out.println("Exiting...");
	                 break;

	             default:
	                 System.out.println("Invalid choice. Please enter a valid option (1-5).");
	                 break;
	         }
	     }

	     scanner.close();
	 }
	}

interface Account {
 void deposit(double amount);
 void withdraw(double amount);
 double calculateInterest();
 double getBalance();
 void display();
}


class SavingsAccount implements Account {
 private double balance;
 private double interestRate;

 public SavingsAccount(double initialBalance, double interestRate) {
     this.balance = initialBalance;
     this.interestRate = interestRate;
 }

 @Override
 public void deposit(double amount) {
     balance += amount;
     System.out.println("Deposited: $" + amount);
 }

 @Override
 public void withdraw(double amount) {
     if (balance >= amount) {
         balance -= amount;
         System.out.println("Withdrawn: $" + amount);
     } else {
         System.out.println("Insufficient balance");
     }
 }

 @Override
 public double calculateInterest() {
     double interest = balance * (interestRate / 100);
     balance += interest;
     return interest;
 }

 @Override
 public double getBalance() {
     return balance;
 }

 @Override
 public void display() {
     System.out.println("Savings Account Balance: $" + balance);
 }

 // Unique method for SavingsAccount
 public void addInterest() {
     double interest = calculateInterest();
     System.out.println("Interest added: $" + interest);
 }
}


class CurrentAccount implements Account {
 private double balance;
 private double overdraftLimit;

 public CurrentAccount(double initialBalance, double overdraftLimit) {
     this.balance = initialBalance;
     this.overdraftLimit = overdraftLimit;
 }

 @Override
 public void deposit(double amount) {
     balance += amount;
     System.out.println("Deposited: $" + amount);
 }

 @Override
 public void withdraw(double amount) {
     if (balance + overdraftLimit >= amount) {
         balance -= amount;
         System.out.println("Withdrawn: $" + amount);
     } else {
         System.out.println("Insufficient funds");
     }
 }

 @Override
 public double calculateInterest() {
   
     return 0;
 }

 @Override
 public double getBalance() {
     return balance;
 }

 @Override
 public void display() {
     System.out.println("Current Account Balance: $" + balance);
 }


 public void applyOverdraft() {
     System.out.println("Overdraft applied. Current balance: $" + balance);
 }
}


class Bank {
 private Account[] accounts;
 private int numOfAccounts;

 public Bank(int capacity) {
     accounts = new Account[capacity];
     numOfAccounts = 0;
 }

 public void addAccount(Account account) {
     if (numOfAccounts < accounts.length) {
         accounts[numOfAccounts++] = account;
     } else {
         System.out.println("Cannot add more accounts. Bank is full.");
     }
 }

 public void displayAccounts() {
     for (int i = 0; i < numOfAccounts; i++) {
         accounts[i].display();
     }
 }
}




