package oopsInterface;

public class StateBankOfIndia  extends TransactionDataBase{

	public static void main(String[] args) {
		System.out.println("Transaction list of end user in diffrent countries end user : ");
		
		StateBankOfIndia s=new StateBankOfIndia();
		s.india();
		s.america();
		s.europe();
		s.france();
		s.japan();
		s.china();

	

	}

}
