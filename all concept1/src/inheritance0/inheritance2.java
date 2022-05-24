package inheritance0;

class A{
	int a;
	A(){
		System.out.println("A constructor");
		a=3;
	}
	public void display() {
		System.out.println("Print Starts");
	}
}
class B extends A{
	int b=3;
	B(){
		System.out.println(b);
//		b=3;
	}
}
public class inheritance2 {

	public static void main(String[] args) {

	}

}
