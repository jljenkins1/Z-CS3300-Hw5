package fakeSpeare;

public class HawaiianPizza extends AbstractPizza{

	public HawaiianPizza() {
		super();
	    this.priceWithoutToppings = 3.00;
	    addDefaultToppings();
	    updatePizzaPrice();
		}

		// Constructor
		
		@Override
		protected void addDefaultToppings() {
		    toppingList.add(Toppings.CANADIAN_BACON);
	        toppingList.add(Toppings.CHEESE);
	        toppingList.add(Toppings.PINEAPPLE);
		}
		//sum topping prices
		//
		protected double addTopingsToPrice(double priceWithoutToppings) {
			double toppingsPrice = 0.0;
			for (Toppings topping : toppingList) {
				toppingsPrice +=topping.getToppingPrice();
			}
			return toppingsPrice;
	    // Update Pizza Price here
		}

		@Override
		public void updatePizzaPrice() {
			double toppingsPrice = addTopingsToPrice(priceWithoutToppings);
	        this.totalPrice = this.priceWithoutToppings + toppingsPrice + this.cookingPrice;
		}


	}