package java25;

import java.util.Scanner;

public class reverse9 {

	public static void main(String[] args) {
		
		int num,rem,rev=0;
		
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Number:");
        num = sc.nextInt();
        
        System.out.println("Number befor rev:"+num);
        
       while(num != 0) {
            rem = num % 10;
            rev = rev * 10 + rem;
            num = num / 10;
        }
       
       System.out.println("Number after rev:"+rev);
        
        

	}

}
