package me.agilani.www;

public abstract class Coffee {
	
	private CoffeeType coffeeType; 
	
	public Coffee(CoffeeType coffeeType)
	{
		this.setCoffeeType(coffeeType);
	}
	
	public void AddIngredients()
	{
		//to add ingredients
	}

	public CoffeeType getCoffeeType() {
		return coffeeType;
	}

	public void setCoffeeType(CoffeeType coffeeType) {
		this.coffeeType = coffeeType;
	}
	
	
	public abstract void makeCoffee();
	
}
