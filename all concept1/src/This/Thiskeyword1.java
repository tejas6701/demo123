package This;
public class Thiskeyword1 {
	int variable = 51;
	public static void main(String args[]) {
		Thiskeyword1 obj = new Thiskeyword1();
		obj.method(20);
		obj.method();
		System.out.println("Value of Instance variable 1:" + obj.variable);//51
	}
	void method(int variable) {
		System.out.println("Value of Local variable 1:" + variable);//20
		variable = 10;
		System.out.println("Value of Local variable 2:" + variable);//10
		System.out.println("Value of Instance variable 4:" + this.variable);//20
		this.variable=variable;
		System.out.println("Value of Local variable 5:" + variable);//
		System.out.println("Value of Instance variable 6:" + this.variable);//
	}
	void method() {
		int variable = 40;
		System.out.println("Value of Instance variable 7:" + this.variable);//
		System.out.println("Value of Local variable 8:" + variable);//
		this.variable=variable;
		System.out.println("Value of Local variable 9:" + variable);//
		System.out.println("Value of Instance variable 10:" + this.variable);//
	}

}
