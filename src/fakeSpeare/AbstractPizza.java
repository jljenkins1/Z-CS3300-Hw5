package fakeSpeare;

public abstract class AbstractPizza extends main {
	protected List<Toppings> toppingList;
    protected double priceWithoutToppings;
    protected double totalPrice;
    protected int pizzaOrderID;
    protected static int orderIDCounter = 0;
    protected ICookingStrategy cookingStrategy;
    protected double cookingPrice;

    public AbstractPizza() {
        this.toppingList = new ArrayList<>();
        // Increment and assign the orderIDCounter for each pizza instance.
        this.pizzaOrderID = ++orderIDCounter;
    }

    // Getters and setters for each attribute.

    protected abstract double addTopingsToPrice(double priceWithoutToppings);
    public abstract double updatePizzaPrice();
}

}
