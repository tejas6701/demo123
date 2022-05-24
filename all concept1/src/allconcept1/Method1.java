package allconcept1;

import Homework.*;

public class Method1 {
    
	public static void main(String[] args) {
//		printDetails(24,26);
//		printDetails(22,28);
		
		getMultiplication r1=new getMultiplication();
		r1.additionResult(50,55);
		r1.substractionResult(52, 11);
		r1.getResult(25, 15);
		Method1.printDetails(23,27);
	}
		
		
	public static int printDetails(int a, int b) {
		int result=a+b;
		System.out.println("Result= "+result);
		return result; 
	  
	  
	}
}
		
		
	
	

