package abcPractice;

public class Practice {
	
	public static void main(String[]args)
	{
	    int a[]=new int[]{1,2,3,2,4,5,4,6,7,6};
	    int count=0;
	    System.out.println("Duplicate Element in the array");
	 
	    for(int i=0;i<=a.length-1;i++)
	     {
	          for(int j=i+1;j<=a.length-1;j++)
	          {
	              if(a[i]==a[j])
	              {
	                   System.out.println(a[j]);
	                    count++;
	              }
	         }
	     }
	     System.out.println(count);
	  }
		
		
		
		
		
		
		
		
		
		
		
	}
	                     
		
		
		
		
		
		
		
		
		
		
		
	  
	
		
		
		
		
		
	
	
	 
	
		
	    
	
	   
	    
	    
	    
	    
	    
	    
	    
	    
	

	
	
	



	

