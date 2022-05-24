import java.util.Scanner;

public class practice5 {
	public static void main(String [] args) {
		for (int res=1;res<100;res++) {	
	Scanner ref=new Scanner(System.in);
	System.out.println("Enter any Number");
	res=ref.nextInt();
	int temp=0;
	for (int i=2;i<=res-1;i++) {
		if(res%i==0) {
			temp=temp+1;
		}
	}
		if(temp==0) {
			System.out.println(res+" is a prime number");
		}
		else {
			System.out.println(res+" is a not a prime number");
		}
	}	
	}}

