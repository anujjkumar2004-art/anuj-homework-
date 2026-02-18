package payment;
abstract class Payment {
    protected double amount;

    public Payment(double amount) {
        this.amount = amount;
    }

    abstract void processPayment();
}

class CardPayment extends Payment implements Runnable {

    public CardPayment(double amount) {
        super(amount);
    }

    @Override
    public void processPayment() {
        System.out.println("Card payment of " + amount + " completed");
    }

    @Override
    public void run() {
        processPayment();
    }
}


class UPIPayment extends Payment implements Runnable {

    public UPIPayment(double amount) {
        super(amount);
    }

    @Override
    public void processPayment() {
        System.out.println("UPI payment of " + amount + " completed");
    }

    @Override
    public void run() {
        processPayment();
    }
}


public class OnlinePaymentSystem {
    public static void main(String[] args) {

        double cardAmount = 2000;
        double upiAmount = 1500;

        Payment card = new CardPayment(cardAmount);
        Payment upi = new UPIPayment(upiAmount);
       
        
        Thread t1 = new Thread((Runnable) card);
        Thread t2 = new Thread((Runnable) upi);

        t1.start();
        t2.start();
    }
}