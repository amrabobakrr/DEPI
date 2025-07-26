package E_commerceSystem;

public class Admin extends User {
    public Admin(int userId, String username, String email) {
        super(userId, username, email);
    }

    @Override
    public void getUserDetails() {
        System.out.println("Admin: " + username + "  Email: " + email);
    }

    public void updateProduct(Product product, double newPrice, int newStock) {
        product.setPrice(newPrice);
        product.setStock(newStock);
        System.out.println("Product updated: " + product.getName());
    }
}
