package controlStatements;

public class NestedIfElse {

	public static void main(String[] args) {
		System.out.println("Your number is :");
		int num=10;
		
		if(num>0)
		{
			System.out.println("Positive number.");
			
			if(num%2==0)
			{
				System.out.println("Even number.");
			}
			else
			{
				System.out.println("Odd number.");
			}
		}
		else
		{
			System.out.println("Negative number.");
		}
		
		
		
		
		
		
		
		
	}

}
