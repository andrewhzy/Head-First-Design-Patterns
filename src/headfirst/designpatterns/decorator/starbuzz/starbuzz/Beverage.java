package headfirst.designpatterns.decorator.starbuzz.starbuzz;

public abstract class Beverage {
    String name;
    double cost;

    public String getDescription() {
        return this.name + ", $" + this.cost;
    }

    public double getCost() {
        return this.cost;
    }

    public String getName() {
        return this.name;
    }
}
