package abstractions;

public  abstract class LoginPageFacebook {

	public  static void facebbok()   //non abstract static method
	{
		System.out.println("!!FACEBOOK!!");
	}
	abstract void username(); //abstract method
	
    abstract void password();
	
	public void login()
	{
		System.out.println("LogIn");
	}
	
	
	
	
	
	
	
	
	
}
