package logicalProgramm1;

public class NarmStrongNumber {

	public static void main(String[] args) {
	      
	 int num=153; //Armstrong number means it is 1^3+5^3+3^3=153; 
	 //find length of int
	 String s= String.valueOf(num);
	 int length=s.length();
	 
	 int tem=num;//153
	 int result=0;
	 int rem;
	 
	 while(tem!=0)//153,15
	 {
		 rem=tem%10; //3,5,1
		 //Assignment operator
		 result+= Math.pow(rem,length); //(rem,length)3^3=27,     5^3=125, 1^3=1,  27+125+1=153
		 tem=tem/10;//15  ,1 ,0
	 }
	 if(num==result)
	 {
		 System.out.println(num +": is a Armstrong number.");
	 }
	 else
	 {
		 System.out.println(num+":is not Armstrong number.");
	 }
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
	
}
