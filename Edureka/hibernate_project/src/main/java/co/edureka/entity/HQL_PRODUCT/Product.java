package co.edureka.entity.HQL_PRODUCT;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "PRODUCT_DTLS")
public class Product {
    @Id
    @Column(name = "PRODUCT_ID")
    private long productId;

    @Column(name = "PRODUCT_NAME")
    private String productName;

    @Column(name = "PRODUCT_PRICE")
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
