package Casting;

public class pr {

	public static void main(String[] args) {
		int a=50;
		double x=a;//implicit widening
		double y=(double)a;//explicit widening
		
		
		System.out.println(a);
		System.out.println(x);
		System.out.println(y);
		// narrowing is only explicit   // auto or implicite narrowing is not possible
		double salary=25000.666;
		int salary1=(int)salary;//explicit narrowing 
		System.out.println(salary1);
		
		

	}

}
