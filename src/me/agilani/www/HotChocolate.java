package me.agilani.www;

public class HotChocolate extends Coffee {

	public HotChocolate() {
		super(CoffeeType.HotChocolate);
		makeCoffee();
	}

	@Override
	public void makeCoffee() {
		System.out.println("Making Hot Chocolate");
	}

}
