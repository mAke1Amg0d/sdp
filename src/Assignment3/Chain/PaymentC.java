package Assignment3.Chain;

public class PaymentC extends PaymentHandler {
    private int balance = 1000;

    public void handlePayment(int amount) {
        if (amount <= balance) {
            System.out.println("PaymentC handled the payment of $" + amount);
        } else {
            System.out.println("Unable to handle the payment");
        }
    }
}