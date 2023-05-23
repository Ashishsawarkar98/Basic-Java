package logicalProgramm1;

public class PfactorialNumber {

	public static void main(String[]args)
	{
	     int num=5;
	     int fact=1;

	    //5=5*4*3*2*1=

	   for(int i=num; i>=1;i--)
	   {
	       fact =fact*i;
	           //1*5
	           //5*4=20
	           //20*3=60
	           //60*2=120
	           //120*1=120
	         
	   }
	System.out.println("Fact="+fact);
	}
		
		
		
		
		
		
		
		

	

}
