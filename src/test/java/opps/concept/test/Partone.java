package opps.concept.test;

public interface Partone {
	
	public void getCar();
	
    default void defaultHouse() {
    	String vcayH = "Malibu villa";
    			System.out.println(vcayH);
    }
	
	}

