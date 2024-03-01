package fakeSpeare;

public class HawaiianPizza {

	public HawaiianPizza() {
		super();
	    this.priceWithoutToppings = 3.00;
	    toppingList.add(Toppings.CANADIAN_BACON);
	    toppingList.add(Toppings.CHEESE);
	    toppingList.add(Toppings.PINEAPPLE);
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