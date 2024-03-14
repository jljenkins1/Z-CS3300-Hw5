package fakeSpeare;

import java.util.ArrayList;
import java.util.List;

public class PizzaOrder {
    private PizzaCookingFactory pizzaFactory;

    private List<AbstractPizza> pizzaOrderList;

    // Constructor to instantiate pizzaCookingFactory and pizzaOrderList
    public PizzaOrder() {
        this.pizzaFactory = new PizzaCookingFactory();
        this.pizzaOrderList = new ArrayList<>();
    }

    // Method to print toppings of a pizza order by ID
    public void printListOfToppingsByPizzaOrderID(int orderID) {
        AbstractPizza pizza = getPizzaByOrderID(orderID);
        if (pizza != null) {
            System.out.println("Toppings for Pizza Order ID " + orderID + ": " + pizza.getToppingList());
        } else {
            System.out.println("Pizza Order ID not found.");
        }
    }

    // Method to print the pizzas in the pizzaOrderList
    public void printPizzaOrderCart() {
        System.out.println("Pizza Order Cart:");
        for (AbstractPizza pizza : pizzaOrderList) {
            System.out.println(pizza);
        }
    }

    // Method to get a pizza by its order ID
    public AbstractPizza getPizzaByOrderID(int orderID) {
        for (AbstractPizza pizza : pizzaOrderList) {
            if (pizza.getPizzaOrderID() == orderID) {
                return pizza;
            }
        }
        return null; // Return null if not found
    }

    // Method to add a pizza to the pizzaOrderList
    public boolean addPizzaToCart(PizzaType pizzaType) {
        AbstractPizza pizza = pizzaFactory.createPizza(pizzaType);
        if (pizza != null) {
            pizzaOrderList.add(pizza);
            return true;
        }
        return false;
    }

    // Method to add a new topping to a pizza by order ID
    public boolean addNewToppingToPizza(int orderID, Toppings topping) {
        AbstractPizza pizza = getPizzaByOrderID(orderID);
        if (pizza != null) {
            if (pizza.addTopping(topping)) {
                return true;
            }
        }
        return false;
    }

    // Method to remove a topping from a pizza by order ID
    public boolean removeToppingFromPizza(int orderID, Toppings topping) {
        AbstractPizza pizza = getPizzaByOrderID(orderID);
        if (pizza != null) {
            if (pizza.removeTopping(topping)) {
                return true;
            }
        }
        return false;
    }

    // Method to check if there are any uncooked pizzas
    public boolean isThereAnyUncookedPizza() {
        for (AbstractPizza pizza : pizzaOrderList) {
            if (pizza.cookingStrategy == null) {
                return true;
            }
        }
        return false;
    }

    // Meeethod to select cooking strategy by pizza order ID
    public boolean selectCookingStrategyByPizzaOrderID(int orderID, CookingStyleType cookingStrategyType) {
        AbstractPizza pizza = getPizzaByOrderID(orderID);
        if (pizza != null) {
            ICookingStrategy strategy = null;
            switch (cookingStrategyType) {
                case MICROWAVE:
                    strategy = new MicrowaveCookingStrategy();
                    break;
                case CONVECTIONAL_OVEN:
                    strategy = new ConvectionalOvenCookingStrategy();
                    break;
                case BRICK_OVEN:
                    strategy = new BrickOvenCookingStrategy();
                    break;
            }
            if (strategy != null) {
                pizza.setCookingStrategy(strategy);
                return true;
            }
        }
        return false;
    }

    // Method to calculate total price and checkout
    public double checkout() throws Exception {
        if (isThereAnyUncookedPizza()) {
            throw new Exception("There are uncooked pizzas.");
        }
        double total = 0;
        for (AbstractPizza pizza : pizzaOrderList) {
            total += pizza.getTotalPrice();
        }
        return total;
    }
}
