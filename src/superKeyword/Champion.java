package superKeyword;

public class Champion extends Legends {

	public void junior()
	{
		System.out.println("Virat Kohli runs      :"+ super.a);
		System.out.println("Rohit Sharma runs     :"+ super.b);
	}
	
	public static void main(String[]args)
	{
		System.out.println("List of century of palyer : ");
		Champion c =new Champion();
		c.senior();
		c.junior();
	}
	
	
	
	
	
	
	
	
}
