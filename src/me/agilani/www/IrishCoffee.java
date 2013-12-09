package me.agilani.www;

public class IrishCoffee extends Coffee {

	public IrishCoffee() {
		super(CoffeeType.IrishCoffee);
		makeCoffee();
	}

	@Override
	public void makeCoffee() {
		System.out.println("What the hell! i am Irish. Lets have an Irish Coffee");
	}

}
