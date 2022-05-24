package Homework;

public class getMultiplication{
	public void getResult(int p, int q) {
		double result=p*q;
		System.out.println("Multiplication= "+result);
//		return result;
	}	
//}
//class getAddition{
	public void additionResult(int a, int b){
		double result1=a+b;
		System.out.println("Addition= "+result1);
//		return result1;
	}
//}
//class getSubstraction {
	public void substractionResult(int x, int b){
		double result2=x-b;
	    System.out.println("Substraction= "+result2);
//		return result2;
		
	}


// class practice {

	 static void main(String[] args) {
		getMultiplication r0=new getMultiplication();
		r0.getResult(2,50);
		r0.additionResult(10, 10);
		r0.substractionResult(10, 10);
//		getAddition r1=new getAddition();
//        r1.additionResult(50,49);
//        
//        getSubstraction r2=new getSubstraction();
//        r2.substractionResult(100,2);

	 }
	}


