package AssForPractice;

public class ElectronicProduct extends Product {
    private int warrantyInMonths;

    public ElectronicProduct(String productId, String name, double price, int stockQuantity, String category, int warrantyInMonths) {
        super(productId, name, price, stockQuantity, category);
        setWarrantyInMonths(warrantyInMonths);
    }

    public int getWarrantyInMonths() {
        return warrantyInMonths;
    }

    public void setWarrantyInMonths(int warrantyInMonths) {
        if (warrantyInMonths < 0)
            throw new IllegalArgumentException("Warranty cannot be negative.");
        this.warrantyInMonths = warrantyInMonths;
    }

    @Override
    public String toString() {
        return super.toString() + "\nWarranty: " + warrantyInMonths + " months";
    }
}

