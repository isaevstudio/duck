package model;

public class RubberDuck extends Duck {

	public RubberDuck(QuackBehavior quackBehavior, FlyBehavior flyBehavior) {
		super(quackBehavior, flyBehavior);
	}
	public void display(){
		System.out.println("Yes, I'm RubberDuck");
		performQuack();
		performFly();
	}
	
}
