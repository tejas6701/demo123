package inheritance0;
class Honda{
	Honda(){
		System.out.println("I AM HONDA CONS");
		
	}
}
class Maruti extends Honda{
	Maruti(){
		System.out.println("I AM MARUTI CONSTRUCTOR");
	}
}
public class Inheritance4 {

	public static void main(String[] args) {
		  Maruti r=new Maruti();
	}

}
