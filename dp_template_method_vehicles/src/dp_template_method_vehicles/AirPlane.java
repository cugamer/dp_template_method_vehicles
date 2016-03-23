
package dp_template_method_vehicles;

public class AirPlane extends Vehicle {
	
	public AirPlane(){
		this.name = "Air plane";
	}

	void examine() {
		System.out.println("The plane is checked to ensure the wings are still attached and the "
				+ "landing geer will retract properly.");
	}

	void powerOn() {
		System.out.println("The engines are powered on and the generator provides power to the cabin.");
	}
	
	public void fuelUp(){
		System.out.println("The plane is filled with jet fuel.");
	}

	public void checkEngine(){
		System.out.println("The planes engine is checked.  It's still in there.");
	}
	
	public void getLaunchPermission(){
		System.out.println("The pilot requests clearance from the tower to take off.");
	}
}
