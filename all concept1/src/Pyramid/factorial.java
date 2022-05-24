package Pyramid;

import java.util.Scanner;

public class factorial {
		public static void main(String [] args) {
		
			double num;
			double res=1;
			Scanner ref=new Scanner(System.in);
			System.out.println("Enter Any Number");
			num=ref.nextDouble();
			for(int i=1;i<=num;i++) {
				res=res*i;
			}System.out.println("Factorial of num : "+res);
		}
}
