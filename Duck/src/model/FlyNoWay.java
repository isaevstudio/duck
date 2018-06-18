package model;

public class FlyNoWay implements FlyBehavior {

	@Override
	public void performFly() {

		System.out.println("This duck can't fly!");
	}

}
