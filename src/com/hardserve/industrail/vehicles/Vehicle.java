package com.hardserve.industrail.vehicles;

public abstract class Vehicle {
	protected double speed;

	abstract double move(double distance);

	public double getSpeed() {
		return this.speed;
	}
}
