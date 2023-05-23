package exceptionHandling;

public class TryFinally {

	public static void main(String[] args) {
		
		try
		{
			System.out.println("1");
			int a=10;
			int b=20;
			int c=a/b;
		}
		finally
		{
			System.out.println("I am in finally block");
		}
			
	}

}
