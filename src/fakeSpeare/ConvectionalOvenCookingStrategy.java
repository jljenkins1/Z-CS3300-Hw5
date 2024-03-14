package fakeSpeare;

public class ConvectionalOvenCookingStrategy implements ICookingStrategy {
    @Override
    public boolean cook(AbstractPizza pizza) {
        // Logic for cooking pizza in a Convection Oven
        double convectionalOvenCookingPrice = 1.0;
        pizza.cookingPrice = convectionalOvenCookingPrice;
        pizza.cookingStrategy = this;
        pizza.updatePizzaPrice();
        return true;
    }
}