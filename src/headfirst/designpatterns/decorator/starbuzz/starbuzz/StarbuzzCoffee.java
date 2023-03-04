package headfirst.designpatterns.decorator.starbuzz.starbuzz;

public class StarbuzzCoffee {

    public static void main(String args[]) {
        Beverage beverage = new DarkRoast();
        System.out.println(beverage.getDescription());

        beverage = new CondimentDecorator(beverage, "Mocha", 1);
        beverage = new CondimentDecorator(beverage, "Mocha", 2);
        beverage = new CondimentDecorator(beverage, "Whip", 3);
        System.out.println(beverage.getDescription());
    }
}
