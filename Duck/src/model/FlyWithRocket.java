package model;

public class FlyWithRocket implements FlyBehavior {

	@Override
	public void performFly() {
		
		System.out.println("This duck can fly with rocket!");
	}

}