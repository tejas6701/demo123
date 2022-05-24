package Array;

public class ArrayPractice {
		
	public static void main(String [] args) {
		
		int [] res=new int[] {1,2,3,4,5,6,7,8,9};
		
		//To find the largest number
		System.out.println("length: "+res.length);
		for(int i=res.length-1;i>=0;i--) {
			System.out.println(res[i]);
			/*for(int j=i+1;j<res.length;j++) {
				if(res[i]<res[j]) {
					int temp=res[i];
					res[i]=res[j];
					res[j]=temp;
					
				}
				
				}if((res[i])%2==0) {
//					System.out.println("Largest number"+i);
					System.out.println(res[i]+" is a even number");
			}else {
				System.out.println(res[i]+" is a odd number");
			}*/
		}
	}
}
