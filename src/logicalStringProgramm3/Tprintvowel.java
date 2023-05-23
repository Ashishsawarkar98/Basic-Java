package logicalStringProgramm3;

public class Tprintvowel {
	public static void main(String[]args)
	{
	   String s ="AEIOUXVSGDaeiou";
	   int length=s.length();
	   int count=0;

	  for(int i=0;i<length;i++)
	  {
	       char ch=s.charAt(i);
	   
	        if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
	        {
	           System.out.println("Your vowel is : "+ch);
	           count++;
	        }   
	   }
	   System.out.println("Your total vowel is :"+count);
	 
	}
	    
}
