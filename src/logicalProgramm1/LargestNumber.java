package logicalProgramm1;

public class LargestNumber {

	public static void main(String[] args) {
	
	int a=10;
	int b=20;
	int c=30;
	
	// a>b & a>c== a is largest number//f
    // b>a & b>c== b is the largest number//f
	// c>a & c>b== c is the largest number//t
	
	if(a>b&a>c)//F
	{
		System.out.println("The largest number is a="+a);
	}
	else if(b>a&b>c)
	{
		System.out.println("The largest number is b="+b);
	}
	
	else
	{
		System.out.println("The largest number is c="+c);
	}
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
