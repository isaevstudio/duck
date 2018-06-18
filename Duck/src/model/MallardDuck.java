package model;

public class MallardDuck extends Duck {

	public MallardDuck(QuackBehavior quackBehavior, FlyBehavior flyBehavior) {
		super(quackBehavior, flyBehavior);
	}
	public void display(){
		System.out.println("Yes, I'm MallardDuck");
		performQuack();
		performFly();
	}
	
}
