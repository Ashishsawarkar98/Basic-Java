package methodCalling;

public class MethodOverloading {

	public void testing()
	{
		System.out.println("Manual testing.");
	}
	public void testing(int a)
	{
		System.out.println("Automation testing.");
	}
	public void testing(double b)
	{
		System.out.println("API testing.");
	}
	public void testing (int b,int c)
	{
		System.out.println("Database Testing.");
	}
	public static void main(String[]args)
	{
		System.out.println("Types of testing:");
		MethodOverloading m= new MethodOverloading();
		m.testing();
		m.testing(10);
		m.testing(2.2);
		m.testing(20,30);
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
