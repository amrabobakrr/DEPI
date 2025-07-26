package AssForPractice;

public class BookProduct extends Product {
    private String author;

    public BookProduct(String productId, String name, double price, int stockQuantity, String category, String author) {
        super(productId, name, price, stockQuantity, category);
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    @Override
    public String toString() {
        return super.toString() + "\nAuthor: " + author;
    }
}

