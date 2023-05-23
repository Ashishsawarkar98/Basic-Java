package logicalProgramm1;

public class lFibonaciSeries {
	
	//a  b c
	//1  2 3 5 8 13 21 34....so on it is a number addition of previous 2 numbers.
    //    a b c
	//    a b c
	//      a b c
	public static void main(String[] args) {
	System.out.println("List of Fibonaci Series:");
		
		int a=1;
		int b=2;
		int c;
	
		for(int i=1;i<=100;i++)
		{
		  c=a+b;//3-------
	      a=b;
	      b=c;
	      System.out.println("Fibonaci series:"+c);
		}
		
	}

}
