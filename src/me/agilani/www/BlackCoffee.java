package me.agilani.www;

public class BlackCoffee extends Coffee {

	public BlackCoffee() {
		super(CoffeeType.Black);
		makeCoffee();
	}

	@Override
	public void makeCoffee() {
		System.out.println("Making Black Coffee");
	}

}
