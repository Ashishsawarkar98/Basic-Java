package logicalProgramm1;

public class JPrimeNumber1To100 {

	public static void main(String[] args) {
		int tem=0;
		
		for(int i=1;i<=100;i++) ///i=8(num)
		{
			for(int j=2;j<=i-1;j++)
			{
				if(i%j==0)
				{
					tem=tem+1;
				}	
			}
			if(tem==0)
			{
				System.out.println(i);
			}
			else
			{
				tem=0;
			}
			
		}
		
		
		
		
		
	
	}

}
