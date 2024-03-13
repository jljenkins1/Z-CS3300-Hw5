package fakeSpeare;

public class SupremePizza extends AbstractPizza{

	public SupremePizza() {
		super();
	    this.priceWithoutToppings = 3.50;
	    addDefaultToppings();
	    updatePizzaPrice();
		}

		// Constructor and other required methods.
		
		@Override
		protected void addDefaultToppings() {
		    toppingList.add(Toppings.TOMATO);
	        toppingList.add(Toppings.CHEESE);
	        toppingList.add(Toppings.BELL_PEPPER);
		    toppingList.add(Toppings.ITALIAN_SAUSAGE);
		    toppingList.add(Toppings.PEPPERONI);
		    toppingList.add(Toppings.BLACK_OLIVE);
		    toppingList.add(Toppings.MUSHROOM);
		}
		

		protected double addTopingsToPrice(double priceWithoutToppings) {
			double toppingsPrice = 0;
			for (Toppings topping : toppingList) {
				toppingsPrice +=topping.getToppingPrice();
			}
			return toppingsPrice;
	    // Logic to add the price of toppings to priceWithoutToppings.
		}

		@Override
		public void updatePizzaPrice() {
	    // Logic to update totalPrice based on toppings and priceWithoutToppings.
			double toppingsPrice = addTopingsToPrice(priceWithoutToppings);
	        this.totalPrice = this.priceWithoutToppings + toppingsPrice + this.cookingPrice;
		}


	}