package me.agilani.www;

public class LatteCoffee extends Coffee {

	public LatteCoffee() {
		super(CoffeeType.Latte);
		makeCoffee();
	}

	@Override
	public void makeCoffee() {
		System.out.println("Making Latte Coffee");
	}

}
