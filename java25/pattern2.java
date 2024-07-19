package java25;

public class pattern2 {

	public static void main(String[] args) {
		
		
		for(int i=1;i<=5;i++)
		{
			for(int sp=5;sp>=i;sp--)
			{
				System.out.print("_");
			}
			
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.print("\n");
		}
		

	}

}
