package fakeSpeare;

public class BrickOvenCookingStrategy implements ICookingStrategy {
    @Override
    public boolean cook(AbstractPizza pizza) {
        // Logic for cooking pizza in a Brick Oven
        double brickOvenCookingPrice = 10.0;
        pizza.cookingPrice = brickOvenCookingPrice;
        pizza.cookingStrategy = this;
        pizza.updatePizzaPrice();
        return true;
    }
}