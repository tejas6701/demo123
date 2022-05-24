package Operator;

public class condition3 {

	public static void main(String[] args) {
		int age=18;
		int weight=49;
		
		if (age>=18)
			{if (weight>=50) {
				System.out.println("You are eligible to donate blood");
			}
			else {
				System.out.println("You are not eligible to donate blood, as your weight is below 50.");
			}}
			else 
			{System.out.println("You are not eligible to donate blood, as your age is below 18.");
		}
	}}
