package controlStatements;

public class SwitchStatement {

	public static void main(String[] args) {
		System.out.println("Tata-Sky channel list :");
		
	int chanel =1109;
	switch (chanel)
	{
		case 134 :
		{
			System.out.println("Sony sab."); break;
		}
		case 139:
		{
			System.out.println("Star plus."); break;
		}
		case 310:
		{
			System.out.println("Star gold.");break;
		}
		case 509:
		{
			System.out.println("Aaj-tak."); break;
		}
		case 203:
		{
			System.out.println("Zee cafe."); break;
		}
		default:
		{
			System.out.println("You are not subscribe this channel.");
		}
		  
	}
	
	
	
	

	}

}
