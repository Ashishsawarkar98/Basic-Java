package exceptionHandling;

import java.io.FileInputStream;

public class FileNotFoundException {

	public static void main(String[] args) {
	
		try
		{
			FileInputStream fis = new FileInputStream("c:/mno.text");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	

	}

}
