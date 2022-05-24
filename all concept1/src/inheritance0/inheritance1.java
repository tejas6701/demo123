package inheritance0;

 class fruits{
	 int fruitAge;
	 fruits(){
			System.out.println("fruit constructor");
			fruitAge=7;		
	 }
	 final public void taste() {
		 System.out.println("fruites are sweet");
	 }
 }
 class orange extends fruits{
	 final public void taste(int a) {
		 System.out.println("*****");
		 
	 }
	 int fruitAge;
	 orange(){
		 System.out.println("Orange Constructor");
		 fruitAge=5; 
	 }
	 public void shape() {
		 System.out.println("Orange is sweet");
		 System.out.println("Orange is round");
		 System.out.println("fruitAge= "+super.fruitAge);
		 System.out.println("Orange fruitAge= "+fruitAge);
	 }
 }
public class inheritance1 {

	final public static void main(String[] args) {
		orange o1=new orange();
		 o1.taste();
		 o1.shape();

	}

}
