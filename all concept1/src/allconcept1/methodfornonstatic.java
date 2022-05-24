package allconcept1;

public class methodfornonstatic {

	public static void main(String[] args) {
		methodfornonstatic ref=new methodfornonstatic();
		ref.getResult(20,30);
		ref.getResult(21,29);
	}
	double getResult(int p, int q) {
		double result=p+q;
		System.out.println("Result= "+result);
		return result;
	}

}
