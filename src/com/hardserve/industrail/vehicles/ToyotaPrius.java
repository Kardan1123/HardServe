package com.hardserve.industrail.vehicles;

public class ToyotaPrius extends Engined implements ElectricEngine, GasEngine {
	protected double conversion = 0.1;
	
	public void charge(double amount) {
		if (fuelLevel + amount > capacity) {
			System.out.println("Warning! Attempt of overcharging!");
		} else {
			fuelLevel += amount;
			System.out.println("Charged for " + amount +
					", current fuel level -- " + fuelLevel + ".");
		}
	}

	public void fillGas(double amount) {
		if (fuelLevel + amount > capacity) {
			System.out.println("Warning! Attempt of overcharging!");
		} else {
			fuelLevel += amount;
			System.out.println("Charged for " + amount +
					", current fuel level -- " + fuelLevel + ".");
		}
	}
	
	@Override
	public double moveOnGas(double distance)
	{
		double atStart = fuelLevel;
		double remainingDistance = super.moveOnGas(distance);
		double atFinish = fuelLevel;
		chargeLevel += (atStart - atFinish) * conversion;
		return remainingDistance;
	}
	
	ToyotaPrius(){
		speed = 90;
		capacity = 1000;
		fuelLevel = this.capacity;
		consumption = 7;
		chargeLevel = this.capacity;
	}
}
