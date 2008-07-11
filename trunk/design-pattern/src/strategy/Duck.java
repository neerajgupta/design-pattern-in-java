package strategy;

public abstract class Duck {
	FlyBehavior fly;
	QuackBehavior quack;

	public void performFly() {
		fly.fly();
	}

	public void performQuack() {
		quack.quack();
	}

	public abstract void display();

	public void performSwim() {
		System.out.println("All duck swim.");
	}

	void setFlyBehavior(FlyBehavior fly) {
		this.fly = fly;
	}

	void setQuackBehavior(QuackBehavior quack) {
		this.quack = quack;
	}
}
