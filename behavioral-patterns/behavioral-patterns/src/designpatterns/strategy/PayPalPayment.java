package java.designpatterns.strategy;

import java.util.Objects;

public class PayPalPayment implements PaymentStrategy {
    private String emailId;
    private String password;

    public PayPalPayment(String emailId, String password) {
        this.emailId = emailId;
        this.password = password;
    }

    @Override
    public void pay(int amount) {
        if (Objects.nonNull(this.emailId) && Objects.nonNull(this.password)) {
            System.out.println("Amount " + amount + " paid with paypal account");
        }
    }
}
