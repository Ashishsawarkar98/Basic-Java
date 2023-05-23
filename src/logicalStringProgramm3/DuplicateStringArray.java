package logicalStringProgramm3;

public class DuplicateStringArray {

	public static void main(String[] args) {
	
		String s[]=new String[] {"java","paython","C","c++","java","paython"};
		int count=0;
		
		for(int i=0;i<s.length;i++)
		{
			for(int j=i+1;j<s.length;j++)
			{
				if(s[i]==s[j])
				{
					System.out.println(s[j]);
					count++;
				}
			}
		}
		System.out.println("Total count of duplicate element in string array is :"+count);
		
		
		
		
		
		
		
		
		
		
	}

}
