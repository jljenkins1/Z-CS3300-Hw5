package fakeSpeare;

public class PizzaCookingFactory {
    private int orderIDCounter = 0;

    public AbstractPizza createPizza(PizzaType pizzaType) {
        AbstractPizza pizza = null;
        switch (pizzaType) {
            case HAWAIIAN:
                pizza = new HawaiianPizza();
                break;
            case MARGHERITA:
                pizza = new MargheritaPizza();
                break;
            case SUPREME:
                pizza = new SupremePizza();
                break;
            case VEGITARIAN:
                pizza = new VegetarianPizza();
                break;
        }
        if (pizza != null) {
            pizza.pizzaOrderID = ++orderIDCounter;
        }
        return pizza;
    }
}
