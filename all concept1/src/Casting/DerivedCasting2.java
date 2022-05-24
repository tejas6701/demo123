package Casting;
class Member {
	// Memmber variable of this class
	long phone;
	// Member function of this class
	void chat() {
		// Print message of Member/ Child class
		System.out.println("chatting in whatsapp group with "+phone);
	}
}
class Admin extends Member {
	// Member function of this class
	void addNumber() {
		// Print message of Admin/ Parent class
		System.out.println("adding a new user number in whatsapp group");
	}
}
public class DerivedCasting2 {

	// Main driver method
	public static void main(String[] args) {
		
		Member ref=new Admin();//auto or implicit upcating 
		
		ref.chat();//parent method by using upcasting
		
		//down casting
		Admin a1=(Admin)ref;
		a1.addNumber();
		a1.chat();
	
	}
}
/**
* child class object referred by any of its parent known as up casting


* parent class object referred by any of its child class known as downcasting
  directly downcasting is not possible in java

Child c2=new Parent();//downcasting but not possible in this way

Parent p1=new Child();

Child c1=(Child)p1;//downcasting, as Upcasting object is getting down casted here
 */


