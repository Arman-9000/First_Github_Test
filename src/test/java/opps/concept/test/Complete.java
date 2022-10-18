package opps.concept.test;

public class Complete extends Abstrct{
	@Override
	public void getName() {
		// TODO Auto-generated method stub
	
		String name = "Arman";
		System.out.println(name);
	}
public static void main(String[] args) {
	Complete obj = new Complete();
	
	obj.getName();
	obj.getNum();
}

	
}

