package Assignment3.Chain;

public class PaymentA extends PaymentHandler {
    private int balance = 100;

    public void handlePayment(int amount) {
        if (amount <= balance) {
            System.out.println("PaymentA handled the payment of $" + amount);
        } else if (nextHandler != null) {
            nextHandler.handlePayment(amount);
        }
    }
}