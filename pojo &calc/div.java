import java.util.Scanner;

public class div {
	  int num1,num2;
	  float division;
	  
	  
	  public void division() {
	  Scanner obj=new Scanner(System.in);  
	  System.out.println("Enter first number:");
	  num1=obj.nextInt();
	  System.out.println("Enter second number:");
	  num2=obj.nextInt();
	  
	  if(num2==0) {
		  System.out.println("can't divide by zero");
	  }
	  else {
		  division=num1/num2;
		  System.out.println("division is:"+division);
	  }
	  
	  
	  
	  
	  }
	  
	  }
     
     
      
         

