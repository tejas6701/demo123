package Interface;

interface one{
	int age=30;
	void display1();
	void printable();
}
class two{
	void show() {
		System.out.println("dfdsf");
	}
	void draw() {
		System.out.println("dsfd");
	}
}
class three extends two implements one{
	public void display1(){
	System.out.println("display");
	}
	public void printable() {
		System.out.println("printable");
		System.out.println(one.age);
	}
	public void show() {
		System.out.println("show me");
	}
	public void draw() {
		System.out.println("draw me");
	}
}
public class IterfacePractice {

	public static void main(String[] args) {
		
		three ref=new three();
		ref.display1();
		ref.printable();
		ref.draw();
		ref.display1();
			}

}
