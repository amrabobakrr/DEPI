package E_commerceSystem;

public class PayPalPayment implements Payment {
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing PayPal payment: $" + amount);
    }

    @Override
    public boolean validateCard(String email) {
        System.out.println("Validating PayPal email: " + email);
        return email.contains("@");
    }
}
