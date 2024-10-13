package Assignment3.Chain;

public class PaymentB extends PaymentHandler {
    private int balance = 300;

    public void handlePayment(int amount) {
        if (amount <= balance) {
            System.out.println("PaymentB handled the payment of $" + amount);
        } else if (nextHandler != null) {
            nextHandler.handlePayment(amount);
        }
    }
}