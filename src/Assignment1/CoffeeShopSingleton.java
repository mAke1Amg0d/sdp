package Assignment1;

// Assignment1.CoffeeShopSingleton.java
public class CoffeeShopSingleton {
    private static CoffeeShopSingleton instance;

    private CoffeeShopSingleton() {
        // Приватный конструктор
    }

    public static CoffeeShopSingleton getInstance() {
        if (instance == null) {
            instance = new CoffeeShopSingleton();
        }
        return instance;
    }

    public void takeOrder(String orderDetails) {
        System.out.println("Order taken: " + orderDetails);
    }
}
