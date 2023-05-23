package singleLevelInheritance;

public class Ateam extends Bteam{
	
	public void rohit()
	{
		System.out.println("Rohit sharma(captain and batsman)");
	}
	public void virat()
	{
		System.out.println("Virat Kohli(batsman)");
	}
	public void dinesh()
	{
		System.out.println("Dinesh Karthik(batsman)");
	}
	public void jaspreet()
	{
		System.out.println("Jaspreet Bumhraha(bowler)");
	}
	public void hardik()
	{
		System.out.println("Hardhik pandya(all rounder)");
	}
	public void jadeja()
	{
		System.out.println("Ravindra Jadeja(Spinner)");
	}
	public void bhuvneshwar()
	{
		System.out.println("Bhuvneshwar Kumar(bowler)");
	}
	
	public static void main(String[]args) {
		System.out.println("Final playing XI of india:");
		
		Ateam a =new Ateam();
		a.rohit();
		a.virat();
		a.samson();
		a.rishbh();
		a.dinesh();
		a.hardik();
		a.jadeja();
		a.yadav();
		a.jaspreet();
		a.imaraan();
		a.bhuvneshwar();
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	

}
