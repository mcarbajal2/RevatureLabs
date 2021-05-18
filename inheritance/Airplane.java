package dev.carbajal.inheritance;

public class Airplane extends FlyingVehicle{
	
	private short wheels;
	private short propellers;
	
	// constructor
	
	public Airplane(short wheels, short propellers) {
		
		super();
		
		this.wheels = wheels;
		this.propellers = propellers;
		
	}
	
	// getters and setters
	
	public short getWheels() {
		
		return this.wheels;
		
	}
	
	public void setWheels(short wheels) {
		
		this.wheels = wheels;
		
	}
	
	public short getPropellers() {
		
		return this.propellers;
		
	}
	
	public void setPropellers(short propellers) {
		
		this.propellers = propellers;
		
	}
	
	// method
	
	public void turn() {
		
		System.out.println("Turning...");
		
	}

}
