package java25;

import java.util.Scanner;

public class employee15 {

	public static void main(String[] args) {
		Manager m= new Manager();
		m.calculatesalary();
		m.displayinfo();
		programmer p= new programmer();
		p.calculatesalary();
		p.displayinfo();
	
	}

}

abstract class Employee{
	
	
	
	abstract void calculatesalary();
	abstract void displayinfo();
	
}

class Manager extends Employee{
	
	int empid=1;
	String Name="girish";
	
	double basesalary,bonus,grosssalary;

	@Override
	void calculatesalary() {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your base salary");
		basesalary=sc.nextDouble();		
		bonus=0.1*basesalary;
		grosssalary=basesalary+bonus;
		
	}

	@Override
	void displayinfo() {
        System.out.println("Employee ID: " + empid);
        System.out.println("Name: " + Name);
        System.out.println("Base Salary: " + basesalary);
        System.out.println("Bonus: " + bonus);
        System.out.println("Gross Salary: " + grosssalary);
    }
	
}

class programmer extends Employee{
	

	int empid=2;
	String Name="pinkesh";
	
	double basesalary,bonus,grosssalary;

	@Override
	void calculatesalary() {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your base salary");
		basesalary=sc.nextDouble();		
		bonus=0.1*basesalary;
		grosssalary=basesalary+bonus;
		
	}

	@Override
	void displayinfo() {
        System.out.println("Employee ID: " + empid);
        System.out.println("Name: " + Name);
        System.out.println("Base Salary: " + basesalary);
        System.out.println("Bonus: " + bonus);
        System.out.println("Gross Salary: " + grosssalary);
    }
	
}
