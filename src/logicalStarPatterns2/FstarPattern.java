package logicalStarPatterns2;

public class FstarPattern {
	//1----*
	//2---**
	//3--***
	//4-****
	//5*****
	//1-****
	//2--***
	//3---**
	//4----*

	public static void main(String[] args) {
		
       for(int i=1;i<=15;i++)
       {
    	   for(int j=14;j>=i;j--)
    	   {
    		   System.out.print(" ");
    	   }
    	   for(int k=1;k<=i;k++)
    	   {
    		   System.out.print("*");
    	   }
    	   System.out.println();
       }
       for(int a=1;a<=14;a++)
       {
    	   for(int b=1;b<=a;b++)
    	   {
    		   System.out.print(" ");
    	   }
    	   for(int c=14;c>=a;c--)
    	   {
    		   System.out.print("*");
    	   }
    	   System.out.println();
       }
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
