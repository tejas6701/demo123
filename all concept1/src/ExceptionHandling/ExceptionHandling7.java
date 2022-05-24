package ExceptionHandling;
//No exception in program
public class ExceptionHandling7 {
	public static void main(String args[]) {
		try {
			// below code do not throw any exception
			int data = 25 / 0;
			System.out.println(data);
		}// catch won't be executed
		catch (Exception e) {
			System.out.println("Exception handled...");
		
//		catch (ArithmeticException e) {
//			System.out.println("Exception handled...");
		}
		// executed regardless of exception occurred or not
		finally {
			try {
				int i=10/0;
			}
			catch (ArithmeticException e) {
				System.out.println("finally exception handled");
			}
			System.out.println("finally block is always executed");
		}
		System.out.println("rest of the code...");
	}
}