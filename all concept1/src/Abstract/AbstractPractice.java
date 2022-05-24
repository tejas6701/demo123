package Abstract;
abstract class sbi{
	abstract double getInterest();
	void display() {
		System.out.println("as per rbi guidlines");
	}
}
class axis extends sbi{
	double getInterest(){
//		System.out.println());	
		return 7.5;
	}
}
public class AbstractPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        sbi s1=new axis();
        s1.getInterest();
        System.out.println(s1.getInterest());
	}

}
