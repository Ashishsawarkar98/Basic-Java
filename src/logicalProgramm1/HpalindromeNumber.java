package logicalProgramm1;

public class HpalindromeNumber {

	public static void main(String[] args) {
		int num=121; //palindrome number means number must be same value after rev like 121=121(rev)
		int tem=num;//  
		int rem;
		int rev=0;
		
		while(tem!=0)//T
		{
			rem=tem%10;
			rev=rev*10+rem;
			tem=tem/10;
		}
		if(num==rev)
		{
			System.out.println("Your number is: Palindrome Number.");
		}
		else
		{
			System.out.println("Your number is: Not a palindrome number.");
		}
		
		
		
		
		
		
		
		
		
		
		
	} 

}
