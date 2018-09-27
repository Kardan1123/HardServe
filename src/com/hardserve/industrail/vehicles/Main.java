package com.hardserve.industrail.vehicles;

public class Main {

	public static void main(String[] args) {
		Vehicle [] array = new Vehicle[5];
		array[0] = new Bysicle(10);
		array[1] = new ToyotaPrius();
		array[2] = new Tesla();
		array[3] = new ToyotaPrius();
		array[4] = new LancerEvolution();
		for(int i = 0; i < 5; i++) {
			array[i].move(200);
		}
	}

}
