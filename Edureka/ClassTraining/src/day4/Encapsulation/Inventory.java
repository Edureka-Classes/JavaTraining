package day4.Encapsulation;

public class Inventory {
    public static void main(String[] args) {
        Product prod = new Product();

        System.out.println(prod.getProductId() + " = " + prod.getProductName());

        prod.setProductId(46532829);
        prod.setProductName("Mobile Phone");
        System.out.println(prod.getProductName() + " - " + prod.getProductId());
        System.out.println();

        System.out.println("\"prod\" is an instance type ---->  " +prod.getClass().getName());
        System.out.println("\"prod\" is an instance type ---->  " +prod.getClass().getSimpleName());
        System.out.println("hashCode() ----> " +prod.hashCode());
        System.out.println("hashCode() in hexaDecimal form ----> " +Integer.toHexString(prod.hashCode()));
        System.out.println();

        System.out.println(prod); //toString()


    }
}
