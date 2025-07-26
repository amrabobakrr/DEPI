package AssForPractice;

public class Product {
    private String productId;
    private String name;
    private double price;
    private int stockQuantity;
    private String category;

    public Product(String productId, String name, double price, int stockQuantity, String category) {
        this.productId = productId;
        this.name = name;
        this.category = category;

        this.price = price >= 0 ? price : 0;
        this.stockQuantity = stockQuantity >= 0 ? stockQuantity : 0;
    }


    public String getProductId() {
        return productId;
    }
    public String getName() {
        return name;
    }
    public double getPrice() {
        return price;
    }
    public int getStockQuantity() {
        return stockQuantity;
    }
    public String getCategory() {
        return category;
    }

    public void setPrice(double price) {
        if (price < 0)
            throw new IllegalArgumentException("Price cannot be negative.");
        this.price = price;
    }

    public void setStockQuantity(int quantity) {
        if (quantity < 0)
            throw new IllegalArgumentException("Stock quantity cannot be negative.");
        this.stockQuantity = quantity;
    }

    public boolean isInStock() {
        return stockQuantity > 0;
    }

    public boolean reduceStock(int quantity) {
        if (quantity <= stockQuantity) {
            stockQuantity -= quantity;
            return true;
        }
        return false;
    }

    public void addStock(int quantity) {
        if (quantity > 0) {
            stockQuantity += quantity;
        }
    }

    @Override
    public String toString() {
        return "Product ID: " + productId +
                "\nName: " + name +
                "\nCategory: " + category +
                "\nPrice: $" + price +
                "\nStock: " + stockQuantity;
    }
}

