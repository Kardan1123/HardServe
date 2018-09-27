package com.hardserve.industrail.vehicles;

public class Tesla extends Engined implements ElectricEngine {
	public void charge(double amount) {
		if (this.fuelLevel + amount > capacity) {
			System.out.println("Warning! Attempt of overcharging!");
		} else {
			this.fuelLevel += amount;
			System.out.println("Charged for " + amount + ", current fuel level -- " + this.fuelLevel + ".");
		}
	}

	Tesla() {
		speed = 110;
		capacity = 1400;
		fuelLevel = 0;
		consumption = 5;
		chargeLevel = this.capacity;
	}
}
