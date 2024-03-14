package fakeSpeare;

public class HawaiianPizza extends AbstractPizza{

	public HawaiianPizza() {
		super();
	    this.priceWithoutToppings = 3.00;
	    addDefaultToppings();
	    updatePizzaPrice();
		}

		// Constructor and other required methods.
		
		@Override
		protected void addDefaultToppings() {
		    toppingList.add(Toppings.CANADIAN_BACON);
	        toppingList.add(Toppings.CHEESE);
	        toppingList.add(Toppings.PINEAPPLE);
		}
		

		protected double addTopingsToPrice(double priceWithoutToppings) {
			double toppingsPrice = 0.0;
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