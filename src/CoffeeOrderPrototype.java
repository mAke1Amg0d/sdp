public abstract class CoffeeOrderPrototype implements Cloneable {
    protected String coffeeType;
    protected String milkType;
    protected String syrupType;
    protected String addonType;

    public CoffeeOrderPrototype clone() throws CloneNotSupportedException {
        return (CoffeeOrderPrototype) super.clone();
    }

    public void showOrderDetails() {
        System.out.println("Coffee: " + coffeeType + ", Milk: " + milkType + ", Syrup: " + syrupType + ", Addon: " + addonType);
    }
}