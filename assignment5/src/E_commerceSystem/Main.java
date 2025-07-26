package E_commerceSystem;

public class Main {
    public static void main(String[] args) {

        Product product1 = new Product(1, "Laptop", 1000.0, 5);
        Customer customer = new Customer(101, "Amr", "amr@gmail.com");
        Admin admin = new Admin(201, "Admin", "admin@gmail.com");
        customer.getUserDetails();
        admin.getUserDetails();
        customer.placeOrder(product1.getProductId());
        customer.placeOrder(product1.getProductId(), 2);
        admin.updateProduct(product1, 950.0, 10);
        Payment ccPayment = new CreditCardPayment();
        if (ccPayment.validateCard("3050248795748675")) {
            ccPayment.processPayment(950.0);
        }
        Payment paypalPayment = new PayPalPayment();
        if (paypalPayment.validateCard("amr@gmail.com")) {
            paypalPayment.processPayment(950.0);
        }
    }
}

