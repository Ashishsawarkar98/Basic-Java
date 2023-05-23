package methodCalling;

public class ThisKeyword {

  int a=100;//instance
  int b=200;
  
  public void players()
  {
	  int a=300;
	  int b=400;
	  System.out.println("virat Kohli runs="+this.a);
	  System.out.println("Rohit shrama runs="+this.b);
	  System.out.println("Virendra sehwaag="+a);
	  System.out.println("Braien lara="+b);
  }
  public static void main(String[]args) {
	  System.out.println("Centurey of cricket palyers:");
	  ThisKeyword t= new ThisKeyword();
	  t.players();
	  
	  
	  
  }
	
	
	
	
}
