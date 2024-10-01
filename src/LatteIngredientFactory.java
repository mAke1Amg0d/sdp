public class LatteIngredientFactory implements IngredientFactory {
    @Override
    public Milk createMilk() {
        return new WholeMilk();
    }

    @Override
    public Syrup createSyrup() {
        return new VanillaSyrup();
    }

    @Override
    public Addon createAddon() {
        return new Cinnamon();
    }
}
