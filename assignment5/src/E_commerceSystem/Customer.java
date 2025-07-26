package E_commerceSystem;

public class Customer extends User {
    public Customer(int userId, String username, String email) {
        super(userId, username, email);
    }
    @Override
    public void getUserDetails() {
        System.out.println("Customer: " + username + "  Email: " + email);
    }

    public void placeOrder(int productId) {
        System.out.println("Order placed for product ID: " + productId);
    }

    public void placeOrder(int productId, int quantity) {
        System.out.println("Order placed for product ID: " + productId + " | Quantity: " + quantity);
    }
}
