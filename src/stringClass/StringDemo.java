package stringClass;

public class StringDemo {

	public static void main(String[] args) {
		String s1 = "Software Tester ";
		String s2 = "velocity ";
		String s3 = "Velocity ";
		String s4 = "VELOCITY ";
		String s5 = "Software ";
		
		
		//s1 is empty or not
		System.out.println(s1.isEmpty());
		
		//s1 string length (index start with 1)
		System.out.println(s1.length());
		
		//s3 to lowercase
		System.out.println(s3.toLowerCase());
		
		//s2 to upercase
		System.out.println(s2.toUpperCase());
		
		//s1 start with "Soft"
		System.out.println(s1.startsWith("Soft"));
		
		//s2 end with "ity"
		System.out.println(s2.endsWith("ity"));
		
		//s1 char at any index no 9 (index start with 0)
		System.out.println(s1.charAt(9));
		
		//index of char "e" from s1
		System.out.println(s1.indexOf("e"));
		
		
		//s2 & s4 same or not 
		System.out.println(s2.equals(s4)); //comparision
		
		
	}

	}


