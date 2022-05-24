package inheritance0;
class A1{
	static int a=1;
	int b=2;
	double c=3d;
}
class B1 extends A1{
	static int d=4;
	int e=5;
	long f=6;
}
class C1 extends B1{
	static int g=7;
	double h=8d;
	int i=9;
}
public class inheritance3 {

	public static void main(String[] args) {
		System.out.println(A1.a);
		System.out.println(B1.d);
		System.out.println(C1.g);
		
		C1 d1=new C1();
		
		System.out.println(d1.b);
		System.out.println(d1.c);
		System.out.println(d1.e);
		System.out.println(d1.f);
		System.out.println(d1.h);
		System.out.println(d1.i);
		
		B1 x1= new C1();

		
	}

}
