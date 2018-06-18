package model;

public class MuteQuack implements QuackBehavior {

	@Override
	public void performQuack() {

		System.out.println("This duck can't quack!");
	}

}