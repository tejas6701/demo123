package Array;

//import java.util.Arrays;

public class ArrayAscending {

	public static void main(String[] args) {
	
	int[] res=new int[] {5,50,20,30,10,15};
	
	for(int i=0;i<res.length;i++) {
		for(int j=i+1;j<res.length;j++) {
			if (res[i]>res[j]){
				int temp=res[i];
				res[i]=res[j];
				res[j]=temp;
			}}}
				for(int i=0;i<res.length;i++) {
				System.out.println(res[i]);
				}
}}
