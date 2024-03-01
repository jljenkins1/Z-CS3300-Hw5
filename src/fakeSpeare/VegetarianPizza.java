package fakeSpeare;

public class VegetarianPizza extends AbstractPizza {
	super();
    this.priceWithoutToppings = 1.50;
    toppingList.add(Toppings.TOMATO);
    toppingList.add(Toppings.CHEESE);
    toppingList.add(Toppings.BELL_PEPPER);
    toppingList.add(Toppings.BLACK_OLIVE);
    toppingList.add(Toppings.MUSHROOM);
    updatePizzaPrice();
	}

	// Constructor and other required methods.

	@Override
	protected double addTopingsToPrice(double priceWithoutToppings) {
    // Logic to add the price of toppings to priceWithoutToppings.
	}

	@Override
	public double updatePizzaPrice() {
    // Logic to update totalPrice based on toppings and priceWithoutToppings.
	}
}