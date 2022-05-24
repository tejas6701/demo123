package String;

public class StringBufferPractice {

	public static void main(String[] args) {
	StringBuffer str=new StringBuffer("Hello");
	str.append(" java");
	System.out.println(str);
	str.insert(7, "pune");
	System.out.println(str);
	
	str.replace(4, 8, "mumbai");
	System.out.println(str);
	str.delete(4, 8);
	System.out.println(str);
	System.out.println("**************");
	StringBuffer str1=new StringBuffer("i am from pune");
	System.out.println(str1);
	System.out.println(str1.length());
	for(int i=str1.length()-1;i>=0;i--) {
		System.out.print(str1.charAt(i));
	}System.out.println();
	str1.reverse();
	System.out.println("reverse method:= "+str1);

	}

}
