package dp_template_method_vehicles;

public class SailBoat extends Vehicle {

	void examine() {
		System.out.println("The boat is checked for leaks and racoons.");
	}

	void powerOn() {
		System.out.println("The boats outboard moter is started up.");
	}
	
	public void getLaunchPermission(){
		System.out.println("The captain requests permission to set out from the "
				+ "harbor master");
	}

}
