public class CoffeeBuilder {
    private String coffeeType;
    private String milkType;
    private String syrupType;
    private String addonType;

    public CoffeeBuilder setCoffeeType(String coffeeType) {
        this.coffeeType = coffeeType;
        return this;
    }

    public CoffeeBuilder setMilkType(String milkType) {
        this.milkType = milkType;
        return this;
    }

    public CoffeeBuilder setSyrupType(String syrupType) {
        this.syrupType = syrupType;
        return this;
    }

    public CoffeeBuilder setAddonType(String addonType) {
        this.addonType = addonType;
        return this;
    }

    public CustomCoffee build() {
        return new CustomCoffee(coffeeType, milkType, syrupType, addonType);
    }
}