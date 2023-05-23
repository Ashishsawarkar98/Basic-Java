package logicalProgramm1;

public class GrevProgramm {

	public static void main(String[] args) {
     
		int num=1234; // 1234==4321(rev)
		int rev=0;
		int rem;
		
		while(num!=0)
		{
			rem=num%10;
			rev=rev*10+rem;
			num=num/10;
		}
		System.out.println("Your rev number="+rev);

		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
