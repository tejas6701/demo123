package Casting;
class Parent{
	void show() {
		System.out.println("Parent show method is called");
	}
	void callme() {
		System.out.println("Parent callme method is called");
	}
}
class Child extends Parent {
	void readme() {
		System.out.println("Child readme method is called");
	}
	void show() {
		System.out.println("child show method is called");
}}
public class DerivedCasting1 {
	public static void main(String[] args) {
		Parent ref=new Child();
		ref.callme();
		ref.show();
		Child ref1= (Child)ref;
		ref1.callme();
		ref1.show();
		ref1.readme();
		
		
		
	}
}



