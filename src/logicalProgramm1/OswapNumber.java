package logicalProgramm1;

public class OswapNumber {

	public static void main(String[]args)
	{
	    int a=10;
	    int b=20;
	    int c;

	   System.out.println("Before sawapping : ");
	   System.out.println("a="+a);
	   System.out.println("b="+b);

	   System.out.println("After swapping :");
	     
	   c=a+b;//10+20=30
	   b=c-b;//30-20=10
	   a=c-a;//30-10=20
	   System.out.println("a="+a);  System.out.println("b="+b);
	}   
	 
}
