package package2;
import package1.*;
public class AccessModifiers extends Modifiers{ 
	public static void main(String[] args) {
		Modifiers ref=new Modifiers();
		System.out.println(ref.num4);
		AccessModifiers ref1=new AccessModifiers();
		System.out.println(ref1.num3);
		
	}
}
