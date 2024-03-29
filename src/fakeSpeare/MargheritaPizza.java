package fakeSpeare;

public class MargheritaPizza extends AbstractPizza{

	public MargheritaPizza() {
		super();
	    this.priceWithoutToppings = 2.50;
	    addDefaultToppings();
	    updatePizzaPrice();
		}

		// Constructor and other required methods.
		
		@Override
		protected void addDefaultToppings() {
		    toppingList.add(Toppings.TOMATO);
	        toppingList.add(Toppings.CHEESE);
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