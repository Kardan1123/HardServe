package com.hardserve.industrail.vehicles;

public abstract class Engineless extends Vehicle {
	@Override
	double move(double distance) {
		double time = distance / speed;
		double hours = Math.floor(time);
		double minutes = (time - hours) * 6000 / 100;
		double seconds = Math.floor((minutes - Math.floor(minutes))*6000/100);
		System.out.println("Vehicle covered " + distance + " km and spent " 
		+ hours + " hours, " + Math.floor(minutes) + " minutes and " + seconds + "seconds.");
		return time;
	}
}
