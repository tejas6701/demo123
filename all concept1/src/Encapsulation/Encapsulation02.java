package Encapsulation;

class sensitiveData{
	private int atmPin=6701;
	private double password=9876.00;
	public int getatmPin() {
		return atmPin;
	}
	public double password() {
		return password;
	}
	public void setatmPin(int atmPin) {
		this.atmPin=atmPin;
	}
}

public class Encapsulation02 {
		public static void main(String[] args) {
			sensitiveData ref=new sensitiveData();
			System.out.println("Program starts");
			System.out.println("ATM PIN  : "+ref.getatmPin());
			System.out.println("PASSWORD : "+ref.password());
			
			ref.setatmPin(7721);
			System.out.println("new atm pin "+ref.getatmPin());
		}
	}