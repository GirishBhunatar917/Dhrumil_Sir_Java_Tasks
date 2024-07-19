package java25;

public class pattern4 {

	public static void main(String[] args) {
		
		
		for(int i=1;i<=5;i++)
		{
			for(int sp=5;sp>=i;sp--)
			{
				System.out.print("__");
			}
			
			for(int j=1;j<=i*2-1;j++)
			{
				System.out.print(i);
			}
			System.out.print("\n");
		}
		

	}

}
