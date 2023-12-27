package day4.Encapsulation;

public class Product {
    private String productName;
    private int productId;

    public String getProductName(){
        return this.productName;
    }

    public void setProductName(String productName){
        this.productName = productName;
    }

    public int getProductId() {
        return this.productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    @Override
    public String toString () {
        return "Product [productId = " + productId + ", productName = " + productName + "]";
    }
}


