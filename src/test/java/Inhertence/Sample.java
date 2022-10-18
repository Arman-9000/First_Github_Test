package Inhertence;

public class Sample {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Parent p = new Parent();
		Child c = new Child();
		Parent p2 = new Child();
		
		p.methodA();
		c.methodA();
		p2.methodA();
		
		c.methodB();
		
		if (p2 instanceof Child)
			((Child)p2).methodB();
	}
	
	
	

}
