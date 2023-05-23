package operators;

public class UnaryOperators {

	public static void main(String[] args) {
		//post fix (we increase or decrease the by 1 after expression)
		
		  int a=20;
		  
		  System.out.println(a);//20   //plus by 1 after expression
		  a++;
		  System.out.println(a);//21
		  
		  System.out.println(--a);//20  //minus value by 1 after expression
		  System.out.println(--a);//19
		  
		   // prefix (we increase or decrease the value by 1 before the expression)
		  
		  System.out.println(a);//19
		  ++a;                           //plus value by 1 after expression
		  System.out.println(a);//20
		  ++a;
		  System.out.println(a);//21
		                                // minus the value by 1 a
		  System.out.println(--a);//20
		  System.out.println(--a);//19
		  
		  

	}

}
