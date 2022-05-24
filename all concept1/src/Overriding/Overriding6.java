package Overriding;
class Animal{
	void myMethod() {
		System.out.println("ANIMAL CAN MOVE");
	}
}
class Cat extends Animal{
	void myMethod() {
//		super.myMethod();
		System.out.println("DOG CAN BARK");
		
	}
}
public class Overriding6 {

	public static void main(String[] args) {
		
		Animal ref=new Cat();
		ref.myMethod();
	}

}
