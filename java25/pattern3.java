package java25;

public class pattern3 {

public static void main(String[] args) {
		
		
		for(int i=1;i<=5;i++)
		{
			for(int sp=5;sp>=i;sp--)
			{
				System.out.print("__");
			}
			
			for(int j=1;j<=2*i-1;j++)
			{
				System.out.print("*");
			}
			System.out.print("\n");
		}
		

	}

}
