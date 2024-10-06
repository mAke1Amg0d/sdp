package Assignment1;

public abstract class CoffeeOrderPrototype implements Cloneable {
    protected String coffeeType;
    protected String milkType;
    protected String syrupType;
    protected String addonType;

    public CoffeeOrderPrototype clone() throws CloneNotSupportedException {
        return (CoffeeOrderPrototype) super.clone();
    }

    public void showOrderDetails() {
        System.out.println("Assignment1.Coffee: " + coffeeType + ", Assignment1.Milk: " + milkType + ", Assignment1.Syrup: " + syrupType + ", Assignment1.Addon: " + addonType);
    }
}