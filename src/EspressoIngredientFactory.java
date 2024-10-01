public class EspressoIngredientFactory implements IngredientFactory {
    @Override
    public Milk createMilk() {
        return new NoMilk();
    }

    @Override
    public Syrup createSyrup() {
        return new NoSyrup();
    }

    @Override
    public Addon createAddon() {
        return new Sugar();
    }
}