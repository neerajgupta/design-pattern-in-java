package strategy;

public class MallardDuck extends Duck {

	public MallardDuck() {
		this.fly = new FlyWithWings();
		this.quack = new Quack();
	}

	@Override
	public void display() {
		System.out.println("I am a real mallard duck.");
	}

}
