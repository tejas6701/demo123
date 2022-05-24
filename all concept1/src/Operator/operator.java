package Operator;

public class operator {

	public static void main(String[] args) {
		int age=18;
		char Bloodgroup='A';
		boolean res1, res2;
		res1=(age>18);
		res2=(Bloodgroup=='A');
		System.out.println("Result1= "+res1);//F
		System.out.println("Result1= "+res2);//T
		System.out.println("Result1 ||= "+(res1 || res2));//T
		System.out.println("Result1 &&= "+(res1 && res2));//F
		System.out.println("Result1 !(&&)= "+!(res1&&res2));//F
		
		System.out.println("****************************************");//F
	
		System.out.println("Result1: "+res1);
		System.out.println("Result2: "+res2);
		// Logical AND
		System.out.println("bool1 && bool2 = " + (res1 && res2));//

		// Logical OR
		System.out.println("bool1 || bool2 = " + (res1 || res2)); // 

		// Logical Not
		System.out.println("!(bool1 && bool2) = " + !(res1 && res2));//
		
		
		int num1 = 14, num2 = 14;
		System.out.println("num1: " + num1 + "--->num2: " + num2);//15   14
		// is equal to
//		boolean res = (num1 == num2);
//		System.out.println("num1 == num2 : " + res);// 
				//or
		System.out.println("num1 == num2 : " + (num1 == num2));// 
		// is not equal to
		System.out.println("num1 != num2 : " + (num1 != num2));// 
		// Greater than
		System.out.println("num1 >  num2 : " + (num1 > num2));// 
		// Less than
		System.out.println("num1 <  num2 : " + (num1 < num2));// 
		// Greater than or equal to
		System.out.println("num1 >= num2 : " + (num1 >= num2));// 
		// Less than or equal to
		System.out.println("num1 <= num2 : " + (num1 <= num2));// 

	}

	}
