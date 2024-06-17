package java.designpatterns.strategy;

import java.util.Objects;

public class CreditCardPayment implements PaymentStrategy {
    private final String cardNumber;
    private final String cardHolderName;
    private final String cvv;
    private final String expiryDate;

    @Override
    public void pay(int amount) {
        if (Objects.nonNull(this.cardNumber) && Objects.nonNull(this.cardHolderName) &&
                Objects.nonNull(this.cvv) && Objects.nonNull(this.expiryDate)) {
            System.out.println("Amount " + amount + " paid with credit card");
        }
    }

    public CreditCardPayment(String cardNumber, String cardHolderName, String cvv, String expiryDate) {
        this.cardNumber = cardNumber;
        this.cardHolderName = cardHolderName;
        this.cvv = cvv;
        this.expiryDate = expiryDate;
    }
}
