package zoopla.uk.logintest;

public class CustomerInfo {

	
	static String name = "Rahman";
	
	static int salary ;
	static int kola;
	static int bonus;
	static int shopping;
	static int total;
	public static void getCustomerInfo() {
		
		salary = 100000;
		kola = 20000;
		bonus = 10;
		shopping = 50000;
		total = salary+kola+bonus-shopping;
		
		System.out.println("salary = " + total);
		
		
		
	}

	public static void getCustomerArman() {
		
		String Name1 = "Arman";
		
		salary = 200000;
		kola = 50000;
		bonus = 50;
		shopping = 100000;
		total = salary+kola+bonus-shopping;
		
		System.out.println("2nd salary = " + total);
		
		System.out.println("Name is "+ Name +" Other customer Name " + Name1);
		
		System.out.println(Name1);
		
		System.out.println("LETS GET THIS MONEY =$");
	
		
		
			}
		
		
		
	
	
	
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		CustomerInfo.getCustomerInfo();
		CustomerInfo.getCustomerArman();
		
	
	
	}

}
