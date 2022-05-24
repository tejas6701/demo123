package inheritance0;
 class Grandfather{
	 Grandfather(){
		 System.out.println("I am Grandfather");
		 }
	 void myHome() {
		 System.out.println("I have home");
	 }
 }
 class Father extends Grandfather{
	 Father(double num1){
		 System.out.println("I am Father");
	 }
	 void myCar() {
		 System.out.println("I have car");
	 }
 }
class Child extends Father{
	Child(){
		
		super(1.0);
		
		System.out.println("I am Child");
	}
	void myBike() {
		System.out.println("I have bike");
	}
}
public class Inheritance0 {

	public static void main(String[] args) {
		
		Child ref=new Child();
//		ref.myBike();
//		ref.myCar();
//		ref.myHome();
	}

}
