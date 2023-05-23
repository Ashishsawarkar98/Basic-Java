package logicalProgramm1;

public class IPrimeNumber {

	public static void main(String[] args) {
		int num=121; //prime number is number which is divide able only value 1 and its own value not in between values.
		int tem=0;
		
		for(int i=2;i<=num-1;i++)
		{
			if(num%i==0)
			{
				tem=tem+1;//1
			}
		}
		if(tem>0)
		{
			System.out.println("Your Number is: Not a Prime Number.");
		}
		else
		{
			System.out.println("Your number is: Prime Number.");
		}
		
		
		
		
		
		
		
	}

}
