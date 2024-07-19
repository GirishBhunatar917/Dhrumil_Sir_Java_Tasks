package java25;

import java.util.Scanner;

public class shape12 {
	
	

	public static void main(String[] args) {
		circle c=new circle();
		c.calculateArea();
		c.calculateperimeter();
		triangle t= new triangle();
		t.calculateArea();
		t.calculateperimeter();	

	}
	

}
abstract class shape{
	
	abstract void calculateArea();
	abstract void calculateperimeter();
}

class circle extends shape{
     double pi=3.14,area,perimeter;
	 int r;
	 
	@Override
	void calculateArea() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter radius of circle:");
		r=sc.nextInt();
		area=pi*r*r;
		System.out.println("Area of circle is:"+area);
	}

	@Override
	void calculateperimeter() {
		perimeter=2*pi*r;
		System.out.println("perimeter of circle is:"+perimeter);
		
	}

	
	
}

class triangle extends shape{
	
    double b,h,area,perimeter;

	@Override
	void calculateArea() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter base of triangle:");
		b=sc.nextFloat();
		System.out.println("Enter height of triangle:");
		h=sc.nextFloat();
		area=0.5*b*h;
		System.out.println("Area of triangle is:"+area);
	}

	@Override
	void calculateperimeter() {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter side of triangle:");
		b=sc.nextFloat();
		perimeter=b*b*b;
		System.out.println("perimeter of triangle is:"+perimeter);
		
		
	}
}

	

