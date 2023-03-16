package PizzaFactory;

public class HawaiiPizza extends PizzaFactory {
    public HawaiiPizza() {
        this("Hawaii");
        name = "Hawaii";
    }


    public HawaiiPizza(String name) {
        super(name);
    }
}
