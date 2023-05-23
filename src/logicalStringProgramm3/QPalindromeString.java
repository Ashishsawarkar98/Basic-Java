package logicalStringProgramm3;

public class QPalindromeString {

	public static void main(String[]args)
	{
	    String s ="MADAM";
	    int length=s.length();
	    String rev="";

	    for(int i=length-1;i>=0;i--)
	    {
	        rev=rev+s.charAt(i);
	    }
	    if(s.equals(rev))
	    {
	       System.out.println("Palindrome String");
	    }
	    else
	    {
	      System.out.println("Not a palindrome String ");
	    }
	}


}

