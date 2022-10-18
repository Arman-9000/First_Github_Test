package zoopla.uk.logintest;

public class Test_1 {
	int num = 10;
	
	
	 public int cubee(int x) {
		 System.out.println(x*x*x);
		 return x*x*x;
	
		
	 }

	 public int sqaure(int x) {
		 System.out.println(x*x);
		 return x*x;
	 }
	
	 public static int add(int x, int y) {
		 System.out.println(x+y);
		 return x+y;
		 
	 }
	
	public void useless() {
		System.out.println("this method is useless");
	}
	
	
	Test_1 arman = new Test_1();
	
	
public static void main(String[] args) {
	
	System.out.println(CustomerInfo.name);
	
	Test_1.add(3, 4); // this works because it is a static method.
	
	Test_1 arman = new Test_1(); // this is how you create an object
	// classname objectname = new classname ();
	
	
	arman.cubee(4);
	arman.sqaure(4);
	arman.useless();
	StudyForMethods.sum(3, 4);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	// num we cannot use this instance variable because of static method but we can use non static method as much requiered 
	// no restrictions
	// instance variable> I can use within class any method, except static method.
	// i can not use out site the class. also,
	// i can use only inside the non-static method
	

}
public void getSalary() {
	num = 350000;
}
public void getBonus() {
	num = 17500;
}
public void cola() {
	num = 10000;
int total = (num + num + num);
	System.out.println(total);
}
}
