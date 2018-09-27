package com.hardserve.industrail.vehicles;

public class LancerEvolution extends Engined implements GasEngine {
	public void fillGas(double amount) {
		if (this.fuelLevel + amount > capacity) {
			System.out.println("Warning! Attempt of overcharging!");
		} else {
			this.fuelLevel += amount;
			System.out.println("Charged for " + amount + ", current fuel level -- " + this.fuelLevel + ".");
		}
	}

	LancerEvolution() {
		speed = 100;
		capacity = 2400;
		fuelLevel = this.capacity;
		consumption = 8.5;
		chargeLevel = 0;
	}
	
	
}
