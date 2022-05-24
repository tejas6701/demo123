package Homework;

import java.util.Scanner;

//import java.util.Scanner;

public class Homework1 {

	public static void main(String[] args) {
	char jk = 'z';
	System.out.println("Enter any character");
	
	Scanner r=new Scanner(System.in);
	jk=r.next().charAt(0);
	
	int a=jk;
	
	System.out.println("Ascii value of "+jk+" is "+a);
	
	}
}	
//Find ASCII value of character