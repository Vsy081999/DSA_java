package methodOveriding;

public class Test {

	public static void main(String[] args) {
		// child class object
		Samsung s = new Samsung();
		s.off();

		// Upcasting
		// Reference of parent class and object of child class
		Mobile m = new Samsung();
		m.off();

		// Downcasting
		Mobile mm = new Samsung();
		Samsung ss = (Samsung) mm;
		ss.opencamera();
		ss.flash();
	}

}
