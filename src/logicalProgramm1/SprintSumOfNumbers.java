package logicalProgramm1;

public class SprintSumOfNumbers {
	
	public static void main(String[]args)   //10  1 0
	                                         //    1
	{
		int num=121;
		int sum=0;
		int rem;
		
		while(num!=0)
		{
			rem=num%10;//1,2,1
			sum+=rem;//1+,2=3,1+=4
			num=num/10;//12,1,0
		}
		System.out.println(sum);
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
}
