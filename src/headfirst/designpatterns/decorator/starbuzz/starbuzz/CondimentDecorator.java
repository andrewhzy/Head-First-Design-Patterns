package headfirst.designpatterns.decorator.starbuzz.starbuzz;

public class CondimentDecorator extends Beverage {
    Beverage beverage;

    public CondimentDecorator(Beverage beverage, String name, int cost) {
        this.beverage = beverage;
        this.name = name;
        this.cost = cost;
    }
    @Override
    public String getDescription() {
        return this.getName() + ", $" + this.getCost();
    }
    @Override
    public String getName() {
        return beverage.getName() + ", +" + this.name;
    }

    @Override
    public double getCost() {
        return this.beverage.getCost() + this.cost;
    }

}
