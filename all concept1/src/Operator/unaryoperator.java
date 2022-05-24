package Operator;

public class unaryoperator {

	public static void main(String[] args) {
		int a = 0, 
				b;
		b = a++ + ++a + ++a + a; //

		System.out.println("a: "+a);// 3
		System.out.println("b: "+b);//
		System.out.println("**********************");
		a = -5;//-5-3
		b = a-- + --a + --a + a;
		System.out.println("a: "+a);//-8
		System.out.println("b: "+b);// 

		a = 21;//21-3+2
		b = --a + --a + --a + a + ++a + a++;
		System.out.println("a: "+a);//20
		System.out.println("b: "+b);// 

		a = -2;//-2-1+4
		b = a-- + a + ++a + a++ + ++a + a++ + a;
		System.out.println("a: "+a);//1
		System.out.println("b: "+b);//
	}

}
