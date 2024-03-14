package fakeSpeare;

import java.util.List;
import java.util.ArrayList;

public abstract class AbstractPizza{
	protected List<Toppings> toppingList;
    protected double priceWithoutToppings;
    protected double totalPrice;
    protected int pizzaOrderID;
    protected static int orderIDCounter = 0;
    protected ICookingStrategy cookingStrategy;
    protected double cookingPrice;

    protected AbstractPizza() {
        this.toppingList = new ArrayList<>();
        // Increment and assign the orderIDCounter for each pizza instance.
        this.pizzaOrderID = ++orderIDCounter;
    }

    protected abstract void addDefaultToppings();

    // Updates the pizza price based on the base price, toppings, and any cooking strategy cost
    public void updatePizzaPrice() {
        double toppingsPrice = toppingList.stream().mapToDouble(Toppings::getToppingPrice).sum();
        this.totalPrice = this.priceWithoutToppings + toppingsPrice + this.cookingPrice;
    }

    // Sets the cooking strategy and updates the price based on the strategy chosen
    public void setCookingStrategy(ICookingStrategy cookingStrategy) {
        this.cookingStrategy = cookingStrategy;
        if (cookingStrategy != null) {
            cookingStrategy.cook(this); // This will also update the total price
        }
    }

    // Getters and Setters
    public int getPizzaOrderID() {
        return this.pizzaOrderID;
    }

    public double getTotalPrice() {
        return this.totalPrice;
    }

    public List<Toppings> getToppingList() {
        return this.toppingList;
    }
    
    // Adds a new topping to the pizza and updates the total price
    public boolean addTopping(Toppings topping) {
        if (!toppingList.contains(topping)) {
            toppingList.add(topping);
            updatePizzaPrice();
            return true;
        }
        return false;
    }

    // Removes a topping from the pizza and updates the total price
    public boolean removeTopping(Toppings topping) {
        boolean removed = toppingList.remove(topping);
        if (removed) {
            updatePizzaPrice();
        }
        return removed;
    }
    //ToString method for All info on instance of pizza
    @Override
    public String toString() {
        return "Pizza{" +
                "ID=" + pizzaOrderID +
                ", Base Price=" + priceWithoutToppings +
                ", Cooking Price=" + cookingPrice +
                ", Total Price=" + totalPrice +
                ", Toppings=" + toppingList +
                ", Cooking Strategy=" + (cookingStrategy != null ? cookingStrategy.getClass().getSimpleName() : "None") +
                '}';
    }
}