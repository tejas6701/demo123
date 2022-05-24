package allconcept1;

public class allconcept1 {
	
	int a=256, b=256, 
	result=a-b;
	static long mobilenumber=96027;
	static final int  result5=6701;
	public static void main(String[] args) {
		int p=24, q=26;
		int result1=p+q;
		allconcept1 ref=new allconcept1();
    System.out.println("Mobile Number= "+allconcept1.mobilenumber);
    System.out.println("Result of a-b= "+ref.result);
    System.out.println("Result of p+q= "+result1);
//    result5=123; Cannot be reinitialize because its final declared
    System.out.println("Result of result5= "+result5);
	}

}
