package me.agilani.www;

public class WhiteCoffee extends Coffee {

	public WhiteCoffee() {
		super(CoffeeType.White);
		makeCoffee();
	}

	@Override
	public void makeCoffee() {
		System.out.println("Making White Coffee");
	}

}
