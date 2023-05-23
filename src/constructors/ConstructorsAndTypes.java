package constructors;

public class ConstructorsAndTypes {
	
	ConstructorsAndTypes() //non parameterized(argument)constructors
	{
		System.out.println("I have knowledge about manual testing");
	}
	ConstructorsAndTypes(int a)
	{
		System.out.println("I have knowledge about automation testing");
	}
	ConstructorsAndTypes(int a ,int b) //parameterized (argument) constructors
	{
		System.out.println("I have knowledge about java ");
	}
	
	public static void main(String[]args) {
		System.out.println("List Of My Skills");
		new ConstructorsAndTypes();
		new ConstructorsAndTypes(10);
		new ConstructorsAndTypes(20,40);
		
		
		
		
	}
	
	
	
	

}
