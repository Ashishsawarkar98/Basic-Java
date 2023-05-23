package exceptionHandling;

public class TryCatchFinally {

	public static void main(String[]args) {
		
		
		try
		{
			System.out.println("1");
			int a=10;
			int b=10;
			int c=a/b;
			System.out.println("ashish");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally 
		{
			System.out.println("Programm excution ended");
		}
		
			
	}	
}
