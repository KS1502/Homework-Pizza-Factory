package PizzaFactory;

public class SalamiPizza extends PizzaFactory {
    public SalamiPizza() {
        this("Salami");
        name = "Salami";
    }

    public SalamiPizza(String name) {
        super(name);
    }
}