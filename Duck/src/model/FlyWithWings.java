package model;

public class FlyWithWings implements FlyBehavior {

	@Override
	public void performFly() {
	
		System.out.println("This duck can fly with wings!");
	}

}
