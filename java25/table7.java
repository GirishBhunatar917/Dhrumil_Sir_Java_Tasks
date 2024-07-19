package java25;

import java.util.Scanner;

public class table7 {

	public static void main(String[] args) {
		int i,num;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter positive integer:");
		num=sc.nextInt();
		if(num<1) {
			System.out.println("please enter positive number!");
		}else
		{	
		for(i=1;i<=10;i++)
		{
			System.out.println(+num+"*"+i+"="+num*i);
		}
		}

	}

}
