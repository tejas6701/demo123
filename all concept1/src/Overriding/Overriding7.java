package Overriding;
class Anyone{
     public void myHonda(){
    	 System.out.println("I like Honda Bike");
     }
}
class Noone extends Anyone{
	public void myHonda() {
		super.myHonda();
		System.out.println("I Love My Honda Bike");
	}
}
public class Overriding7 {

	public static void main(String[] args) {
			
		Anyone ref=new Noone();
		ref.myHonda();
	}

}
