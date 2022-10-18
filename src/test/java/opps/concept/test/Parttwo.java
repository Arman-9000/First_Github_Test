package opps.concept.test;

public class Parttwo implements Partone{

	@Override
	public void getCar() {
		// TODO Auto-generated method stub
		String name = "BMW";
		System.out.println(name);
	}
public static void main(String[] args) {
	Parttwo obj = new Parttwo();
	
	obj.getCar();
	obj.defaultHouse();
}
}
