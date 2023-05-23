package operators;

public class LogiacalOperators {

	public static void main(String[] args) {
		 int a=25;
	       int b=10;   // in logical, bitwise and multiplication
	       
	       
	       System.out.println(a>b && b>a);//false
	       System.out.println(a<b & a>b);//false
	       System.out.println(a>b && b<a);//true
	       System.out.println(a<b&b>a);//false
	       
	       
	       int c=9;
	       int d=10;
	       
	       System.out.println(c<d|d<c);//true
	       System.out.println(d<c||d>c);//
	       System.out.println(c<d||d>c);
	       System.out.println(d<c|c>d);
			

	}

}
