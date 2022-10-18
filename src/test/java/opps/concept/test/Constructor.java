package opps.concept.test;

public class Constructor {

	public Constructor(String name) {
		System.out.println(name);
		}
	public Constructor() {
		System.out.println("i created a constructor object");
		
	}
	
	
	
	
	
	
	
	
public static void main(String[] args) {
	Constructor obj = new Constructor("arman");
	Constructor x = new Constructor("life");
	Constructor y = new Constructor("xyz");
	Constructor z = new Constructor();
			
}} 
