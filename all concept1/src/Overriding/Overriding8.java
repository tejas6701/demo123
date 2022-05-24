package Overriding;
class CBI{
	CBI(){
		System.out.println("Print my method");
		}
	public void myChopper(){
	System.out.println("My method");		
	}
}
class STF extends CBI{
	STF(){
		System.out.println("I am stf constructor");
	}
	public void myChopper(){
		System.out.println("My chopper");
	}
}
public class Overriding8 {
	public static void main(String [] args) {
		
		STF ref=new STF();
		ref.myChopper();
	
	}
}
