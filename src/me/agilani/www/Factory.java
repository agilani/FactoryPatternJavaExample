package me.agilani.www;

public class Factory {

	public static Coffee DispenseDrink(CoffeeType ct) {
		Coffee myCoffee = null;
		switch(ct)
		{
			case Black:
				myCoffee = new BlackCoffee();
				break;
			case White:
				myCoffee = new WhiteCoffee();
				break;
			case Latte:
				myCoffee = new LatteCoffee();
				break;
			case Mocha:
				myCoffee = new MochaCoffee();
				break;
			case HotChocolate:
				myCoffee = new HotChocolate();
				break;
			default:
				myCoffee = new IrishCoffee();
				break;
		}
		
		return myCoffee;
	}

}
