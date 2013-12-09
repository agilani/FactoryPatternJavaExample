package me.agilani.www;

public class Runner {

	private static Coffee myCoffee;
	
	public static void main(String[] args) {

		setMyCoffee(Factory.DispenseDrink(CoffeeType.Black));
		
		setMyCoffee(Factory.DispenseDrink(CoffeeType.White));
		setMyCoffee(Factory.DispenseDrink(CoffeeType.Latte));
		setMyCoffee(Factory.DispenseDrink(CoffeeType.Mocha));
		setMyCoffee(Factory.DispenseDrink(CoffeeType.HotChocolate));
		setMyCoffee(Factory.DispenseDrink(CoffeeType.IrishCoffee));
		
		setMyCoffee(null);
		System.gc();

	}

	public static Coffee getMyCoffee() {
		return myCoffee;
	}

	public static void setMyCoffee(Coffee myCoffee) {
		Runner.myCoffee = myCoffee;
	}

}
