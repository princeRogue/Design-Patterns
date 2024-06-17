package java.designpatterns.strategy;

public class Main {
    public static void main(String[] args) {
        PaymentProcessor paymentProcessor = new PaymentProcessor();
        
        // Pay with credit card
        paymentProcessor.setPaymentStrategy(new CreditCardPayment("1234567890123456", "John Doe", "123", "12/23"));
        paymentProcessor.pay(100);

        // Pay with PayPal
        paymentProcessor.setPaymentStrategy(new PayPalPayment("john.doe@example.com", "password123"));
        paymentProcessor.pay(200);

        // Pay with Bitcoin
        paymentProcessor.setPaymentStrategy(new BitcoinPayment("1A1zP1eP5QGefi2DMPTfTL5SLmv7DivfNa"));
        paymentProcessor.pay(300);
    }
}
