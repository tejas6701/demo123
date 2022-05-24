package allconcept1;

public class overloading {

	public static void main(String[] args) {
          getDetails();
          getDetails(10,20);
          getDetails(10,10,5);
          getDetails(10.0,20.0);
          getDetails(11,5.5);
	}
	public static void getDetails() {
		System.out.println("main method overloading");
	}
	public static void getDetails(int a, int b) {
		int result=a+b;
		System.out.println("2= "+result);
	}
	public static void getDetails(int p,double q) {
		double result1=p+q;
		System.out.println("3= "+result1);
	}
	public static void getDetails(double p,double q) {
		double result2=p+q;
		System.out.println("4= "+result2);
	}
	public static void getDetails(long p,long q, long r) {
		double result2=p+q+r;
		System.out.println("5= "+result2);

}}
