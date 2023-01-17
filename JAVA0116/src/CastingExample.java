
public class CastingExample {

	public static void main(String[] args) {
		
		Vehicle vehicle = new Bus();
		//run()			run(), checkFare()
		
		vehicle.run();
		
		Bus bus = (Bus)vehicle;
		bus.run();
		bus.checkFare();
		
	}

}
