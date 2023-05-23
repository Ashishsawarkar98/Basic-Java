package controlStatements;

public class NestedIf {

	public static void main(String[] args) {
		System.out.println("Welcome to blood donation camp.");
		int age =21;
		int weight=60;
		
		if(age>19)
		{
			System.out.println("Condition 1 satisfied.");
			
			if(weight>50)
			{
				System.out.println("Condition 2 satisfied.");
				
			}
		}
		else
		{
			System.out.println("Yor are not match the conditions so you can not donate blood.");
		}

	}

}
