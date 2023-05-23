package polyMorphisam;

public class CompileTimePolymorphisam {
	
	//static or early binding or method overloading.
	
	public void testing()
	{
		System.out.println("Manual Testing.");
	}
	public void testing(int a)
	{
		System.out.println("Automation Testing.");
	}
	public void testing(int b ,int c)
	{
		System.out.println("Data-Base Testing.");
	}
	public void testing(int d ,int e ,int f)
	{
		System.out.println("API Testing.");
	}
	
	public static void main(String[]args) {
		System.out.println("Types of software testing :");
		
		CompileTimePolymorphisam c =new CompileTimePolymorphisam();
		c.testing();
		c.testing(10);
		c.testing(20, 30);
		c.testing(30, 40, 50);
		
		
		
	}
	
	
	
	
	
	
	
	

}
