package ExceptionHandling;

public class ExceptionHandling13 {
		
  		static void getNumber(int num1, int num2) {
  			
  		try {   int res=num1/num2;
  				System.out.println("number is valid");
  		
  		}
  		catch(Throwable k) {
  			System.out.println("K= "+k);
  			System.out.println("exception is handled");
  		}}
  		 public static void main(String[] args) {
 		  getNumber(10,10);
 	   }
    }

 

/**
try-catch--> to handle the exception
throw------> to throw the exception from a method body, this needs to handled by using throws
throws------> use to handle exception throws by a method while calling or use to declare a exception on method level
*/