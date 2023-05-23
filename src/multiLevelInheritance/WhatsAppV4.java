package multiLevelInheritance;

public class WhatsAppV4 extends WhatsAppV3 {

	public void fingerprint()
	{
		System.out.println("Finger Print.");
	}
	public void groupcall()
	{
		System.out.println("Group calls.");
	}
	
	public static void main(String[]args) {
		System.out.println("Features in whatsapp 2023 vaersions:");
		WhatsAppV4 w= new WhatsAppV4();
		w.block();
		w.text();
		w.status();
		w.backup();
		w.groups();
		w.location();
		w.audiocall();
		w.stickers();
		w.videocall();
		w.fingerprint();
		w.groupcall();
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
}
