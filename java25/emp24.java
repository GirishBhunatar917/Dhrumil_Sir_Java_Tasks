package java25;

public class emp24 {

	public static void main(String[] args) {
		Employee emp1 = new Manager("John Doe", 50000, 10000);
	    Employee emp2 = new Programmer("Jane Smith", 60000, 20, 50);

	     emp1.calculateSalary();
	     emp2.calculateSalary();

	}

}


class Employee {
 protected String name;
 protected double baseSalary;

 public Employee(String name, double baseSalary) {
     this.name = name;
     this.baseSalary = baseSalary;
 }

 public void calculateSalary() {
     System.out.println("Salary for employee " + name + " is:" + baseSalary);
 }
}


class Manager extends Employee {
 private double bonus;

 public Manager(String name, double baseSalary, double bonus) {
     super(name, baseSalary);
     this.bonus = bonus;
 }

 @Override
 public void calculateSalary() {
     double totalSalary = baseSalary + bonus;
     System.out.println("Salary for manager " + name + " is: " + totalSalary);
 }
}


class Programmer extends Employee {
 private double overtimePayRate;
 private int hoursWorked;

 public Programmer(String name, double baseSalary, double overtimePayRate, int hoursWorked) {
     super(name, baseSalary);
     this.overtimePayRate = overtimePayRate;
     this.hoursWorked = hoursWorked;
 }

 @Override
 public void calculateSalary() {
     double overtimePay = overtimePayRate * hoursWorked;
     double totalSalary = baseSalary + overtimePay;
     System.out.println("Salary for programmer " + name + " is: " + totalSalary);
 }
}

     