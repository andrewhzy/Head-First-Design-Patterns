package headfirst.designpatterns.decorator.starbuzz.mini;

public class DrinkDecorator extends Drink {
    private Drink drink;

    public DrinkDecorator(Drink drink, String name, double cost) {
        this.drink = drink;
        this.name = name;
        this.cost = cost;
    }

    @Override
    public String getName() {
        return drink.getName() + ", +" + this.name;
    }

    @Override
    public double getCost() {
        return drink.getCost() + this.cost;
    }

    @Override
    public String description() {
        return this.getName() + " : " + this.getCost();
    }
}
