package fakeSpeare;

public class VegetarianPizza extends AbstractPizza{

	public VegetarianPizza() {
		super();
	    this.priceWithoutToppings = 1.50;
	    addDefaultToppings();
	    updatePizzaPrice();
		}

		// Constructor 
		
		@Override
		protected void addDefaultToppings() {
		    toppingList.add(Toppings.TOMATO);
	        toppingList.add(Toppings.CHEESE);
	        toppingList.add(Toppings.BELL_PEPPER);
		    toppingList.add(Toppings.BLACK_OLIVE);
		    toppingList.add(Toppings.MUSHROOM);
		}
		

		protected double addTopingsToPrice(double priceWithoutToppings) {
			double toppingsPrice = 0;
			for (Toppings topping : toppingList) {
				toppingsPrice +=topping.getToppingPrice();
			}
			return toppingsPrice;
	    // sum topping price
		}

		@Override
		public void updatePizzaPrice() {
	    // update total price
			double toppingsPrice = addTopingsToPrice(priceWithoutToppings);
	        this.totalPrice = this.priceWithoutToppings + toppingsPrice + this.cookingPrice;
		}


	}