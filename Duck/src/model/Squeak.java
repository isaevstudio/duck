package model;

public class Squeak implements QuackBehavior {

	@Override
	public void performQuack() {
		
		System.out.println("This duck can Squeak");
	}
}
