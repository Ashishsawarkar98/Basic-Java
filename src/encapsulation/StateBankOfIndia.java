package encapsulation;

public class StateBankOfIndia {

	private int account;//instance //bank
	
	public void setbalnce(int Balance) //setter method
	{
		this.account=Balance;//20000 //mitali
	}
	public int getBalance()  //atm
	{
		return account ; //20000
	}
		
	public static void main(String[]args) {
		
		StateBankOfIndia s= new StateBankOfIndia();
		s.setbalnce(10000);
		s.getBalance();
		
		int z=s.getBalance();
		System.out.println("Your account balance is:"+z);
		
		
		
		
		
		
	}
		
		
		
		
		
		
		
		
		
		
		
		
	
}
