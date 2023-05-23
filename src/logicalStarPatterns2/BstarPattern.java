package logicalStarPatterns2;

public class BstarPattern {
	 //1*****
	 //2****
	 //3***
	 //4**
	 //5*	       
			

	public static void main(String[] args) {
		
		for(int i=1;i<=5;i++)
		{
			for(int j=5;j>=i;j--)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		
		
		
		
		
		
	}

}
