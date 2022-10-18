package zoopla.uk.logintest;

public class StudyForMethods {
	
	
	public static int cube(int x) {
		System.out.println(x*x*x);
		return x*x*x;
	}
	
	public static void sum(int y, int x) {
		System.out.println(y + x);
	}
	public static void div(int y, int x) {
		System.out.println(y/x);
	}
	
	public static void name(String x) {
		System.out.println(x);
	}
	
	public static void nam(char o) {
		System.out.println(o);
	}
	
	public static void money() {
		System.out.println(1000);
	}
	
	public static void condition(int help) {
		if(help > 3)
			System.out.println("greater");
		else
			System.out.println("lesser");
	}
	
	public static void rafatisgay(boolean gang) {
		if (gang == true)
			System.out.println(gang);
		else
			System.out.println(gang);
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
	
		cube(8);
		cube(100);
		sum(2,4);
		div(4,2);
		name("Lets Get this Money");
		nam('$');
		money();
		condition(500);
		condition(-200);
		boolean gang = true;
		name("Is RAFAT GAY?");
		rafatisgay(gang);
	}

}
