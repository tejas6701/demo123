package This;

 class student {

	int rollno;
	double salary;
	student(int rollno, double salary){
		
		System.out.println("Print the Roll Number= "+this.rollno);
		System.out.println("Print the Salary= "+this.salary);
		this.rollno=rollno;
		this.salary=salary;
		
	}
	void display() {
		System.out.println(rollno+" ; "+salary);
	}
}
class Thiskeyword{
	public static void main(String[] args) {
		
		student ref=new student(725,60000.0);
		
		ref.display();
		
	}

}
