package logicalStringProgramm3;

public class DuplicateElementArre {

	public static void main(String[] args) {
	                      //0 1 2 3 4 5 6
		int a[]= new int[] {1,2,3,2,5,1,5};
		
		int count=0;
		System.out.println("Duplicate Element in given array:");
		
		for(int i=0;i<=a.length-1;i++)//T
		{
			for(int j=i+1;j<=a.length-1;j++)//t
			{
				if(a[i]==a[j])
				{
					System.out.println(a[j]);
					count++;
				}	
			}	
		}
		System.out.println("Total duplicate Element count :"+count);		
		
		
		
		
		
		
		

	}

}
