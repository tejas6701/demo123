package Constructor;
final class Constructor0 {

	public Constructor0() {
		System.out.println("This is a zero-para constructor");
	}
	
	public Constructor0(char c) {
		System.out.println("This is a single-para constructor");
	}

	public Constructor0(int num1, int num2) {
		System.out.println("This is a int-int parameterized constructor");
	}

	public static void main(String[] args) {
		Constructor0 c1 = new Constructor0();
		Constructor0 c2 = new Constructor0(10, 20);
		Constructor0 c3 = new Constructor0('d');
	}
}

/**
 * Constructor Overloading: more than on constructor in a  class
 * Rule: 
 * 1. type of args differ or
 * 2. number of args differ or
 * 3. position of args differ
 * 
 */