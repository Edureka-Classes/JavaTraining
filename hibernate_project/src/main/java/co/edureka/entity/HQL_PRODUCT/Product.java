package co.edureka.entity;

public class Product {
    private long productId;
    private String productName;
    private Float productPrice;

    public Product () {
    }

    public Product (final long productId, final String productName, final Float productPrice) {
        super();
        this.productId = productId;
        this.productName = productName;
        this.productPrice = productPrice;
    }

    public long getProductId () {
        return this.productId;
    }

    public void setProductId (final long productId) {
        this.productId = productId;
    }

    public String getProductName () {
        return this.productName;
    }

    public void setProductName (final String productName) {
        this.productName = productName;
    }

    public Float getProductPrice () {
        return this.productPrice;
    }

    public void setProductPrice (final Float productPrice) {
        this.productPrice = productPrice;
    }

    @Override
    public String toString () {
        return "Product{" +
                "productId=" + productId +
                ", productName='" + productName + '\'' +
                ", productPrice=" + productPrice +
                '}';
    }
}
