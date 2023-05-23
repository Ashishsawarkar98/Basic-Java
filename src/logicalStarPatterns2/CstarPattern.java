package logicalStarPatterns2;

public class CstarPattern {
	//1*                                     
	//2**
	//3***                               
	//4****
	//5*****
	//1****
	//2***
	//3**
	//4*
	
	public static void main(String[] args) {
		
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		for(int a=1;a<=4;a++)
		{
			for(int b=4;b>=a;b--)
			{
			 System.out.print("*");
			}
			System.out.println();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
