package methodCalling;

public class MethodOverriding2 {
	
	public static void main(String[] args) {
		System.out.println("List of Startup:");
		MethodOverriding1 m=new MethodOverriding1();
		m.startup();
		m.startup(10);
		m.startup(2.2);
		m.startup(20, 40, 60);
		
		
	}

}
