package fakeSpeare;

public class SupremePizza {

	public SupremePizza() {
		super();
	    this.priceWithoutToppings = 3.50;
	    toppingList.add(Toppings.TOMATO);
	    toppingList.add(Toppings.CHEESE);
	    toppingList.add(Toppings.BELL_PEPPER);
	    toppingList.add(Toppings.ITALIAN_SAUSAGE);
	    toppingList.add(Toppings.PEPPERONI);
	    toppingList.add(Toppings.BLACK_OLIVES);
	    toppingList.add(Toppings.MUSHROOM);
	    updatePizzaPrice();
		}

		// Constructor and other required methods.

		@Override
		protected double addToppingsToPrice(double priceWithoutToppings) {
	    // Logic to add the price of toppings to priceWithoutToppings.
		}

		@Override
		public double updatePizzaPrice() {
	    // Logic to update totalPrice based on toppings and priceWithoutToppings.
		}
	}