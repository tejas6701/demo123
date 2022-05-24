package Pyramid;

import java.util.Scanner;

public class vowels {

	public static void main(String[] args) {
		String str;
		Scanner ref=new Scanner(System.in);
		str=ref.nextLine();
		str.toLowerCase();
		System.out.print("vowels are : ");
		for(int i=0;i<str.length();i++) {
		if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u') {
			System.out.print(" "+str.charAt(i));
		}
	}
	}
}
