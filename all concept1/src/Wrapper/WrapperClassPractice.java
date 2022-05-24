package Wrapper;

public class WrapperClassPractice {

	public static void main(String[] args) {
		int age=20;
		System.out.println(age);
		
		Integer salary=25000;
		System.out.println(salary);
		Double salary1=new Double(250);
		System.out.println(salary1);
		double salary2=salary1.intValue();//unboxing
		System.out.println(salary2);
	}

}
