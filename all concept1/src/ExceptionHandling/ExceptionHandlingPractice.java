package ExceptionHandling;

public class ExceptionHandlingPractice {
	static void getName(int a, int b) {
	try{int res=a/b; 
	System.out.println("Numbers are non zero");
	}
	catch(Exception e){
		System.out.println("Exception is handled");
	}
	}
	
	public static void main(String[] args) {
		getName(10,5);
	}
}
