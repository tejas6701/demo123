package String;

import java.util.Scanner;

public class StringPracice {

	public static void main(String[] args) {
			
		 String s1="Banglore";
		 String s2="Mumbai";
		 System.out.println(s1.charAt(0));
		 System.out.println(s1.toUpperCase());
		 System.out.println(s1.toLowerCase());
		 System.out.println(s1.replace("r", ""));
		 System.out.println("Length of string: "+s1.length());
		 
		 System.out.println("******************");
		 
		 String s3="   I am from maharashtra   ";
		 String[] s4=s3.split(" ",3);
		 for(String s:s4) {
			 System.out.println(s);
		 }System.out.println("*------------------------*");
			System.out.println(s3.trim());
			
	    String s5="I am from pune "+123;
	    System.out.println(s5);
	    
	}

}
	
