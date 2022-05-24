package Abstract;
abstract class RBIBank102 {
	 abstract double getRateOfInterestForHomeLoan();
	//abtract mean must be overridden
	//final means can't be override
}
class SBI102 extends RBIBank {
	double getRateOfInterestForHomeLoan() {
		return 6.45;
	}
}
 class AbstractClass4 {
	public static void main(String args[]) {		
	
	}
}
