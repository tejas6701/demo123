package Blocks;

public class block1 {
	static int age;
	double salary;
	
	static {
		age=30;
	}
	{
		salary=25000.00;
	}

	public static void main(String[] args) {
	
	System.out.println("Age= "+block1.age);
	System.out.println("******************");
	block1 ref=new block1();
	System.out.println("Salary= "+ref.salary);
	}

}
