package E_commerceSystem;

public interface Payment {
    void processPayment(double amount);
    boolean validateCard(String cardNumber);
}

