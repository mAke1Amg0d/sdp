// Main.java
public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        // Singleton example
        CoffeeShopSingleton shop = CoffeeShopSingleton.getInstance();
        shop.takeOrder("Espresso with sugar");

        // Factory Method example
        CoffeeFactory espressoFactory = new EspressoFactory();
        Coffee espresso = espressoFactory.createCoffee();
        espresso.prepare();

        CoffeeFactory latteFactory = new LatteFactory();
        Coffee latte = latteFactory.createCoffee();
        latte.prepare();

        // Abstract Factory example
        IngredientFactory espressoIngredients = new EspressoIngredientFactory();
        espressoIngredients.createMilk().addMilk();
        espressoIngredients.createSyrup().addSyrup();
        espressoIngredients.createAddon().addAddon();

        IngredientFactory latteIngredients = new LatteIngredientFactory();
        latteIngredients.createMilk().addMilk();
        latteIngredients.createSyrup().addSyrup();
        latteIngredients.createAddon().addAddon();

        // Prototype example
        EspressoOrder originalOrder = new EspressoOrder();
        CoffeeOrderPrototype clonedOrder = originalOrder.clone();
        clonedOrder.showOrderDetails();

        // Builder example
        CustomCoffee customCoffee = new CoffeeBuilder()
                .setCoffeeType("Latte")
                .setMilkType("Almond Milk")
                .setSyrupType("Caramel")
                .setAddonType("Whipped Cream")
                .build();
        customCoffee.showDetails();
    }
}
