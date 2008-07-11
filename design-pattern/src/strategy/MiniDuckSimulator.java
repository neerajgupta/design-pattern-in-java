package strategy;

public class MiniDuckSimulator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Duck duck = new MallardDuck();

		duck.performFly();
		duck.performQuack();
		duck.performSwim();
		duck.display();
		
		duck.setFlyBehavior(new FlyNoWay());
		duck.setQuackBehavior(new MuteQuack());

		duck.performFly();
		duck.performQuack();
		duck.performSwim();
		duck.display();
	}

}
