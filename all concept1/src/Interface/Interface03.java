package Interface;

interface Printable {
	int age=30;//by default ==public static final
	void print();//this is public  abstarct by default
	
}
interface Showable {
	void show();
}
class Interface03 implements Printable, Showable {
	public void print() {
		System.out.println("Hello, print");
	}
	public void show() {
		System.out.println("Welcome, show");
	}
	public static void main(String args[]) {
		Interface03 obj = new Interface03();
		obj.print();
		obj.show();
		System.out.println(Printable.age);
	}

}
