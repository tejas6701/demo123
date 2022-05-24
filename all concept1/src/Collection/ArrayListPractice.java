package Collection;
import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListPractice {
	public static void main(String[] args) {
		ArrayList ref=new ArrayList();
		ref.add("Banana");
		ref.add("Mango");
		ref.add("Grapes");
		ref.add(12345);
		ref.add(null);
		ref.add("Orange");
		
		System.out.println("ArrayList: "+ref);//to print arraylist element in series
		for(Object fruites: ref) {
			System.out.print(fruites+" ");//to print arraylist element one by one
		}System.out.println();
		System.out.println(ref.size());//size of arraylist
		System.out.println(ref.get(5));// to get the element based on its index
		ref.set(4, "Watermalon");//to update the element based on its index
		System.out.println("After updating the element of index 4"+ref);
		
//		ref.forEach(a-> {//Lambda Expression
//			System.out.println("print elements by using lamda exp.: "+a);
//		});
		System.out.println("****************************");
		//By using iterator
		Iterator itr=ref.iterator();
		System.out.print("By using iterator interface :");
		while(itr.hasNext()) {
			System.out.print(itr.next()+" ");			
		}
		//By using new obj of iterator
		Iterator itr1=ref.iterator();
		System.out.print("By using new iterator interface :");
		while(itr1.hasNext()) {
			System.out.print(itr1.next()+" ");	
	}	

}
}