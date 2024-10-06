package Assignment1;

public class CustomCoffee {
    private String coffeeType;
    private String milkType;
    private String syrupType;
    private String addonType;

    public CustomCoffee(String coffeeType, String milkType, String syrupType, String addonType) {
        this.coffeeType = coffeeType;
        this.milkType = milkType;
        this.syrupType = syrupType;
        this.addonType = addonType;
    }

    public void showDetails() {
        System.out.println("Custom coffee: " + coffeeType + ", Assignment1.Milk: " + milkType + ", Assignment1.Syrup: " + syrupType + ", Assignment1.Addon: " + addonType);
    }
}