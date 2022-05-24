package Blocks;

public class block0 {
	
	
		static {
			
			System.out.println("Block 1");
		}
	

	public static void main(String[] args) {
		
		int a=25,b=25,res=a+b;
		System.out.println("result= "+res);
		// TODO Auto-generated method stub

	}
	 static{
		block0 ref=new block0();
		ref.display(1,2);
		System.out.println("Block 2");
	}
	 void display(int p, int q) {
		int res1=p+q;
		System.out.println("hello tejas= "+res1);
		
	}

}
