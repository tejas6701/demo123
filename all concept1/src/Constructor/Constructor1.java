package Constructor;
public class Constructor1 {

	int age;
	double salary;
	
	Constructor1(){
		//explicit default constructors---> no para and empty body
	}
	public static void main(String[] args) {


		Constructor1 c1=new Constructor1();
		
		System.out.println(c1.age);//0
		System.out.println(c1.salary);//0.0

	}

}