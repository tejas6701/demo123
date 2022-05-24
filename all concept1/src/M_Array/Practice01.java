package M_Array;

import java.util.Arrays;

public class Practice01 {

	public static void main(String[] args) {
		
		String [] res= {"bike","car","truck","aeroplane","helicopter"};
		System.out.println(res.length);
		for(int i=0;i<res.length;i++) {
			System.out.print(res[i]+" ");	
		}System.out.println();
		Arrays.sort(res);
		for(String a:res) {
			System.out.print(a+" ");	
		}
	
	}
}
	