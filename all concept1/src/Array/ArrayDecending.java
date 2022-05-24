package Array;

public class ArrayDecending {

	public static void main(String[] args) {
		int[] num=new int[] {50,95,40,05,30,80,60,70};
		
		for(int i=0;i<num.length;i++) {
			for(int j=i+1;j<num.length;j++) {
				if(num[i]<num[j]) {
					int temp=num[i];
					num[i]=num[j];
					num[j]=temp;
				}
			}
			if(i==0) {
			System.out.println(num[i]);
		
			}
		}
	}
}