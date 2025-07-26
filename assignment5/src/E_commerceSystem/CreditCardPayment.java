package E_commerceSystem;

public class CreditCardPayment implements Payment {
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing credit card payment: $" + amount);
    }
    @Override
    public boolean validateCard(String cardNumber) {
        System.out.println("Validating credit card: " + cardNumber);
        return cardNumber.length() == 16;
    }
}
