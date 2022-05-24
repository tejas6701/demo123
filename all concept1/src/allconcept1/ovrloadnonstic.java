package allconcept1;

public class ovrloadnonstic {

	public static void main(String[] args) {
		ovrloadnonstic obj=new ovrloadnonstic();
		 obj.getDetails();
         obj.getDetails(10,20);
         obj.getDetails(10,10,5);
         obj.getDetails(10.0,20.0);
         obj.getDetails(11,5.5);
	}
	public  double getDetails() {
		double a = 0; //Initialize is must to declare main method overloading
		System.out.println("main method overloading");
		return a ;

	}
	public  double getDetails(int a, int b) {
		int result=a+b;
		System.out.println("2= "+result);
		return result;

	}
	public  double getDetails(int p,double q) {
		double result1=p+q;
		System.out.println("3= "+result1);
		return result1;

	}
	public  double getDetails(double p,double q) {
		double result2=p+q;
		System.out.println("4= "+result2);
		return result2;

	}
	public  double getDetails(long p,long q, long r) {
		double result5=p+q+r;
		System.out.println("5= "+result5);
		return result5;



	}

}
