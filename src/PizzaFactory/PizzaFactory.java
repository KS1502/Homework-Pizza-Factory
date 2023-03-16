package PizzaFactory;

public class PizzaFactory {
    String name;


    public PizzaFactory(String name ){
        this.name=name;

    }

    public String getName() {
        return name;
    }
    public void prepare() {
        System.out.println("Preparing pizza " + name);
    }

    public void bake() {
        System.out.println("Baking pizza " + name);
    }

    public void pack(){
        System.out.println("Packing pizza "+name);
}

    @Override
    public String toString() {
        return super.toString();
    }


/* 1. Cоздать фабрику по производству пиццы. Фабрика должна уметь готовить следующие виды пиццы:
    Гавайи, Моцарелла,Салями.
   2. Каждый вид пиццы должен уметь: подготавливаться (накладывать ингридиенты напр.), печься и упаковываться.
    В каждом случае должно быть понятно о какой пицце речь.
            3. В классе Main не должен создаваться новый обьект пиццы, а из него должен поступать "заказ"  на изготовление
    требуемого вида пиццы (обьекта) в класс PizzaFactory, который и должен выбрать нужную пиццу для изготовления

    Пример: заказана пицца Hawaii.
    На выходе:
    Preparing pizza with ananas and cheese
    Baking Pizza Hawaii
    Packing pizza Hawaii*/
}
