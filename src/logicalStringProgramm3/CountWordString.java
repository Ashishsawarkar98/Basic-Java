package logicalStringProgramm3;

public class CountWordString {

	public static void main(String[] args) {
		
		String s = "i love india a";
        int Count = 1; 

        for (int i = 0; i <=s.length()-1; i++) 
        {
            if (s.charAt(i)==' ') 
            {
                Count++;//1234
            }
        }

        System.out.println("The number of words in the sentence is: " + Count);
    }
		
		
		
		 
		
		
		
		
		
		
		
		
		
		
		
		
	}

