package dp_template_method_vehicles;

public class ReadyVehicles {

	public static void main(String[] args) {
		AirPlane plane = new AirPlane();
		plane.prepare();
		System.out.println("------------------------------------------------------------");
		
		DisplayCar car = new DisplayCar();
		car.prepare();
		System.out.println("------------------------------------------------------------");

		SailBoat boat = new SailBoat();
		boat.prepare();
	}
}
