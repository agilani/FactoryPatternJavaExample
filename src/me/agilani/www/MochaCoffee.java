package me.agilani.www;

public class MochaCoffee extends Coffee {

	public MochaCoffee() {
		super(CoffeeType.Mocha);
		makeCoffee();
	}

	@Override
	public void makeCoffee() {
		System.out.println("Making Mocha Coffee");
	}

}
