package dp_template_method_vehicles;

public abstract class Vehicle {
	public String name;

	public final void prepare(){
		wash();
		examine();
		unlock();
		fuelUp();
		checkEngine();
		getLaunchPermission();
		powerOn();
	}
	
	void wash(){
		System.out.println(this.name + " is being washed");
	}
	
	void unlock(){
		System.out.println(this.name + " is now unlocked");
	}
	
	abstract void examine();
	
	abstract void powerOn();
	
	void fuelUp(){}
	
	void checkEngine(){}
	
	void getLaunchPermission(){}
	
}
