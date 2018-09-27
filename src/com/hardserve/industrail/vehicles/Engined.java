package com.hardserve.industrail.vehicles;


public abstract class Engined extends Vehicle {
	protected int capacity;
	protected double consumption;
	protected double fuelLevel;
	protected double chargeLevel;

	public double getFuelLevel() {
		return this.fuelLevel;
	}

	public double getChargeLevel() {
		return this.chargeLevel;
	}
	
	protected double moveOnCharge(double distance) {
		double coveredDistance;
		double usedCharge;
		
		if(distance * consumption > chargeLevel) {
			coveredDistance = chargeLevel / consumption;
			usedCharge = chargeLevel;
		} else {
			coveredDistance = distance;
			usedCharge = distance * consumption;
		}
		
		chargeLevel -= usedCharge;
		System.out.println("Covered " + coveredDistance +" km, spent " + usedCharge +" power units.");
		return distance - coveredDistance;
	}
	
	protected double moveOnGas(double distance) {
		double coveredDistance;
		double usedGas;
		
		if(distance * consumption > fuelLevel) {
			coveredDistance = fuelLevel / consumption;
			usedGas = fuelLevel;
		} else {
			coveredDistance = distance;
			usedGas = distance * consumption;
		}
		
		fuelLevel -= usedGas;
		System.out.println("Covered " + coveredDistance +" km, spent " + usedGas +" fuel.");
		return distance - coveredDistance;
	}
	
	@Override
	double move(double distance) {
		double toSpend = consumption * distance;

		if (toSpend > fuelLevel + chargeLevel) {
			System.out.println("You don't have enough fuel!");
			return 0;
		}

		moveOnGas(moveOnCharge(distance));
		
		double time = distance / speed;
		double hours = Math.floor(time);
		double minutes = (time - hours) * 6000 / 100;
		double seconds = Math.floor((minutes - Math.floor(minutes))*6000/100);
		System.out.printf("Vehicle covered %.2f km and spent " + hours 
				+ " hours, " + Math.floor(minutes) + " minutes and " 
				+ seconds + "seconds. You have " + fuelLevel
				+ " fuel and " + chargeLevel + "charge.", distance);
		return time;
	}
}
