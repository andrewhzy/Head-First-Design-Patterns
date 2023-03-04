package headfirst.designpatterns.decorator.starbuzz.mini;

public abstract class Drink {
    String name;
    double cost;

    public String getName(){return this.name;}
    public double getCost(){return this.cost;}
    public String description(){return this.name + ", " +cost;}

}
