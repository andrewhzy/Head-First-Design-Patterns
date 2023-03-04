package headfirst.designpatterns.decorator.starbuzz.mini;

public class DrinkMain {

    public static void main(String args[]) {
        Drink drink = new Cola();
        System.out.println(drink.description());

        drink = new Coffee();
        System.out.println(drink.description());

        drink = new DrinkDecorator(drink, "Mocha", 1);
        drink = new DrinkDecorator(drink, "Milk", 2);
        drink = new DrinkDecorator(drink, "Whip", 3);
        System.out.println(drink.description());
    }
}
