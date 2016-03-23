
package dp_template_method_vehicles;

public class DisplayCar extends Vehicle {
	
	public DisplayCar(){
		this.name = "Show car";
	}

	void examine() {
		System.out.println("The car is examined for any dings or cracks.  None are found, "
				+ "it'll look great on the lot.");
	}

	void powerOn() {
		System.out.println("The cars display lights and music are turned on.");
	}

	public void checkEngine(){
		System.out.println("The car is checked to ensure the engine looks good under the "
				+ "display lights.");
	}
}
