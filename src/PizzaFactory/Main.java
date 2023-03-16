package PizzaFactory;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        System.out.println("Hello my friend! Order your favorite pizza : Hawaii,Salami,Mozzarella");
        Scanner scanner = new Scanner(System.in);
        String choose = scanner.nextLine();
        switch (choose){
            case "Hawaii":
                System.out.println("Your is Hawaii Pizza");
                System.out.println("Preparing pizza Hawaii\n" +
                        "Baking pizza Hawaii\n" +
                        "Packing pizza Hawaii ");
                System.out.println("Bon appetit!");
                break;
            case "Salami":
                System.out.println("Your is Salami Pizza");
                System.out.println("Preparing pizza Salami\n" +
                        "Baking pizza Salami\n" +
                        "Packing pizza Salami");
                System.out.println("Bon appetit!");
                break;
            case "Mozzarella":
                System.out.println("Your is Mozzarella Pizza");
                System.out.println("Preparing pizza Mozzarella\n" +
                        "Baking pizza Mozzarella\n" +
                        "Packing pizza Mozzarella\n");
                System.out.println("Bon appetit!");
                break;
            default:
                System.out.println("Sorry friend,we don't have that kind of pizza.");
                break;
        }
      //  HawaiiPizza pizza = new HawaiiPizza();
      //  pizza.prepare();
      //  pizza.bake();
      //  pizza.pack();
      //  System.out.println();

        //SalamiPizza pizza1 = new SalamiPizza();
        //pizza1.prepare();
        //pizza1.bake();
        // pizza1.pack();
        //  System.out.println();

        //  MozzarellaPizza pizza2 = new MozzarellaPizza();
        //  pizza2.prepare();
        //   pizza2.bake();
        //  pizza2.pack();
        //  System.out.println();

      /*  Hello my friend! Order your favorite pizza : Hawaii,Salami,Mozzarella
        Salami
        Your is Salami Pizza
        Preparing pizza Salami
        Baking pizza Salami
        Packing pizza Salami
        Bon appetit

         Hello my friend! Order your favorite pizza : Hawaii,Salami,Mozzarella
Peperoni
Sorry friend,we don't have that kind of pizza.


         */
        }
}