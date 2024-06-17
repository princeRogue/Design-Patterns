package java.designpatterns.strategy;

import java.util.Objects;

public class BitcoinPayment implements PaymentStrategy{

    private String bitcoinAddress;

    public BitcoinPayment(String bitcoinAddress) {
        this.bitcoinAddress = bitcoinAddress;
    }

    @Override
    public void pay(int amount) {
        if(Objects.nonNull(this.bitcoinAddress)) {
            System.out.println("Amount " + amount + " paid with bitcoin");
        }
    }
}
