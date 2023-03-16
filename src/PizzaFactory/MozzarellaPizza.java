package PizzaFactory;

public class MozzarellaPizza extends PizzaFactory {
    public MozzarellaPizza() {
        this("Mozzarella");
        name = "Mozzarella";

   }
    public MozzarellaPizza(String name) {
        super(name);
    }
}
