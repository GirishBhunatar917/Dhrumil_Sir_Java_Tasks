package java25;

import java.util.Scanner;

public class twonum8 {

    public static void main(String[] args) {
        int num1, num2;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter num1 base value Number:");
        num1 = sc.nextInt();
        System.out.println("Enter num2 power value Number :");
        num2 = sc.nextInt();

        int result = power(num1, num2);
        System.out.println(num1 + " raised to the power of " + num2 + " is: " + result);
    }

    public static int power(int a, int b) {
    	
        int result = 1;
        
        for (int i = 0; i < b; i++) {
        	
            result =result*a ;
        }
        
        return result;
    }
}
