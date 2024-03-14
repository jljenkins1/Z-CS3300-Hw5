package fakeSpeare;

public class MicrowaveCookingStrategy implements ICookingStrategy {
    @Override
    public boolean cook(AbstractPizza pizza) {
        // Logic for cooking pizza in a microwave

        double microwaveCookingPrice = 1.0;
        pizza.cookingPrice = microwaveCookingPrice;
        pizza.cookingStrategy = this;
        pizza.updatePizzaPrice();
        return true;
    }
}