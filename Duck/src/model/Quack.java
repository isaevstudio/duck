package model;

public class Quack implements QuackBehavior {
	@Override
	public void performQuack(){
		System.out.println("This duck can Quack");
	}

}
