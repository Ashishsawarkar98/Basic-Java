package javaMethods;

public class NonStaticMethods {
	
	public void virat()
	{
	  System.out.println("RCB");
	}
	public void rohit()
	{
		System.out.println("MI");
	}
	public  void dhoni()
	{
	 System.out.println("CSK");
	}
	
	public static void main(String[]args) {
		System.out.println("List of IPL team captains:");
		
		NonStaticMethods n= new NonStaticMethods();
		n.virat();
		n.rohit();
		n.dhoni();
		
		
		
		
	}
	
	
	
	
	
	
	
	
	

}
