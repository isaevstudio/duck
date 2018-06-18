package model;

public class RedheadDuck extends Duck{
	public RedheadDuck(QuackBehavior quackBehavior, FlyBehavior flyBehavior) {
		super(quackBehavior, flyBehavior);
		// TODO Auto-generated constructor stub
	}
	public void display(){
		System.out.println("Yes, I'm RedheadDuck");
		performQuack();
		performFly();
	}
}
