package java25;

public class car23 {
 private String company_name;
 private String model_name;
 private int year;
 private double mileage;

 
 public car23(String company_name, String model_name, int year, double mileage) {
     this.company_name = company_name;
     this.model_name = model_name;
     this.year = year;
     this.mileage = mileage;
 }

 
 public String getCompany_name() {
     return company_name;
 }

 public void setCompany_name(String company_name) {
     this.company_name = company_name;
 }

 
 public String getModel_name() {
     return model_name;
 }


 public void setModel_name(String model_name) {
     this.model_name = model_name;
 }

 
 public int getYear() {
     return year;
 }

 
 public void setYear(int year) {
     this.year = year;
 }

 
 public double getMileage() {
     return mileage;
 }

 public static void main(String[] args) {
     
     car23 myCar = new car23("Toyota", "Camry", 2023, 10.5);

    
     System.out.println("Company: " + myCar.getCompany_name());
     System.out.println("Model: " + myCar.getModel_name());
     System.out.println("Year: " + myCar.getYear());
     System.out.println("Mileage: " + myCar.getMileage());

     
     myCar.setYear(2024);
     System.out.println("Updated Year: " + myCar.getYear());
 }
}

