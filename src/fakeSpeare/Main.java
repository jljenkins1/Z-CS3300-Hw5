package fakeSpeare;

public class Main {
	public static void main(String[] args) {
		// Instantiate a pizzaOrder, perform operations based on the requirements.
		PizzaOrder order = new PizzaOrder();
		
		// Adds pizzas to the cart, selects cooking strategies for the pizzas in the cart, prints pizza order cart. Calls checkout to calculate the bill, throws exception if triggered.
		 PizzaCookingFactory factory = new PizzaCookingFactory();
	     AbstractPizza margheritaPizza = factory.createPizza(PizzaType.MARGHERITA);
	     AbstractPizza hawaiianPizza = factory.createPizza(PizzaType.HAWAIIAN);
	     
	     // Add pizzas to the order
	        order.addPizzaToCart(margheritaPizza);
	        order.addPizzaToCart(hawaiianPizza);

	        // Print current pizza order cart
	        System.out.println("Initial Pizza Order Cart:");
	        order.printPizzaOrderCart();

	        // Add new toppings to Margherita Pizza
	        System.out.println("\nAdding new toppings to Margherita Pizza...");
	        order.addNewToppingToPizza(margheritaPizza.getPizzaOrderID(), Toppings.PEPPERONI);
	        order.addNewToppingToPizza(margheritaPizza.getPizzaOrderID(), Toppings.MUSHROOM);

	        // Remove a topping from Hawaiian Pizza
	        System.out.println("\nRemoving Pineapple from Hawaiian Pizza...");
	        order.removeToppingFromPizza(hawaiianPizza.getPizzaOrderID(), Toppings.PINEAPPLE);

	        // Select cooking strategies for each pizza
	        System.out.println("\nSelecting cooking strategies...");
	        order.selectCookingStrategyByPizzaOrderID(margheritaPizza.getPizzaOrderID(), CookingStyleType.BRICK_OVEN);
	        order.selectCookingStrategyByPizzaOrderID(hawaiianPizza.getPizzaOrderID(), CookingStyleType.CONVENTIONAL_OVEN);

	        // Print pizza order cart after modifications
	        System.out.println("\nUpdated Pizza Order Cart:");
	        order.printPizzaOrderCart();

	        // Attempt to checkout
	        try {
	            double total = order.checkout();
	            System.out.println("\nCheckout successful! Total amount due: $" + total);
	        } catch (Exception e) {
	            System.err.println("Error during checkout: " + e.getMessage());
	        }
	  }
}