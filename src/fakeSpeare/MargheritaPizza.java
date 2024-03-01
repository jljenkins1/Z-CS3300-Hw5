package fakeSpeare;

public class MargheritaPizza extends AbstractPizza {
	super();
    this.priceWithoutToppings = 2.50;
    toppingList.add(Toppings.TOMATO);
    toppingList.add(Toppings.CHEESE);
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