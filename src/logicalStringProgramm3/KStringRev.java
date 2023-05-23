package logicalStringProgramm3;

public class KStringRev {

	public static void main(String[]args)
	{
	     String s ="ASHISH";
	     int length=s.length();
	     String rev=" ";

	     for(int i=length-1;i>=0;i--)
	     {
	         rev=rev+s.charAt(i);
	     }
	     System.out.println("Your rev.string: "+rev);
	}
}
